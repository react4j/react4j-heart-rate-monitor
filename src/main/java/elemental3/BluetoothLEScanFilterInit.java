package elemental3;

import elemental2.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface BluetoothLEScanFilterInit {
  @JsOverlay
  @Nonnull
  static BluetoothLEScanFilterInit create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty
  Object getManufacturerData();

  @JsProperty
  void setManufacturerData(@Nonnull Object manufacturerData);

  @JsOverlay
  @Nonnull
  default BluetoothLEScanFilterInit manufacturerData(@Nonnull Object manufacturerData) {
    setManufacturerData( manufacturerData );
    return this;
  }

  @JsProperty
  String getName();

  @JsProperty
  void setName(@Nonnull String name);

  @JsOverlay
  @Nonnull
  default BluetoothLEScanFilterInit name(@Nonnull String name) {
    setName( name );
    return this;
  }

  @JsProperty
  String getNamePrefix();

  @JsProperty
  void setNamePrefix(@Nonnull String namePrefix);

  @JsOverlay
  @Nonnull
  default BluetoothLEScanFilterInit namePrefix(@Nonnull String namePrefix) {
    setNamePrefix( namePrefix );
    return this;
  }

  @JsProperty
  Object getServiceData();

  @JsProperty
  void setServiceData(@Nonnull Object serviceData);

  @JsOverlay
  @Nonnull
  default BluetoothLEScanFilterInit serviceData(@Nonnull Object serviceData) {
    setServiceData( serviceData );
    return this;
  }

  @JsProperty
  JsArray<BluetoothServiceUUID> getServices();

  @JsProperty
  void setServices(@Nonnull JsArray<BluetoothServiceUUID> services);

  @JsOverlay
  @Nonnull
  default BluetoothLEScanFilterInit services(@Nonnull JsArray<BluetoothServiceUUID> services) {
    setServices( services );
    return this;
  }
}
