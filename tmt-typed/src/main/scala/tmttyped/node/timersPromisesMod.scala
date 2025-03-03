package tmttyped.node

import tmttyped.node.timersMod.TimerOptions
import tmttyped.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timersPromisesMod {
  
  @JSImport("timers/promises", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * ```js
    * import {
    *   setImmediate,
    * } from 'timers/promises';
    *
    * const res = await setImmediate('result');
    *
    * console.log(res);  // Prints 'result'
    * ```
    *
    * ```js
    * const {
    *   setImmediate,
    * } = require('timers/promises');
    *
    * setImmediate('result').then((res) => {
    *   console.log(res);  // Prints 'result'
    * });
    * ```
    * @since v15.0.0
    * @param value A value with which the promise is fulfilled.
    */
  @scala.inline
  def setImmediate[T](): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("setImmediate")().asInstanceOf[js.Promise[T]]
  @scala.inline
  def setImmediate[T](value: T): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("setImmediate")(value.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  @scala.inline
  def setImmediate[T](value: T, options: TimerOptions): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("setImmediate")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  @scala.inline
  def setImmediate[T](value: Unit, options: TimerOptions): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("setImmediate")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  /**
    * Returns an async iterator that generates values in an interval of `delay` ms.
    *
    * ```js
    * import {
    *   setInterval,
    * } from 'timers/promises';
    *
    * const interval = 100;
    * for await (const startTime of setInterval(interval, Date.now())) {
    *   const now = Date.now();
    *   console.log(now);
    *   if ((now - startTime) > 1000)
    *     break;
    * }
    * console.log(Date.now());
    * ```
    *
    * ```js
    * const {
    *   setInterval,
    * } = require('timers/promises');
    * const interval = 100;
    *
    * (async function() {
    *   for await (const startTime of setInterval(interval, Date.now())) {
    *     const now = Date.now();
    *     console.log(now);
    *     if ((now - startTime) > 1000)
    *       break;
    *   }
    *   console.log(Date.now());
    * })();
    * ```
    * @since v15.9.0
    */
  @scala.inline
  def setInterval[T](): AsyncIterable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("setInterval")().asInstanceOf[AsyncIterable[T]]
  @scala.inline
  def setInterval[T](delay: Double): AsyncIterable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("setInterval")(delay.asInstanceOf[js.Any]).asInstanceOf[AsyncIterable[T]]
  @scala.inline
  def setInterval[T](delay: Double, value: T): AsyncIterable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("setInterval")(delay.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[T]]
  @scala.inline
  def setInterval[T](delay: Double, value: T, options: TimerOptions): AsyncIterable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("setInterval")(delay.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[T]]
  @scala.inline
  def setInterval[T](delay: Double, value: Unit, options: TimerOptions): AsyncIterable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("setInterval")(delay.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[T]]
  @scala.inline
  def setInterval[T](delay: Unit, value: T): AsyncIterable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("setInterval")(delay.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[T]]
  @scala.inline
  def setInterval[T](delay: Unit, value: T, options: TimerOptions): AsyncIterable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("setInterval")(delay.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[T]]
  @scala.inline
  def setInterval[T](delay: Unit, value: Unit, options: TimerOptions): AsyncIterable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("setInterval")(delay.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[T]]
  
  /**
    * ```js
    * import {
    *   setTimeout,
    * } from 'timers/promises';
    *
    * const res = await setTimeout(100, 'result');
    *
    * console.log(res);  // Prints 'result'
    * ```
    *
    * ```js
    * const {
    *   setTimeout,
    * } = require('timers/promises');
    *
    * setTimeout(100, 'result').then((res) => {
    *   console.log(res);  // Prints 'result'
    * });
    * ```
    * @since v15.0.0
    * @param delay The number of milliseconds to wait before fulfilling the promise.
    * @param value A value with which the promise is fulfilled.
    */
  @scala.inline
  def setTimeout[T](): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")().asInstanceOf[js.Promise[T]]
  @scala.inline
  def setTimeout[T](delay: Double): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")(delay.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  @scala.inline
  def setTimeout[T](delay: Double, value: T): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")(delay.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  @scala.inline
  def setTimeout[T](delay: Double, value: T, options: TimerOptions): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")(delay.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  @scala.inline
  def setTimeout[T](delay: Double, value: Unit, options: TimerOptions): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")(delay.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  @scala.inline
  def setTimeout[T](delay: Unit, value: T): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")(delay.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  @scala.inline
  def setTimeout[T](delay: Unit, value: T, options: TimerOptions): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")(delay.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  @scala.inline
  def setTimeout[T](delay: Unit, value: Unit, options: TimerOptions): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")(delay.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
}
