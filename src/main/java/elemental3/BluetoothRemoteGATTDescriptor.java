package elemental3;

import elemental2.core.DataView;
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
    name = "BluetoothRemoteGATTDescriptor"
)
public class BluetoothRemoteGATTDescriptor {
  /**
   * Type is instantiated by the runtime no attempt should be made to instantiate type by application code.
   */
  @Deprecated
  BluetoothRemoteGATTDescriptor() {
  }

  @JsProperty(
      name = "characteristic"
  )
  @Nonnull
  public native BluetoothRemoteGATTCharacteristic characteristic();

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
  public native Promise<DataView> readValue();

  @Nonnull
  public native Promise<Void> writeValue(@Nonnull BufferSource value);
}
