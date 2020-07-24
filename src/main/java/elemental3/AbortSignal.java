package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "AbortSignal"
)
public class AbortSignal extends EventTarget {
  @Nullable
  public EventHandler onabort;

  AbortSignal() {
  }

  @JsProperty(
      name = "aborted"
  )
  public native boolean aborted();
}
