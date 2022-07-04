/**
 * 
 */
package ecommerce.mystore.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ecommerce.mystore.actiondriver.Action;
import ecommerce.mystore.base.BaseClass;

/**
 * @author HP
 *
 */
public class LoginPage extends BaseClass{
	
	@FindBy(id="email")
	WebElement UserName;
	
	
	@FindBy(id="passwd")
	WebElement Password;
	
	
	@FindBy(id="SubmitLogin")
	WebElement SignInBtn;

	
	@FindBy(id="email_create")
	WebElement emailForNewAccount;
	
	@FindBy(id="SubmitCreate")
	WebElement CreatenewAccountBtn;
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public HomePage login(String uname, String pswd) {
		Action.type(UserName, uname);
		Action.type(Password, pswd);
		Action.click(driver, SignInBtn);
		return new HomePage();
	}
	public AddressPage login1(String uname, String pswd) {
		Action.type(UserName, uname);
		Action.type(Password, pswd);
		Action.click(driver, SignInBtn);
		return new AddressPage();
	}
	
	public AccountCreationPage createNewAccount(String newEmail) {
		Action.type(emailForNewAccount, newEmail);
		Action.click(driver, CreatenewAccountBtn);
		return new AccountCreationPage();
	}
	
}


