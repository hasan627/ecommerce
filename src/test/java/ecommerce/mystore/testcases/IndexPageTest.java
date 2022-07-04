/**
 * 
 */
package ecommerce.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ecommerce.mystore.base.BaseClass;
import ecommerce.mystore.pageobjects.IndexPage;

/**
 * @author HP
 *
 */
public class IndexPageTest extends BaseClass{
	IndexPage indexPage;

	@BeforeMethod
	public void Setup() {
		LaunchApp();
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void verifyLogo() {
		indexPage= new IndexPage();
		boolean result = indexPage.validateLogo();
		Assert.assertTrue(result);
	}
	
	@Test
	public void verifyTitle() {
		String titleActual= indexPage.getMySiteTitle();
		String titleExpected = "My Store";
		Assert.assertEquals(titleActual, titleExpected);
	}
}
