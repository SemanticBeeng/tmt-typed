package tmttyped.std

import tmttyped.std.stdStrings.rejected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PromiseRejectedResult
  extends StObject
     with PromiseSettledResult[js.Any] {
  
  var reason: js.Any
  
  var status: rejected
}
object PromiseRejectedResult {
  
  @scala.inline
  def apply(reason: js.Any): PromiseRejectedResult = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], status = "rejected")
    __obj.asInstanceOf[PromiseRejectedResult]
  }
  
  @scala.inline
  implicit class PromiseRejectedResultMutableBuilder[Self <: PromiseRejectedResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReason(value: js.Any): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: rejected): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
