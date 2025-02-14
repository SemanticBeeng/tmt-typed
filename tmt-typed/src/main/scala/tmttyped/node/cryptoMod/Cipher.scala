package tmttyped.node.cryptoMod

import tmttyped.node.NodeJS.ArrayBufferView
import tmttyped.node.bufferMod.global.Buffer
import tmttyped.node.bufferMod.global.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * * Extends: `<stream.Transform>`
  *
  * Instances of the `Cipher` class are used to encrypt data. The class can be
  * used in one of two ways:
  *
  * * As a `stream` that is both readable and writable, where plain unencrypted
  * data is written to produce encrypted data on the readable side, or
  * * Using the `cipher.update()` and `cipher.final()` methods to produce
  * the encrypted data.
  *
  * The {@link createCipher} or {@link createCipheriv} methods are
  * used to create `Cipher` instances. `Cipher` objects are not to be created
  * directly using the `new` keyword.
  *
  * Example: Using `Cipher` objects as streams:
  *
  * ```js
  * const {
  *   scrypt,
  *   randomFill,
  *   createCipheriv
  * } = await import('crypto');
  *
  * const algorithm = 'aes-192-cbc';
  * const password = 'Password used to generate key';
  *
  * // First, we'll generate the key. The key length is dependent on the algorithm.
  * // In this case for aes192, it is 24 bytes (192 bits).
  * scrypt(password, 'salt', 24, (err, key) => {
  *   if (err) throw err;
  *   // Then, we'll generate a random initialization vector
  *   randomFill(new Uint8Array(16), (err, iv) => {
  *     if (err) throw err;
  *
  *     // Once we have the key and iv, we can create and use the cipher...
  *     const cipher = createCipheriv(algorithm, key, iv);
  *
  *     let encrypted = '';
  *     cipher.setEncoding('hex');
  *
  *     cipher.on('data', (chunk) => encrypted += chunk);
  *     cipher.on('end', () => console.log(encrypted));
  *
  *     cipher.write('some clear text data');
  *     cipher.end();
  *   });
  * });
  * ```
  *
  * ```js
  * const {
  *   scrypt,
  *   randomFill,
  *   createCipheriv
  * } = require('crypto');
  *
  * const algorithm = 'aes-192-cbc';
  * const password = 'Password used to generate key';
  *
  * // First, we'll generate the key. The key length is dependent on the algorithm.
  * // In this case for aes192, it is 24 bytes (192 bits).
  * scrypt(password, 'salt', 24, (err, key) => {
  *   if (err) throw err;
  *   // Then, we'll generate a random initialization vector
  *   randomFill(new Uint8Array(16), (err, iv) => {
  *     if (err) throw err;
  *
  *     // Once we have the key and iv, we can create and use the cipher...
  *     const cipher = createCipheriv(algorithm, key, iv);
  *
  *     let encrypted = '';
  *     cipher.setEncoding('hex');
  *
  *     cipher.on('data', (chunk) => encrypted += chunk);
  *     cipher.on('end', () => console.log(encrypted));
  *
  *     cipher.write('some clear text data');
  *     cipher.end();
  *   });
  * });
  * ```
  *
  * Example: Using `Cipher` and piped streams:
  *
  * ```js
  * import {
  *   createReadStream,
  *   createWriteStream,
  * } from 'fs';
  *
  * import {
  *   pipeline
  * } from 'stream';
  *
  * const {
  *   scrypt,
  *   randomFill,
  *   createCipheriv,
  * } = await import('crypto');
  *
  * const algorithm = 'aes-192-cbc';
  * const password = 'Password used to generate key';
  *
  * // First, we'll generate the key. The key length is dependent on the algorithm.
  * // In this case for aes192, it is 24 bytes (192 bits).
  * scrypt(password, 'salt', 24, (err, key) => {
  *   if (err) throw err;
  *   // Then, we'll generate a random initialization vector
  *   randomFill(new Uint8Array(16), (err, iv) => {
  *     if (err) throw err;
  *
  *     const cipher = createCipheriv(algorithm, key, iv);
  *
  *     const input = createReadStream('test.js');
  *     const output = createWriteStream('test.enc');
  *
  *     pipeline(input, cipher, output, (err) => {
  *       if (err) throw err;
  *     });
  *   });
  * });
  * ```
  *
  * ```js
  * const {
  *   createReadStream,
  *   createWriteStream,
  * } = require('fs');
  *
  * const {
  *   pipeline
  * } = require('stream');
  *
  * const {
  *   scrypt,
  *   randomFill,
  *   createCipheriv,
  * } = require('crypto');
  *
  * const algorithm = 'aes-192-cbc';
  * const password = 'Password used to generate key';
  *
  * // First, we'll generate the key. The key length is dependent on the algorithm.
  * // In this case for aes192, it is 24 bytes (192 bits).
  * scrypt(password, 'salt', 24, (err, key) => {
  *   if (err) throw err;
  *   // Then, we'll generate a random initialization vector
  *   randomFill(new Uint8Array(16), (err, iv) => {
  *     if (err) throw err;
  *
  *     const cipher = createCipheriv(algorithm, key, iv);
  *
  *     const input = createReadStream('test.js');
  *     const output = createWriteStream('test.enc');
  *
  *     pipeline(input, cipher, output, (err) => {
  *       if (err) throw err;
  *     });
  *   });
  * });
  * ```
  *
  * Example: Using the `cipher.update()` and `cipher.final()` methods:
  *
  * ```js
  * const {
  *   scrypt,
  *   randomFill,
  *   createCipheriv,
  * } = await import('crypto');
  *
  * const algorithm = 'aes-192-cbc';
  * const password = 'Password used to generate key';
  *
  * // First, we'll generate the key. The key length is dependent on the algorithm.
  * // In this case for aes192, it is 24 bytes (192 bits).
  * scrypt(password, 'salt', 24, (err, key) => {
  *   if (err) throw err;
  *   // Then, we'll generate a random initialization vector
  *   randomFill(new Uint8Array(16), (err, iv) => {
  *     if (err) throw err;
  *
  *     const cipher = createCipheriv(algorithm, key, iv);
  *
  *     let encrypted = cipher.update('some clear text data', 'utf8', 'hex');
  *     encrypted += cipher.final('hex');
  *     console.log(encrypted);
  *   });
  * });
  * ```
  *
  * ```js
  * const {
  *   scrypt,
  *   randomFill,
  *   createCipheriv,
  * } = require('crypto');
  *
  * const algorithm = 'aes-192-cbc';
  * const password = 'Password used to generate key';
  *
  * // First, we'll generate the key. The key length is dependent on the algorithm.
  * // In this case for aes192, it is 24 bytes (192 bits).
  * scrypt(password, 'salt', 24, (err, key) => {
  *   if (err) throw err;
  *   // Then, we'll generate a random initialization vector
  *   randomFill(new Uint8Array(16), (err, iv) => {
  *     if (err) throw err;
  *
  *     const cipher = createCipheriv(algorithm, key, iv);
  *
  *     let encrypted = cipher.update('some clear text data', 'utf8', 'hex');
  *     encrypted += cipher.final('hex');
  *     console.log(encrypted);
  *   });
  * });
  * ```
  * @since v0.1.94
  */
