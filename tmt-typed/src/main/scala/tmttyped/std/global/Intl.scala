package tmttyped.std.global

import tmttyped.std.Intl.BCP47LanguageTag
import tmttyped.std.Intl.Collator
import tmttyped.std.Intl.CollatorOptions
import tmttyped.std.Intl.DateTimeFormat
import tmttyped.std.Intl.DateTimeFormatOptions
import tmttyped.std.Intl.LDMLPluralRule
import tmttyped.std.Intl.NumberFormat
import tmttyped.std.Intl.NumberFormatOptions
import tmttyped.std.Intl.PluralRules
import tmttyped.std.Intl.PluralRulesOptions
import tmttyped.std.Intl.RelativeTimeFormat
import tmttyped.std.Intl.RelativeTimeFormatOptions
import tmttyped.std.Intl.RelativeTimeFormatPart
import tmttyped.std.Intl.RelativeTimeFormatUnit
import tmttyped.std.Intl.ResolvedCollatorOptions
import tmttyped.std.Intl.ResolvedPluralRulesOptions
import tmttyped.std.Intl.ResolvedRelativeTimeFormatOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/////////////////////////////
/// ECMAScript Internationalization API
/////////////////////////////
object Intl {
  
  object Collator {
    
    @JSGlobal("Intl.Collator")
    @js.native
    def apply(): tmttyped.std.Intl.Collator = js.native
    @JSGlobal("Intl.Collator")
    @js.native
    def apply(locales: js.UndefOr[scala.Nothing], options: CollatorOptions): tmttyped.std.Intl.Collator = js.native
    @JSGlobal("Intl.Collator")
    @js.native
    def apply(locales: java.lang.String): tmttyped.std.Intl.Collator = js.native
    @JSGlobal("Intl.Collator")
    @js.native
    def apply(locales: java.lang.String, options: CollatorOptions): tmttyped.std.Intl.Collator = js.native
    @JSGlobal("Intl.Collator")
    @js.native
    def apply(locales: js.Array[java.lang.String]): tmttyped.std.Intl.Collator = js.native
    @JSGlobal("Intl.Collator")
    @js.native
    def apply(locales: js.Array[java.lang.String], options: CollatorOptions): tmttyped.std.Intl.Collator = js.native
    
