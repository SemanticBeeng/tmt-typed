package tmttyped.rsocketCore

import tmttyped.rsocketCore.rsocketencodingMod.Encoders
import tmttyped.rsocketFlowable.mod.Flowable
import tmttyped.rsocketTypes.reactiveSocketTypesMod.ConnectionStatus
import tmttyped.rsocketTypes.reactiveSocketTypesMod.DuplexConnection
import tmttyped.rsocketTypes.reactiveSocketTypesMod.Encodable
import tmttyped.rsocketTypes.reactiveSocketTypesMod.Frame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rsocketresumabletransportMod {
  
  @JSImport("rsocket-core/RSocketResumableTransport", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with RSocketResumableTransport {
    def this(source: js.Function0[DuplexConnection], options: Options) = this()
    def this(source: js.Function0[DuplexConnection], options: Options, encoders: Encoders[js.Any]) = this()
    
    /**
      * Close the underlying connection, emitting `onComplete` on the receive()
      * Publisher.
      */
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /**
      * Open the underlying connection. Throws if the connection is already in
      * the CLOSED or ERROR state.
      */
    /* CompleteClass */
    override def connect(): Unit = js.native
    
    /**
      * Returns a Flowable that immediately publishes the current connection
      * status and thereafter updates as it changes. Once a connection is in
      * the CLOSED or ERROR state, it may not be connected again.
      * Implementations must publish values per the comments on ConnectionStatus.
      */
    /* CompleteClass */
    override def connectionStatus(): Flowable[ConnectionStatus] = js.native
    
    /**
      * Returns a stream of all `Frame`s received on this connection.
      *
      * Notes:
      * - Implementations must call `onComplete` if the underlying connection is
      *   closed by the peer or by calling `close()`.
      * - Implementations must call `onError` if there are any errors
      *   sending/receiving frames.
      * - Implemenations may optionally support multi-cast receivers. Those that do
      *   not should throw if `receive` is called more than once.
      */
    /* CompleteClass */
    override def receive(): Flowable[Frame] = js.native
    
    /**
      * Send all the `input` frames on this connection.
      *
      * Notes:
      * - Implementations must not cancel the subscription.
      * - Implementations must signal any errors by calling `onError` on the
      *   `receive()` Publisher.
      */
    /* CompleteClass */
    override def send(input: Flowable[Frame]): Unit = js.native
    
    /**
      * Send a single frame on the connection.
      */
    /* CompleteClass */
    override def sendOne(frame: Frame): Unit = js.native
  }
  
  trait Options extends StObject {
    
    var bufferSize: Double
    
    var resumeToken: Encodable
    
    var sessionDurationSeconds: Double
  }
  object Options {
    
    @scala.inline
    def apply(bufferSize: Double, resumeToken: Encodable, sessionDurationSeconds: Double): Options = {
      val __obj = js.Dynamic.literal(bufferSize = bufferSize.asInstanceOf[js.Any], resumeToken = resumeToken.asInstanceOf[js.Any], sessionDurationSeconds = sessionDurationSeconds.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBufferSize(value: Double): Self = StObject.set(x, "bufferSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResumeToken(value: Encodable): Self = StObject.set(x, "resumeToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionDurationSeconds(value: Double): Self = StObject.set(x, "sessionDurationSeconds", value.asInstanceOf[js.Any])
    }
  }
  
  trait RSocketResumableTransport
    extends StObject
       with DuplexConnection
  object RSocketResumableTransport {
    
    @scala.inline
    def apply(
      close: () => Unit,
      connect: () => Unit,
      connectionStatus: () => Flowable[ConnectionStatus],
      receive: () => Flowable[Frame],
      send: Flowable[Frame] => Unit,
      sendOne: Frame => Unit
    ): RSocketResumableTransport = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), connect = js.Any.fromFunction0(connect), connectionStatus = js.Any.fromFunction0(connectionStatus), receive = js.Any.fromFunction0(receive), send = js.Any.fromFunction1(send), sendOne = js.Any.fromFunction1(sendOne))
      __obj.asInstanceOf[RSocketResumableTransport]
    }
  }
}
