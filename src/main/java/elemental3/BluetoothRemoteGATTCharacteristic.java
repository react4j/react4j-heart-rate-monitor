package elemental3;

import elemental2.core.DataView;
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
    name = "BluetoothRemoteGATTCharacteristic"
)
public class BluetoothRemoteGATTCharacteristic extends EventTarget {
  @Nullable
  public EventHandler oncharacteristicvaluechanged;

  /**
   * Type is instantiated by the runtime no attempt should be made to instantiate type by application code.
   */
  @Deprecated
  BluetoothRemoteGATTCharacteristic() {
  }

  @JsProperty(
      name = "properties"
  )
  @Nonnull
  public native BluetoothCharacteristicProperties properties();

  @JsProperty(
      name = "service"
  )
  @Nonnull
  public native BluetoothRemoteGATTService service();

  @JsProperty(
      name = "uuid"
  )
  @Nonnull
  public native String uuid();

  @JsProperty(
      name = "value"
  )
  @Nullable
  public native DataView value();

  @Nonnull
  public native Promise<BluetoothRemoteGATTDescriptor> getDescriptor(
      @Nonnull BluetoothDescriptorUUID descriptor);

  @Nonnull
  public native Promise<JsArray<BluetoothRemoteGATTDescriptor>> getDescriptors(
      @Nonnull BluetoothDescriptorUUID descriptor);

  @Nonnull
  public native Promise<JsArray<BluetoothRemoteGATTDescriptor>> getDescriptors();

  @Nonnull
  public native Promise<DataView> readValue();

  @Nonnull
  public native Promise<BluetoothRemoteGATTCharacteristic> startNotifications();

  @Nonnull
  public native Promise<BluetoothRemoteGATTCharacteristic> stopNotifications();

  @Nonnull
  public native Promise<Void> writeValue(@Nonnull BufferSource value);

  @Nonnull
  public native Promise<Void> writeValueWithResponse(@Nonnull BufferSource value);

  @Nonnull
  public native Promise<Void> writeValueWithoutResponse(@Nonnull BufferSource value);
}
