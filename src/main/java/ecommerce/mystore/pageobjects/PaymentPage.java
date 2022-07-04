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
public class PaymentPage extends BaseClass{
	
	@FindBy(xpath="//a[contains (text(), 'Pay by bank wire')]")
	WebElement payWithBank;
	
	@FindBy(xpath="//a[contains (text(), 'Pay by check')]")
	WebElement payByCheck;
	
	public PaymentPage() {
		PageFactory.initElements(driver, this);
	}

	
	public OrderSummaryPage clickOnPaymentMethod() {
		Action.click(driver, payByCheck);
		return new OrderSummaryPage();
	}
}
