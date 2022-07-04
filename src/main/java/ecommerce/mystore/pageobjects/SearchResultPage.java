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
public class SearchResultPage extends BaseClass {
	
	@FindBy(xpath="//*[@id=\"center_column\"]//img")
	WebElement productResult;

	
	public SearchResultPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean isProductAvailability() {
		return Action.isDisplayed(driver, productResult);
	}
	
	
	public AddToCartPage ClickOnProduct() {
		Action.click(driver, productResult);
		return new AddToCartPage();
	}
	
 
}
