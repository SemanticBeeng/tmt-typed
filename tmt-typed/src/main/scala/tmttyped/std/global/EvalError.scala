package tmttyped.std.global

import tmttyped.std.EvalErrorConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("EvalError")
@js.native
class EvalError ()
  extends StObject
     with tmttyped.std.Error {
  def this(message: java.lang.String) = this()
  
  /* CompleteClass */
  override var message: java.lang.String = js.native
  
  /* CompleteClass */
  override var name: java.lang.String = js.native
}
object EvalError {
  
  @scala.inline
  def apply: EvalErrorConstructor = js.Dynamic.global.selectDynamic("EvalError").asInstanceOf[EvalErrorConstructor]
}
