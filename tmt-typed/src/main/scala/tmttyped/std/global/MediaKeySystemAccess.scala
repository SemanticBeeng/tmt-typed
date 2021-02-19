package tmttyped.std.global

import tmttyped.std.MediaKeySystemConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MediaKeySystemAccess")
@js.native
class MediaKeySystemAccess ()
  extends tmttyped.std.MediaKeySystemAccess {
  
  /* CompleteClass */
  override def createMediaKeys(): js.Promise[tmttyped.std.MediaKeys] = js.native
  
  /* CompleteClass */
  override def getConfiguration(): MediaKeySystemConfiguration = js.native
  
  /* CompleteClass */
  override val keySystem: java.lang.String = js.native
}
