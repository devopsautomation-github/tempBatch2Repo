package javascriptExample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleInputboxTest {
	
	
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
		driver.get("http://only-testing-blog.blogspot.com/2013/11/new-test.html");
		Thread.sleep(5000);
		
		
		driver.manage().window().maximize();
		
		
		
	}

	
	@Test
	public void verifyInputBox() {
		
		WebElement ele = driver.findElement(By.cssSelector("[name*='ln']"));

		
//		driver.findElement(By.cssSelector("[name*='ln']")).sendKeys("enter last name");
		
		
		JavascriptExecutor JS = (JavascriptExecutor) driver;
//		JS.executeScript("alert('hello everyone, happy learning!!')");
		
		
		JS.executeScript("arguments[0].value=arguments[1]", ele,  "enter last name....");
		
		
	}
}
