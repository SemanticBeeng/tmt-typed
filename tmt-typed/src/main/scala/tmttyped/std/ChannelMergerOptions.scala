package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelMergerOptions
  extends StObject
     with AudioNodeOptions {
  
  var numberOfInputs: js.UndefOr[Double] = js.undefined
}
object ChannelMergerOptions {
  
  @scala.inline
  def apply(): ChannelMergerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelMergerOptions]
  }
  
  @scala.inline
  implicit class ChannelMergerOptionsMutableBuilder[Self <: ChannelMergerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNumberOfInputs(value: Double): Self = StObject.set(x, "numberOfInputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfInputsUndefined: Self = StObject.set(x, "numberOfInputs", js.undefined)
  }
}
