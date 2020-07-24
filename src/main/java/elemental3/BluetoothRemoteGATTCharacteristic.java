package elemental3;

import elemental2.core.ArrayBuffer;
import elemental2.core.DataView;
import elemental2.core.Float32Array;
import elemental2.core.Float64Array;
import elemental2.core.Int16Array;
import elemental2.core.Int32Array;
import elemental2.core.Int8Array;
import elemental2.core.JsArray;
import elemental2.core.Uint16Array;
import elemental2.core.Uint32Array;
import elemental2.core.Uint8Array;
import elemental2.core.Uint8ClampedArray;
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
  public native Promise<BluetoothRemoteGATTDescriptor> getDescriptor(@Nonnull String descriptor);

  @Nonnull
  public native Promise<BluetoothRemoteGATTDescriptor> getDescriptor(int descriptor);

  @Nonnull
  public native Promise<JsArray<BluetoothRemoteGATTDescriptor>> getDescriptors(
      @Nonnull BluetoothDescriptorUUID descriptor);

  @Nonnull
  public native Promise<JsArray<BluetoothRemoteGATTDescriptor>> getDescriptors(
      @Nonnull String descriptor);

  @Nonnull
  public native Promise<JsArray<BluetoothRemoteGATTDescriptor>> getDescriptors(int descriptor);

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
  public native Promise<Void> writeValue(@Nonnull ArrayBufferView value);

  @Nonnull
  public native Promise<Void> writeValue(@Nonnull Int8Array value);

  @Nonnull
  public native Promise<Void> writeValue(@Nonnull Int16Array value);

  @Nonnull
  public native Promise<Void> writeValue(@Nonnull Int32Array value);

  @Nonnull
  public native Promise<Void> writeValue(@Nonnull Uint8Array value);

  @Nonnull
  public native Promise<Void> writeValue(@Nonnull Uint16Array value);

  @Nonnull
  public native Promise<Void> writeValue(@Nonnull Uint32Array value);

  @Nonnull
  public native Promise<Void> writeValue(@Nonnull Uint8ClampedArray value);

  @Nonnull
  public native Promise<Void> writeValue(@Nonnull Float32Array value);

  @Nonnull
  public native Promise<Void> writeValue(@Nonnull Float64Array value);

  @Nonnull
  public native Promise<Void> writeValue(@Nonnull DataView value);

  @Nonnull
  public native Promise<Void> writeValue(@Nonnull ArrayBuffer value);

  @Nonnull
  public native Promise<Void> writeValueWithResponse(@Nonnull BufferSource value);

  @Nonnull
  public native Promise<Void> writeValueWithResponse(@Nonnull ArrayBufferView value);

  @Nonnull
  public native Promise<Void> writeValueWithResponse(@Nonnull Int8Array value);

  @Nonnull
  public native Promise<Void> writeValueWithResponse(@Nonnull Int16Array value);

  @Nonnull
  public native Promise<Void> writeValueWithResponse(@Nonnull Int32Array value);

  @Nonnull
  public native Promise<Void> writeValueWithResponse(@Nonnull Uint8Array value);

  @Nonnull
  public native Promise<Void> writeValueWithResponse(@Nonnull Uint16Array value);

  @Nonnull
  public native Promise<Void> writeValueWithResponse(@Nonnull Uint32Array value);

  @Nonnull
  public native Promise<Void> writeValueWithResponse(@Nonnull Uint8ClampedArray value);

  @Nonnull
  public native Promise<Void> writeValueWithResponse(@Nonnull Float32Array value);

  @Nonnull
  public native Promise<Void> writeValueWithResponse(@Nonnull Float64Array value);

  @Nonnull
  public native Promise<Void> writeValueWithResponse(@Nonnull DataView value);

  @Nonnull
  public native Promise<Void> writeValueWithResponse(@Nonnull ArrayBuffer value);

  @Nonnull
  public native Promise<Void> writeValueWithoutResponse(@Nonnull BufferSource value);

  @Nonnull
  public native Promise<Void> writeValueWithoutResponse(@Nonnull ArrayBufferView value);

  @Nonnull
  public native Promise<Void> writeValueWithoutResponse(@Nonnull Int8Array value);

  @Nonnull
  public native Promise<Void> writeValueWithoutResponse(@Nonnull Int16Array value);

  @Nonnull
  public native Promise<Void> writeValueWithoutResponse(@Nonnull Int32Array value);

  @Nonnull
  public native Promise<Void> writeValueWithoutResponse(@Nonnull Uint8Array value);

  @Nonnull
  public native Promise<Void> writeValueWithoutResponse(@Nonnull Uint16Array value);

  @Nonnull
  public native Promise<Void> writeValueWithoutResponse(@Nonnull Uint32Array value);

  @Nonnull
  public native Promise<Void> writeValueWithoutResponse(@Nonnull Uint8ClampedArray value);

  @Nonnull
  public native Promise<Void> writeValueWithoutResponse(@Nonnull Float32Array value);

  @Nonnull
  public native Promise<Void> writeValueWithoutResponse(@Nonnull Float64Array value);

  @Nonnull
  public native Promise<Void> writeValueWithoutResponse(@Nonnull DataView value);

  @Nonnull
  public native Promise<Void> writeValueWithoutResponse(@Nonnull ArrayBuffer value);
}
