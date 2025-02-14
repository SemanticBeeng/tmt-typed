package tmttyped.std.global

import tmttyped.std.DOMPointInit
import tmttyped.std.DOMQuadInit
import tmttyped.std.DOMRectInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("DOMQuad")
@js.native
class DOMQuad ()
  extends StObject
     with tmttyped.std.DOMQuad {
  def this(p1: DOMPointInit) = this()
  def this(p1: Unit, p2: DOMPointInit) = this()
  def this(p1: DOMPointInit, p2: DOMPointInit) = this()
  def this(p1: Unit, p2: Unit, p3: DOMPointInit) = this()
  def this(p1: Unit, p2: DOMPointInit, p3: DOMPointInit) = this()
  def this(p1: DOMPointInit, p2: Unit, p3: DOMPointInit) = this()
  def this(p1: DOMPointInit, p2: DOMPointInit, p3: DOMPointInit) = this()
  def this(p1: Unit, p2: Unit, p3: Unit, p4: DOMPointInit) = this()
  def this(p1: Unit, p2: Unit, p3: DOMPointInit, p4: DOMPointInit) = this()
  def this(p1: Unit, p2: DOMPointInit, p3: Unit, p4: DOMPointInit) = this()
  def this(p1: Unit, p2: DOMPointInit, p3: DOMPointInit, p4: DOMPointInit) = this()
  def this(p1: DOMPointInit, p2: Unit, p3: Unit, p4: DOMPointInit) = this()
  def this(p1: DOMPointInit, p2: Unit, p3: DOMPointInit, p4: DOMPointInit) = this()
  def this(p1: DOMPointInit, p2: DOMPointInit, p3: Unit, p4: DOMPointInit) = this()
  def this(p1: DOMPointInit, p2: DOMPointInit, p3: DOMPointInit, p4: DOMPointInit) = this()
  
  /* CompleteClass */
  override def getBounds(): tmttyped.std.DOMRect = js.native
  
  /* CompleteClass */
  override val p1: tmttyped.std.DOMPoint = js.native
  
  /* CompleteClass */
  override val p2: tmttyped.std.DOMPoint = js.native
  
  /* CompleteClass */
  override val p3: tmttyped.std.DOMPoint = js.native
  
  /* CompleteClass */
  override val p4: tmttyped.std.DOMPoint = js.native
  
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}
object DOMQuad {
  
  @JSGlobal("DOMQuad")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def fromQuad(): tmttyped.std.DOMQuad = ^.asInstanceOf[js.Dynamic].applyDynamic("fromQuad")().asInstanceOf[tmttyped.std.DOMQuad]
  @scala.inline
  def fromQuad(other: DOMQuadInit): tmttyped.std.DOMQuad = ^.asInstanceOf[js.Dynamic].applyDynamic("fromQuad")(other.asInstanceOf[js.Any]).asInstanceOf[tmttyped.std.DOMQuad]
  
  @scala.inline
  def fromRect(): tmttyped.std.DOMQuad = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRect")().asInstanceOf[tmttyped.std.DOMQuad]
  @scala.inline
  def fromRect(other: DOMRectInit): tmttyped.std.DOMQuad = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRect")(other.asInstanceOf[js.Any]).asInstanceOf[tmttyped.std.DOMQuad]
}
