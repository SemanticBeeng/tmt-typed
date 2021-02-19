package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/////////////////////////////
/// DOM APIs
/////////////////////////////
trait Account extends StObject {
  
  var displayName: java.lang.String
  
  var id: java.lang.String
  
  var imageURL: js.UndefOr[java.lang.String] = js.undefined
  
  var name: js.UndefOr[java.lang.String] = js.undefined
  
  var rpDisplayName: java.lang.String
}
object Account {
  
  @scala.inline
  def apply(displayName: java.lang.String, id: java.lang.String, rpDisplayName: java.lang.String): Account = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], rpDisplayName = rpDisplayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Account]
  }
  
  @scala.inline
  implicit class AccountMutableBuilder[Self <: Account] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: java.lang.String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: java.lang.String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageURL(value: java.lang.String): Self = StObject.set(x, "imageURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageURLUndefined: Self = StObject.set(x, "imageURL", js.undefined)
    
    @scala.inline
    def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRpDisplayName(value: java.lang.String): Self = StObject.set(x, "rpDisplayName", value.asInstanceOf[js.Any])
  }
}
