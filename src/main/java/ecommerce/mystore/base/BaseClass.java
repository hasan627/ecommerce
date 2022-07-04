package ecommerce.mystore.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ecommerce.mystore.actiondriver.Action;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static Properties prop;
	public static WebDriver driver;
	
	@BeforeTest
	public void LoadConfig() {
		try {
			prop = new Properties();
			System.out.println("Super Constructor invoked");
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"\\Configuration\\Config.properties");
			try {
				prop.load(ip);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("driver: "+ driver);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	public static void LaunchApp() {
		WebDriverManager.chromedriver().setup();
		String browserName = prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver();
			driver = new FirefoxDriver();
		}else if (browserName.equalsIgnoreCase("IE")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Action.implicitWait(driver, 5000);
		Action.pageLoadTimeOut(driver, 5000);	
		driver.get(prop.getProperty("url"));
	}
	
	

}
