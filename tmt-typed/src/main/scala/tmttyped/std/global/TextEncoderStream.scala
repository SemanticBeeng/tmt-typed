package tmttyped.std.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("TextEncoderStream")
@js.native
class TextEncoderStream ()
  extends StObject
     with tmttyped.std.TextEncoderStream {
  
  /**
    * Returns "utf-8".
    */
  /* CompleteClass */
  override val encoding: java.lang.String = js.native
  
  /* CompleteClass */
  override val readable: org.scalajs.dom.experimental.ReadableStream[js.Any] = js.native
  /* CompleteClass */
  @JSName("readable")
  override val readable_TextEncoderStream: org.scalajs.dom.experimental.ReadableStream[js.typedarray.Uint8Array] = js.native
  
  /* CompleteClass */
  override val writable: tmttyped.std.WritableStream[js.Any] = js.native
  /* CompleteClass */
  @JSName("writable")
  override val writable_TextEncoderStream: tmttyped.std.WritableStream[java.lang.String] = js.native
}
