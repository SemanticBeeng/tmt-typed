package tmttyped.node.fsMod

import tmttyped.node.Buffer
import tmttyped.node.nodeStrings.change
import tmttyped.node.nodeStrings.error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FSWatcher
  extends tmttyped.node.nodeEventsMod.^ {
  
  @JSName("addListener")
  def addListener_change(
    event: change,
    listener: js.Function2[/* eventType */ String, /* filename */ String | Buffer, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_close(event: tmttyped.node.nodeStrings.close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_error(event: error, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
  
  def close(): Unit = js.native
  
  @JSName("on")
  def on_change(
    event: change,
    listener: js.Function2[/* eventType */ String, /* filename */ String | Buffer, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_close(event: tmttyped.node.nodeStrings.close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
  
  @JSName("once")
  def once_change(
    event: change,
    listener: js.Function2[/* eventType */ String, /* filename */ String | Buffer, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_close(event: tmttyped.node.nodeStrings.close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_error(event: error, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
  
  @JSName("prependListener")
  def prependListener_change(
    event: change,
    listener: js.Function2[/* eventType */ String, /* filename */ String | Buffer, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_close(event: tmttyped.node.nodeStrings.close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(event: error, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
  
  @JSName("prependOnceListener")
  def prependOnceListener_change(
    event: change,
    listener: js.Function2[/* eventType */ String, /* filename */ String | Buffer, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_close(event: tmttyped.node.nodeStrings.close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(event: error, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
}
