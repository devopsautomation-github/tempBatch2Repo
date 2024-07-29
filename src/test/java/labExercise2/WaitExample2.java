package labExercise2;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.Constants;

public class WaitExample2 extends DriverSetup{
	
	
	@Test
	public void verifyScreenShotTest() throws Exception {
		
		
		driver.get("http://only-testing-blog.blogspot.com/2014/01/new-testing.html?");
		
		Thread.sleep(5000);			//hard coded ---- demo ----- 
		
		
		//conditional wait
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));        //max time ----- 2 sec ---- 120 sec
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.waitTime));
		wait.until(ExpectedConditions.alertIsPresent());
		
		
		
		
		
//		WebElement ele = driver.findElement(By.cssSelector("#text3"));
//		ele.sendKeys("enter value");
//		
		
		
		//handle an alert
		
		System.out.println("alert text: " + driver.switchTo().alert().getText());
		
		
		
		
		
		
	}
	
	
	

}
