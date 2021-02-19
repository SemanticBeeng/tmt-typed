package tmttyped.node.dnsMod

import tmttyped.node.nodeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolveWithTtlOptions extends ResolveOptions {
  
  @JSName("ttl")
  var ttl_ResolveWithTtlOptions: `true`
}
object ResolveWithTtlOptions {
  
  @scala.inline
  def apply(ttl: `true`): ResolveWithTtlOptions = {
    val __obj = js.Dynamic.literal(ttl = ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolveWithTtlOptions]
  }
  
  @scala.inline
  implicit class ResolveWithTtlOptionsMutableBuilder[Self <: ResolveWithTtlOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTtl(value: `true`): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
  }
}
