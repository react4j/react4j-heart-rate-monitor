package elemental3;

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
public interface AllowedBluetoothDevice {
  @JsOverlay
  @Nonnull
  static AllowedBluetoothDevice create(@Nonnull final StringOrUUIDArrayUnion allowedServices,
      @Nonnull final String deviceId, final boolean mayUseGATT) {
    final AllowedBluetoothDevice $instance$ = Js.uncheckedCast( JsPropertyMap.of() );
    $instance$.setAllowedServices( allowedServices );
    $instance$.setDeviceId( deviceId );
    $instance$.setMayUseGATT( mayUseGATT );
    return $instance$;
  }

  @JsProperty
  @Nonnull
  StringOrUUIDArrayUnion getAllowedServices();

  @JsProperty
  void setAllowedServices(@Nonnull StringOrUUIDArrayUnion allowedServices);

  @JsOverlay
  @Nonnull
  default AllowedBluetoothDevice allowedServices(@Nonnull StringOrUUIDArrayUnion allowedServices) {
    setAllowedServices( allowedServices );
    return this;
  }

  @JsProperty
  @Nonnull
  String getDeviceId();

  @JsProperty
  void setDeviceId(@Nonnull String deviceId);

  @JsOverlay
  @Nonnull
  default AllowedBluetoothDevice deviceId(@Nonnull String deviceId) {
    setDeviceId( deviceId );
    return this;
  }

  @JsProperty
  boolean isMayUseGATT();

  @JsProperty
  void setMayUseGATT(boolean mayUseGATT);

  @JsOverlay
  @Nonnull
  default AllowedBluetoothDevice mayUseGATT(boolean mayUseGATT) {
    setMayUseGATT( mayUseGATT );
    return this;
  }
}
