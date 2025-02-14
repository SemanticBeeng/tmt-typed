package tmttyped.node

import org.scalablytyped.runtime.Shortcut
import tmttyped.node.pathMod.PlatformPath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object win32Mod extends Shortcut {
  
  @JSImport("path/win32", JSImport.Namespace)
  @js.native
  val ^ : PlatformPath = js.native
  
  type _To = PlatformPath
  
  /* This means you don't have to write `^`, but can instead just say `win32Mod.foo` */
  override def _to: PlatformPath = ^
}
