package seleniumIDE_Example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetup {
	
	public static WebDriver driver;
	
	public static WebDriver getDriver() {
		
		driver = new ChromeDriver();
		return driver;
		
	}

}
