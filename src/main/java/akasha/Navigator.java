package akasha;

import akasha.bluetooth.Bluetooth;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * The Navigator interface represents the state and the identity of the user agent. It allows scripts to query it and to register themselves to carry on some activities.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator">Navigator - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#the-navigator-object">the Navigator object - HTML Living Standard</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Navigator"
)
public final class Navigator {
  private Navigator() {
  }

  @JsOverlay
  @Nonnull
  public static Navigator of(@Nonnull final Object object) {
    return Js.cast( object );
  }

  @JsProperty(
      name = "bluetooth"
  )
  @Nonnull
  public native Bluetooth bluetooth();

  /**
   * The Navigator.permissions read-only property returns a Permissions object that can be used to query and update permission status of APIs covered by the Permissions API.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Navigator/permissions">Navigator.permissions - MDN</a>
   */
  @JsProperty(
      name = "permissions"
  )
  @Nonnull
  public native Permissions permissions();
}