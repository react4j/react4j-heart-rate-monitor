package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "PermissionStatus"
)
public class PermissionStatus extends EventTarget {
  @Nullable
  public EventHandler onchange;

  /**
   * Type is instantiated by the runtime no attempt should be made to instantiate type by application code.
   */
  @Deprecated
  PermissionStatus() {
  }

  @JsProperty(
      name = "state"
  )
  @Nonnull
  public native String state();
}
