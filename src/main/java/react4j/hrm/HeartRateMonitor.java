package react4j.hrm;

import arez.ComputableValue;
import arez.annotations.Action;
import arez.annotations.ArezComponent;
import arez.annotations.ComputableValueRef;
import arez.annotations.DepType;
import arez.annotations.Feature;
import arez.annotations.Memoize;
import arez.annotations.Observable;
import elemental2.core.DataView;
import elemental2.dom.DomGlobal;
import elemental3.BluetoothDevice;
import elemental3.BluetoothLEScanFilterInit;
import elemental3.BluetoothRemoteGATTCharacteristic;
import elemental3.BluetoothRemoteGATTServer;
import elemental3.BluetoothServiceUUID;
import elemental3.Event;
import elemental3.EventListener;
import elemental3.Navigator;
import elemental3.RequestDeviceOptions;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

@ArezComponent
abstract class HeartRateMonitor
{
  @Nonnull
  private final EventListener _onCharacteristicValueChanged = this::onCharacteristicValueChanged;
  @Nonnull
  private final EventListener _onServerDisconnected = e -> setServerFromDevice( null );
  @Nullable
  private BluetoothRemoteGATTServer _server;

  @Nonnull
  static HeartRateMonitor create()
  {
    return new Arez_HeartRateMonitor();
  }

  @Observable( writeOutsideTransaction = Feature.ENABLE )
  abstract int getHeartRate();

  abstract void setHeartRate( int heartRate );

  void connect()
  {
    Navigator
      .of( DomGlobal.navigator )
      .bluetooth()
      .requestDevice( RequestDeviceOptions
                        .create()
                        .acceptAllDevices( false )
                        .filters( BluetoothLEScanFilterInit
                                    .create()
                                    .services( BluetoothServiceUUID.of( "heart_rate" ) ) )
      )
      .then( device -> {
        setServerFromDevice( device );
        return null;
      } );
  }

  void disconnect()
  {
    if ( null != _server )
    {
      _server.disconnect();
    }
  }

  private void setServerFromDevice( @Nullable final BluetoothDevice device )
  {
    if ( null == device )
    {
      _server = null;
      setHeartRate( 0 );
    }
    else
    {
      _server = device.gatt();
      if ( null != _server )
      {
        _server
          .connect()
          .then( server -> {
            triggerConnectedPossiblyChanged();
            return server.getPrimaryService( "heart_rate" );
          } )
          .then( service -> service.getCharacteristic( "heart_rate_measurement" ) )
          .then( BluetoothRemoteGATTCharacteristic::startNotifications )
          .then( characteristic -> {
            characteristic.addEventListener( "characteristicvaluechanged", _onCharacteristicValueChanged );
            return null;
          } );
      }
      device.addEventListener( "gattserverdisconnected", _onServerDisconnected );
    }
    triggerConnectedPossiblyChanged();
  }

  @Action
  void triggerConnectedPossiblyChanged()
  {
    getConnectedComputableValue().reportPossiblyChanged();
  }

  void onCharacteristicValueChanged( @Nonnull final Event e )
  {
    final BluetoothRemoteGATTCharacteristic target = (BluetoothRemoteGATTCharacteristic) e.target();
    assert null != target;
    final DataView value = target.value();
    assert null != value;
    setHeartRate( value.getInt8( 1 ) );
  }

  @Memoize( depType = DepType.AREZ_OR_EXTERNAL )
  boolean isConnected()
  {
    return null != _server && _server.connected();
  }

  @ComputableValueRef
  abstract ComputableValue<?> getConnectedComputableValue();
}
