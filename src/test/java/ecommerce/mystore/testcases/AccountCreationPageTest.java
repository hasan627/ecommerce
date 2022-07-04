package ecommerce.mystore.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ecommerce.mystore.base.BaseClass;
import ecommerce.mystore.pageobjects.AccountCreationPage;
import ecommerce.mystore.pageobjects.HomePage;
import ecommerce.mystore.pageobjects.IndexPage;
import ecommerce.mystore.pageobjects.LoginPage;

public class AccountCreationPageTest extends BaseClass {
	IndexPage indexpage;
	LoginPage loginpage;
	HomePage homepage;
	AccountCreationPage accountCreationPage;
	
	@BeforeMethod
	public void Setup() {
		LaunchApp();
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void verifyCreateAccountPageTest() throws InterruptedException {
		TimeUnit.SECONDS.sleep(3);
		indexpage = new IndexPage();
		loginpage = indexpage.ClickOnSignIn();
		accountCreationPage = loginpage.createNewAccount("ratan@gmail.com");
		boolean result=accountCreationPage.ValidateAccountCreatePage();
		Assert.assertTrue(result);	
	}

}
