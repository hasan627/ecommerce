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
public class ShippingPage extends BaseClass {
	
	@FindBy(id="cgv")
	WebElement terms;
	
	@FindBy(xpath = "//button/span[contains(text(),'Proceed to checkout')]")
	WebElement proceedToCheckOut;
	
	public ShippingPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void checkTheTerms() {
		Action.click(driver, terms);
	}
	
	public PaymentPage clickOnProceedToCheckOut() {
		Action.click(driver, proceedToCheckOut);
		return new PaymentPage();
	}
	
	
}
