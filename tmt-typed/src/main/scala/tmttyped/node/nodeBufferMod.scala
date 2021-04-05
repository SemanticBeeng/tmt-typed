package tmttyped.node

import tmttyped.node.NodeJS.ArrayBufferView
import tmttyped.node.anon.ToPrimitive
import tmttyped.node.bufferMod.TranscodeEncoding
import tmttyped.std.SharedArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeBufferMod {
  
  @JSImport("node:buffer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Raw data is stored in instances of the Buffer class.
    * A Buffer is similar to an array of integers but corresponds to a raw memory allocation outside the V8 heap.  A Buffer cannot be resized.
    * Valid string encodings: 'ascii'|'utf8'|'utf16le'|'ucs2'(alias of 'utf16le')|'base64'|'binary'(deprecated)|'hex'
    */
  /* was `typeof Buffer` */
  @JSImport("node:buffer", "Buffer")
  @js.native
  class Buffer protected ()
    extends tmttyped.node.bufferMod.Buffer {
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
  /* was `typeof Buffer` */
  object Buffer {
    
    @JSImport("node:buffer", "Buffer")
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
    @JSImport("node:buffer", "Buffer.poolSize")
    @js.native
    def poolSize: Double = js.native
    @scala.inline
    def poolSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("poolSize")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("node:buffer", "INSPECT_MAX_BYTES")
  @js.native
  val INSPECT_MAX_BYTES: Double = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("node:buffer", "SlowBuffer")
  @js.native
  class SlowBuffer protected ()
    extends tmttyped.node.Buffer {
    /** @deprecated since v6.0.0, use `Buffer.allocUnsafeSlow()` */
    def this(size: Double) = this()
  }
  
  object constants {
    
    @JSImport("node:buffer", "constants")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("node:buffer", "constants.MAX_LENGTH")
    @js.native
    def MAX_LENGTH: Double = js.native
    @scala.inline
    def MAX_LENGTH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_LENGTH")(x.asInstanceOf[js.Any])
    
    @JSImport("node:buffer", "constants.MAX_STRING_LENGTH")
    @js.native
    def MAX_STRING_LENGTH: Double = js.native
    @scala.inline
    def MAX_STRING_LENGTH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_STRING_LENGTH")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("node:buffer", "kMaxLength")
  @js.native
  val kMaxLength: Double = js.native
  
  @JSImport("node:buffer", "kStringMaxLength")
  @js.native
  val kStringMaxLength: Double = js.native
  
  @scala.inline
  def transcode(source: js.typedarray.Uint8Array, fromEnc: TranscodeEncoding, toEnc: TranscodeEncoding): tmttyped.node.Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("transcode")(source.asInstanceOf[js.Any], fromEnc.asInstanceOf[js.Any], toEnc.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.Buffer]
  
  /* was `typeof Buffer` */
  object BuffType
}