@JSImport("crypto", "Cipher")
@js.native
class Cipher protected () extends StObject {
  
  /**
    * Once the `cipher.final()` method has been called, the `Cipher` object can no
    * longer be used to encrypt data. Attempts to call `cipher.final()` more than
    * once will result in an error being thrown.
    * @since v0.1.94
    * @param outputEncoding The `encoding` of the return value.
    * @return Any remaining enciphered contents. If `outputEncoding` is specified, a string is returned. If an `outputEncoding` is not provided, a {@link Buffer} is returned.
    */
  def `final`(): Buffer = js.native
  def `final`(output_encoding: BufferEncoding): String = js.native
  
  /**
    * When using block encryption algorithms, the `Cipher` class will automatically
    * add padding to the input data to the appropriate block size. To disable the
    * default padding call `cipher.setAutoPadding(false)`.
    *
    * When `autoPadding` is `false`, the length of the entire input data must be a
    * multiple of the cipher's block size or `cipher.final()` will throw an error.
    * Disabling automatic padding is useful for non-standard padding, for instance
    * using `0x0` instead of PKCS padding.
    *
    * The `cipher.setAutoPadding()` method must be called before `cipher.final()`.
    * @since v0.7.1
    * @return for method chaining.
    */
  def setAutoPadding(): this.type = js.native
  def setAutoPadding(auto_padding: Boolean): this.type = js.native
  
  def update(data: String, input_encoding: Unit, output_encoding: Encoding): String = js.native
  def update(data: String, input_encoding: Encoding): Buffer = js.native
  def update(data: String, input_encoding: Encoding, output_encoding: Encoding): String = js.native
  def update(data: ArrayBufferView, input_encoding: Unit, output_encoding: Encoding): String = js.native
  /**
    * Updates the cipher with `data`. If the `inputEncoding` argument is given,
    * the `data`argument is a string using the specified encoding. If the `inputEncoding`argument is not given, `data` must be a `Buffer`, `TypedArray`, or`DataView`. If `data` is a `Buffer`,
    * `TypedArray`, or `DataView`, then`inputEncoding` is ignored.
    *
    * The `outputEncoding` specifies the output format of the enciphered
    * data. If the `outputEncoding`is specified, a string using the specified encoding is returned. If no`outputEncoding` is provided, a `Buffer` is returned.
    *
    * The `cipher.update()` method can be called multiple times with new data until `cipher.final()` is called. Calling `cipher.update()` after `cipher.final()` will result in an error being
    * thrown.
    * @since v0.1.94
    * @param inputEncoding The `encoding` of the data.
    * @param outputEncoding The `encoding` of the return value.
    */
  def update(data: BinaryLike): Buffer = js.native
}
