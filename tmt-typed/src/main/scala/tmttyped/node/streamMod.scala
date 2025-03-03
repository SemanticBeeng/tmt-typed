package tmttyped.node

import tmttyped.node.NodeJS.ErrnoException
import tmttyped.node.NodeJS.ReadWriteStream
import tmttyped.node.NodeJS.ReadableStream
import tmttyped.node.NodeJS.WritableStream
import tmttyped.node.anon.Chunk
import tmttyped.node.anon.End
import tmttyped.node.bufferMod.global.BufferEncoding
import tmttyped.node.eventsMod.Abortable
import tmttyped.node.nodeStrings.close
import tmttyped.node.nodeStrings.data
import tmttyped.node.nodeStrings.drain
import tmttyped.node.nodeStrings.end
import tmttyped.node.nodeStrings.error
import tmttyped.node.nodeStrings.finish
import tmttyped.node.nodeStrings.pause
import tmttyped.node.nodeStrings.pipe
import tmttyped.node.nodeStrings.readable
import tmttyped.node.nodeStrings.resume
import tmttyped.node.nodeStrings.unpipe
import tmttyped.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object streamMod {
  
  @JSImport("stream", JSImport.Namespace)
  @js.native
  class ^ () extends StObject
  @JSImport("stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Duplex streams are streams that implement both the `Readable` and `Writable` interfaces.
    *
    * Examples of `Duplex` streams include:
    *
    * * `TCP sockets`
    * * `zlib streams`
    * * `crypto streams`
    * @since v0.9.4
    */
  @JSImport("stream", "Duplex")
  @js.native
  class Duplex () extends StObject {
    def this(opts: DuplexOptions) = this()
    
    def _destroy(error: js.Error, callback: js.Function1[/* error */ js.Error | Null, Unit]): Unit = js.native
    def _destroy(error: Null, callback: js.Function1[/* error */ js.Error | Null, Unit]): Unit = js.native
    
    def _final(callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Unit = js.native
    
    def _write(
      chunk: js.Any,
      encoding: BufferEncoding,
      callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
    
    var _writev: js.UndefOr[
        js.Function2[
          /* chunks */ js.Array[Chunk], 
          /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
          Unit
        ]
      ] = js.native
    
    def cork(): Unit = js.native
    
    def end(): Unit = js.native
    def end(cb: js.Function0[Unit]): Unit = js.native
    def end(chunk: js.Any): Unit = js.native
    def end(chunk: js.Any, cb: js.Function0[Unit]): Unit = js.native
    def end(chunk: js.Any, encoding: Unit, cb: js.Function0[Unit]): Unit = js.native
    def end(chunk: js.Any, encoding: BufferEncoding): Unit = js.native
    def end(chunk: js.Any, encoding: BufferEncoding, cb: js.Function0[Unit]): Unit = js.native
    
    def setDefaultEncoding(encoding: BufferEncoding): this.type = js.native
    
    def uncork(): Unit = js.native
    
    val writable: Boolean = js.native
    
    val writableCorked: Double = js.native
    
    val writableEnded: Boolean = js.native
    
    val writableFinished: Boolean = js.native
    
    val writableHighWaterMark: Double = js.native
    
    val writableLength: Double = js.native
    
    val writableObjectMode: Boolean = js.native
    
    def write(chunk: js.Any): Boolean = js.native
    def write(chunk: js.Any, cb: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Boolean = js.native
    def write(chunk: js.Any, encoding: Unit, cb: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Boolean = js.native
    def write(chunk: js.Any, encoding: BufferEncoding): Boolean = js.native
    def write(
      chunk: js.Any,
      encoding: BufferEncoding,
      cb: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
    ): Boolean = js.native
  }
  
  /**
    * The `stream.PassThrough` class is a trivial implementation of a `Transform` stream that simply passes the input bytes across to the output. Its purpose is
    * primarily for examples and testing, but there are some use cases where`stream.PassThrough` is useful as a building block for novel sorts of streams.
    */
  @JSImport("stream", "PassThrough")
  @js.native
  class PassThrough () extends StObject {
    def this(opts: TransformOptions) = this()
  }
  
  /**
    * @since v0.9.4
    */
  @JSImport("stream", "Readable")
  @js.native
  class Readable ()
    extends StObject
       with ReadableStream {
    def this(opts: ReadableOptions) = this()
    
    var _construct: js.UndefOr[
        js.Function1[/* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], Unit]
      ] = js.native
    
    def _destroy(error: js.Error, callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Unit = js.native
    def _destroy(error: Null, callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Unit = js.native
    
    def _read(size: Double): Unit = js.native
    
    /**
      * Event emitter
      * The defined events on documents including:
      * 1. close
      * 2. data
      * 3. end
      * 4. error
      * 5. pause
      * 6. readable
      * 7. resume
      */
    @JSName("addListener")
    def addListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    /**
      * Destroy the stream. Optionally emit an `'error'` event, and emit a `'close'`event (unless `emitClose` is set to `false`). After this call, the readable
      * stream will release any internal resources and subsequent calls to `push()`will be ignored.
      *
      * Once `destroy()` has been called any further calls will be a no-op and no
      * further errors except from `_destroy()` may be emitted as `'error'`.
      *
      * Implementors should not override this method, but instead implement `readable._destroy()`.
      * @since v8.0.0
      * @param error Error which will be passed as payload in `'error'` event
      */
    def destroy(): Unit = js.native
    def destroy(error: js.Error): Unit = js.native
    
    /**
      * Is `true` after `readable.destroy()` has been called.
      * @since v8.0.0
      */
    var destroyed: Boolean = js.native
    
    @JSName("emit")
    def emit_close(event: close): Boolean = js.native
    @JSName("emit")
    def emit_data(event: data, chunk: js.Any): Boolean = js.native
    @JSName("emit")
    def emit_end(event: end): Boolean = js.native
    @JSName("emit")
    def emit_error(event: error, err: js.Error): Boolean = js.native
    @JSName("emit")
    def emit_pause(event: pause): Boolean = js.native
    @JSName("emit")
    def emit_readable(event: readable): Boolean = js.native
    @JSName("emit")
    def emit_resume(event: resume): Boolean = js.native
    
    @JSName("on")
    def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("on")
    def on_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("on")
    def on_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    @JSName("once")
    def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("once")
    def once_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("once")
    def once_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    @JSName("prependListener")
    def prependListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    def push(chunk: js.Any): Boolean = js.native
    def push(chunk: js.Any, encoding: BufferEncoding): Boolean = js.native
    
    /**
      * Getter for the property `encoding` of a given `Readable` stream. The `encoding`property can be set using the `readable.setEncoding()` method.
      * @since v12.7.0
      */
    val readableEncoding: BufferEncoding | Null = js.native
    
    /**
      * Becomes `true` when `'end'` event is emitted.
      * @since v12.9.0
      */
    val readableEnded: Boolean = js.native
    
    /**
      * This property reflects the current state of a `Readable` stream as described
      * in the `Three states` section.
      * @since v9.4.0
      */
    val readableFlowing: Boolean | Null = js.native
    
    /**
      * Returns the value of `highWaterMark` passed when creating this `Readable`.
      * @since v9.3.0
      */
    val readableHighWaterMark: Double = js.native
    
    /**
      * This property contains the number of bytes (or objects) in the queue
      * ready to be read. The value provides introspection data regarding
      * the status of the `highWaterMark`.
      * @since v9.4.0
      */
    val readableLength: Double = js.native
    
    /**
      * Getter for the property `objectMode` of a given `Readable` stream.
      * @since v12.3.0
      */
    val readableObjectMode: Boolean = js.native
    
    @JSName("removeListener")
    def removeListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    /**
      * Passing `chunk` as `null` signals the end of the stream (EOF) and behaves the
      * same as `readable.push(null)`, after which no more data can be written. The EOF
      * signal is put at the end of the buffer and any buffered data will still be
      * flushed.
      *
      * The `readable.unshift()` method pushes a chunk of data back into the internal
      * buffer. This is useful in certain situations where a stream is being consumed by
      * code that needs to "un-consume" some amount of data that it has optimistically
      * pulled out of the source, so that the data can be passed on to some other party.
      *
      * The `stream.unshift(chunk)` method cannot be called after the `'end'` event
      * has been emitted or a runtime error will be thrown.
      *
      * Developers using `stream.unshift()` often should consider switching to
      * use of a `Transform` stream instead. See the `API for stream implementers` section for more information.
      *
      * ```js
      * // Pull off a header delimited by \n\n.
      * // Use unshift() if we get too much.
      * // Call the callback with (error, header, stream).
      * const { StringDecoder } = require('string_decoder');
      * function parseHeader(stream, callback) {
      *   stream.on('error', callback);
      *   stream.on('readable', onReadable);
      *   const decoder = new StringDecoder('utf8');
      *   let header = '';
      *   function onReadable() {
      *     let chunk;
      *     while (null !== (chunk = stream.read())) {
      *       const str = decoder.write(chunk);
      *       if (str.match(/\n\n/)) {
      *         // Found the header boundary.
      *         const split = str.split(/\n\n/);
      *         header += split.shift();
      *         const remaining = split.join('\n\n');
      *         const buf = Buffer.from(remaining, 'utf8');
      *         stream.removeListener('error', callback);
      *         // Remove the 'readable' listener before unshifting.
      *         stream.removeListener('readable', onReadable);
      *         if (buf.length)
      *           stream.unshift(buf);
      *         // Now the body of the message can be read from the stream.
      *         callback(null, header, stream);
      *       } else {
      *         // Still reading the header.
      *         header += str;
      *       }
      *     }
      *   }
      * }
      * ```
      *
      * Unlike {@link push}, `stream.unshift(chunk)` will not
      * end the reading process by resetting the internal reading state of the stream.
      * This can cause unexpected results if `readable.unshift()` is called during a
      * read (i.e. from within a {@link _read} implementation on a
      * custom stream). Following the call to `readable.unshift()` with an immediate {@link push} will reset the reading state appropriately,
      * however it is best to simply avoid calling `readable.unshift()` while in the
      * process of performing a read.
      * @since v0.9.11
      * @param chunk Chunk of data to unshift onto the read queue. For streams not operating in object mode, `chunk` must be a string, `Buffer`, `Uint8Array` or `null`. For object mode
      * streams, `chunk` may be any JavaScript value.
      * @param encoding Encoding of string chunks. Must be a valid `Buffer` encoding, such as `'utf8'` or `'ascii'`.
      */
    def unshift(chunk: js.Any): Unit = js.native
    def unshift(chunk: js.Any, encoding: BufferEncoding): Unit = js.native
  }
  object Readable {
    
    @JSImport("stream", "Readable")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A utility method for creating Readable Streams out of iterators.
      */
    /* static member */
    @scala.inline
    def from(iterable: js.Iterable[js.Any]): Readable = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[Readable]
    @scala.inline
    def from(iterable: js.Iterable[js.Any], options: ReadableOptions): Readable = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Readable]
    @scala.inline
    def from(iterable: AsyncIterable[js.Any]): Readable = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[Readable]
    @scala.inline
    def from(iterable: AsyncIterable[js.Any], options: ReadableOptions): Readable = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Readable]
  }
  
  @JSImport("stream", "Stream")
  @js.native
  class Stream () extends StObject {
    def this(opts: ReadableOptions) = this()
  }
  
  /**
    * Transform streams are `Duplex` streams where the output is in some way
    * related to the input. Like all `Duplex` streams, `Transform` streams
    * implement both the `Readable` and `Writable` interfaces.
    *
    * Examples of `Transform` streams include:
    *
    * * `zlib streams`
    * * `crypto streams`
    * @since v0.9.4
    */
  @JSImport("stream", "Transform")
  @js.native
  class Transform () extends StObject {
    def this(opts: TransformOptions) = this()
    
    def _flush(callback: TransformCallback): Unit = js.native
    
    def _transform(chunk: js.Any, encoding: BufferEncoding, callback: TransformCallback): Unit = js.native
  }
  
  /**
    * @since v0.9.4
    */
  @JSImport("stream", "Writable")
  @js.native
  class Writable ()
    extends StObject
       with WritableStream {
    def this(opts: WritableOptions) = this()
    
    var _construct: js.UndefOr[
        js.Function1[/* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], Unit]
      ] = js.native
    
    def _destroy(error: js.Error, callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Unit = js.native
    def _destroy(error: Null, callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Unit = js.native
    
    def _final(callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Unit = js.native
    
    def _write(
      chunk: js.Any,
      encoding: BufferEncoding,
      callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
    
    var _writev: js.UndefOr[
        js.Function2[
          /* chunks */ js.Array[Chunk], 
          /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
          Unit
        ]
      ] = js.native
    
    /**
      * Event emitter
      * The defined events on documents including:
      * 1. close
      * 2. drain
      * 3. error
      * 4. finish
      * 5. pipe
      * 6. unpipe
      */
    @JSName("addListener")
    def addListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    /**
      * The `writable.cork()` method forces all written data to be buffered in memory.
      * The buffered data will be flushed when either the {@link uncork} or {@link end} methods are called.
      *
      * The primary intent of `writable.cork()` is to accommodate a situation in which
      * several small chunks are written to the stream in rapid succession. Instead of
      * immediately forwarding them to the underlying destination, `writable.cork()`buffers all the chunks until `writable.uncork()` is called, which will pass them
      * all to `writable._writev()`, if present. This prevents a head-of-line blocking
      * situation where data is being buffered while waiting for the first small chunk
      * to be processed. However, use of `writable.cork()` without implementing`writable._writev()` may have an adverse effect on throughput.
      *
      * See also: `writable.uncork()`, `writable._writev()`.
      * @since v0.11.2
      */
    def cork(): Unit = js.native
    
    /**
      * Destroy the stream. Optionally emit an `'error'` event, and emit a `'close'`event (unless `emitClose` is set to `false`). After this call, the writable
      * stream has ended and subsequent calls to `write()` or `end()` will result in
      * an `ERR_STREAM_DESTROYED` error.
      * This is a destructive and immediate way to destroy a stream. Previous calls to`write()` may not have drained, and may trigger an `ERR_STREAM_DESTROYED` error.
      * Use `end()` instead of destroy if data should flush before close, or wait for
      * the `'drain'` event before destroying the stream.
      *
      * Once `destroy()` has been called any further calls will be a no-op and no
      * further errors except from `_destroy()` may be emitted as `'error'`.
      *
      * Implementors should not override this method,
      * but instead implement `writable._destroy()`.
      * @since v8.0.0
      * @param error Optional, an error to emit with `'error'` event.
      */
    def destroy(): Unit = js.native
    def destroy(error: js.Error): Unit = js.native
    
    /**
      * Is `true` after `writable.destroy()` has been called.
      * @since v8.0.0
      */
    var destroyed: Boolean = js.native
    
    @JSName("emit")
    def emit_close(event: close): Boolean = js.native
    @JSName("emit")
    def emit_drain(event: drain): Boolean = js.native
    @JSName("emit")
    def emit_error(event: error, err: js.Error): Boolean = js.native
    @JSName("emit")
    def emit_finish(event: finish): Boolean = js.native
    @JSName("emit")
    def emit_pipe(event: pipe, src: Readable): Boolean = js.native
    @JSName("emit")
    def emit_unpipe(event: unpipe, src: Readable): Boolean = js.native
    
    def end(chunk: js.Any): Unit = js.native
    def end(chunk: js.Any, cb: js.Function0[Unit]): Unit = js.native
    def end(chunk: js.Any, encoding: BufferEncoding): Unit = js.native
    def end(chunk: js.Any, encoding: BufferEncoding, cb: js.Function0[Unit]): Unit = js.native
    
    @JSName("on")
    def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("on")
    def on_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("on")
    def on_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    @JSName("once")
    def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("once")
    def once_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("once")
    def once_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    @JSName("prependListener")
    def prependListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    @JSName("removeListener")
    def removeListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    /**
      * The `writable.setDefaultEncoding()` method sets the default `encoding` for a `Writable` stream.
      * @since v0.11.15
      * @param encoding The new default encoding
      */
    def setDefaultEncoding(encoding: BufferEncoding): this.type = js.native
    
    /**
      * The `writable.uncork()` method flushes all data buffered since {@link cork} was called.
      *
      * When using `writable.cork()` and `writable.uncork()` to manage the buffering
      * of writes to a stream, it is recommended that calls to `writable.uncork()` be
      * deferred using `process.nextTick()`. Doing so allows batching of all`writable.write()` calls that occur within a given Node.js event loop phase.
      *
      * ```js
      * stream.cork();
      * stream.write('some ');
      * stream.write('data ');
      * process.nextTick(() => stream.uncork());
      * ```
      *
      * If the `writable.cork()` method is called multiple times on a stream, the
      * same number of calls to `writable.uncork()` must be called to flush the buffered
      * data.
      *
      * ```js
      * stream.cork();
      * stream.write('some ');
      * stream.cork();
      * stream.write('data ');
      * process.nextTick(() => {
      *   stream.uncork();
      *   // The data will not be flushed until uncork() is called a second time.
      *   stream.uncork();
      * });
      * ```
      *
      * See also: `writable.cork()`.
      * @since v0.11.2
      */
    def uncork(): Unit = js.native
    
    /**
      * Number of times `writable.uncork()` needs to be
      * called in order to fully uncork the stream.
      * @since v13.2.0, v12.16.0
      */
    val writableCorked: Double = js.native
    
    /**
      * Is `true` after `writable.end()` has been called. This property
      * does not indicate whether the data has been flushed, for this use `writable.writableFinished` instead.
      * @since v12.9.0
      */
    val writableEnded: Boolean = js.native
    
    /**
      * Is set to `true` immediately before the `'finish'` event is emitted.
      * @since v12.6.0
      */
    val writableFinished: Boolean = js.native
    
    /**
      * Return the value of `highWaterMark` passed when creating this `Writable`.
      * @since v9.3.0
      */
    val writableHighWaterMark: Double = js.native
    
    /**
      * This property contains the number of bytes (or objects) in the queue
      * ready to be written. The value provides introspection data regarding
      * the status of the `highWaterMark`.
      * @since v9.4.0
      */
    val writableLength: Double = js.native
    
    /**
      * Getter for the property `objectMode` of a given `Writable` stream.
      * @since v12.3.0
      */
    val writableObjectMode: Boolean = js.native
    
    /**
      * The `writable.write()` method writes some data to the stream, and calls the
      * supplied `callback` once the data has been fully handled. If an error
      * occurs, the `callback` will be called with the error as its
      * first argument. The `callback` is called asynchronously and before `'error'` is
      * emitted.
      *
      * The return value is `true` if the internal buffer is less than the`highWaterMark` configured when the stream was created after admitting `chunk`.
      * If `false` is returned, further attempts to write data to the stream should
      * stop until the `'drain'` event is emitted.
      *
      * While a stream is not draining, calls to `write()` will buffer `chunk`, and
      * return false. Once all currently buffered chunks are drained (accepted for
      * delivery by the operating system), the `'drain'` event will be emitted.
      * It is recommended that once `write()` returns false, no more chunks be written
      * until the `'drain'` event is emitted. While calling `write()` on a stream that
      * is not draining is allowed, Node.js will buffer all written chunks until
      * maximum memory usage occurs, at which point it will abort unconditionally.
      * Even before it aborts, high memory usage will cause poor garbage collector
      * performance and high RSS (which is not typically released back to the system,
      * even after the memory is no longer required). Since TCP sockets may never
      * drain if the remote peer does not read the data, writing a socket that is
      * not draining may lead to a remotely exploitable vulnerability.
      *
      * Writing data while the stream is not draining is particularly
      * problematic for a `Transform`, because the `Transform` streams are paused
      * by default until they are piped or a `'data'` or `'readable'` event handler
      * is added.
      *
      * If the data to be written can be generated or fetched on demand, it is
      * recommended to encapsulate the logic into a `Readable` and use {@link pipe}. However, if calling `write()` is preferred, it is
      * possible to respect backpressure and avoid memory issues using the `'drain'` event:
      *
      * ```js
      * function write(data, cb) {
      *   if (!stream.write(data)) {
      *     stream.once('drain', cb);
      *   } else {
      *     process.nextTick(cb);
      *   }
      * }
      *
      * // Wait for cb to be called before doing any other write.
      * write('hello', () => {
      *   console.log('Write completed, do more writes now.');
      * });
      * ```
      *
      * A `Writable` stream in object mode will always ignore the `encoding` argument.
      * @since v0.9.4
      * @param chunk Optional data to write. For streams not operating in object mode, `chunk` must be a string, `Buffer` or `Uint8Array`. For object mode streams, `chunk` may be any
      * JavaScript value other than `null`.
      * @param encoding The encoding, if `chunk` is a string.
      * @param callback Callback for when this chunk of data is flushed.
      * @return `false` if the stream wishes for the calling code to wait for the `'drain'` event to be emitted before continuing to write additional data; otherwise `true`.
      */
    def write(chunk: js.Any): Boolean = js.native
    def write(chunk: js.Any, cb: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Boolean = js.native
    def write(chunk: js.Any, encoding: BufferEncoding): Boolean = js.native
    def write(
      chunk: js.Any,
      encoding: BufferEncoding,
      cb: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
    ): Boolean = js.native
  }
  
  /**
    * Attaches an AbortSignal to a readable or writeable stream. This lets code
    * control stream destruction using an `AbortController`.
    *
    * Calling `abort` on the `AbortController` corresponding to the passed`AbortSignal` will behave the same way as calling `.destroy(new AbortError())`on the stream.
    *
    * ```js
    * const fs = require('fs');
    *
    * const controller = new AbortController();
    * const read = addAbortSignal(
    *   controller.signal,
    *   fs.createReadStream(('object.json'))
    * );
    * // Later, abort the operation closing the stream
    * controller.abort();
    * ```
    *
    * Or using an `AbortSignal` with a readable stream as an async iterable:
    *
    * ```js
    * const controller = new AbortController();
    * setTimeout(() => controller.abort(), 10_000); // set a timeout
    * const stream = addAbortSignal(
    *   controller.signal,
    *   fs.createReadStream(('object.json'))
    * );
    * (async () => {
    *   try {
    *     for await (const chunk of stream) {
    *       await process(chunk);
    *     }
    *   } catch (e) {
    *     if (e.name === 'AbortError') {
    *       // The operation was cancelled
    *     } else {
    *       throw e;
    *     }
    *   }
    * })();
    * ```
    * @since v15.4.0
    * @param signal A signal representing possible cancellation
    * @param stream a stream to attach a signal to
    */
  @scala.inline
  def addAbortSignal[T /* <: Stream */](signal: AbortSignal, stream: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("addAbortSignal")(signal.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def finished(stream: ReadWriteStream, callback: js.Function1[/* err */ js.UndefOr[ErrnoException | Null], Unit]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("finished")(stream.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  @scala.inline
  def finished(
    stream: ReadWriteStream,
    options: FinishedOptions,
    callback: js.Function1[/* err */ js.UndefOr[ErrnoException | Null], Unit]
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("finished")(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  @scala.inline
  def finished(stream: ReadableStream, callback: js.Function1[/* err */ js.UndefOr[ErrnoException | Null], Unit]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("finished")(stream.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  /**
    * A function to get notified when a stream is no longer readable, writable
    * or has experienced an error or a premature close event.
    *
    * ```js
    * const { finished } = require('stream');
    *
    * const rs = fs.createReadStream('archive.tar');
    *
    * finished(rs, (err) => {
    *   if (err) {
    *     console.error('Stream failed.', err);
    *   } else {
    *     console.log('Stream is done reading.');
    *   }
    * });
    *
    * rs.resume(); // Drain the stream.
    * ```
    *
    * Especially useful in error handling scenarios where a stream is destroyed
    * prematurely (like an aborted HTTP request), and will not emit `'end'`or `'finish'`.
    *
    * The `finished` API provides promise version:
    *
    * ```js
    * const { finished } = require('stream/promises');
    *
    * const rs = fs.createReadStream('archive.tar');
    *
    * async function run() {
    *   await finished(rs);
    *   console.log('Stream is done reading.');
    * }
    *
    * run().catch(console.error);
    * rs.resume(); // Drain the stream.
    * ```
    *
    * `stream.finished()` leaves dangling event listeners (in particular`'error'`, `'end'`, `'finish'` and `'close'`) after `callback` has been
    * invoked. The reason for this is so that unexpected `'error'` events (due to
    * incorrect stream implementations) do not cause unexpected crashes.
    * If this is unwanted behavior then the returned cleanup function needs to be
    * invoked in the callback:
    *
    * ```js
    * const cleanup = finished(rs, (err) => {
    *   cleanup();
    *   // ...
    * });
    * ```
    * @since v10.0.0
    * @param stream A readable and/or writable stream.
    * @param callback A callback function that takes an optional error argument.
    * @return A cleanup function which removes all registered listeners.
    */
  @scala.inline
  def finished(
    stream: ReadableStream,
    options: FinishedOptions,
    callback: js.Function1[/* err */ js.UndefOr[ErrnoException | Null], Unit]
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("finished")(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  @scala.inline
  def finished(stream: WritableStream, callback: js.Function1[/* err */ js.UndefOr[ErrnoException | Null], Unit]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("finished")(stream.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  @scala.inline
  def finished(
    stream: WritableStream,
    options: FinishedOptions,
    callback: js.Function1[/* err */ js.UndefOr[ErrnoException | Null], Unit]
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("finished")(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  @scala.inline
  def pipeline(
    stream1: ReadableStream,
    stream2: ReadWriteStream,
    streams: (ReadWriteStream | WritableStream | (js.Function1[/* err */ ErrnoException | Null, Unit]))*
  ): WritableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(stream1.asInstanceOf[js.Any], stream2.asInstanceOf[js.Any], streams.asInstanceOf[js.Any])).asInstanceOf[WritableStream]
  @scala.inline
  def pipeline(
    stream1: ReadableStream,
    stream2: WritableStream,
    streams: (ReadWriteStream | WritableStream | (js.Function1[/* err */ ErrnoException | Null, Unit]))*
  ): WritableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(stream1.asInstanceOf[js.Any], stream2.asInstanceOf[js.Any], streams.asInstanceOf[js.Any])).asInstanceOf[WritableStream]
  @scala.inline
  def pipeline(streams: js.Array[ReadableStream | WritableStream | ReadWriteStream]): WritableStream = ^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(streams.asInstanceOf[js.Any]).asInstanceOf[WritableStream]
  @scala.inline
  def pipeline(
    streams: js.Array[ReadableStream | WritableStream | ReadWriteStream],
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): WritableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(streams.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[WritableStream]
  /**
    * A module method to pipe between streams and generators forwarding errors and
    * properly cleaning up and provide a callback when the pipeline is complete.
    *
    * ```js
    * const { pipeline } = require('stream');
    * const fs = require('fs');
    * const zlib = require('zlib');
    *
    * // Use the pipeline API to easily pipe a series of streams
    * // together and get notified when the pipeline is fully done.
    *
    * // A pipeline to gzip a potentially huge tar file efficiently:
    *
    * pipeline(
    *   fs.createReadStream('archive.tar'),
    *   zlib.createGzip(),
    *   fs.createWriteStream('archive.tar.gz'),
    *   (err) => {
    *     if (err) {
    *       console.error('Pipeline failed.', err);
    *     } else {
    *       console.log('Pipeline succeeded.');
    *     }
    *   }
    * );
    * ```
    *
    * The `pipeline` API provides a promise version, which can also
    * receive an options argument as the last parameter with a`signal` `<AbortSignal>` property. When the signal is aborted,`destroy` will be called on the underlying pipeline, with
    * an`AbortError`.
    *
    * ```js
    * const { pipeline } = require('stream/promises');
    *
    * async function run() {
    *   await pipeline(
    *     fs.createReadStream('archive.tar'),
    *     zlib.createGzip(),
    *     fs.createWriteStream('archive.tar.gz')
    *   );
    *   console.log('Pipeline succeeded.');
    * }
    *
    * run().catch(console.error);
    * ```
    *
    * To use an `AbortSignal`, pass it inside an options object,
    * as the last argument:
    *
    * ```js
    * const { pipeline } = require('stream/promises');
    *
    * async function run() {
    *   const ac = new AbortController();
    *   const options = {
    *     signal: ac.signal,
    *   };
    *
    *   setTimeout(() => ac.abort(), 1);
    *   await pipeline(
    *     fs.createReadStream('archive.tar'),
    *     zlib.createGzip(),
    *     fs.createWriteStream('archive.tar.gz'),
    *     options,
    *   );
    * }
    *
    * run().catch(console.error); // AbortError
    * ```
    *
    * The `pipeline` API also supports async generators:
    *
    * ```js
    * const { pipeline } = require('stream/promises');
    * const fs = require('fs');
    *
    * async function run() {
    *   await pipeline(
    *     fs.createReadStream('lowercase.txt'),
    *     async function* (source) {
    *       source.setEncoding('utf8');  // Work with strings rather than `Buffer`s.
    *       for await (const chunk of source) {
    *         yield chunk.toUpperCase();
    *       }
    *     },
    *     fs.createWriteStream('uppercase.txt')
    *   );
    *   console.log('Pipeline succeeded.');
    * }
    *
    * run().catch(console.error);
    * ```
    *
    * `stream.pipeline()` will call `stream.destroy(err)` on all streams except:
    *
    * * `Readable` streams which have emitted `'end'` or `'close'`.
    * * `Writable` streams which have emitted `'finish'` or `'close'`.
    *
    * `stream.pipeline()` leaves dangling event listeners on the streams
    * after the `callback` has been invoked. In the case of reuse of streams after
    * failure, this can cause event listener leaks and swallowed errors.
    * @since v10.0.0
    * @param callback Called when the pipeline is fully done.
    */
  @scala.inline
  def pipeline[A /* <: PipelineSource[js.Any] */, B /* <: PipelineDestination[A, js.Any] */](source: A, destination: B): WritableStream | B = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[WritableStream | B]
  @scala.inline
  def pipeline[A /* <: PipelineSource[js.Any] */, B /* <: PipelineDestination[A, js.Any] */](source: A, destination: B, callback: PipelineCallback[B]): WritableStream | B = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[WritableStream | B]
  @scala.inline
  def pipeline[A /* <: PipelineSource[js.Any] */, T1 /* <: PipelineTransform[A, js.Any] */, B /* <: PipelineDestination[T1, js.Any] */](source: A, transform1: T1, destination: B): WritableStream | B = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[WritableStream | B]
  @scala.inline
  def pipeline[A /* <: PipelineSource[js.Any] */, T1 /* <: PipelineTransform[A, js.Any] */, B /* <: PipelineDestination[T1, js.Any] */](source: A, transform1: T1, destination: B, callback: PipelineCallback[B]): WritableStream | B = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[WritableStream | B]
  @scala.inline
  def pipeline[A /* <: PipelineSource[js.Any] */, T1 /* <: PipelineTransform[A, js.Any] */, T2 /* <: PipelineTransform[T1, js.Any] */, B /* <: PipelineDestination[T2, js.Any] */](source: A, transform1: T1, transform2: T2, destination: B): WritableStream | B = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], transform2.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[WritableStream | B]
  @scala.inline
  def pipeline[A /* <: PipelineSource[js.Any] */, T1 /* <: PipelineTransform[A, js.Any] */, T2 /* <: PipelineTransform[T1, js.Any] */, B /* <: PipelineDestination[T2, js.Any] */](source: A, transform1: T1, transform2: T2, destination: B, callback: PipelineCallback[B]): WritableStream | B = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], transform2.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[WritableStream | B]
  @scala.inline
  def pipeline[A /* <: PipelineSource[js.Any] */, T1 /* <: PipelineTransform[A, js.Any] */, T2 /* <: PipelineTransform[T1, js.Any] */, T3 /* <: PipelineTransform[T2, js.Any] */, B /* <: PipelineDestination[T3, js.Any] */](source: A, transform1: T1, transform2: T2, transform3: T3, destination: B): WritableStream | B = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], transform2.asInstanceOf[js.Any], transform3.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[WritableStream | B]
  @scala.inline
  def pipeline[A /* <: PipelineSource[js.Any] */, T1 /* <: PipelineTransform[A, js.Any] */, T2 /* <: PipelineTransform[T1, js.Any] */, T3 /* <: PipelineTransform[T2, js.Any] */, B /* <: PipelineDestination[T3, js.Any] */](
    source: A,
    transform1: T1,
    transform2: T2,
    transform3: T3,
    destination: B,
    callback: PipelineCallback[B]
  ): WritableStream | B = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], transform2.asInstanceOf[js.Any], transform3.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[WritableStream | B]
  @scala.inline
  def pipeline[A /* <: PipelineSource[js.Any] */, T1 /* <: PipelineTransform[A, js.Any] */, T2 /* <: PipelineTransform[T1, js.Any] */, T3 /* <: PipelineTransform[T2, js.Any] */, T4 /* <: PipelineTransform[T3, js.Any] */, B /* <: PipelineDestination[T4, js.Any] */](source: A, transform1: T1, transform2: T2, transform3: T3, transform4: T4, destination: B): WritableStream | B = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], transform2.asInstanceOf[js.Any], transform3.asInstanceOf[js.Any], transform4.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[WritableStream | B]
  @scala.inline
  def pipeline[A /* <: PipelineSource[js.Any] */, T1 /* <: PipelineTransform[A, js.Any] */, T2 /* <: PipelineTransform[T1, js.Any] */, T3 /* <: PipelineTransform[T2, js.Any] */, T4 /* <: PipelineTransform[T3, js.Any] */, B /* <: PipelineDestination[T4, js.Any] */](
    source: A,
    transform1: T1,
    transform2: T2,
    transform3: T3,
    transform4: T4,
    destination: B,
    callback: PipelineCallback[B]
  ): WritableStream | B = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], transform2.asInstanceOf[js.Any], transform3.asInstanceOf[js.Any], transform4.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[WritableStream | B]
  
  object promises {
    
    @JSImport("stream", "promises")
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
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - tmttyped.node.eventsMod.Abortable because Already inherited
  - tmttyped.node.streamMod.StreamOptions because Already inherited
  - tmttyped.node.streamMod.WritableOptions because var conflicts: autoDestroy, construct, destroy, emitClose, highWaterMark, objectMode, signal. Inlined decodeStrings, defaultEncoding, write, writev, `final` */ trait DuplexOptions
    extends StObject
       with ReadableOptions {
    
    var allowHalfOpen: js.UndefOr[Boolean] = js.undefined
    
    @JSName("construct")
    var construct_DuplexOptions: js.UndefOr[
        js.ThisFunction1[
          /* this */ Duplex, 
          /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var decodeStrings: js.UndefOr[Boolean] = js.undefined
    
    var defaultEncoding: js.UndefOr[BufferEncoding] = js.undefined
    
    @JSName("destroy")
    var destroy_DuplexOptions: js.UndefOr[
        js.ThisFunction2[
          /* this */ Duplex, 
          /* error */ js.Error | Null, 
          /* callback */ js.Function1[/* error */ js.Error | Null, Unit], 
          Unit
        ]
      ] = js.undefined
    
    var `final`: js.UndefOr[
        js.ThisFunction1[
          (/* this */ Duplex) | (/* this */ Writable), 
          /* callback */ js.Function1[js.UndefOr[js.Error | Null], Unit], 
          Unit
        ]
      ] = js.undefined
    
    @JSName("read")
    var read_DuplexOptions: js.UndefOr[js.ThisFunction1[/* this */ Duplex, /* size */ Double, Unit]] = js.undefined
    
    var readableHighWaterMark: js.UndefOr[Double] = js.undefined
    
    var readableObjectMode: js.UndefOr[Boolean] = js.undefined
    
    var writableCorked: js.UndefOr[Double] = js.undefined
    
    var writableHighWaterMark: js.UndefOr[Double] = js.undefined
    
    var writableObjectMode: js.UndefOr[Boolean] = js.undefined
    
    var write: js.UndefOr[
        js.ThisFunction3[
          (/* this */ Duplex) | (/* this */ Writable), 
          /* chunk */ js.Any, 
          /* encoding */ BufferEncoding, 
          /* callback */ js.Function1[js.UndefOr[js.Error | Null], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var writev: js.UndefOr[
        js.ThisFunction2[
          (/* this */ Duplex) | (/* this */ Writable), 
          /* chunks */ js.Array[Chunk], 
          /* callback */ js.Function1[js.UndefOr[js.Error | Null], Unit], 
          Unit
        ]
      ] = js.undefined
  }
  object DuplexOptions {
    
    @scala.inline
    def apply(): DuplexOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DuplexOptions]
    }
    
    @scala.inline
    implicit class DuplexOptionsMutableBuilder[Self <: DuplexOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowHalfOpen(value: Boolean): Self = StObject.set(x, "allowHalfOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowHalfOpenUndefined: Self = StObject.set(x, "allowHalfOpen", js.undefined)
      
      @scala.inline
      def setConstruct(
        value: js.ThisFunction1[
              /* this */ Duplex, 
              /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
              Unit
            ]
      ): Self = StObject.set(x, "construct", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstructUndefined: Self = StObject.set(x, "construct", js.undefined)
      
      @scala.inline
      def setDecodeStrings(value: Boolean): Self = StObject.set(x, "decodeStrings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecodeStringsUndefined: Self = StObject.set(x, "decodeStrings", js.undefined)
      
      @scala.inline
      def setDefaultEncoding(value: BufferEncoding): Self = StObject.set(x, "defaultEncoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultEncodingUndefined: Self = StObject.set(x, "defaultEncoding", js.undefined)
      
      @scala.inline
      def setDestroy(
        value: js.ThisFunction2[
              /* this */ Duplex, 
              /* error */ js.Error | Null, 
              /* callback */ js.Function1[/* error */ js.Error | Null, Unit], 
              Unit
            ]
      ): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      @scala.inline
      def setFinal(
        value: js.ThisFunction1[
              (/* this */ Duplex) | (/* this */ Writable), 
              /* callback */ js.Function1[js.UndefOr[js.Error | Null], Unit], 
              Unit
            ]
      ): Self = StObject.set(x, "final", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFinalUndefined: Self = StObject.set(x, "final", js.undefined)
      
      @scala.inline
      def setRead(value: js.ThisFunction1[/* this */ Duplex, /* size */ Double, Unit]): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
      
      @scala.inline
      def setReadableHighWaterMark(value: Double): Self = StObject.set(x, "readableHighWaterMark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadableHighWaterMarkUndefined: Self = StObject.set(x, "readableHighWaterMark", js.undefined)
      
      @scala.inline
      def setReadableObjectMode(value: Boolean): Self = StObject.set(x, "readableObjectMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadableObjectModeUndefined: Self = StObject.set(x, "readableObjectMode", js.undefined)
      
      @scala.inline
      def setWritableCorked(value: Double): Self = StObject.set(x, "writableCorked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWritableCorkedUndefined: Self = StObject.set(x, "writableCorked", js.undefined)
      
      @scala.inline
      def setWritableHighWaterMark(value: Double): Self = StObject.set(x, "writableHighWaterMark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWritableHighWaterMarkUndefined: Self = StObject.set(x, "writableHighWaterMark", js.undefined)
      
      @scala.inline
      def setWritableObjectMode(value: Boolean): Self = StObject.set(x, "writableObjectMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWritableObjectModeUndefined: Self = StObject.set(x, "writableObjectMode", js.undefined)
      
      @scala.inline
      def setWrite(
        value: js.ThisFunction3[
              (/* this */ Duplex) | (/* this */ Writable), 
              /* chunk */ js.Any, 
              /* encoding */ BufferEncoding, 
              /* callback */ js.Function1[js.UndefOr[js.Error | Null], Unit], 
              Unit
            ]
      ): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWriteUndefined: Self = StObject.set(x, "write", js.undefined)
      
      @scala.inline
      def setWritev(
        value: js.ThisFunction2[
              (/* this */ Duplex) | (/* this */ Writable), 
              /* chunks */ js.Array[Chunk], 
              /* callback */ js.Function1[js.UndefOr[js.Error | Null], Unit], 
              Unit
            ]
      ): Self = StObject.set(x, "writev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWritevUndefined: Self = StObject.set(x, "writev", js.undefined)
    }
  }
  
  trait FinishedOptions
    extends StObject
       with Abortable {
    
    var error: js.UndefOr[Boolean] = js.undefined
    
    var readable: js.UndefOr[Boolean] = js.undefined
    
    var writable: js.UndefOr[Boolean] = js.undefined
  }
  object FinishedOptions {
    
    @scala.inline
    def apply(): FinishedOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FinishedOptions]
    }
    
    @scala.inline
    implicit class FinishedOptionsMutableBuilder[Self <: FinishedOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setReadable(value: Boolean): Self = StObject.set(x, "readable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadableUndefined: Self = StObject.set(x, "readable", js.undefined)
      
      @scala.inline
      def setWritable(value: Boolean): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWritableUndefined: Self = StObject.set(x, "writable", js.undefined)
    }
  }
  
  trait Pipe extends StObject {
    
    def close(): Unit
    
    def hasRef(): Boolean
    
    def ref(): Unit
    
    def unref(): Unit
  }
  object Pipe {
    
    @scala.inline
    def apply(close: () => Unit, hasRef: () => Boolean, ref: () => Unit, unref: () => Unit): Pipe = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), hasRef = js.Any.fromFunction0(hasRef), ref = js.Any.fromFunction0(ref), unref = js.Any.fromFunction0(unref))
      __obj.asInstanceOf[Pipe]
    }
    
    @scala.inline
    implicit class PipeMutableBuilder[Self <: Pipe] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasRef(value: () => Boolean): Self = StObject.set(x, "hasRef", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRef(value: () => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUnref(value: () => Unit): Self = StObject.set(x, "unref", js.Any.fromFunction0(value))
    }
  }
  
  type PipelineCallback[S /* <: PipelineDestination[js.Any, js.Any] */] = (js.Function1[/* err */ ErrnoException | Null, Unit]) | (js.Function2[/* err */ ErrnoException | Null, /* value */ js.Any, Unit])
  
  type PipelineDestination[S /* <: PipelineTransformSource[js.Any] */, P] = WritableStream | PipelineDestinationIterableFunction[js.Any] | (PipelineDestinationPromiseFunction[js.Any, P])
  
  type PipelineDestinationIterableFunction[T] = js.Function1[/* source */ AsyncIterable[T], AsyncIterable[js.Any]]
  
  type PipelineDestinationPromiseFunction[T, P] = js.Function1[/* source */ AsyncIterable[T], js.Promise[P]]
  
  trait PipelineOptions extends StObject {
    
    var signal: AbortSignal
  }
  object PipelineOptions {
    
    @scala.inline
    def apply(signal: AbortSignal): PipelineOptions = {
      val __obj = js.Dynamic.literal(signal = signal.asInstanceOf[js.Any])
      __obj.asInstanceOf[PipelineOptions]
    }
    
    @scala.inline
    implicit class PipelineOptionsMutableBuilder[Self <: PipelineOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    }
  }
  
  type PipelinePromise[S /* <: PipelineDestination[js.Any, js.Any] */] = js.Promise[js.Any | Unit]
  
  type PipelineSource[T] = js.Iterable[T] | AsyncIterable[T] | ReadableStream | PipelineSourceFunction[T]
  
  type PipelineSourceFunction[T] = js.Function0[js.Iterable[T] | AsyncIterable[T]]
  
  type PipelineTransform[S /* <: PipelineTransformSource[js.Any] */, U] = ReadWriteStream | (js.Function1[/* source */ S | AsyncIterable[js.Any], AsyncIterable[U]])
  
  type PipelineTransformSource[T] = PipelineSource[T] | (PipelineTransform[js.Any, T])
  
  trait ReadableOptions
    extends StObject
       with StreamOptions[Readable] {
    
    var encoding: js.UndefOr[BufferEncoding] = js.undefined
    
    var read: js.UndefOr[js.ThisFunction1[/* this */ Readable, /* size */ Double, Unit]] = js.undefined
  }
  object ReadableOptions {
    
    @scala.inline
    def apply(): ReadableOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadableOptions]
    }
    
    @scala.inline
    implicit class ReadableOptionsMutableBuilder[Self <: ReadableOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setRead(value: js.ThisFunction1[/* this */ Readable, /* size */ Double, Unit]): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
    }
  }
  
  trait StreamOptions[T /* <: Stream */]
    extends StObject
       with Abortable {
    
    var autoDestroy: js.UndefOr[Boolean] = js.undefined
    
    var construct: js.UndefOr[
        js.ThisFunction1[
          /* this */ T, 
          /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var destroy: js.UndefOr[
        js.ThisFunction2[
          /* this */ T, 
          /* error */ js.Error | Null, 
          /* callback */ js.Function1[/* error */ js.Error | Null, Unit], 
          Unit
        ]
      ] = js.undefined
    
    var emitClose: js.UndefOr[Boolean] = js.undefined
    
    var highWaterMark: js.UndefOr[Double] = js.undefined
    
    var objectMode: js.UndefOr[Boolean] = js.undefined
  }
  object StreamOptions {
    
    @scala.inline
    def apply[T /* <: Stream */](): StreamOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StreamOptions[T]]
    }
    
    @scala.inline
    implicit class StreamOptionsMutableBuilder[Self <: StreamOptions[_], T /* <: Stream */] (val x: Self with StreamOptions[T]) extends AnyVal {
      
      @scala.inline
      def setAutoDestroy(value: Boolean): Self = StObject.set(x, "autoDestroy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoDestroyUndefined: Self = StObject.set(x, "autoDestroy", js.undefined)
      
      @scala.inline
      def setConstruct(
        value: js.ThisFunction1[
              /* this */ T, 
              /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
              Unit
            ]
      ): Self = StObject.set(x, "construct", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstructUndefined: Self = StObject.set(x, "construct", js.undefined)
      
      @scala.inline
      def setDestroy(
        value: js.ThisFunction2[
              /* this */ T, 
              /* error */ js.Error | Null, 
              /* callback */ js.Function1[/* error */ js.Error | Null, Unit], 
              Unit
            ]
      ): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      @scala.inline
      def setEmitClose(value: Boolean): Self = StObject.set(x, "emitClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmitCloseUndefined: Self = StObject.set(x, "emitClose", js.undefined)
      
      @scala.inline
      def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
      
      @scala.inline
      def setObjectMode(value: Boolean): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectModeUndefined: Self = StObject.set(x, "objectMode", js.undefined)
    }
  }
  
  type TransformCallback = js.Function2[/* error */ js.UndefOr[js.Error | Null], /* data */ js.UndefOr[js.Any], Unit]
  
  trait TransformOptions
    extends StObject
       with DuplexOptions {
    
    @JSName("construct")
    var construct_TransformOptions: js.UndefOr[
        js.ThisFunction1[
          /* this */ Transform, 
          /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
          Unit
        ]
      ] = js.undefined
    
    @JSName("destroy")
    var destroy_TransformOptions: js.UndefOr[
        js.ThisFunction2[
          /* this */ Transform, 
          /* error */ js.Error | Null, 
          /* callback */ js.Function1[/* error */ js.Error | Null, Unit], 
          Unit
        ]
      ] = js.undefined
    
    @JSName("final")
    var final_TransformOptions: js.UndefOr[
        js.ThisFunction1[
          /* this */ Transform, 
          /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var flush: js.UndefOr[js.ThisFunction1[/* this */ Transform, /* callback */ TransformCallback, Unit]] = js.undefined
    
    @JSName("read")
    var read_TransformOptions: js.UndefOr[js.ThisFunction1[/* this */ Transform, /* size */ Double, Unit]] = js.undefined
    
    var transform: js.UndefOr[
        js.ThisFunction3[
          /* this */ Transform, 
          /* chunk */ js.Any, 
          /* encoding */ BufferEncoding, 
          /* callback */ TransformCallback, 
          Unit
        ]
      ] = js.undefined
    
    @JSName("write")
    var write_TransformOptions: js.UndefOr[
        js.ThisFunction3[
          /* this */ Transform, 
          /* chunk */ js.Any, 
          /* encoding */ BufferEncoding, 
          /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
          Unit
        ]
      ] = js.undefined
    
    @JSName("writev")
    var writev_TransformOptions: js.UndefOr[
        js.ThisFunction2[
          /* this */ Transform, 
          /* chunks */ js.Array[Chunk], 
          /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
          Unit
        ]
      ] = js.undefined
  }
  object TransformOptions {
    
    @scala.inline
    def apply(): TransformOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransformOptions]
    }
    
    @scala.inline
    implicit class TransformOptionsMutableBuilder[Self <: TransformOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConstruct(
        value: js.ThisFunction1[
              /* this */ Transform, 
              /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
              Unit
            ]
      ): Self = StObject.set(x, "construct", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstructUndefined: Self = StObject.set(x, "construct", js.undefined)
      
      @scala.inline
      def setDestroy(
        value: js.ThisFunction2[
              /* this */ Transform, 
              /* error */ js.Error | Null, 
              /* callback */ js.Function1[/* error */ js.Error | Null, Unit], 
              Unit
            ]
      ): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      @scala.inline
      def setFinal(
        value: js.ThisFunction1[
              /* this */ Transform, 
              /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
              Unit
            ]
      ): Self = StObject.set(x, "final", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFinalUndefined: Self = StObject.set(x, "final", js.undefined)
      
      @scala.inline
      def setFlush(value: js.ThisFunction1[/* this */ Transform, /* callback */ TransformCallback, Unit]): Self = StObject.set(x, "flush", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlushUndefined: Self = StObject.set(x, "flush", js.undefined)
      
      @scala.inline
      def setRead(value: js.ThisFunction1[/* this */ Transform, /* size */ Double, Unit]): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
      
      @scala.inline
      def setTransform(
        value: js.ThisFunction3[
              /* this */ Transform, 
              /* chunk */ js.Any, 
              /* encoding */ BufferEncoding, 
              /* callback */ TransformCallback, 
              Unit
            ]
      ): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      @scala.inline
      def setWrite(
        value: js.ThisFunction3[
              /* this */ Transform, 
              /* chunk */ js.Any, 
              /* encoding */ BufferEncoding, 
              /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
              Unit
            ]
      ): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWriteUndefined: Self = StObject.set(x, "write", js.undefined)
      
      @scala.inline
      def setWritev(
        value: js.ThisFunction2[
              /* this */ Transform, 
              /* chunks */ js.Array[Chunk], 
              /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
              Unit
            ]
      ): Self = StObject.set(x, "writev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWritevUndefined: Self = StObject.set(x, "writev", js.undefined)
    }
  }
  
  trait WritableOptions
    extends StObject
       with StreamOptions[Writable] {
    
    var decodeStrings: js.UndefOr[Boolean] = js.undefined
    
    var defaultEncoding: js.UndefOr[BufferEncoding] = js.undefined
    
    var `final`: js.UndefOr[
        js.ThisFunction1[
          /* this */ Writable, 
          /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var write: js.UndefOr[
        js.ThisFunction3[
          /* this */ Writable, 
          /* chunk */ js.Any, 
          /* encoding */ BufferEncoding, 
          /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var writev: js.UndefOr[
        js.ThisFunction2[
          /* this */ Writable, 
          /* chunks */ js.Array[Chunk], 
          /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
          Unit
        ]
      ] = js.undefined
  }
  object WritableOptions {
    
    @scala.inline
    def apply(): WritableOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WritableOptions]
    }
    
    @scala.inline
    implicit class WritableOptionsMutableBuilder[Self <: WritableOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDecodeStrings(value: Boolean): Self = StObject.set(x, "decodeStrings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecodeStringsUndefined: Self = StObject.set(x, "decodeStrings", js.undefined)
      
      @scala.inline
      def setDefaultEncoding(value: BufferEncoding): Self = StObject.set(x, "defaultEncoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultEncodingUndefined: Self = StObject.set(x, "defaultEncoding", js.undefined)
      
      @scala.inline
      def setFinal(
        value: js.ThisFunction1[
              /* this */ Writable, 
              /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
              Unit
            ]
      ): Self = StObject.set(x, "final", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFinalUndefined: Self = StObject.set(x, "final", js.undefined)
      
      @scala.inline
      def setWrite(
        value: js.ThisFunction3[
              /* this */ Writable, 
              /* chunk */ js.Any, 
              /* encoding */ BufferEncoding, 
              /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
              Unit
            ]
      ): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWriteUndefined: Self = StObject.set(x, "write", js.undefined)
      
      @scala.inline
      def setWritev(
        value: js.ThisFunction2[
              /* this */ Writable, 
              /* chunks */ js.Array[Chunk], 
              /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
              Unit
            ]
      ): Self = StObject.set(x, "writev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWritevUndefined: Self = StObject.set(x, "writev", js.undefined)
    }
  }
  
  @js.native
  trait internal extends StObject {
    
    def pipe[T /* <: WritableStream */](destination: T): T = js.native
    def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
  }
}
