package javascriptExample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleInputboxTest2 {
	
	
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
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		Thread.sleep(7000);
		
		
		
		
		
		
	}

	
	@Test
	public void verifyInputBox() {
		
		WebElement btnSubmit = driver.findElement(By.cssSelector("#submit"));
		
		
		
		//JavascriptExecutor
		
		JavascriptExecutor JS = (JavascriptExecutor) driver;
//		JS.executeScript("alert('hello everyone, happy learning!!')");
		
		
		JS.executeScript("arguments[0].click()", btnSubmit);
		
		
	}
}
