package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This WebVR API interface represents represents the event object of WebVR-related events (see the list of WebVR window extensions). */
@js.native
trait VRDisplayEvent
  extends StObject
     with Event {
  
  val display: VRDisplay = js.native
  
  val reason: VRDisplayEventReason | Null = js.native
}
