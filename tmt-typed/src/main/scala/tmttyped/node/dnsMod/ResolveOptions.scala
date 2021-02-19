package tmttyped.node.dnsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolveOptions extends StObject {
  
  var ttl: Boolean
}
object ResolveOptions {
  
  @scala.inline
  def apply(ttl: Boolean): ResolveOptions = {
    val __obj = js.Dynamic.literal(ttl = ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolveOptions]
  }
  
  @scala.inline
  implicit class ResolveOptionsMutableBuilder[Self <: ResolveOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTtl(value: Boolean): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
  }
}
