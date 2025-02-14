package tmttyped.node

import tmttyped.node.NodeJS.ReadWriteStream
import tmttyped.node.NodeJS.ReadableStream
import tmttyped.node.NodeJS.WritableStream
import tmttyped.node.streamMod.FinishedOptions
import tmttyped.node.streamMod.PipelineDestination
import tmttyped.node.streamMod.PipelineOptions
import tmttyped.node.streamMod.PipelinePromise
import tmttyped.node.streamMod.PipelineSource
import tmttyped.node.streamMod.PipelineTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeColonstreamMod {
  
  @JSImport("node:stream/promises", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def finished(stream: ReadWriteStream): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("finished")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def finished(stream: ReadWriteStream, options: FinishedOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("finished")(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def finished(stream: ReadableStream): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("finished")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def finished(stream: ReadableStream, options: FinishedOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("finished")(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def finished(stream: WritableStream): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("finished")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def finished(stream: WritableStream, options: FinishedOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("finished")(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def pipeline(
    stream1: ReadableStream,
    stream2: ReadWriteStream,
    streams: (ReadWriteStream | WritableStream | PipelineOptions)*
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(stream1.asInstanceOf[js.Any], stream2.asInstanceOf[js.Any], streams.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def pipeline(
    stream1: ReadableStream,
    stream2: WritableStream,
    streams: (ReadWriteStream | WritableStream | PipelineOptions)*
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(stream1.asInstanceOf[js.Any], stream2.asInstanceOf[js.Any], streams.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def pipeline(streams: js.Array[ReadableStream | WritableStream | ReadWriteStream]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(streams.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def pipeline(streams: js.Array[ReadableStream | WritableStream | ReadWriteStream], options: PipelineOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(streams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def pipeline[A /* <: PipelineSource[js.Any] */, B /* <: PipelineDestination[A, js.Any] */](source: A, destination: B): PipelinePromise[B] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[PipelinePromise[B]]
  @scala.inline
  def pipeline[A /* <: PipelineSource[js.Any] */, B /* <: PipelineDestination[A, js.Any] */](source: A, destination: B, options: PipelineOptions): PipelinePromise[B] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PipelinePromise[B]]
  @scala.inline
  def pipeline[A /* <: PipelineSource[js.Any] */, T1 /* <: PipelineTransform[A, js.Any] */, B /* <: PipelineDestination[T1, js.Any] */](source: A, transform1: T1, destination: B): PipelinePromise[B] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[PipelinePromise[B]]
  @scala.inline
  def pipeline[A /* <: PipelineSource[js.Any] */, T1 /* <: PipelineTransform[A, js.Any] */, B /* <: PipelineDestination[T1, js.Any] */](source: A, transform1: T1, destination: B, options: PipelineOptions): PipelinePromise[B] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PipelinePromise[B]]
  @scala.inline
  def pipeline[A /* <: PipelineSource[js.Any] */, T1 /* <: PipelineTransform[A, js.Any] */, T2 /* <: PipelineTransform[T1, js.Any] */, B /* <: PipelineDestination[T2, js.Any] */](source: A, transform1: T1, transform2: T2, destination: B): PipelinePromise[B] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], transform2.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[PipelinePromise[B]]
  @scala.inline
  def pipeline[A /* <: PipelineSource[js.Any] */, T1 /* <: PipelineTransform[A, js.Any] */, T2 /* <: PipelineTransform[T1, js.Any] */, B /* <: PipelineDestination[T2, js.Any] */](source: A, transform1: T1, transform2: T2, destination: B, options: PipelineOptions): PipelinePromise[B] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], transform2.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PipelinePromise[B]]
  @scala.inline
  def pipeline[A /* <: PipelineSource[js.Any] */, T1 /* <: PipelineTransform[A, js.Any] */, T2 /* <: PipelineTransform[T1, js.Any] */, T3 /* <: PipelineTransform[T2, js.Any] */, B /* <: PipelineDestination[T3, js.Any] */](source: A, transform1: T1, transform2: T2, transform3: T3, destination: B): PipelinePromise[B] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], transform2.asInstanceOf[js.Any], transform3.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[PipelinePromise[B]]
  @scala.inline
  def pipeline[A /* <: PipelineSource[js.Any] */, T1 /* <: PipelineTransform[A, js.Any] */, T2 /* <: PipelineTransform[T1, js.Any] */, T3 /* <: PipelineTransform[T2, js.Any] */, B /* <: PipelineDestination[T3, js.Any] */](
    source: A,
    transform1: T1,
    transform2: T2,
    transform3: T3,
    destination: B,
    options: PipelineOptions
  ): PipelinePromise[B] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], transform2.asInstanceOf[js.Any], transform3.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PipelinePromise[B]]
  @scala.inline
  def pipeline[A /* <: PipelineSource[js.Any] */, T1 /* <: PipelineTransform[A, js.Any] */, T2 /* <: PipelineTransform[T1, js.Any] */, T3 /* <: PipelineTransform[T2, js.Any] */, T4 /* <: PipelineTransform[T3, js.Any] */, B /* <: PipelineDestination[T4, js.Any] */](source: A, transform1: T1, transform2: T2, transform3: T3, transform4: T4, destination: B): PipelinePromise[B] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], transform2.asInstanceOf[js.Any], transform3.asInstanceOf[js.Any], transform4.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[PipelinePromise[B]]
  @scala.inline
  def pipeline[A /* <: PipelineSource[js.Any] */, T1 /* <: PipelineTransform[A, js.Any] */, T2 /* <: PipelineTransform[T1, js.Any] */, T3 /* <: PipelineTransform[T2, js.Any] */, T4 /* <: PipelineTransform[T3, js.Any] */, B /* <: PipelineDestination[T4, js.Any] */](
    source: A,
    transform1: T1,
    transform2: T2,
    transform3: T3,
    transform4: T4,
    destination: B,
    options: PipelineOptions
  ): PipelinePromise[B] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], transform2.asInstanceOf[js.Any], transform3.asInstanceOf[js.Any], transform4.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PipelinePromise[B]]
}
