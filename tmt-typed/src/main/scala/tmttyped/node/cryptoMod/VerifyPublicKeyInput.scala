package tmttyped.node.cryptoMod

import tmttyped.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifyPublicKeyInput
  extends PublicKeyInput
     with SigningOptions
object VerifyPublicKeyInput {
  
  @scala.inline
  def apply(key: String | Buffer): VerifyPublicKeyInput = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyPublicKeyInput]
  }
}
