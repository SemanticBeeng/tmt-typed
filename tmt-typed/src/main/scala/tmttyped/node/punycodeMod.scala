package tmttyped.node

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object punycodeMod {
  
  @JSImport("punycode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The `punycode.decode()` method converts a [Punycode](https://tools.ietf.org/html/rfc3492) string of ASCII-only
    * characters to the equivalent string of Unicode codepoints.
    *
    * ```js
    * punycode.decode('maana-pta'); // 'mañana'
    * punycode.decode('--dqo34k'); // '☃-⌘'
    * ```
    * @since v0.5.1
    */
  @scala.inline
  def decode(string: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(string.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  /**
    * The `punycode.encode()` method converts a string of Unicode codepoints to a[Punycode](https://tools.ietf.org/html/rfc3492) string of ASCII-only characters.
    *
    * ```js
    * punycode.encode('mañana'); // 'maana-pta'
    * punycode.encode('☃-⌘'); // '--dqo34k'
    * ```
    * @since v0.5.1
    */
  @scala.inline
  def encode(string: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(string.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  /**
    * The `punycode.toASCII()` method converts a Unicode string representing an
    * Internationalized Domain Name to [Punycode](https://tools.ietf.org/html/rfc3492). Only the non-ASCII parts of the
    * domain name will be converted. Calling `punycode.toASCII()` on a string that
    * already only contains ASCII characters will have no effect.
    *
    * ```js
    * // encode domain names
    * punycode.toASCII('mañana.com');  // 'xn--maana-pta.com'
    * punycode.toASCII('☃-⌘.com');   // 'xn----dqo34k.com'
    * punycode.toASCII('example.com'); // 'example.com'
    * ```
    * @since v0.6.1
    */
  @scala.inline
  def toASCII(domain: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("toASCII")(domain.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  /**
    * The `punycode.toUnicode()` method converts a string representing a domain name
    * containing [Punycode](https://tools.ietf.org/html/rfc3492) encoded characters into Unicode. Only the [Punycode](https://tools.ietf.org/html/rfc3492)encoded parts of the domain name are be
    * converted.
    *
    * ```js
    * // decode domain names
    * punycode.toUnicode('xn--maana-pta.com'); // 'mañana.com'
    * punycode.toUnicode('xn----dqo34k.com');  // '☃-⌘.com'
    * punycode.toUnicode('example.com');       // 'example.com'
    * ```
    * @since v0.6.1
    */
  @scala.inline
  def toUnicode(domain: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("toUnicode")(domain.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  trait ucs2 extends StObject {
    
    /**
      * @deprecated since v7.0.0
      * The version of the punycode module bundled in Node.js is being deprecated.
      * In a future major version of Node.js this module will be removed.
      * Users currently depending on the punycode module should switch to using
      * the userland-provided Punycode.js module instead.
      */
    def decode(string: java.lang.String): js.Array[Double]
    
    /**
      * @deprecated since v7.0.0
      * The version of the punycode module bundled in Node.js is being deprecated.
      * In a future major version of Node.js this module will be removed.
      * Users currently depending on the punycode module should switch to using
      * the userland-provided Punycode.js module instead.
      */
    def encode(codePoints: js.Array[Double]): java.lang.String
  }
  object ucs2 {
    
    /**
      * @deprecated since v7.0.0
      * The version of the punycode module bundled in Node.js is being deprecated.
      * In a future major version of Node.js this module will be removed.
      * Users currently depending on the punycode module should switch to using
      * the userland-provided Punycode.js module instead.
      */
    @JSImport("punycode", "ucs2")
    @js.native
    val ^ : ucs2 = js.native
    
    @scala.inline
    implicit class ucs2MutableBuilder[Self <: ucs2] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDecode(value: java.lang.String => js.Array[Double]): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEncode(value: js.Array[Double] => java.lang.String): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * @deprecated since v7.0.0
    * The version of the punycode module bundled in Node.js is being deprecated.
    * In a future major version of Node.js this module will be removed.
    * Users currently depending on the punycode module should switch to using
    * the userland-provided Punycode.js module instead.
    */
  @JSImport("punycode", "version")
  @js.native
  val version: java.lang.String = js.native
}
