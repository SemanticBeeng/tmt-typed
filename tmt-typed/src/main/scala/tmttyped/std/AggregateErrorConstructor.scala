package tmttyped.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AggregateErrorConstructor
  extends StObject
     with Instantiable1[/* errors */ js.Iterable[js.Any], AggregateError]
     with Instantiable2[/* errors */ js.Iterable[js.Any], /* message */ java.lang.String, AggregateError] {
  
  def apply(errors: js.Iterable[js.Any]): AggregateError = js.native
  def apply(errors: js.Iterable[js.Any], message: java.lang.String): AggregateError = js.native
}
