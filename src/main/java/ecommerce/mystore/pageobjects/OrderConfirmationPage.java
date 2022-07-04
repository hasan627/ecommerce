/**
 * 
 */
package ecommerce.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ecommerce.mystore.actiondriver.Action;
import ecommerce.mystore.base.BaseClass;

/**
 * @author HP
 *
 */
public class OrderConfirmationPage extends BaseClass {
	
	@FindBy(xpath="//strong[contains (text(), 'Your order on My Store is complete.')]")
	WebElement confirmPageElement;
	
	
	public OrderConfirmationPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validatePaymentPage() {
		String confirmMsg = confirmPageElement.getText();
		return confirmMsg;
	}

}
