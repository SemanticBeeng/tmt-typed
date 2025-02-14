package tmttyped.node.dnsMod

import tmttyped.node.nodeStrings.SRV
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnySrvRecord
  extends StObject
     with SrvRecord
     with AnyRecord {
  
  var `type`: SRV
}
object AnySrvRecord {
  
  @scala.inline
  def apply(name: String, port: Double, priority: Double, weight: Double): AnySrvRecord = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SRV")
    __obj.asInstanceOf[AnySrvRecord]
  }
  
  @scala.inline
  implicit class AnySrvRecordMutableBuilder[Self <: AnySrvRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: SRV): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
