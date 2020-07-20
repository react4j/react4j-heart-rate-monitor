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
public interface BluetoothDataFilterInit {
  @JsOverlay
  @Nonnull
  static BluetoothDataFilterInit create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty
  BufferSource getDataPrefix();

  @JsProperty
  void setDataPrefix(@Nonnull BufferSource dataPrefix);

  @JsOverlay
  @Nonnull
  default BluetoothDataFilterInit dataPrefix(@Nonnull BufferSource dataPrefix) {
    setDataPrefix( dataPrefix );
    return this;
  }

  @JsProperty
  BufferSource getMask();

  @JsProperty
  void setMask(@Nonnull BufferSource mask);

  @JsOverlay
  @Nonnull
  default BluetoothDataFilterInit mask(@Nonnull BufferSource mask) {
    setMask( mask );
    return this;
  }
}
