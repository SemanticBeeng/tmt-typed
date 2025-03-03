package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PushSubscriptionOptions extends StObject {
  
  val applicationServerKey: js.typedarray.ArrayBuffer | Null
  
  val userVisibleOnly: scala.Boolean
}
object PushSubscriptionOptions {
  
  @scala.inline
  def apply(userVisibleOnly: scala.Boolean): PushSubscriptionOptions = {
    val __obj = js.Dynamic.literal(userVisibleOnly = userVisibleOnly.asInstanceOf[js.Any], applicationServerKey = null)
    __obj.asInstanceOf[PushSubscriptionOptions]
  }
  
  @scala.inline
  implicit class PushSubscriptionOptionsMutableBuilder[Self <: PushSubscriptionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationServerKey(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "applicationServerKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationServerKeyNull: Self = StObject.set(x, "applicationServerKey", null)
    
    @scala.inline
    def setUserVisibleOnly(value: scala.Boolean): Self = StObject.set(x, "userVisibleOnly", value.asInstanceOf[js.Any])
  }
}
