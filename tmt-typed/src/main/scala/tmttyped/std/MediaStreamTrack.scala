package tmttyped.std

import tmttyped.std.stdStrings.ended
import tmttyped.std.stdStrings.mute
import tmttyped.std.stdStrings.unmute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A single media track within a stream; typically, these are audio or video tracks, but other track types may exist as well. */
@js.native
trait MediaStreamTrack
  extends StObject
     with EventTarget {
  
  @JSName("addEventListener")
  def addEventListener_ended(
    `type`: ended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, js.Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(
    `type`: ended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(
    `type`: ended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, js.Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mute(
    `type`: mute,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, js.Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mute(
    `type`: mute,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mute(
    `type`: mute,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, js.Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unmute(
    `type`: unmute,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, js.Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unmute(
    `type`: unmute,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unmute(
    `type`: unmute,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, js.Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  def applyConstraints(): js.Promise[Unit] = js.native
  def applyConstraints(constraints: org.scalajs.dom.experimental.mediastream.MediaTrackConstraints): js.Promise[Unit] = js.native
  
  var enabled: scala.Boolean = js.native
  
  def getCapabilities(): MediaTrackCapabilities = js.native
  
  def getConstraints(): org.scalajs.dom.experimental.mediastream.MediaTrackConstraints = js.native
  
  def getSettings(): org.scalajs.dom.experimental.mediastream.MediaTrackSettings = js.native
  
  val id: java.lang.String = js.native
  
  val kind: java.lang.String = js.native
  
  val label: java.lang.String = js.native
  
  val muted: scala.Boolean = js.native
  
  var onended: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, js.Any]) | Null = js.native
  
  var onmute: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, js.Any]) | Null = js.native
  
  var onunmute: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, js.Any]) | Null = js.native
  
  val readyState: org.scalajs.dom.experimental.mediastream.MediaStreamTrackState = js.native
  
  @JSName("removeEventListener")
  def removeEventListener_ended(
    `type`: ended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, js.Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ended(
    `type`: ended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, js.Any],
    options: org.scalajs.dom.raw.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ended(
    `type`: ended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mute(
    `type`: mute,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, js.Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mute(
    `type`: mute,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, js.Any],
    options: org.scalajs.dom.raw.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mute(
    `type`: mute,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unmute(
    `type`: unmute,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, js.Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unmute(
    `type`: unmute,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, js.Any],
    options: org.scalajs.dom.raw.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unmute(
    `type`: unmute,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  
  def stop(): Unit = js.native
}
