package elemental3;

import elemental2.core.JsArray;
import elemental2.promise.Promise;
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

  @JsProperty(
      name = "referringDevice"
  )
  @Nullable
  public native BluetoothDevice referringDevice();

  @Nonnull
  public native Promise<Boolean> getAvailability();

  @Nonnull
  public native Promise<JsArray<BluetoothDevice>> getDevices();

  @Nonnull
  public native Promise<BluetoothDevice> requestDevice(@Nonnull RequestDeviceOptions options);

  @Nonnull
  public native Promise<BluetoothDevice> requestDevice();
}
