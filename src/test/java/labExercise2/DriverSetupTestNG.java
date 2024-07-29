package labExercise2;

//import org.junit.After;
//import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class DriverSetupTestNG {
	
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
		driver.get("http://only-testing-blog.blogspot.com/2013/11/new-test.html");
		Thread.sleep(5000);
		
		
		driver.manage().window().maximize();
		
		
		
	}
	
	
	
	

}
