/**
 * 
 */
package ecommerce.mystore.testcases;

import static org.testng.Assert.assertTrue;

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
public class HomePageTest extends BaseClass{
	
	IndexPage indexpage;
	LoginPage loginpage;
	HomePage homepage;
	
	@BeforeMethod
	public void Setup() {
		LaunchApp();
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public  void verifyWIshListTest() throws InterruptedException {
		TimeUnit.SECONDS.sleep(3);
		indexpage =  new IndexPage();
		loginpage = indexpage.ClickOnSignIn();
		homepage =loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		boolean result = homepage.validateMyWishList();
		Assert.assertTrue(result);
	}
	
	@Test
	public  void verifyOrderHistoryTest() throws InterruptedException {
		TimeUnit.SECONDS.sleep(3);
		indexpage =  new IndexPage();
		loginpage = indexpage.ClickOnSignIn();
		homepage =loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		boolean result = homepage.validateOrderHistory();
		Assert.assertTrue(result);
	}

}
