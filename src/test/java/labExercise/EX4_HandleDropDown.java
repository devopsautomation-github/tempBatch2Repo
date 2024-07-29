package labExercise;

import org.junit.Test;
import org.openqa.selenium.By;

public class EX4_HandleDropDown extends DriverSetup{
	

	
	@Test
	public void verifyDropDownTest() {
		
		
		driver.findElement(By.xpath("//*[@id='selectcity']/option[@value='cbe']")).click();
		
		
		
	}
		
		
	}


