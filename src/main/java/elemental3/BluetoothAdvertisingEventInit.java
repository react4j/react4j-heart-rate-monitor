package elemental3;

import elemental2.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface BluetoothAdvertisingEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static BluetoothAdvertisingEventInit create(@Nonnull final BluetoothDevice device) {
    final BluetoothAdvertisingEventInit $instance$ = Js.uncheckedCast( JsPropertyMap.of() );
    $instance$.setDevice( device );
    return $instance$;
  }

  @JsProperty
  int getAppearance();

  @JsProperty
  void setAppearance(int appearance);

  @JsOverlay
  @Nonnull
  default BluetoothAdvertisingEventInit appearance(int appearance) {
    setAppearance( appearance );
    return this;
  }

  @JsProperty
  @Nonnull
  BluetoothDevice getDevice();

  @JsProperty
  void setDevice(@Nonnull BluetoothDevice device);

  @JsOverlay
  @Nonnull
  default BluetoothAdvertisingEventInit device(@Nonnull BluetoothDevice device) {
    setDevice( device );
    return this;
  }

  @JsProperty
  BluetoothManufacturerDataMap getManufacturerData();

  @JsProperty
  void setManufacturerData(@Nonnull BluetoothManufacturerDataMap manufacturerData);

  @JsOverlay
  @Nonnull
  default BluetoothAdvertisingEventInit manufacturerData(
      @Nonnull BluetoothManufacturerDataMap manufacturerData) {
    setManufacturerData( manufacturerData );
    return this;
  }

  @JsProperty
  String getName();

  @JsProperty
  void setName(@Nonnull String name);

  @JsOverlay
  @Nonnull
  default BluetoothAdvertisingEventInit name(@Nonnull String name) {
    setName( name );
    return this;
  }

  @JsProperty
  byte getRssi();

  @JsProperty
  void setRssi(byte rssi);

  @JsOverlay
  @Nonnull
  default BluetoothAdvertisingEventInit rssi(byte rssi) {
    setRssi( rssi );
    return this;
  }

  @JsProperty
  BluetoothServiceDataMap getServiceData();

  @JsProperty
  void setServiceData(@Nonnull BluetoothServiceDataMap serviceData);

  @JsOverlay
  @Nonnull
  default BluetoothAdvertisingEventInit serviceData(@Nonnull BluetoothServiceDataMap serviceData) {
    setServiceData( serviceData );
    return this;
  }

  @JsProperty
  byte getTxPower();

  @JsProperty
  void setTxPower(byte txPower);

  @JsOverlay
  @Nonnull
  default BluetoothAdvertisingEventInit txPower(byte txPower) {
    setTxPower( txPower );
    return this;
  }

  @JsProperty
  JsArray<StringOrUnsignedLongUnion> getUuids();

  @JsProperty
  void setUuids(@Nonnull JsArray<StringOrUnsignedLongUnion> uuids);

  @JsOverlay
  @Nonnull
  default BluetoothAdvertisingEventInit uuids(@Nonnull JsArray<StringOrUnsignedLongUnion> uuids) {
    setUuids( uuids );
    return this;
  }
}
