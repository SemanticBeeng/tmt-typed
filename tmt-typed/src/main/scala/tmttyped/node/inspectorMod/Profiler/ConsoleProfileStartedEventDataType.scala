package tmttyped.node.inspectorMod.Profiler

import tmttyped.node.inspectorMod.Debugger.Location
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsoleProfileStartedEventDataType extends StObject {
  
  var id: String
  
  /**
    * Location of console.profile().
    */
  var location: Location
  
  /**
    * Profile title passed as an argument to console.profile().
    */
  var title: js.UndefOr[String] = js.undefined
}
object ConsoleProfileStartedEventDataType {
  
  @scala.inline
  def apply(id: String, location: Location): ConsoleProfileStartedEventDataType = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsoleProfileStartedEventDataType]
  }
  
  @scala.inline
  implicit class ConsoleProfileStartedEventDataTypeMutableBuilder[Self <: ConsoleProfileStartedEventDataType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
