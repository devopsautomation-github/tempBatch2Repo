package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import pages.LoginPage;
import utility.Constants;

public class TestBase {
	
	WebDriver driver;
	LoginPage lp;
	
	@BeforeTest
	public void launchApp() throws Exception {
		
		
		driver = new ChromeDriver();
		driver.get(Constants.appURL);
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//create an object
		lp = new LoginPage(driver);
		
		
	}
	
	
	@AfterTest
	public void closeApp() throws Exception {
		
		Thread.sleep(7000);
		driver.close();
		driver.quit();
	}

}
