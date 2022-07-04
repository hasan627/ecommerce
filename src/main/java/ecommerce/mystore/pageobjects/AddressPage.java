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
public class AddressPage extends BaseClass{
	
	@FindBy(xpath="//span[contains(text(),'Proceed to checkout')]")
	WebElement proceedToCheckOutBtn;
	
	public AddressPage() {
		PageFactory.initElements(driver, this);
	}
	
	public ShippingPage clickOnCheckOut() {
		Action.isDisplayed(driver, proceedToCheckOutBtn);
		return new ShippingPage();
	}

}
