package elemental3;

import elemental2.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Permissions"
)
public class Permissions {
  Permissions() {
  }

  @Nonnull
  public native Promise<PermissionStatus> query(@Nonnull Object permissionDesc);
}
