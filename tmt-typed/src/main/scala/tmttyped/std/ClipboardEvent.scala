package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Events providing information related to modification of the clipboard, that is cut, copy, and paste events. */
@js.native
trait ClipboardEvent
  extends StObject
     with Event {
  
  val clipboardData: org.scalajs.dom.raw.DataTransfer | Null = js.native
}
