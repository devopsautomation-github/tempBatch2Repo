package labExercise2;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.Constants;

public class DatePickerExample3_revist extends DriverSetup{
	
	
	@Test
	public void verifyScreenShotTest() throws Exception {
		
		
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		
		Thread.sleep(5000);			//hard coded ---- demo ----- 
		
		WebElement ele = driver.findElement(By.cssSelector("#datepicker1"));
		ele.sendKeys("07/10/2024");
		
		
		
	}
	
	
	

}
