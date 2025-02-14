package tmttyped.std.global

import tmttyped.std.StringConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("String")
@js.native
class String ()
  extends StObject
     with tmttyped.std.String {
  def this(value: js.Any) = this()
}
object String {
  
  /**
    * Allows manipulation and formatting of text strings and determination and location of substrings within strings.
    */
  @scala.inline
  def apply: StringConstructor = js.Dynamic.global.selectDynamic("String").asInstanceOf[StringConstructor]
}
