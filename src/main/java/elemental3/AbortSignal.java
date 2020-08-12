package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The AbortSignal interface represents a signal object that allows you to communicate with a DOM request (such as a Fetch) and abort it if required via an AbortController object.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal">AbortSignal - MDN</a>
 */
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

  /**
   * The aborted read-only property returns a Boolean that indicates whether the DOM request(s) the signal is communicating with is/are aborted (true) or not (false).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal/aborted">AbortSignal.aborted - MDN</a>
   */
  @JsProperty(
      name = "aborted"
  )
  public native boolean aborted();
}
