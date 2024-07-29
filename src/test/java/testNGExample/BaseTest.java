package testNGExample;

import java.time.Duration;

import org.apache.commons.math3.geometry.spherical.twod.Edge;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest {
	WebDriver driver;
	
	
	
	@Parameters("ibm_br")
	@BeforeTest
	public void launchApp(String brFromXML) {
		
		System.out.println("fetch value from XML file: "+ brFromXML);
		
		String br = brFromXML;
		
		
		if(br.equalsIgnoreCase("chrome")) {
			
			System.out.println("Execution on chrome browser");
			driver = new ChromeDriver();
			
		}
		else if(br.equalsIgnoreCase("edge")) {
			System.out.println("Execution on edge browser");
			driver = new EdgeDriver();
			
		}
		
		else if(br.equalsIgnoreCase("firefox")) {
			System.out.println("Execution on firefox browser");
			driver = new FirefoxDriver();
			
		}
		
		else {
			
			System.out.println("*******EXECUTION ON DEFAULT BROWSER: CHROME************");
			driver = new ChromeDriver();
		}
		
		
		
		
		
//		
		
		
		
		
		
		//launching an application
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
	}
	
	
	@AfterTest
	public void closeApp() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		driver.close();
		driver.quit();
		
		
	}

}
