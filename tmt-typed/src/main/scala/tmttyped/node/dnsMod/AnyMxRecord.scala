package tmttyped.node.dnsMod

import tmttyped.node.nodeStrings.MX
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnyMxRecord
  extends StObject
     with MxRecord
     with AnyRecord {
  
  var `type`: MX
}
object AnyMxRecord {
  
  @scala.inline
  def apply(exchange: String, priority: Double): AnyMxRecord = {
    val __obj = js.Dynamic.literal(exchange = exchange.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MX")
    __obj.asInstanceOf[AnyMxRecord]
  }
  
  @scala.inline
  implicit class AnyMxRecordMutableBuilder[Self <: AnyMxRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: MX): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
