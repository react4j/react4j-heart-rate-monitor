package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface ValueEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static ValueEventInit create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty
  @Nullable
  Any getValue();

  @JsProperty
  void setValue(@Nullable Any value);

  @JsOverlay
  @Nonnull
  default ValueEventInit value(@Nullable Any value) {
    setValue( value );
    return this;
  }
}
