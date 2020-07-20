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
    name = "BluetoothRemoteGATTService"
)
public class BluetoothRemoteGATTService extends EventTarget {
  @Nullable
  public EventHandler oncharacteristicvaluechanged;

  @Nullable
  public EventHandler onserviceadded;

  @Nullable
  public EventHandler onservicechanged;

  @Nullable
  public EventHandler onserviceremoved;

  /**
   * Type is instantiated by the runtime no attempt should be made to instantiate type by application code.
   */
  @Deprecated
  BluetoothRemoteGATTService() {
  }

  @JsProperty(
      name = "device"
  )
  @Nonnull
  public native BluetoothDevice device();

  @JsProperty(
      name = "isPrimary"
  )
  public native boolean isPrimary();

  @JsProperty(
      name = "uuid"
  )
  @Nonnull
  public native String uuid();

  @Nonnull
  public native Promise<BluetoothRemoteGATTCharacteristic> getCharacteristic(
      @Nonnull BluetoothCharacteristicUUID characteristic);

  @Nonnull
  public native Promise<JsArray<BluetoothRemoteGATTCharacteristic>> getCharacteristics(
      @Nonnull BluetoothCharacteristicUUID characteristic);

  @Nonnull
  public native Promise<JsArray<BluetoothRemoteGATTCharacteristic>> getCharacteristics();

  @Nonnull
  public native Promise<BluetoothRemoteGATTService> getIncludedService(
      @Nonnull BluetoothServiceUUID service);

  @Nonnull
  public native Promise<JsArray<BluetoothRemoteGATTService>> getIncludedServices(
      @Nonnull BluetoothServiceUUID service);

  @Nonnull
  public native Promise<JsArray<BluetoothRemoteGATTService>> getIncludedServices();
}
