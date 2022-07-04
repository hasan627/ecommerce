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
public class OrderSummaryPage extends BaseClass {
	
	@FindBy(xpath="//span[contains (text(), 'I confirm my order')]")
	WebElement confirmOrderBtn;
	
	public OrderSummaryPage() {
		PageFactory.initElements(driver, this);
	}
	
	public OrderConfirmationPage clickOnConfirmOrder() {
		Action.click(driver, confirmOrderBtn);
		return new OrderConfirmationPage();
	}

}
