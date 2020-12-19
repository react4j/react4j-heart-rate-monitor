package elemental3;

import elemental3.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The Float64Array typed array represents an array of 64-bit floating point numbers (corresponding
 * to the C double data type) in the platform byte order. If control over byte order is needed, use
 * DataView instead. The contents are initialized to 0. Once established, you can reference elements
 * in the array using the object's methods, or using standard array index syntax (that is, using
 * bracket notation).
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Float64Array">Float64Array - MDN</a>
 * @see <a href="https://tc39.es/ecma262/#sec-typedarray-objects">TypedArray Objects - ECMA</a>
 * @see <a href="https://heycam.github.io/webidl/#idl-Float64Array">Float64Array - WebIDL</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Float64Array"
)
public class Float64Array implements TypedArray {
  /**
   * The BYTES_PER_ELEMENT property represents the size in bytes of each element in an typed array.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray/BYTES_PER_ELEMENT">TypedArray.BYTES_PER_ELEMENT - MDN</a>
   */
  @JsOverlay
  public static final int BYTES_PER_ELEMENT = 8;

  /**
   * The name property represents a string value of the typed array constructor name.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray/name">TypedArray.name - MDN</a>
   */
  @JsOverlay
  public static final String name = "Float64Array";

  /**
   * The Float64Array() typed array constructor creates a new Float64Array object, which is, an array of 64-bit floating point numbers (corresponding to the C double data type) in the platform byte order. If control over byte order is needed, use DataView instead. The contents are initialized to 0. Once established, you can reference elements in the array using the object's methods, or using standard array index syntax (that is, using bracket notation).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Float64Array/Float64Array">Float64Array.Float64Array - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-typedarray-constructors">The definition of 'TypedArray constructors' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  public Float64Array(final int length) {
  }

  /**
   * The Float64Array() typed array constructor creates a new Float64Array object, which is, an array of 64-bit floating point numbers (corresponding to the C double data type) in the platform byte order. If control over byte order is needed, use DataView instead. The contents are initialized to 0. Once established, you can reference elements in the array using the object's methods, or using standard array index syntax (that is, using bracket notation).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Float64Array/Float64Array">Float64Array.Float64Array - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-typedarray-constructors">The definition of 'TypedArray constructors' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  public Float64Array(@Nonnull final Float64Array array) {
  }

  /**
   * The Float64Array() typed array constructor creates a new Float64Array object, which is, an array of 64-bit floating point numbers (corresponding to the C double data type) in the platform byte order. If control over byte order is needed, use DataView instead. The contents are initialized to 0. Once established, you can reference elements in the array using the object's methods, or using standard array index syntax (that is, using bracket notation).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Float64Array/Float64Array">Float64Array.Float64Array - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-typedarray-constructors">The definition of 'TypedArray constructors' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  public Float64Array(@Nonnull final JsArray<Double> array) {
  }

  /**
   * The Float64Array() typed array constructor creates a new Float64Array object, which is, an array of 64-bit floating point numbers (corresponding to the C double data type) in the platform byte order. If control over byte order is needed, use DataView instead. The contents are initialized to 0. Once established, you can reference elements in the array using the object's methods, or using standard array index syntax (that is, using bracket notation).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Float64Array/Float64Array">Float64Array.Float64Array - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-typedarray-constructors">The definition of 'TypedArray constructors' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  public Float64Array(@Nonnull final double[] array) {
  }

  /**
   * The Float64Array() typed array constructor creates a new Float64Array object, which is, an array of 64-bit floating point numbers (corresponding to the C double data type) in the platform byte order. If control over byte order is needed, use DataView instead. The contents are initialized to 0. Once established, you can reference elements in the array using the object's methods, or using standard array index syntax (that is, using bracket notation).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Float64Array/Float64Array">Float64Array.Float64Array - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-typedarray-constructors">The definition of 'TypedArray constructors' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  public Float64Array(@Nonnull final ArrayBuffer buffer, final int byteOffset, final int length) {
  }

  /**
   * The Float64Array() typed array constructor creates a new Float64Array object, which is, an array of 64-bit floating point numbers (corresponding to the C double data type) in the platform byte order. If control over byte order is needed, use DataView instead. The contents are initialized to 0. Once established, you can reference elements in the array using the object's methods, or using standard array index syntax (that is, using bracket notation).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Float64Array/Float64Array">Float64Array.Float64Array - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-typedarray-constructors">The definition of 'TypedArray constructors' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  public Float64Array(@Nonnull final ArrayBuffer buffer, final int byteOffset) {
  }

  /**
   * The Float64Array() typed array constructor creates a new Float64Array object, which is, an array of 64-bit floating point numbers (corresponding to the C double data type) in the platform byte order. If control over byte order is needed, use DataView instead. The contents are initialized to 0. Once established, you can reference elements in the array using the object's methods, or using standard array index syntax (that is, using bracket notation).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Float64Array/Float64Array">Float64Array.Float64Array - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-typedarray-constructors">The definition of 'TypedArray constructors' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  public Float64Array(@Nonnull final ArrayBuffer buffer) {
  }

  @JsProperty(
      name = "buffer"
  )
  @Nonnull
  public native ArrayBuffer buffer();

  @JsProperty(
      name = "byteLength"
  )
  public native int byteLength();

  @JsProperty(
      name = "byteOffset"
  )
  public native int byteOffset();

  @JsProperty(
      name = "length"
  )
  public native int length();

  @Nonnull
  public static native Float64Array of(double... element);

  /**
   * The copyWithin() method shallow copies part of an array to another location in the same array and returns it without modifying its length.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray/copyWithin">Typed%TypedArray%.prototype.copyWithin() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-%typedarray%.prototype.copywithin">%TypedArray%.prototype.copyWithin - ECMA</a>
   */
  @Nonnull
  public native Float64Array copyWithin(int target, int start, int end);

  /**
   * The copyWithin() method shallow copies part of an array to another location in the same array and returns it without modifying its length.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray/copyWithin">Typed%TypedArray%.prototype.copyWithin() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-%typedarray%.prototype.copywithin">%TypedArray%.prototype.copyWithin - ECMA</a>
   */
  @Nonnull
  public native Float64Array copyWithin(int target, int start);

  public native double get(int index);

  public native void set(int index, double value);

  public native void set(@Nonnull Float64Array array, int offset);

  public native void set(@Nonnull Float64Array array);

  public native void set(@Nonnull JsArray<Double> array, int offset);

  public native void set(@Nonnull double[] array, int offset);

  public native void set(@Nonnull JsArray<Double> array);

  public native void set(@Nonnull double[] array);

  @Nonnull
  public native Float64Array subarray(int start, int end);

  @JsMethod(
      name = "toString"
  )
  @Nonnull
  public native String toString_();
}