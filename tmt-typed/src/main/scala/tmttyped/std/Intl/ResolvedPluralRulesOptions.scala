package tmttyped.std.Intl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolvedPluralRulesOptions extends StObject {
  
  var locale: String
  
  var maximumFractionDigits: Double
  
  var maximumSignificantDigits: js.UndefOr[Double] = js.undefined
  
  var minimumFractionDigits: Double
  
  var minimumIntegerDigits: Double
  
  var minimumSignificantDigits: js.UndefOr[Double] = js.undefined
  
  var pluralCategories: js.Array[LDMLPluralRule]
  
  var `type`: PluralRuleType
}
object ResolvedPluralRulesOptions {
  
  @scala.inline
  def apply(
    locale: String,
    maximumFractionDigits: Double,
    minimumFractionDigits: Double,
    minimumIntegerDigits: Double,
    pluralCategories: js.Array[LDMLPluralRule],
    `type`: PluralRuleType
  ): ResolvedPluralRulesOptions = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], maximumFractionDigits = maximumFractionDigits.asInstanceOf[js.Any], minimumFractionDigits = minimumFractionDigits.asInstanceOf[js.Any], minimumIntegerDigits = minimumIntegerDigits.asInstanceOf[js.Any], pluralCategories = pluralCategories.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedPluralRulesOptions]
  }
  
  @scala.inline
  implicit class ResolvedPluralRulesOptionsMutableBuilder[Self <: ResolvedPluralRulesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumFractionDigits(value: Double): Self = StObject.set(x, "maximumFractionDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumSignificantDigits(value: Double): Self = StObject.set(x, "maximumSignificantDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumSignificantDigitsUndefined: Self = StObject.set(x, "maximumSignificantDigits", js.undefined)
    
    @scala.inline
    def setMinimumFractionDigits(value: Double): Self = StObject.set(x, "minimumFractionDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumIntegerDigits(value: Double): Self = StObject.set(x, "minimumIntegerDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumSignificantDigits(value: Double): Self = StObject.set(x, "minimumSignificantDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumSignificantDigitsUndefined: Self = StObject.set(x, "minimumSignificantDigits", js.undefined)
    
    @scala.inline
    def setPluralCategories(value: js.Array[LDMLPluralRule]): Self = StObject.set(x, "pluralCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluralCategoriesVarargs(value: LDMLPluralRule*): Self = StObject.set(x, "pluralCategories", js.Array(value :_*))
    
    @scala.inline
    def setType(value: PluralRuleType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
