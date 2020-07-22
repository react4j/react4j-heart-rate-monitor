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
public interface RequestDeviceOptions {
  @JsOverlay
  @Nonnull
  static RequestDeviceOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty
  boolean isAcceptAllDevices();

  @JsProperty
  void setAcceptAllDevices(boolean acceptAllDevices);

  @JsOverlay
  @Nonnull
  default RequestDeviceOptions acceptAllDevices(final boolean acceptAllDevices) {
    setAcceptAllDevices( acceptAllDevices );
    return this;
  }

  @JsProperty
  JsArray<BluetoothLEScanFilterInit> getFilters();

  @JsProperty
  void setFilters(@Nonnull JsArray<BluetoothLEScanFilterInit> filters);

  @JsOverlay
  @Nonnull
  default RequestDeviceOptions filters(@Nonnull final JsArray<BluetoothLEScanFilterInit> filters) {
    setFilters( filters );
    return this;
  }

  @JsProperty
  JsArray<BluetoothServiceUUID> getOptionalServices();

  @JsProperty
  void setOptionalServices(@Nonnull JsArray<BluetoothServiceUUID> optionalServices);

  @JsOverlay
  @Nonnull
  default RequestDeviceOptions optionalServices(
      @Nonnull final JsArray<BluetoothServiceUUID> optionalServices) {
    setOptionalServices( optionalServices );
    return this;
  }
}
