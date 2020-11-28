package react4j.hrm;

import arez.ComputableValue;
import arez.annotations.Action;
import arez.annotations.ArezComponent;
import arez.annotations.ComputableValueRef;
import arez.annotations.DepType;
import arez.annotations.Feature;
import arez.annotations.Memoize;
import arez.annotations.Observable;
import elemental3.DataView;
import elemental3.EventListener;
import elemental3.Navigator;
import elemental3.bluetooth.BluetoothDevice;
import elemental3.bluetooth.BluetoothLEScanFilterInit;
import elemental3.bluetooth.BluetoothRemoteGATTCharacteristic;
import elemental3.bluetooth.BluetoothRemoteGATTServer;
import elemental3.bluetooth.BluetoothServiceUUID;
import elemental3.bluetooth.RequestDeviceOptions;
import elemental3.bluetooth.ValueEvent;
import elemental3.bluetooth.ValueEventListener;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.base.Js;

@ArezComponent
abstract class HeartRateMonitor
{
  @Nonnull
  private final ValueEventListener _onCharacteristicValueChanged = this::onCharacteristicValueChanged;
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
      .of( Js.global().get( "navigator" ) )
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
      } )
      .catch_( v -> {
        // User cancelled pairing so just abort
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
            characteristic.addCharacteristicvaluechangedListener( _onCharacteristicValueChanged );
            return null;
          } )
          .catch_( v -> {
            // Ignore error as UI will resolve correctly regardless
            return null;
          } );
      }
      device.addGattserverdisconnectedListener( _onServerDisconnected );
    }
    triggerConnectedPossiblyChanged();
  }

  @Action
  void triggerConnectedPossiblyChanged()
  {
    getConnectedComputableValue().reportPossiblyChanged();
  }

  void onCharacteristicValueChanged( @Nonnull final ValueEvent e )
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
