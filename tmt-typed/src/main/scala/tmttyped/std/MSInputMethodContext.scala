package tmttyped.std

import tmttyped.std.stdStrings.MSCandidateWindowHide
import tmttyped.std.stdStrings.MSCandidateWindowShow
import tmttyped.std.stdStrings.MSCandidateWindowUpdate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MSInputMethodContext
  extends StObject
     with EventTarget {
  
  @JSName("addEventListener")
  def addEventListener_MSCandidateWindowHide(
    `type`: MSCandidateWindowHide,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, js.Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSCandidateWindowHide(
    `type`: MSCandidateWindowHide,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSCandidateWindowHide(
    `type`: MSCandidateWindowHide,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, js.Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSCandidateWindowShow(
    `type`: MSCandidateWindowShow,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, js.Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSCandidateWindowShow(
    `type`: MSCandidateWindowShow,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSCandidateWindowShow(
    `type`: MSCandidateWindowShow,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, js.Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSCandidateWindowUpdate(
    `type`: MSCandidateWindowUpdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, js.Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSCandidateWindowUpdate(
    `type`: MSCandidateWindowUpdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSCandidateWindowUpdate(
    `type`: MSCandidateWindowUpdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, js.Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  val compositionEndOffset: Double = js.native
  
  val compositionStartOffset: Double = js.native
  
  def getCandidateWindowClientRect(): org.scalajs.dom.raw.ClientRect = js.native
  
  def getCompositionAlternatives(): js.Array[java.lang.String] = js.native
  
  def hasComposition(): scala.Boolean = js.native
  
  def isCandidateWindowVisible(): scala.Boolean = js.native
  
  var oncandidatewindowhide: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, js.Any]) | Null = js.native
  
  var oncandidatewindowshow: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, js.Any]) | Null = js.native
  
  var oncandidatewindowupdate: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, js.Any]) | Null = js.native
  
  @JSName("removeEventListener")
  def removeEventListener_MSCandidateWindowHide(
    `type`: MSCandidateWindowHide,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, js.Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSCandidateWindowHide(
    `type`: MSCandidateWindowHide,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, js.Any],
    options: org.scalajs.dom.raw.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSCandidateWindowHide(
    `type`: MSCandidateWindowHide,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSCandidateWindowShow(
    `type`: MSCandidateWindowShow,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, js.Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSCandidateWindowShow(
    `type`: MSCandidateWindowShow,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, js.Any],
    options: org.scalajs.dom.raw.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSCandidateWindowShow(
    `type`: MSCandidateWindowShow,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSCandidateWindowUpdate(
    `type`: MSCandidateWindowUpdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, js.Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSCandidateWindowUpdate(
    `type`: MSCandidateWindowUpdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, js.Any],
    options: org.scalajs.dom.raw.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSCandidateWindowUpdate(
    `type`: MSCandidateWindowUpdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  
  val target: org.scalajs.dom.raw.HTMLElement = js.native
}
