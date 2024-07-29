package seleniumIDE_Example;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class AmazonTest {
	
	public static WebDriver driver;
	
	
	public WebDriver createDriver() {
		
		driver = DriverSetup.getDriver();
		driver.get("https://www.amazon.in/");
		
		return driver;
		
	}
	
	
	@Test
	public void verifySearchTest() throws Exception {
		
		
		
		
	}

}
