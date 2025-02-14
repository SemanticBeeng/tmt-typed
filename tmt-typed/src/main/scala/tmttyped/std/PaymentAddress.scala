package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This Payment Request API interface is used to store shipping or payment address information. */
trait PaymentAddress extends StObject {
  
  val addressLine: js.Array[java.lang.String]
  
  val city: java.lang.String
  
  val country: java.lang.String
  
  val dependentLocality: java.lang.String
  
  val organization: java.lang.String
  
  val phone: java.lang.String
  
  val postalCode: java.lang.String
  
  val recipient: java.lang.String
  
  val region: java.lang.String
  
  val sortingCode: java.lang.String
  
  def toJSON(): js.Any
}
object PaymentAddress {
  
  @scala.inline
  def apply(
    addressLine: js.Array[java.lang.String],
    city: java.lang.String,
    country: java.lang.String,
    dependentLocality: java.lang.String,
    organization: java.lang.String,
    phone: java.lang.String,
    postalCode: java.lang.String,
    recipient: java.lang.String,
    region: java.lang.String,
    sortingCode: java.lang.String,
    toJSON: () => js.Any
  ): PaymentAddress = {
    val __obj = js.Dynamic.literal(addressLine = addressLine.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], dependentLocality = dependentLocality.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], sortingCode = sortingCode.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[PaymentAddress]
  }
  
  @scala.inline
  implicit class PaymentAddressMutableBuilder[Self <: PaymentAddress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddressLine(value: js.Array[java.lang.String]): Self = StObject.set(x, "addressLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressLineVarargs(value: java.lang.String*): Self = StObject.set(x, "addressLine", js.Array(value :_*))
    
    @scala.inline
    def setCity(value: java.lang.String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountry(value: java.lang.String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependentLocality(value: java.lang.String): Self = StObject.set(x, "dependentLocality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganization(value: java.lang.String): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhone(value: java.lang.String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostalCode(value: java.lang.String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipient(value: java.lang.String): Self = StObject.set(x, "recipient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegion(value: java.lang.String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortingCode(value: java.lang.String): Self = StObject.set(x, "sortingCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
  }
}
