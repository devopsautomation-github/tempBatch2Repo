package labExercise2;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetup {
	
	public static WebDriver driver;
	
	@After
	public void closeApp() throws Exception {
		Thread.sleep(5000);
		System.out.println("closing an application");
		driver.close();
		driver.quit();
	}
		
	@Before
	public void launchApp() throws Exception {
		
		System.out.println("launching an application");
		
		driver = new ChromeDriver();
		driver.get("https://webapps.tekstac.com/Shopify/");
		Thread.sleep(5000);
		
		
		driver.manage().window().maximize();
		
		
		
	}
	
	
	
	

}
