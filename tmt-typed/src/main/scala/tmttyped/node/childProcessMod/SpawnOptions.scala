package tmttyped.node.childProcessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpawnOptions
  extends StObject
     with CommonSpawnOptions {
  
  var detached: js.UndefOr[Boolean] = js.undefined
}
object SpawnOptions {
  
  @scala.inline
  def apply(): SpawnOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpawnOptions]
  }
  
  @scala.inline
  implicit class SpawnOptionsMutableBuilder[Self <: SpawnOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetached(value: Boolean): Self = StObject.set(x, "detached", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetachedUndefined: Self = StObject.set(x, "detached", js.undefined)
  }
}
