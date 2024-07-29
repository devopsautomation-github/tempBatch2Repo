package testNGExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDT_NOPTest {
	
	
	public WebDriver driver;
	
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
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(5000);
	}
	
	
	
	@Test(dataProvider = "regressionData")
	public void VerifyAppWithUserCred(String email, String pwd) throws Exception {
		
		System.out.println("email value are: " + email);
		System.out.println("email value are: " + pwd);
		
		System.out.println("===================================================");
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#Email")).clear();;
		driver.findElement(By.cssSelector("input#Email")).sendKeys(email);
		
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#Password")).clear();;
		driver.findElement(By.cssSelector("input#Password")).sendKeys(pwd);
		
		driver.findElement(By.tagName("button")).click();
		
		
		
		//validation Step
		Assert.assertTrue(driver.getPageSource().contains("Login was unsuccessful"));
		
		
		
		
	}
	
	
	
	
	@DataProvider
	public Object[][] sampleData() {
		
		
		Object [][] data = { {"lavanya@learnQuest.com", "welcome"},{"abhishek@google.com", "welcome123"},{"amit@yahoo.com", "qweqweqwso"}};
		return data;
		
		
	}
	
	
	@DataProvider
	public Object[][] regressionData() {
		
		
		Object [][] data = { {"lavanya_Regression@learnQuest.com", "welcome"},{"abhishek_Regression@google.com", "welcome123"},{"amit_Regression@yahoo.com", "qweqweqwso"},{"Sunitha_Regression@yahoo.com", "qweqweqwso"}};
		return data;
		
		
	}

}
