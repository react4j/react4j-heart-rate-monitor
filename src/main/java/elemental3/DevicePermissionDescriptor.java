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
public interface DevicePermissionDescriptor extends PermissionDescriptor {
  @JsOverlay
  @Nonnull
  static DevicePermissionDescriptor create(@Nonnull final String name) {
    final DevicePermissionDescriptor $instance$ = Js.uncheckedCast( JsPropertyMap.of() );
    $instance$.setName( name );
    return $instance$;
  }

  @JsProperty
  String getDeviceId();

  @JsProperty
  void setDeviceId(@Nonnull String deviceId);

  @JsOverlay
  @Nonnull
  default DevicePermissionDescriptor deviceId(@Nonnull String deviceId) {
    setDeviceId( deviceId );
    return this;
  }
}
