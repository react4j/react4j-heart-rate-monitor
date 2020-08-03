package elemental3;

import elemental2.core.JsArray;
import elemental2.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The Bluetooth interface of the Web Bluetooth API returns a Promise to a BluetoothDevice object with the specified options.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Bluetooth">Bluetooth - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Bluetooth"
)
public class Bluetooth extends EventTarget {
  @Nullable
  public EventHandler onavailabilitychanged;

  @Nullable
  public EventHandler onserviceadded;

  @Nullable
  public EventHandler onservicechanged;

  @Nullable
  public EventHandler onserviceremoved;

  @Nullable
  public EventHandler onadvertisementreceived;

  @Nullable
  public EventHandler ongattserverdisconnected;

  @Nullable
  public EventHandler oncharacteristicvaluechanged;

  Bluetooth() {
  }

  /**
   * The Bluetooth.referringDevice attribute of the Bluetooth interface returns a BluetoothDevice if the current document was opened in response to an instruction sent by this device and null otherwise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Bluetooth/referringDevice">Bluetooth.referringDevice - MDN</a>
   */
  @JsProperty(
      name = "referringDevice"
  )
  @Nullable
  public native BluetoothDevice referringDevice();

  /**
   * The getAvailability() method of Bluetooth interface of Web Bluetooth API interface exposes the Bluetooth capabilities of the current device. For a returns a Boolean which is true if the deveice has a Bluetooth adapter and false otherwise (unless user configured User Agent not to expose a real value).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Bluetooth/getAvailability">Bluetooth.getAvailability - MDN</a>
   */
  @Nonnull
  public native Promise<Boolean> getAvailability();

  /**
   * The getDevices() method of Bluetooth interface of Web Bluetooth API exposes the Bluetooth devices this origin is allowed to access. This method does not display any permission prompts.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Bluetooth/getDevices">Bluetooth.getDevices - MDN</a>
   */
  @Nonnull
  public native Promise<JsArray<BluetoothDevice>> getDevices();

  /**
   * The Bluetooth.requestDevice() method of the Bluetooth interface returns a Promise to a BluetoothDevice object with the specified options. If there is no chooser UI, this method returns the first device matching the criteria.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Bluetooth/requestDevice">Bluetooth.requestDevice - MDN</a>
   */
  @Nonnull
  public native Promise<BluetoothDevice> requestDevice(@Nonnull RequestDeviceOptions options);

  /**
   * The Bluetooth.requestDevice() method of the Bluetooth interface returns a Promise to a BluetoothDevice object with the specified options. If there is no chooser UI, this method returns the first device matching the criteria.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Bluetooth/requestDevice">Bluetooth.requestDevice - MDN</a>
   */
  @Nonnull
  public native Promise<BluetoothDevice> requestDevice();
}
