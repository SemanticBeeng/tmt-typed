package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The CryptoKey dictionary of the Web Crypto API represents a cryptographic key. */
trait CryptoKey extends StObject {
  
  val algorithm: org.scalajs.dom.crypto.KeyAlgorithm
  
  val extractable: scala.Boolean
  
  val `type`: org.scalajs.dom.crypto.KeyType
  
  val usages: js.Array[org.scalajs.dom.crypto.KeyUsage]
}
object CryptoKey {
  
  @scala.inline
  def apply(
    algorithm: org.scalajs.dom.crypto.KeyAlgorithm,
    extractable: scala.Boolean,
    `type`: org.scalajs.dom.crypto.KeyType,
    usages: js.Array[org.scalajs.dom.crypto.KeyUsage]
  ): CryptoKey = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], extractable = extractable.asInstanceOf[js.Any], usages = usages.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CryptoKey]
  }
  
  @scala.inline
  implicit class CryptoKeyMutableBuilder[Self <: CryptoKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgorithm(value: org.scalajs.dom.crypto.KeyAlgorithm): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtractable(value: scala.Boolean): Self = StObject.set(x, "extractable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: org.scalajs.dom.crypto.KeyType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsages(value: js.Array[org.scalajs.dom.crypto.KeyUsage]): Self = StObject.set(x, "usages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsagesVarargs(value: org.scalajs.dom.crypto.KeyUsage*): Self = StObject.set(x, "usages", js.Array(value :_*))
  }
}
