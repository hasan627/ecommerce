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
public class HomePage extends BaseClass{
	
	@FindBy(xpath="//span[text()='My wishlists']")
	WebElement MyWishList;
	
	@FindBy(xpath="//span[text()='Order history and details']")
	WebElement orderHistoryandDetails;
	
	@FindBy(xpath="//span[text()='My credit slips']']")
	WebElement myCreditSlips;
	
	@FindBy(xpath="//span[text()='My addresses']")
	WebElement myAddress;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateMyWishList() {
		return Action.isDisplayed(driver, MyWishList);
	}
	
	public boolean validateOrderHistory() {
		return Action.isDisplayed(driver, orderHistoryandDetails);
	}
	
	public String getCurrentURL() {
		String homePageURL= driver.getCurrentUrl();
		return homePageURL;
	}

}
