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
public interface BluetoothPermissionDescriptor extends PermissionDescriptor {
  @JsOverlay
  @Nonnull
  static BluetoothPermissionDescriptor create(@Nonnull final String name) {
    return Js.<BluetoothPermissionDescriptor>uncheckedCast( JsPropertyMap.of() ).name( name );
  }

  @JsProperty
  boolean isAcceptAllDevices();

  @JsProperty
  void setAcceptAllDevices(boolean acceptAllDevices);

  @JsOverlay
  @Nonnull
  default BluetoothPermissionDescriptor acceptAllDevices(final boolean acceptAllDevices) {
    setAcceptAllDevices( acceptAllDevices );
    return this;
  }

  @JsProperty
  String getDeviceId();

  @JsProperty
  void setDeviceId(@Nonnull String deviceId);

  @JsOverlay
  @Nonnull
  default BluetoothPermissionDescriptor deviceId(@Nonnull final String deviceId) {
    setDeviceId( deviceId );
    return this;
  }

  @JsProperty
  JsArray<BluetoothLEScanFilterInit> getFilters();

  @JsProperty
  void setFilters(@Nonnull JsArray<BluetoothLEScanFilterInit> filters);

  @JsOverlay
  @Nonnull
  default BluetoothPermissionDescriptor filters(
      @Nonnull final JsArray<BluetoothLEScanFilterInit> filters) {
    setFilters( filters );
    return this;
  }

  @JsOverlay
  default void setFilters(@Nonnull final BluetoothLEScanFilterInit[] filters) {
    setFilters( JsArray.asJsArray( filters ) );
  }

  @JsOverlay
  @Nonnull
  default BluetoothPermissionDescriptor filters(
      @Nonnull final BluetoothLEScanFilterInit[] filters) {
    setFilters( filters );
    return this;
  }

  @JsProperty
  JsArray<BluetoothServiceUUID> getOptionalServices();

  @JsProperty
  void setOptionalServices(@Nonnull JsArray<BluetoothServiceUUID> optionalServices);

  @JsOverlay
  @Nonnull
  default BluetoothPermissionDescriptor optionalServices(
      @Nonnull final JsArray<BluetoothServiceUUID> optionalServices) {
    setOptionalServices( optionalServices );
    return this;
  }

  @JsOverlay
  default void setOptionalServices(@Nonnull final BluetoothServiceUUID[] optionalServices) {
    setOptionalServices( JsArray.asJsArray( optionalServices ) );
  }

  @JsOverlay
  @Nonnull
  default BluetoothPermissionDescriptor optionalServices(
      @Nonnull final BluetoothServiceUUID[] optionalServices) {
    setOptionalServices( optionalServices );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default BluetoothPermissionDescriptor name(@Nonnull final String name) {
    setName( name );
    return this;
  }
}
