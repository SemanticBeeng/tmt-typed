package tmttyped.node.childProcessMod

import tmttyped.node.processMod.global.NodeJS.Signals
import tmttyped.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecException extends Error {
  
  var cmd: js.UndefOr[String] = js.undefined
  
  var code: js.UndefOr[Double] = js.undefined
  
  var killed: js.UndefOr[Boolean] = js.undefined
  
  var signal: js.UndefOr[Signals] = js.undefined
}
object ExecException {
  
  @scala.inline
  def apply(message: String, name: String): ExecException = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecException]
  }
  
  @scala.inline
  implicit class ExecExceptionMutableBuilder[Self <: ExecException] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCmd(value: String): Self = StObject.set(x, "cmd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCmdUndefined: Self = StObject.set(x, "cmd", js.undefined)
    
    @scala.inline
    def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setKilled(value: Boolean): Self = StObject.set(x, "killed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKilledUndefined: Self = StObject.set(x, "killed", js.undefined)
    
    @scala.inline
    def setSignal(value: Signals): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
