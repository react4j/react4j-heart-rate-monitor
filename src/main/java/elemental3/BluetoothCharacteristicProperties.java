package elemental3;

import javax.annotation.Generated;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "BluetoothCharacteristicProperties"
)
public class BluetoothCharacteristicProperties {
  /**
   * Type is instantiated by the runtime no attempt should be made to instantiate type by application code.
   */
  @Deprecated
  BluetoothCharacteristicProperties() {
  }

  @JsProperty(
      name = "authenticatedSignedWrites"
  )
  public native boolean authenticatedSignedWrites();

  @JsProperty(
      name = "broadcast"
  )
  public native boolean broadcast();

  @JsProperty(
      name = "indicate"
  )
  public native boolean indicate();

  @JsProperty(
      name = "notify"
  )
  public native boolean notify();

  @JsProperty(
      name = "read"
  )
  public native boolean read();

  @JsProperty(
      name = "reliableWrite"
  )
  public native boolean reliableWrite();

  @JsProperty(
      name = "writableAuxiliaries"
  )
  public native boolean writableAuxiliaries();

  @JsProperty(
      name = "write"
  )
  public native boolean write();

  @JsProperty(
      name = "writeWithoutResponse"
  )
  public native boolean writeWithoutResponse();
}
