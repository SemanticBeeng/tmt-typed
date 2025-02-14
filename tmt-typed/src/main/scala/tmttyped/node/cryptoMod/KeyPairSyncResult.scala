package tmttyped.node.cryptoMod

import tmttyped.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyPairSyncResult[T1 /* <: String | Buffer */, T2 /* <: String | Buffer */] extends StObject {
  
  var privateKey: T2
  
  var publicKey: T1
}
object KeyPairSyncResult {
  
  @scala.inline
  def apply[T1 /* <: String | Buffer */, T2 /* <: String | Buffer */](privateKey: T2, publicKey: T1): KeyPairSyncResult[T1, T2] = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyPairSyncResult[T1, T2]]
  }
  
  @scala.inline
  implicit class KeyPairSyncResultMutableBuilder[Self <: KeyPairSyncResult[_, _], T1 /* <: String | Buffer */, T2 /* <: String | Buffer */] (val x: Self with (KeyPairSyncResult[T1, T2])) extends AnyVal {
    
    @scala.inline
    def setPrivateKey(value: T2): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKey(value: T1): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
  }
}
