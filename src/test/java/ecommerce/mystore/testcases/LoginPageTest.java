/**
 * 
 */
package ecommerce.mystore.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ecommerce.mystore.base.BaseClass;
import ecommerce.mystore.pageobjects.HomePage;
import ecommerce.mystore.pageobjects.IndexPage;
import ecommerce.mystore.pageobjects.LoginPage;

/**
 * @author HP
 *
 */
public class LoginPageTest extends BaseClass{
	IndexPage indexpage;
	LoginPage loginpage;
	HomePage homePage;
	
	@BeforeMethod
	public void Setup() {
		LaunchApp();
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void LoginTest() throws InterruptedException {
		TimeUnit.SECONDS.sleep(4);
		indexpage = new IndexPage();
		loginpage= indexpage.ClickOnSignIn();
		homePage= loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		String actualURL = homePage.getCurrentURL();
		//System.out.println(actualURL);
		String expectedURL="http://automationpractice.com/index.php?controller=my-account";
		Assert.assertEquals(actualURL, expectedURL);	
		
	}

}

