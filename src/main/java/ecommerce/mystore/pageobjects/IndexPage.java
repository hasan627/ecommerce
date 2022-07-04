package ecommerce.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ecommerce.mystore.actiondriver.Action;
import ecommerce.mystore.base.BaseClass;

public class IndexPage extends BaseClass{
	
	@FindBy(xpath="//a[@class='login']")
	WebElement SigAcnInBtn;
	
	@FindBy(xpath="//img[@class='logo img-responsive']")
	WebElement Logo;
	
	@FindBy(id="search_query_top")
	WebElement ProductSearchBox;
	
	@FindBy(name="submit_search")
	WebElement SearchBtn;
	
	public IndexPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public LoginPage ClickOnSignIn() {
		Action.click(driver, SigAcnInBtn);
		return new LoginPage();
	}
	
	
	public boolean  validateLogo() {
		return Action.isDisplayed(driver, Logo);
	}
	
	
	public String getMySiteTitle() {
		String myStoreTitle = driver.getTitle();
		return myStoreTitle;
	}
	
	public SearchResultPage SearchProduct(String ProductName) {
		Action.type(ProductSearchBox, ProductName);
		Action.click(driver, SearchBtn);
		return new SearchResultPage();
	}
	
	
}
