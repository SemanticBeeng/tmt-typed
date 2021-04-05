package tmttyped.node

import org.scalablytyped.runtime.Shortcut
import tmttyped.node.NodeJS.ArrayBufferView
import tmttyped.node.NodeJS.Global
import tmttyped.node.NodeJS.Immediate
import tmttyped.node.NodeJS.Timeout
import tmttyped.node.NodeJS.WritableStream
import tmttyped.node.anon.ToPrimitive
import tmttyped.node.consoleMod.global.Console_
import tmttyped.node.consoleMod.global.NodeJS.ConsoleConstructorOptions
import tmttyped.node.processMod.global.NodeJS.Process
import tmttyped.std.ArrayBufferLike
import tmttyped.std.ArrayLike
import tmttyped.std.PropertyKey
import tmttyped.std.SharedArrayBuffer
import tmttyped.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /**
    * Raw data is stored in instances of the Buffer class.
    * A Buffer is similar to an array of integers but corresponds to a raw memory allocation outside the V8 heap.  A Buffer cannot be resized.
    * Valid string encodings: 'ascii'|'utf8'|'utf16le'|'ucs2'(alias of 'utf16le')|'base64'|'binary'(deprecated)|'hex'
    */
  @JSGlobal("Buffer")
  @js.native
  class Buffer protected ()
    extends tmttyped.node.Buffer {
    /**
      * Produces a Buffer backed by the same allocated memory as
      * the given {ArrayBuffer}/{SharedArrayBuffer}.
      *
      *
      * @param arrayBuffer The ArrayBuffer with which to share memory.
      * @deprecated since v10.0.0 - Use `Buffer.from(arrayBuffer[, byteOffset[, length]])` instead.
      */
    def this(arrayBuffer: js.typedarray.ArrayBuffer) = this()
    def this(arrayBuffer: SharedArrayBuffer) = this()
    /**
      * Allocates a new buffer containing the given {array} of octets.
      *
      * @param array The octets to store.
      * @deprecated since v10.0.0 - Use `Buffer.from(array)` instead.
      */
    def this(array: js.Array[_]) = this()
    /**
      * Allocates a new buffer containing the given {array} of octets.
      *
      * @param array The octets to store.
      * @deprecated since v10.0.0 - Use `Buffer.from(array)` instead.
      */
    def this(array: js.typedarray.Uint8Array) = this()
    /**
      * Copies the passed {buffer} data onto a new {Buffer} instance.
      *
      * @param buffer The buffer to copy.
      * @deprecated since v10.0.0 - Use `Buffer.from(buffer)` instead.
      */
    def this(buffer: tmttyped.node.Buffer) = this()
    /**
      * Allocates a new buffer of {size} octets.
      *
      * @param size count of octets to allocate.
      * @deprecated since v10.0.0 - Use `Buffer.alloc()` instead (also see `Buffer.allocUnsafe()`).
      */
    def this(size: Double) = this()
    /**
      * Allocates a new buffer containing the given {str}.
      *
      * @param str String to store in buffer.
      * @param encoding encoding to use, optional.  Default is 'utf8'
      * @deprecated since v10.0.0 - Use `Buffer.from(string[, encoding])` instead.
      */
    def this(str: java.lang.String) = this()
    def this(str: java.lang.String, encoding: BufferEncoding) = this()
  }
  object Buffer {
    
    @JSGlobal("Buffer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Allocates a new buffer of {size} octets.
      *
      * @param size count of octets to allocate.
      * @param fill if specified, buffer will be initialized by calling buf.fill(fill).
      *    If parameter is omitted, buffer will be filled with zeros.
      * @param encoding encoding used for call to buf.fill while initalizing
      */
    /* static member */
    @scala.inline
    def alloc(size: Double): tmttyped.node.Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(size.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.Buffer]
    @scala.inline
    def alloc(size: Double, fill: js.UndefOr[scala.Nothing], encoding: BufferEncoding): tmttyped.node.Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(size.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.Buffer]
    @scala.inline
    def alloc(size: Double, fill: java.lang.String): tmttyped.node.Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(size.asInstanceOf[js.Any], fill.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.Buffer]
    @scala.inline
    def alloc(size: Double, fill: java.lang.String, encoding: BufferEncoding): tmttyped.node.Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(size.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.Buffer]
    @scala.inline
    def alloc(size: Double, fill: Double): tmttyped.node.Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(size.asInstanceOf[js.Any], fill.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.Buffer]
    @scala.inline
    def alloc(size: Double, fill: Double, encoding: BufferEncoding): tmttyped.node.Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(size.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.Buffer]
    @scala.inline
    def alloc(size: Double, fill: tmttyped.node.Buffer): tmttyped.node.Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(size.asInstanceOf[js.Any], fill.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.Buffer]
    @scala.inline
    def alloc(size: Double, fill: tmttyped.node.Buffer, encoding: BufferEncoding): tmttyped.node.Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(size.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.Buffer]
    
    /**
      * Allocates a new buffer of {size} octets, leaving memory not initialized, so the contents
      * of the newly created Buffer are unknown and may contain sensitive data.
      *
      * @param size count of octets to allocate
      */
    /* static member */
    @scala.inline
    def allocUnsafe(size: Double): tmttyped.node.Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("allocUnsafe")(size.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.Buffer]
    
    /**
      * Allocates a new non-pooled buffer of {size} octets, leaving memory not initialized, so the contents
      * of the newly created Buffer are unknown and may contain sensitive data.
      *
      * @param size count of octets to allocate
      */
    /* static member */
    @scala.inline
    def allocUnsafeSlow(size: Double): tmttyped.node.Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("allocUnsafeSlow")(size.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.Buffer]
    
    /**
      * Gives the actual byte length of a string. encoding defaults to 'utf8'.
      * This is not the same as String.prototype.length since that returns the number of characters in a string.
      *
      * @param string string to test.
      * @param encoding encoding used to evaluate (defaults to 'utf8')
      */
    /* static member */
    @scala.inline
    def byteLength(string: java.lang.String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("byteLength")(string.asInstanceOf[js.Any]).asInstanceOf[Double]
    @scala.inline
    def byteLength(string: java.lang.String, encoding: BufferEncoding): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("byteLength")(string.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def byteLength(string: js.typedarray.ArrayBuffer): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("byteLength")(string.asInstanceOf[js.Any]).asInstanceOf[Double]
    @scala.inline
    def byteLength(string: js.typedarray.ArrayBuffer, encoding: BufferEncoding): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("byteLength")(string.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def byteLength(string: ArrayBufferView): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("byteLength")(string.asInstanceOf[js.Any]).asInstanceOf[Double]
    @scala.inline
    def byteLength(string: ArrayBufferView, encoding: BufferEncoding): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("byteLength")(string.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def byteLength(string: SharedArrayBuffer): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("byteLength")(string.asInstanceOf[js.Any]).asInstanceOf[Double]
    @scala.inline
    def byteLength(string: SharedArrayBuffer, encoding: BufferEncoding): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("byteLength")(string.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * The same as buf1.compare(buf2).
      */
    /* static member */
    @scala.inline
    def compare(buf1: js.typedarray.Uint8Array, buf2: js.typedarray.Uint8Array): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(buf1.asInstanceOf[js.Any], buf2.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Returns a buffer which is the result of concatenating all the buffers in the list together.
      *
      * If the list has no items, or if the totalLength is 0, then it returns a zero-length buffer.
      * If the list has exactly one item, then the first item of the list is returned.
      * If the list has more than one item, then a new Buffer is created.
      *
      * @param list An array of Buffer objects to concatenate
      * @param totalLength Total length of the buffers when concatenated.
      *   If totalLength is not provided, it is read from the buffers in the list. However, this adds an additional loop to the function, so it is faster to provide the length explicitly.
      */
    /* static member */
    @scala.inline
    def concat(list: js.Array[js.typedarray.Uint8Array]): tmttyped.node.Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(list.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.Buffer]
    @scala.inline
    def concat(list: js.Array[js.typedarray.Uint8Array], totalLength: Double): tmttyped.node.Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(list.asInstanceOf[js.Any], totalLength.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.Buffer]
    
    /**
      * When passed a reference to the .buffer property of a TypedArray instance,
      * the newly created Buffer will share the same allocated memory as the TypedArray.
      * The optional {byteOffset} and {length} arguments specify a memory range
      * within the {arrayBuffer} that will be shared by the Buffer.
      *
      * @param arrayBuffer The .buffer property of any TypedArray or a new ArrayBuffer()
      */
    /* static member */
    /**
      * Creates a new Buffer containing the given JavaScript string {str}.
      * If provided, the {encoding} parameter identifies the character encoding.
      * If not provided, {encoding} defaults to 'utf8'.
      */
    @scala.inline
    def from(
      arrayBuffer: WithImplicitCoercion[
          js.Array[Double] | js.typedarray.ArrayBuffer | SharedArrayBuffer | java.lang.String | js.typedarray.Uint8Array
        ]
    ): tmttyped.node.Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(arrayBuffer.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.Buffer]
    @scala.inline
    def from(
      arrayBuffer: WithImplicitCoercion[js.typedarray.ArrayBuffer | SharedArrayBuffer],
      byteOffset: js.UndefOr[scala.Nothing],
      length: Double
    ): tmttyped.node.Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(arrayBuffer.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.Buffer]
    @scala.inline
    def from(
      arrayBuffer: WithImplicitCoercion[js.typedarray.ArrayBuffer | SharedArrayBuffer],
      byteOffset: Double
    ): tmttyped.node.Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(arrayBuffer.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.Buffer]
    @scala.inline
    def from(
      arrayBuffer: WithImplicitCoercion[js.typedarray.ArrayBuffer | SharedArrayBuffer],
      byteOffset: Double,
      length: Double
    ): tmttyped.node.Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(arrayBuffer.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.Buffer]
    @scala.inline
    def from(data: js.Array[Double]): tmttyped.node.Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(data.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.Buffer]
    /**
      * Creates a new Buffer using the passed {data}
      * @param data data to create a new Buffer
      */
    /* static member */
    @scala.inline
    def from(data: js.typedarray.Uint8Array): tmttyped.node.Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(data.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.Buffer]
    @scala.inline
    def from(str: WithImplicitCoercion[java.lang.String], encoding: BufferEncoding): tmttyped.node.Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(str.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.Buffer]
    @scala.inline
    def from(str: ToPrimitive): tmttyped.node.Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(str.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.Buffer]
    @scala.inline
    def from(str: ToPrimitive, encoding: BufferEncoding): tmttyped.node.Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(str.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.Buffer]
    
    /**
      * Returns true if {obj} is a Buffer
      *
      * @param obj object to test.
      */
    /* static member */
    @scala.inline
    def isBuffer(obj: js.Any): /* is node.Buffer */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBuffer")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is node.Buffer */ Boolean]
    
    /**
      * Returns true if {encoding} is a valid encoding argument.
      * Valid string encodings in Node 0.12: 'ascii'|'utf8'|'utf16le'|'ucs2'(alias of 'utf16le')|'base64'|'binary'(deprecated)|'hex'
      *
      * @param encoding string to test.
      */
    /* static member */
    @scala.inline
    def isEncoding(encoding: java.lang.String): /* is node.BufferEncoding */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEncoding")(encoding.asInstanceOf[js.Any]).asInstanceOf[/* is node.BufferEncoding */ Boolean]
    
    /**
      * Creates a new Buffer using the passed {data}
      * @param values to create a new Buffer
      */
    /* static member */
    @scala.inline
    def of(items: Double*): tmttyped.node.Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(items.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.Buffer]
    
    /**
      * This is the number of bytes used to determine the size of pre-allocated, internal Buffer instances used for pooling. This value may be modified.
      */
    /* static member */
    @JSGlobal("Buffer.poolSize")
    @js.native
    def poolSize: Double = js.native
    @scala.inline
    def poolSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("poolSize")(x.asInstanceOf[js.Any])
  }
  
  @scala.inline
  def clearImmediate(immediateId: Immediate): Unit = js.Dynamic.global.applyDynamic("clearImmediate")(immediateId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def clearInterval(intervalId: Timeout): Unit = js.Dynamic.global.applyDynamic("clearInterval")(intervalId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def clearTimeout(timeoutId: Timeout): Unit = js.Dynamic.global.applyDynamic("clearTimeout")(timeoutId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  object console extends Shortcut {
    
    @JSGlobal("console")
    @js.native
    val ^ : Console_ = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("console.Console")
    @js.native
    class Console protected () extends Console_ {
      def this(options: ConsoleConstructorOptions) = this()
      def this(stdout: WritableStream) = this()
      def this(stdout: WritableStream, stderr: WritableStream) = this()
      def this(stdout: WritableStream, stderr: js.UndefOr[scala.Nothing], ignoreErrors: Boolean) = this()
      def this(stdout: WritableStream, stderr: WritableStream, ignoreErrors: Boolean) = this()
    }
    
    type _To = Console_
    
    /* This means you don't have to write `^`, but can instead just say `console.foo` */
    override def _to: Console_ = ^
  }
  
  @JSGlobal("__dirname")
  @js.native
  def dirname: java.lang.String = js.native
  
  @scala.inline
  def dirname_=(x: java.lang.String): Unit = js.Dynamic.global.updateDynamic("__dirname")(x.asInstanceOf[js.Any])
  
  // Same as module.exports
  @JSGlobal("exports")
  @js.native
  def exports: js.Any = js.native
  @scala.inline
  def exports_=(x: js.Any): Unit = js.Dynamic.global.updateDynamic("exports")(x.asInstanceOf[js.Any])
  
  @JSGlobal("__filename")
  @js.native
  def filename: java.lang.String = js.native
  
  @scala.inline
  def filename_=(x: java.lang.String): Unit = js.Dynamic.global.updateDynamic("__filename")(x.asInstanceOf[js.Any])
  
  object global extends Shortcut {
    
    @JSGlobal("global")
    @js.native
    val ^ : Global with (/* globalThis */ js.Any) = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.Array")
    @js.native
    class Array[T] protected ()
      extends tmttyped.std.Array[T] {
      def this(arrayLength: Double) = this()
      def this(items: T*) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.ArrayBuffer")
    @js.native
    class ArrayBuffer protected ()
      extends tmttyped.std.ArrayBuffer {
      def this(byteLength: Double) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.Boolean")
    @js.native
    class Boolean ()
      extends tmttyped.std.Boolean {
      def this(value: js.Any) = this()
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("global.Buffer")
    @js.native
    class BufferCls protected ()
      extends tmttyped.node.Buffer {
      /**
        * Allocates a new buffer containing the given {str}.
        *
        * @param str String to store in buffer.
        * @param encoding encoding to use, optional.  Default is 'utf8'
        * @deprecated since v10.0.0 - Use `Buffer.from(string[, encoding])` instead.
        */
      def this(str: java.lang.String) = this()
      def this(str: java.lang.String, encoding: BufferEncoding) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.DataView")
    @js.native
    class DataView protected ()
      extends tmttyped.std.DataView {
      def this(buffer: ArrayBufferLike) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: js.UndefOr[scala.Nothing], byteLength: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Double, byteLength: Double) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.Date")
    @js.native
    class Date ()
      extends tmttyped.std.Date {
      def this(value: java.lang.String) = this()
      def this(value: js.Date) = this()
      def this(value: Double) = this()
      def this(vd: VarDate) = this()
      def this(year: Double, month: Double) = this()
      def this(year: Double, month: Double, date: Double) = this()
      def this(year: Double, month: Double, date: js.UndefOr[scala.Nothing], hours: Double) = this()
      def this(year: Double, month: Double, date: Double, hours: Double) = this()
      def this(
        year: Double,
        month: Double,
        date: js.UndefOr[scala.Nothing],
        hours: js.UndefOr[scala.Nothing],
        minutes: Double
      ) = this()
      def this(year: Double, month: Double, date: js.UndefOr[scala.Nothing], hours: Double, minutes: Double) = this()
      def this(year: Double, month: Double, date: Double, hours: js.UndefOr[scala.Nothing], minutes: Double) = this()
      def this(year: Double, month: Double, date: Double, hours: Double, minutes: Double) = this()
      def this(
        year: Double,
        month: Double,
        date: js.UndefOr[scala.Nothing],
        hours: js.UndefOr[scala.Nothing],
        minutes: js.UndefOr[scala.Nothing],
        seconds: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: js.UndefOr[scala.Nothing],
        hours: js.UndefOr[scala.Nothing],
        minutes: Double,
        seconds: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: js.UndefOr[scala.Nothing],
        hours: Double,
        minutes: js.UndefOr[scala.Nothing],
        seconds: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: js.UndefOr[scala.Nothing],
        hours: Double,
        minutes: Double,
        seconds: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: Double,
        hours: js.UndefOr[scala.Nothing],
        minutes: js.UndefOr[scala.Nothing],
        seconds: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: Double,
        hours: js.UndefOr[scala.Nothing],
        minutes: Double,
        seconds: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: Double,
        hours: Double,
        minutes: js.UndefOr[scala.Nothing],
        seconds: Double
      ) = this()
      def this(year: Double, month: Double, date: Double, hours: Double, minutes: Double, seconds: Double) = this()
      def this(
        year: Double,
        month: Double,
        date: js.UndefOr[scala.Nothing],
        hours: js.UndefOr[scala.Nothing],
        minutes: js.UndefOr[scala.Nothing],
        seconds: js.UndefOr[scala.Nothing],
        ms: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: js.UndefOr[scala.Nothing],
        hours: js.UndefOr[scala.Nothing],
        minutes: js.UndefOr[scala.Nothing],
        seconds: Double,
        ms: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: js.UndefOr[scala.Nothing],
        hours: js.UndefOr[scala.Nothing],
        minutes: Double,
        seconds: js.UndefOr[scala.Nothing],
        ms: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: js.UndefOr[scala.Nothing],
        hours: js.UndefOr[scala.Nothing],
        minutes: Double,
        seconds: Double,
        ms: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: js.UndefOr[scala.Nothing],
        hours: Double,
        minutes: js.UndefOr[scala.Nothing],
        seconds: js.UndefOr[scala.Nothing],
        ms: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: js.UndefOr[scala.Nothing],
        hours: Double,
        minutes: js.UndefOr[scala.Nothing],
        seconds: Double,
        ms: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: js.UndefOr[scala.Nothing],
        hours: Double,
        minutes: Double,
        seconds: js.UndefOr[scala.Nothing],
        ms: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: js.UndefOr[scala.Nothing],
        hours: Double,
        minutes: Double,
        seconds: Double,
        ms: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: Double,
        hours: js.UndefOr[scala.Nothing],
        minutes: js.UndefOr[scala.Nothing],
        seconds: js.UndefOr[scala.Nothing],
        ms: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: Double,
        hours: js.UndefOr[scala.Nothing],
        minutes: js.UndefOr[scala.Nothing],
        seconds: Double,
        ms: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: Double,
        hours: js.UndefOr[scala.Nothing],
        minutes: Double,
        seconds: js.UndefOr[scala.Nothing],
        ms: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: Double,
        hours: js.UndefOr[scala.Nothing],
        minutes: Double,
        seconds: Double,
        ms: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: Double,
        hours: Double,
        minutes: js.UndefOr[scala.Nothing],
        seconds: js.UndefOr[scala.Nothing],
        ms: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: Double,
        hours: Double,
        minutes: js.UndefOr[scala.Nothing],
        seconds: Double,
        ms: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: Double,
        hours: Double,
        minutes: Double,
        seconds: js.UndefOr[scala.Nothing],
        ms: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: Double,
        hours: Double,
        minutes: Double,
        seconds: Double,
        ms: Double
      ) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.Error")
    @js.native
    class Error ()
      extends tmttyped.std.Error {
      def this(message: java.lang.String) = this()
      
      /* CompleteClass */
      override var message: java.lang.String = js.native
      
      /* CompleteClass */
      override var name: java.lang.String = js.native
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.EvalError")
    @js.native
    class EvalError ()
      extends tmttyped.std.Error {
      def this(message: java.lang.String) = this()
      
      /* CompleteClass */
      override var message: java.lang.String = js.native
      
      /* CompleteClass */
      override var name: java.lang.String = js.native
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.Float32Array")
    @js.native
    class Float32Array ()
      extends tmttyped.std.Float32Array {
      def this(array: ArrayBufferLike) = this()
      def this(array: ArrayLike[Double]) = this()
      def this(elements: js.Iterable[Double]) = this()
      def this(length: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: js.UndefOr[scala.Nothing], length: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Double, length: Double) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.Float64Array")
    @js.native
    class Float64Array ()
      extends tmttyped.std.Float64Array {
      def this(array: ArrayBufferLike) = this()
      def this(array: ArrayLike[Double]) = this()
      def this(elements: js.Iterable[Double]) = this()
      def this(length: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: js.UndefOr[scala.Nothing], length: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Double, length: Double) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.Function")
    @js.native
    class Function protected ()
      extends js.Function {
      /**
        * Creates a new function.
        * @param args A list of arguments the function accepts.
        */
      def this(args: java.lang.String*) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.Int16Array")
    @js.native
    class Int16Array ()
      extends tmttyped.std.Int16Array {
      def this(array: ArrayBufferLike) = this()
      def this(array: ArrayLike[Double]) = this()
      def this(elements: js.Iterable[Double]) = this()
      def this(length: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: js.UndefOr[scala.Nothing], length: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Double, length: Double) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.Int32Array")
    @js.native
    class Int32Array ()
      extends tmttyped.std.Int32Array {
      def this(array: ArrayBufferLike) = this()
      def this(array: ArrayLike[Double]) = this()
      def this(elements: js.Iterable[Double]) = this()
      def this(length: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: js.UndefOr[scala.Nothing], length: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Double, length: Double) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.Int8Array")
    @js.native
    class Int8Array ()
      extends tmttyped.std.Int8Array {
      def this(array: ArrayBufferLike) = this()
      def this(array: ArrayLike[Double]) = this()
      def this(elements: js.Iterable[Double]) = this()
      def this(length: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: js.UndefOr[scala.Nothing], length: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Double, length: Double) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.Map")
    @js.native
    class Map[K, V] ()
      extends tmttyped.std.Map[K, V] {
      def this(entries: js.Array[js.Tuple2[K, V]]) = this()
      def this(iterable: js.Iterable[js.Tuple2[K, V]]) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.Number")
    @js.native
    class Number ()
      extends tmttyped.std.Number {
      def this(value: js.Any) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.Object")
    @js.native
    class Object ()
      extends tmttyped.std.Object {
      def this(value: js.Any) = this()
      
      /** The initial value of Object.prototype.constructor is the standard built-in Object constructor. */
      /* CompleteClass */
      override var constructor: js.Function = js.native
      
      /**
        * Determines whether an object has a property with the specified name.
        * @param v A property name.
        */
      /* CompleteClass */
      override def hasOwnProperty(v: PropertyKey): scala.Boolean = js.native
      
      /**
        * Determines whether a specified property is enumerable.
        * @param v A property name.
        */
      /* CompleteClass */
      override def propertyIsEnumerable(v: PropertyKey): scala.Boolean = js.native
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.Promise")
    @js.native
    class Promise[T] protected ()
      extends tmttyped.std.Promise[T] {
      /**
        * Creates a new Promise.
        * @param executor A callback used to initialize the promise. This callback is passed two arguments:
        * a resolve callback used to resolve the promise with a value or the result of another promise,
        * and a reject callback used to reject the promise with a provided reason or error.
        */
      def this(executor: js.Function2[
                /* resolve */ js.Function1[/* value */ T | js.Thenable[T], Unit], 
                /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
                Unit
              ]) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.RangeError")
    @js.native
    class RangeError ()
      extends tmttyped.std.Error {
      def this(message: java.lang.String) = this()
      
      /* CompleteClass */
      override var message: java.lang.String = js.native
      
      /* CompleteClass */
      override var name: java.lang.String = js.native
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.ReferenceError")
    @js.native
    class ReferenceError ()
      extends tmttyped.std.Error {
      def this(message: java.lang.String) = this()
      
      /* CompleteClass */
      override var message: java.lang.String = js.native
      
      /* CompleteClass */
      override var name: java.lang.String = js.native
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.RegExp")
    @js.native
    class RegExp protected ()
      extends tmttyped.std.RegExp {
      def this(pattern: java.lang.String) = this()
      def this(pattern: js.RegExp) = this()
      def this(pattern: java.lang.String, flags: java.lang.String) = this()
      def this(pattern: js.RegExp, flags: java.lang.String) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.Set")
    @js.native
    class Set[T] ()
      extends tmttyped.std.Set[T] {
      def this(values: js.Array[T]) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.String")
    @js.native
    class String ()
      extends tmttyped.std.String {
      def this(value: js.Any) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.SyntaxError")
    @js.native
    class SyntaxError ()
      extends tmttyped.std.Error {
      def this(message: java.lang.String) = this()
      
      /* CompleteClass */
      override var message: java.lang.String = js.native
      
      /* CompleteClass */
      override var name: java.lang.String = js.native
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.TypeError")
    @js.native
    class TypeError ()
      extends tmttyped.std.Error {
      def this(message: java.lang.String) = this()
      
      /* CompleteClass */
      override var message: java.lang.String = js.native
      
      /* CompleteClass */
      override var name: java.lang.String = js.native
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.URIError")
    @js.native
    class URIError ()
      extends tmttyped.std.Error {
      def this(message: java.lang.String) = this()
      
      /* CompleteClass */
      override var message: java.lang.String = js.native
      
      /* CompleteClass */
      override var name: java.lang.String = js.native
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.Uint16Array")
    @js.native
    class Uint16Array ()
      extends tmttyped.std.Uint16Array {
      def this(array: ArrayBufferLike) = this()
      def this(array: ArrayLike[Double]) = this()
      def this(elements: js.Iterable[Double]) = this()
      def this(length: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: js.UndefOr[scala.Nothing], length: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Double, length: Double) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.Uint32Array")
    @js.native
    class Uint32Array ()
      extends tmttyped.std.Uint32Array {
      def this(array: ArrayBufferLike) = this()
      def this(array: ArrayLike[Double]) = this()
      def this(elements: js.Iterable[Double]) = this()
      def this(length: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: js.UndefOr[scala.Nothing], length: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Double, length: Double) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.Uint8Array")
    @js.native
    class Uint8Array ()
      extends tmttyped.std.Uint8Array {
      def this(array: ArrayBufferLike) = this()
      def this(array: ArrayLike[Double]) = this()
      def this(elements: js.Iterable[Double]) = this()
      def this(length: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: js.UndefOr[scala.Nothing], length: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Double, length: Double) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.Uint8ClampedArray")
    @js.native
    class Uint8ClampedArray ()
      extends tmttyped.std.Uint8ClampedArray {
      def this(array: ArrayBufferLike) = this()
      def this(array: ArrayLike[Double]) = this()
      def this(elements: js.Iterable[Double]) = this()
      def this(length: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: js.UndefOr[scala.Nothing], length: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Double, length: Double) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.WeakMap")
    @js.native
    class WeakMap[K /* <: js.Object */, V] ()
      extends tmttyped.std.WeakMap[K, V] {
      def this(entries: js.Array[js.Tuple2[K, V]]) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.WeakSet")
    @js.native
    class WeakSet[T /* <: js.Object */] ()
      extends tmttyped.std.WeakSet[T] {
      def this(iterable: js.Iterable[T]) = this()
      def this(values: js.Array[T]) = this()
    }
    
    type _To = Global with (/* globalThis */ js.Any)
    
    /* This means you don't have to write `^`, but can instead just say `global.foo` */
    override def _to: Global with (/* globalThis */ js.Any) = ^
  }
  
  @JSGlobal("module")
  @js.native
  def module: NodeModule = js.native
  @scala.inline
  def module_=(x: NodeModule): Unit = js.Dynamic.global.updateDynamic("module")(x.asInstanceOf[js.Any])
  
  @JSGlobal("process")
  @js.native
  def process: Process = js.native
  @scala.inline
  def process_=(x: Process): Unit = js.Dynamic.global.updateDynamic("process")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def queueMicrotask(callback: js.Function0[Unit]): Unit = js.Dynamic.global.applyDynamic("queueMicrotask")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSGlobal("require")
  @js.native
  def require: NodeRequire = js.native
  @scala.inline
  def require_=(x: NodeRequire): Unit = js.Dynamic.global.updateDynamic("require")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def setImmediate(callback: js.Function1[/* repeated */ js.Any, Unit], args: js.Any*): Immediate = (js.Dynamic.global.applyDynamic("setImmediate")(callback.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Immediate]
  
  @scala.inline
  def setInterval(callback: js.Function1[/* repeated */ js.Any, Unit], ms: js.UndefOr[scala.Nothing], args: js.Any*): Timeout = (js.Dynamic.global.applyDynamic("setInterval")(callback.asInstanceOf[js.Any], ms.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Timeout]
  @scala.inline
  def setInterval(callback: js.Function1[/* repeated */ js.Any, Unit], ms: Double, args: js.Any*): Timeout = (js.Dynamic.global.applyDynamic("setInterval")(callback.asInstanceOf[js.Any], ms.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Timeout]
  
  @scala.inline
  def setTimeout(callback: js.Function1[/* repeated */ js.Any, Unit], ms: js.UndefOr[scala.Nothing], args: js.Any*): Timeout = (js.Dynamic.global.applyDynamic("setTimeout")(callback.asInstanceOf[js.Any], ms.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Timeout]
  @scala.inline
  def setTimeout(callback: js.Function1[/* repeated */ js.Any, Unit], ms: Double, args: js.Any*): Timeout = (js.Dynamic.global.applyDynamic("setTimeout")(callback.asInstanceOf[js.Any], ms.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Timeout]
  
  /*----------------------------------------------*
  *                                               *
  *               GLOBAL INTERFACES               *
  *                                               *
  *-----------------------------------------------*/
  object NodeJS
}
