package tmttyped.rsocketCore

import tmttyped.rsocketFlowable.mod.Flowable
import tmttyped.rsocketTypes.reactiveSocketTypesMod.Encodable
import tmttyped.rsocketTypes.reactiveSocketTypesMod.LeaseFrame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rsocketleaseMod {
  
  @JSImport("rsocket-core/RSocketLease", "Lease")
  @js.native
  class Lease protected () extends StObject {
    def this(timeToLiveMillis: Double, allowedRequests: Double) = this()
    def this(timeToLiveMillis: Double, allowedRequests: Double, metadata: Encodable) = this()
    
    var allowedRequests: Double = js.native
    
    def expired(): Boolean = js.native
    
    var expiry: Double = js.native
    
    var metadata: js.UndefOr[Encodable] = js.native
    
    var startingAllowedRequests: Double = js.native
    
    var timeToLiveMillis: Double = js.native
    
    def valid(): Boolean = js.native
  }
  
  @JSImport("rsocket-core/RSocketLease", "Leases")
  @js.native
  class Leases[T /* <: LeaseStats */] () extends StObject {
    
    def receiver(receiver: js.Function1[/* flowable */ Flowable[Lease], Unit]): Leases[T] = js.native
    
    def sender(sender: js.Function1[/* t */ js.UndefOr[T], Flowable[Lease]]): Leases[T] = js.native
    
    def stats(stats: T): Leases[T] = js.native
  }
  
  @JSImport("rsocket-core/RSocketLease", "RequesterLeaseHandler")
  @js.native
  class RequesterLeaseHandler protected ()
    extends StObject
       with LeaseHandler
       with Disposable {
    def this(leaseReceiver: js.Function1[/* flowable */ Flowable[Lease], Unit]) = this()
    
    def availability(): Double = js.native
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /* CompleteClass */
    override def errorMessage(): String = js.native
    
    /* CompleteClass */
    override def isDisposed(): Boolean = js.native
    
    def receive(frame: LeaseFrame): Unit = js.native
    
    /* CompleteClass */
    override def use(): Boolean = js.native
  }
  
  @JSImport("rsocket-core/RSocketLease", "ResponderLeaseHandler")
  @js.native
  class ResponderLeaseHandler protected ()
    extends StObject
       with LeaseHandler {
    def this(leaseSender: js.Function1[/* leaseStats */ js.UndefOr[LeaseStats], Flowable[Lease]]) = this()
    def this(
      leaseSender: js.Function1[/* leaseStats */ js.UndefOr[LeaseStats], Flowable[Lease]],
      stats: LeaseStats
    ) = this()
    def this(
      leaseSender: js.Function1[/* leaseStats */ js.UndefOr[LeaseStats], Flowable[Lease]],
      stats: Unit,
      errorConsumer: js.Function1[/* e */ js.Error, Unit]
    ) = this()
    def this(
      leaseSender: js.Function1[/* leaseStats */ js.UndefOr[LeaseStats], Flowable[Lease]],
      stats: LeaseStats,
      errorConsumer: js.Function1[/* e */ js.Error, Unit]
    ) = this()
    
    /* CompleteClass */
    override def errorMessage(): String = js.native
    
    def send(send: js.Function1[/* lease */ Lease, Unit]): Disposable = js.native
    
    /* CompleteClass */
    override def use(): Boolean = js.native
  }
  
  trait Disposable extends StObject {
    
    def dispose(): Unit
    
    def isDisposed(): Boolean
  }
  object Disposable {
    
    @scala.inline
    def apply(dispose: () => Unit, isDisposed: () => Boolean): Disposable = {
      val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), isDisposed = js.Any.fromFunction0(isDisposed))
      __obj.asInstanceOf[Disposable]
    }
    
    @scala.inline
    implicit class DisposableMutableBuilder[Self <: Disposable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsDisposed(value: () => Boolean): Self = StObject.set(x, "isDisposed", js.Any.fromFunction0(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - tmttyped.rsocketCore.rsocketCoreStrings.Accept
    - tmttyped.rsocketCore.rsocketCoreStrings.Reject
    - tmttyped.rsocketCore.rsocketCoreStrings.Terminate
  */
  trait EventType extends StObject
  object EventType {
    
    @scala.inline
    def Accept: tmttyped.rsocketCore.rsocketCoreStrings.Accept = "Accept".asInstanceOf[tmttyped.rsocketCore.rsocketCoreStrings.Accept]
    
    @scala.inline
    def Reject: tmttyped.rsocketCore.rsocketCoreStrings.Reject = "Reject".asInstanceOf[tmttyped.rsocketCore.rsocketCoreStrings.Reject]
    
    @scala.inline
    def Terminate: tmttyped.rsocketCore.rsocketCoreStrings.Terminate = "Terminate".asInstanceOf[tmttyped.rsocketCore.rsocketCoreStrings.Terminate]
  }
  
  trait LeaseHandler extends StObject {
    
    def errorMessage(): String
    
    def use(): Boolean
  }
  object LeaseHandler {
    
    @scala.inline
    def apply(errorMessage: () => String, use: () => Boolean): LeaseHandler = {
      val __obj = js.Dynamic.literal(errorMessage = js.Any.fromFunction0(errorMessage), use = js.Any.fromFunction0(use))
      __obj.asInstanceOf[LeaseHandler]
    }
    
    @scala.inline
    implicit class LeaseHandlerMutableBuilder[Self <: LeaseHandler] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorMessage(value: () => String): Self = StObject.set(x, "errorMessage", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUse(value: () => Boolean): Self = StObject.set(x, "use", js.Any.fromFunction0(value))
    }
  }
  
  trait LeaseStats extends StObject {
    
    def onEvent(event: EventType): Unit
  }
  object LeaseStats {
    
    @scala.inline
    def apply(onEvent: EventType => Unit): LeaseStats = {
      val __obj = js.Dynamic.literal(onEvent = js.Any.fromFunction1(onEvent))
      __obj.asInstanceOf[LeaseStats]
    }
    
    @scala.inline
    implicit class LeaseStatsMutableBuilder[Self <: LeaseStats] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnEvent(value: EventType => Unit): Self = StObject.set(x, "onEvent", js.Any.fromFunction1(value))
    }
  }
}
