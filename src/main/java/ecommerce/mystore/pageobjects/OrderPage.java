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
public class OrderPage extends BaseClass{
	
	@FindBy(xpath = "//*[@id=\"product_price_1_1_0\"]/span")
	WebElement unitPrice;
	
	@FindBy(id = "total_price")
	WebElement totalprice;
	
	@FindBy(xpath="//span[contains(text(),'Proceed to checkout')]")
	WebElement proceedToCheckOutBtn;
	
	public OrderPage() {
		PageFactory.initElements(driver, this);
	}
	
	public double getUnitPrice() {
		String unitPriceActual=unitPrice.getText();
		String unit=unitPriceActual.replaceAll("[^a-zA-Z0-9]","");
		double finalUnitPrice=Double.parseDouble(unit);
		return finalUnitPrice/100;
		
		
	}
	
	public double getTotalPrice() {
		String totalPriceActual=totalprice.getText();
		String unit=totalPriceActual.replaceAll("[^a-zA-Z0-9]","");
		double finalTotal=Double.parseDouble(unit);
		return finalTotal/100;
		
	}
	
	public LoginPage clickOnCheckOut() {
		Action.click(driver, proceedToCheckOutBtn);
		return new LoginPage();
	}

}
