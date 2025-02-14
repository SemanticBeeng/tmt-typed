package tmttyped.std.global

import org.scalajs.dom.raw.Document
import tmttyped.std.DOMParserSupportedType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("DOMParser")
@js.native
class DOMParser ()
  extends StObject
     with tmttyped.std.DOMParser {
  
  /**
    * Parses string using either the HTML or XML parser, according to type, and returns the resulting Document. type can be "text/html" (which will invoke the HTML parser), or any of "text/xml", "application/xml", "application/xhtml+xml", or "image/svg+xml" (which will invoke the XML parser).
    *
    * For the XML parser, if string cannot be parsed, then the returned Document will contain elements describing the resulting error.
    *
    * Note that script elements are not evaluated during parsing, and the resulting document's encoding will always be UTF-8.
    *
    * Values other than the above for type will cause a TypeError exception to be thrown.
    */
  /* CompleteClass */
  override def parseFromString(string: java.lang.String, `type`: DOMParserSupportedType): Document = js.native
}
