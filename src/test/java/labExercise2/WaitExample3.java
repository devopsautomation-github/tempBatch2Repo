package labExercise2;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitExample3 extends DriverSetup{
	
	
	@Test
	public void verifyScreenShotTest() throws Exception {
		
		
		driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html");
		
		Thread.sleep(5000);			//hard coded ---- demo ----- 
		
		
		//conditional wait
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));        //max time ----- 2 sec ---- 120 sec
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.waitTime));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#text3")));
		
		
		HelpWaitForElement(driver, By.cssSelector("#text3"), 20);
		HelpWaitForElement(By.cssSelector("#text3"), 20);
		
		WebElement ele = driver.findElement(By.cssSelector("#text3"));
		ele.sendKeys("enter value");
		
		
	}
	
	
	public void HelpWaitForElement(WebDriver driver, By locatorExample, int waitTime) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waitTime));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locatorExample));
		
	}
	
	
	public void HelpWaitForElement(By locatorExample, int waitTime) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waitTime));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locatorExample));
		
	}

}
