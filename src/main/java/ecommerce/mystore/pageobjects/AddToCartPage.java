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
public class AddToCartPage extends BaseClass {
	//span[contains(text(),'Proceed to checkout')]
	
	@FindBy(id="quantity_wanted")
	WebElement quantity;
	
	@FindBy(id="group_1")
	WebElement size;

	@FindBy(xpath="//span[text()='Add to cart']")
	WebElement addToCartBtn;
	
	@FindBy(xpath="//*[@id=\"layer_cart\"]//h2/i")
	WebElement addToCartMessage;
	
	@FindBy(xpath = "//span[contains(text(),'Proceed to checkout')]")
	WebElement proceedToCheckOutBtn;
	
	public AddToCartPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void enterQty(String Qty) {
		Action.type(quantity, Qty);
	}
	
	public void selectSize(String size1) {
		Action.selectByVisibleText(size1, size);
	}
	
	
	public void clickAddToCart() {
		Action.click(driver, addToCartBtn);
	}
	
	public boolean validateAddtoCart() {
		return Action.isDisplayed(driver, addToCartMessage);
	}
	
	public OrderPage clickOnCheckOut() throws Exception {
		Action.JSClick(driver, proceedToCheckOutBtn);
		return new OrderPage();
	}
	
}
