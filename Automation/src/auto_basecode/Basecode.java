package auto_basecode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class Basecode {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void startbrow()
	
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver 3");
	    driver = new ChromeDriver();
		driver.get("https://www.zoho.com/crm/login.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

}