    @JSGlobal("Intl.Collator.supportedLocalesOf")
    @js.native
    def supportedLocalesOf(locales: java.lang.String): js.Array[java.lang.String] = js.native
    @JSGlobal("Intl.Collator.supportedLocalesOf")
    @js.native
    def supportedLocalesOf(locales: java.lang.String, options: CollatorOptions): js.Array[java.lang.String] = js.native
    @JSGlobal("Intl.Collator.supportedLocalesOf")
    @js.native
    def supportedLocalesOf(locales: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
    @JSGlobal("Intl.Collator.supportedLocalesOf")
    @js.native
    def supportedLocalesOf(locales: js.Array[java.lang.String], options: CollatorOptions): js.Array[java.lang.String] = js.native
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Intl.Collator")
  @js.native
  class CollatorCls () extends Collator {
    def this(locales: java.lang.String) = this()
    def this(locales: js.Array[java.lang.String]) = this()
    def this(locales: js.UndefOr[scala.Nothing], options: CollatorOptions) = this()
    def this(locales: java.lang.String, options: CollatorOptions) = this()
    def this(locales: js.Array[java.lang.String], options: CollatorOptions) = this()
    
    /* CompleteClass */
    override def compare(x: java.lang.String, y: java.lang.String): Double = js.native
    
    /* CompleteClass */
    override def resolvedOptions(): ResolvedCollatorOptions = js.native
  }
  
  object DateTimeFormat {
    
    @JSGlobal("Intl.DateTimeFormat")
    @js.native
    def apply(): tmttyped.std.Intl.DateTimeFormat = js.native
    @JSGlobal("Intl.DateTimeFormat")
    @js.native
    def apply(locales: js.UndefOr[scala.Nothing], options: DateTimeFormatOptions): tmttyped.std.Intl.DateTimeFormat = js.native
    @JSGlobal("Intl.DateTimeFormat")
    @js.native
    def apply(locales: java.lang.String): tmttyped.std.Intl.DateTimeFormat = js.native
    @JSGlobal("Intl.DateTimeFormat")
    @js.native
    def apply(locales: java.lang.String, options: DateTimeFormatOptions): tmttyped.std.Intl.DateTimeFormat = js.native
    @JSGlobal("Intl.DateTimeFormat")
    @js.native
    def apply(locales: js.Array[java.lang.String]): tmttyped.std.Intl.DateTimeFormat = js.native
    @JSGlobal("Intl.DateTimeFormat")
    @js.native
    def apply(locales: js.Array[java.lang.String], options: DateTimeFormatOptions): tmttyped.std.Intl.DateTimeFormat = js.native
    
    @JSGlobal("Intl.DateTimeFormat.supportedLocalesOf")
    @js.native
    def supportedLocalesOf(locales: java.lang.String): js.Array[java.lang.String] = js.native
    @JSGlobal("Intl.DateTimeFormat.supportedLocalesOf")
    @js.native
    def supportedLocalesOf(locales: java.lang.String, options: DateTimeFormatOptions): js.Array[java.lang.String] = js.native
    @JSGlobal("Intl.DateTimeFormat.supportedLocalesOf")
    @js.native
    def supportedLocalesOf(locales: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
    @JSGlobal("Intl.DateTimeFormat.supportedLocalesOf")
    @js.native
    def supportedLocalesOf(locales: js.Array[java.lang.String], options: DateTimeFormatOptions): js.Array[java.lang.String] = js.native
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Intl.DateTimeFormat")
  @js.native
  class DateTimeFormatCls () extends DateTimeFormat {
    def this(locales: java.lang.String) = this()
    def this(locales: js.Array[java.lang.String]) = this()
    def this(locales: js.UndefOr[scala.Nothing], options: DateTimeFormatOptions) = this()
    def this(locales: java.lang.String, options: DateTimeFormatOptions) = this()
    def this(locales: js.Array[java.lang.String], options: DateTimeFormatOptions) = this()
  }
  
  object NumberFormat {
    
    @JSGlobal("Intl.NumberFormat")
    @js.native
    def apply(): tmttyped.std.Intl.NumberFormat = js.native
    @JSGlobal("Intl.NumberFormat")
    @js.native
    def apply(locales: js.UndefOr[scala.Nothing], options: NumberFormatOptions): tmttyped.std.Intl.NumberFormat = js.native
    @JSGlobal("Intl.NumberFormat")
    @js.native
    def apply(locales: java.lang.String): tmttyped.std.Intl.NumberFormat = js.native
    @JSGlobal("Intl.NumberFormat")
    @js.native
    def apply(locales: java.lang.String, options: NumberFormatOptions): tmttyped.std.Intl.NumberFormat = js.native
    @JSGlobal("Intl.NumberFormat")
    @js.native
    def apply(locales: js.Array[java.lang.String]): tmttyped.std.Intl.NumberFormat = js.native
    @JSGlobal("Intl.NumberFormat")
    @js.native
    def apply(locales: js.Array[java.lang.String], options: NumberFormatOptions): tmttyped.std.Intl.NumberFormat = js.native
    
    @JSGlobal("Intl.NumberFormat.supportedLocalesOf")
    @js.native
    def supportedLocalesOf(locales: java.lang.String): js.Array[java.lang.String] = js.native
    @JSGlobal("Intl.NumberFormat.supportedLocalesOf")
    @js.native
    def supportedLocalesOf(locales: java.lang.String, options: NumberFormatOptions): js.Array[java.lang.String] = js.native
    @JSGlobal("Intl.NumberFormat.supportedLocalesOf")
    @js.native
    def supportedLocalesOf(locales: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
    @JSGlobal("Intl.NumberFormat.supportedLocalesOf")
    @js.native
    def supportedLocalesOf(locales: js.Array[java.lang.String], options: NumberFormatOptions): js.Array[java.lang.String] = js.native
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Intl.NumberFormat")
  @js.native
  class NumberFormatCls () extends NumberFormat {
    def this(locales: java.lang.String) = this()
    def this(locales: js.Array[java.lang.String]) = this()
    def this(locales: js.UndefOr[scala.Nothing], options: NumberFormatOptions) = this()
    def this(locales: java.lang.String, options: NumberFormatOptions) = this()
    def this(locales: js.Array[java.lang.String], options: NumberFormatOptions) = this()
  }
  
  object PluralRules {
    
    @JSGlobal("Intl.PluralRules")
    @js.native
    def apply(): tmttyped.std.Intl.PluralRules = js.native
    @JSGlobal("Intl.PluralRules")
    @js.native
    def apply(locales: js.UndefOr[scala.Nothing], options: PluralRulesOptions): tmttyped.std.Intl.PluralRules = js.native
    @JSGlobal("Intl.PluralRules")
    @js.native
    def apply(locales: java.lang.String): tmttyped.std.Intl.PluralRules = js.native
    @JSGlobal("Intl.PluralRules")
    @js.native
    def apply(locales: java.lang.String, options: PluralRulesOptions): tmttyped.std.Intl.PluralRules = js.native
    @JSGlobal("Intl.PluralRules")
    @js.native
    def apply(locales: js.Array[java.lang.String]): tmttyped.std.Intl.PluralRules = js.native
    @JSGlobal("Intl.PluralRules")
    @js.native
    def apply(locales: js.Array[java.lang.String], options: PluralRulesOptions): tmttyped.std.Intl.PluralRules = js.native
    
    @JSGlobal("Intl.PluralRules.supportedLocalesOf")
    @js.native
    def supportedLocalesOf(locales: java.lang.String): js.Array[java.lang.String] = js.native
    @JSGlobal("Intl.PluralRules.supportedLocalesOf")
    @js.native
    def supportedLocalesOf(locales: java.lang.String, options: PluralRulesOptions): js.Array[java.lang.String] = js.native
    @JSGlobal("Intl.PluralRules.supportedLocalesOf")
    @js.native
    def supportedLocalesOf(locales: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
    @JSGlobal("Intl.PluralRules.supportedLocalesOf")
    @js.native
    def supportedLocalesOf(locales: js.Array[java.lang.String], options: PluralRulesOptions): js.Array[java.lang.String] = js.native
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Intl.PluralRules")
  @js.native
  class PluralRulesCls () extends PluralRules {
    def this(locales: java.lang.String) = this()
    def this(locales: js.Array[java.lang.String]) = this()
    def this(locales: js.UndefOr[scala.Nothing], options: PluralRulesOptions) = this()
    def this(locales: java.lang.String, options: PluralRulesOptions) = this()
    def this(locales: js.Array[java.lang.String], options: PluralRulesOptions) = this()
    
    /* CompleteClass */
    override def resolvedOptions(): ResolvedPluralRulesOptions = js.native
    
    /* CompleteClass */
    override def select(n: Double): LDMLPluralRule = js.native
  }
  
  /**
    * The [`Intl.RelativeTimeFormat`](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/RelativeTimeFormat)
    * object is a constructor for objects that enable language-sensitive relative time formatting.
    *
    * Part of [Intl object](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl)
    * namespace and the [ECMAScript Internationalization API](https://www.ecma-international.org/publications/standards/Ecma-402.htm).
    *
    * [Compatibility](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/RelativeTimeFormat#Browser_compatibility).
    *
    * [Polyfills](https://github.com/tc39/proposal-intl-relative-time#polyfills).
    */
  object RelativeTimeFormat {
    
    @JSGlobal("Intl.RelativeTimeFormat.supportedLocalesOf")
    @js.native
    def supportedLocalesOf(locales: js.Array[BCP47LanguageTag]): js.Array[BCP47LanguageTag] = js.native
    @JSGlobal("Intl.RelativeTimeFormat.supportedLocalesOf")
    @js.native
    def supportedLocalesOf(locales: js.Array[BCP47LanguageTag], options: RelativeTimeFormatOptions): js.Array[BCP47LanguageTag] = js.native
    /**
      * Returns an array containing those of the provided locales
      * that are supported in date and time formatting
      * without having to fall back to the runtime's default locale.
      *
      * @param locales - A string with a [BCP 47 language tag](http://tools.ietf.org/html/rfc5646), or an array of such strings.
      *  For the general form and interpretation of the locales argument,
      *  see the [`Intl` page](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl#Locale_identification_and_negotiation).
      *
      * @param options - An [object](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/RelativeTimeFormat/RelativeTimeFormat#Parameters)
      *  with some or all of options of the formatting.
      *  An object with some or all of the following properties:
      *  - `localeMatcher` - The locale matching algorithm to use.
      *    Possible values are `"lookup"` and `"best fit"`; the default is `"best fit"`.
      *    For information about this option, see [Intl page](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Intl#Locale_negotiation).
      *  - `numeric` - The format of output message.
      *    Possible values are: `"always"` (default, e.g., `1 day ago`) or `"auto"` (e.g., `yesterday`).
      *    The `"auto"` value allows to not always have to use numeric values in the output.
      *  - `style` - The length of the internationalized message. Possible values are:
      *    `"long"` (default, e.g., in 1 month),
      *    `"short"` (e.g., in 1 mo.)
      *    or `"narrow"` (e.g., in 1 mo.). The narrow style could be similar to the short style for some locales.
      *
      * @returns An array containing those of the provided locales
      *  that are supported in date and time formatting
      *  without having to fall back to the runtime's default locale.
      *
      * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/RelativeTimeFormat/supportedLocalesOf).
      *
      * [Specification](https://tc39.es/ecma402/#sec-Intl.RelativeTimeFormat.supportedLocalesOf).
      */
    @JSGlobal("Intl.RelativeTimeFormat.supportedLocalesOf")
    @js.native
    def supportedLocalesOf(locales: BCP47LanguageTag): js.Array[BCP47LanguageTag] = js.native
    @JSGlobal("Intl.RelativeTimeFormat.supportedLocalesOf")
    @js.native
    def supportedLocalesOf(locales: BCP47LanguageTag, options: RelativeTimeFormatOptions): js.Array[BCP47LanguageTag] = js.native
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Intl.RelativeTimeFormat")
  @js.native
  /**
    * Constructor creates [Intl.RelativeTimeFormat](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RelativeTimeFormat)
    * objects
    *
    * @param locales - A string with a [BCP 47 language tag](http://tools.ietf.org/html/rfc5646), or an array of such strings.
    *  For the general form and interpretation of the locales argument,
    *  see the [`Intl` page](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl#Locale_identification_and_negotiation).
    *
    * @param options - An [object](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/RelativeTimeFormat/RelativeTimeFormat#Parameters)
    *  with some or all of options of the formatting.
    *  An object with some or all of the following properties:
    *  - `localeMatcher` - The locale matching algorithm to use.
    *    Possible values are `"lookup"` and `"best fit"`; the default is `"best fit"`.
    *    For information about this option, see [Intl page](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Intl#Locale_negotiation).
    *  - `numeric` - The format of output message.
    *    Possible values are: `"always"` (default, e.g., `1 day ago`) or `"auto"` (e.g., `yesterday`).
    *    The `"auto"` value allows to not always have to use numeric values in the output.
    *  - `style` - The length of the internationalized message. Possible values are:
    *    `"long"` (default, e.g., in 1 month),
    *    `"short"` (e.g., in 1 mo.)
    *    or `"narrow"` (e.g., in 1 mo.). The narrow style could be similar to the short style for some locales.
    *
    * @returns [Intl.RelativeTimeFormat](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RelativeTimeFormat) object.
    *
    * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/RelativeTimeFormat/RelativeTimeFormat).
    *
    * [Specification](https://tc39.es/ecma402/#sec-intl-relativetimeformat-constructor).
    */
  class RelativeTimeFormatCls () extends RelativeTimeFormat {
    def this(locales: js.Array[BCP47LanguageTag]) = this()
    def this(locales: BCP47LanguageTag) = this()
    def this(locales: js.UndefOr[scala.Nothing], options: RelativeTimeFormatOptions) = this()
    def this(locales: js.Array[BCP47LanguageTag], options: RelativeTimeFormatOptions) = this()
    def this(locales: BCP47LanguageTag, options: RelativeTimeFormatOptions) = this()
    
    /**
      * Formats a value and a unit according to the locale
      * and formatting options of the given
      * [`Intl.RelativeTimeFormat`](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/RelativeTimeFormat)
      * object.
      *
      * While this method automatically provides the correct plural forms,
      * the grammatical form is otherwise as neutral as possible.
      * It is the caller's responsibility to handle cut-off logic
      * such as deciding between displaying "in 7 days" or "in 1 week".
      * This API does not support relative dates involving compound units.
      * e.g "in 5 days and 4 hours".
      *
      * @param value -  Numeric value to use in the internationalized relative time message
      *
      * @param unit - [Unit](https://tc39.es/ecma402/#sec-singularrelativetimeunit)
      *  to use in the relative time internationalized message.
      *  Possible values are: `"year"`, `"quarter"`, `"month"`, `"week"`,
      *  `"day"`, `"hour"`, `"minute"`, `"second"`.
      *  Plural forms are also permitted.
      *
      * @throws `RangeError` if `unit` was given something other than `unit` possible values
      *
      * @returns Internationalized relative time message as string
      *
      * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/RelativeTimeFormat/format).
      *
      * [Specification](https://tc39.es/ecma402/#sec-Intl.RelativeTimeFormat.prototype.format).
      */
    /* CompleteClass */
    override def format(value: Double, unit: RelativeTimeFormatUnit): java.lang.String = js.native
    
    /**
      *  A version of the format method which it returns an array of objects
      *  which represent "parts" of the object,
      *  separating the formatted number into its constituent parts
      *  and separating it from other surrounding text.
      *  These objects have two properties:
      * `type` a NumberFormat formatToParts type, and `value`,
      *  which is the String which is the component of the output.
      *  If a "part" came from NumberFormat,
      *  it will have a unit property which indicates the `unit` being formatted;
      *  literals which are part of the larger frame will not have this property.
      *
      *  @param value - Numeric value to use in the internationalized relative time message
      *
      *  @param unit - [Unit](https://tc39.es/ecma402/#sec-singularrelativetimeunit)
      *   to use in the relative time internationalized message.
      *   Possible values are: `"year"`, `"quarter"`, `"month"`, `"week"`,
      *   `"day"`, `"hour"`, `"minute"`, `"second"`.
      *   Plural forms are also permitted.
      *
      *  @throws `RangeError` if `unit` was given something other than `unit` possible values
      *
      *  @returns Array of [FormatRelativeTimeToParts](https://tc39.es/ecma402/#sec-FormatRelativeTimeToParts)
      *
      *  [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/RelativeTimeFormat/formatToParts).
      *
      *  [Specification](https://tc39.es/ecma402/#sec-Intl.RelativeTimeFormat.prototype.formatToParts).
      */
    /* CompleteClass */
    override def formatToParts(value: Double, unit: RelativeTimeFormatUnit): js.Array[RelativeTimeFormatPart] = js.native
    
    /**
      * Provides access to the locale and options computed during initialization of this `Intl.RelativeTimeFormat` object.
      *
      * @returns A new object with properties reflecting the locale
      *  and formatting options computed during initialization
      *  of the `Intel.RelativeTimeFormat` object.
      *
      * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/RelativeTimeFormat/resolvedOptions).
      *
      * [Specification](https://tc39.es/ecma402/#sec-intl.relativetimeformat.prototype.resolvedoptions)
      */
    /* CompleteClass */
    override def resolvedOptions(): ResolvedRelativeTimeFormatOptions = js.native
  }
}
