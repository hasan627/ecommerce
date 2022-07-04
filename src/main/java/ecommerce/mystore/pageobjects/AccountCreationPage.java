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
public class AccountCreationPage extends BaseClass{
	
	@FindBy(xpath="//h1[text()='Create an account']")
	WebElement formTitle;
	
	public AccountCreationPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean ValidateAccountCreatePage() {
		return Action.isDisplayed(driver, formTitle);
	}

}
