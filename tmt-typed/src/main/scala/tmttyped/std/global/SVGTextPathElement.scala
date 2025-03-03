package tmttyped.std.global

import org.scalajs.dom.raw.EventListenerOptions
import tmttyped.std.AddEventListenerOptions
import tmttyped.std.EventListenerOrEventListenerObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("SVGTextPathElement")
@js.native
class SVGTextPathElement ()
  extends StObject
     with tmttyped.std.SVGTextPathElement {
  
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /* CompleteClass */
  override val assignedSlot: tmttyped.std.HTMLSlotElement | Null = js.native
  
  /* CompleteClass */
  override val href: org.scalajs.dom.raw.SVGAnimatedString = js.native
  
  /* CompleteClass */
  override var innerHTML: java.lang.String = js.native
  
  /**
    * Returns the first following sibling that is an element, and null otherwise.
    */
  /* CompleteClass */
  override val nextElementSibling: org.scalajs.dom.raw.Element | Null = js.native
  
  /**
    * Returns the first preceding sibling that is an element, and null otherwise.
    */
  /* CompleteClass */
  override val previousElementSibling: org.scalajs.dom.raw.Element | Null = js.native
  
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  
  /* CompleteClass */
  override val requiredExtensions: org.scalajs.dom.raw.SVGStringList = js.native
  
  /* CompleteClass */
  override val style: org.scalajs.dom.raw.CSSStyleDeclaration = js.native
  
  /* CompleteClass */
  override val systemLanguage: org.scalajs.dom.raw.SVGStringList = js.native
}
object SVGTextPathElement {
  
  @JSGlobal("SVGTextPathElement.TEXTPATH_METHODTYPE_ALIGN")
  @js.native
  val TEXTPATH_METHODTYPE_ALIGN: Double = js.native
  
  @JSGlobal("SVGTextPathElement.TEXTPATH_METHODTYPE_STRETCH")
  @js.native
  val TEXTPATH_METHODTYPE_STRETCH: Double = js.native
  
  @JSGlobal("SVGTextPathElement.TEXTPATH_METHODTYPE_UNKNOWN")
  @js.native
  val TEXTPATH_METHODTYPE_UNKNOWN: Double = js.native
  
  @JSGlobal("SVGTextPathElement.TEXTPATH_SPACINGTYPE_AUTO")
  @js.native
  val TEXTPATH_SPACINGTYPE_AUTO: Double = js.native
  
  @JSGlobal("SVGTextPathElement.TEXTPATH_SPACINGTYPE_EXACT")
  @js.native
  val TEXTPATH_SPACINGTYPE_EXACT: Double = js.native
  
  @JSGlobal("SVGTextPathElement.TEXTPATH_SPACINGTYPE_UNKNOWN")
  @js.native
  val TEXTPATH_SPACINGTYPE_UNKNOWN: Double = js.native
}
