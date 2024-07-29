package labExercise2;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.Constants;

public class DatePickerExample2 extends DriverSetup{
	
	
	@Test
	public void verifyScreenShotTest() throws Exception {
		
		
		driver.get("https://webapps.tekstac.com/Registration/");
		
		Thread.sleep(5000);			//hard coded ---- demo ----- 
		
		WebElement ele = driver.findElement(By.cssSelector("#dob"));
		ele.sendKeys("07-10-2024");
		
		
		
		
		
		
	}
	
	
	

}
