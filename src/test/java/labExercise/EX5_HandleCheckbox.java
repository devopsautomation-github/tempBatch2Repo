package labExercise;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class EX5_HandleCheckbox extends DriverSetup{
	

	
	@Test
	public void verifyCheckboxTest() {
		
	
		
		
		
		//checkbox
		WebElement old_chk = driver.findElement(By.cssSelector("[id='oldUser']"));
		
		
		System.out.println("is old cehckbox selected or not: " + old_chk.isSelected());  //false
		
		Assert.assertFalse(old_chk.isSelected());
		
		
		//click on checkbox
		old_chk.click();
		
		//checkbox
//		driver.findElement(By.xpath("//*[@id='newUser']")).click();
		
		
		
		
		//------------------------------------------------//
		
//		validation
		System.out.println("is old cehckbox selected or not: " + old_chk.isSelected());
		
		Assert.assertTrue(old_chk.isSelected());
		
		
	}
		
		
	}


