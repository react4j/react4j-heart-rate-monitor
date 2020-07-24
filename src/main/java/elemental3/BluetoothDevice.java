package elemental3;

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
    name = "BluetoothDevice"
)
public class BluetoothDevice extends EventTarget {
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

  BluetoothDevice() {
  }

  @JsProperty(
      name = "gatt"
  )
  @Nullable
  public native BluetoothRemoteGATTServer gatt();

  @JsProperty(
      name = "id"
  )
  @Nonnull
  public native String id();

  @JsProperty(
      name = "name"
  )
  @Nullable
  public native String name();

  @JsProperty(
      name = "watchingAdvertisements"
  )
  public native boolean watchingAdvertisements();

  @Nonnull
  public native Promise<Void> watchAdvertisements(@Nonnull WatchAdvertisementsOptions options);

  @Nonnull
  public native Promise<Void> watchAdvertisements();
}
