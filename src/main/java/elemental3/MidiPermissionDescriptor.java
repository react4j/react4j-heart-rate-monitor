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
public interface MidiPermissionDescriptor extends PermissionDescriptor {
  @JsOverlay
  @Nonnull
  static MidiPermissionDescriptor create(@Nonnull final String name) {
    final MidiPermissionDescriptor $instance$ = Js.uncheckedCast( JsPropertyMap.of() );
    $instance$.setName( name );
    return $instance$;
  }

  @JsProperty
  boolean isSysex();

  @JsProperty
  void setSysex(boolean sysex);

  @JsOverlay
  @Nonnull
  default MidiPermissionDescriptor sysex(boolean sysex) {
    setSysex( sysex );
    return this;
  }
}
