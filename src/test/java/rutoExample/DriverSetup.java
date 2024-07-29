package rutoExample;

//import org.junit.After;
//import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import utility.Constants;

public class DriverSetup {
	
	public static WebDriver driver;
	
	@AfterTest
	public void closeApp() throws Exception {
		Thread.sleep(5000);
		System.out.println("closing an application");
		driver.close();
		driver.quit();
	}
		
	@BeforeTest
	public void launchApp() throws Exception {
		
		System.out.println("launching an application");
		
		driver = new ChromeDriver();
		driver.get(Constants.appURL);
		Thread.sleep(5000);
		
		
		driver.manage().window().maximize();
		
		
		
	}
	
	
	
	

}
