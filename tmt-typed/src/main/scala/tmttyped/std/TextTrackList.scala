package tmttyped.std

import org.scalablytyped.runtime.NumberDictionary
import tmttyped.std.stdStrings.addtrack
import tmttyped.std.stdStrings.change
import tmttyped.std.stdStrings.removetrack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextTrackList
  extends StObject
     with EventTarget
     with /* index */ NumberDictionary[org.scalajs.dom.raw.TextTrack] {
  
  @JSName("addEventListener")
  def addEventListener_addtrack(
    `type`: addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.TrackEvent, js.Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_addtrack(
    `type`: addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.TrackEvent, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_addtrack(
    `type`: addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.TrackEvent, js.Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, js.Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, js.Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_removetrack(
    `type`: removetrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.TrackEvent, js.Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_removetrack(
    `type`: removetrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.TrackEvent, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_removetrack(
    `type`: removetrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.TrackEvent, js.Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  def getTrackById(id: java.lang.String): org.scalajs.dom.raw.TextTrack | Null = js.native
  
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[org.scalajs.dom.raw.TextTrack]] = js.native
  
  val length: Double = js.native
  
  var onaddtrack: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.TrackEvent, js.Any]) | Null = js.native
  
  var onchange: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, js.Any]) | Null = js.native
  
  var onremovetrack: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.TrackEvent, js.Any]) | Null = js.native
  
  @JSName("removeEventListener")
  def removeEventListener_addtrack(
    `type`: addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.TrackEvent, js.Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_addtrack(
    `type`: addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.TrackEvent, js.Any],
    options: org.scalajs.dom.raw.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_addtrack(
    `type`: addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.TrackEvent, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, js.Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, js.Any],
    options: org.scalajs.dom.raw.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_removetrack(
    `type`: removetrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.TrackEvent, js.Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_removetrack(
    `type`: removetrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.TrackEvent, js.Any],
    options: org.scalajs.dom.raw.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_removetrack(
    `type`: removetrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.TrackEvent, js.Any],
    options: scala.Boolean
  ): Unit = js.native
}
