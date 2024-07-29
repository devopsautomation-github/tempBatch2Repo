package labExercise;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class EX5_HandleRadioButton extends DriverSetup{
	

	
	@Test
	public void verifyCheckboxTest() throws Exception {
		
//	List<WebElement> allRadio = driver.findElements(By.cssSelector("[name=\"status\"]"));
		
//		System.out.println("Count: " + allRadio.size());
	
//		allRadio.get(1).click();
//		
//		Thread.sleep(3000);
//		
//		allRadio.get(2).click();
		
		
		
		WebElement radio_pending = driver.findElement(By.cssSelector("[value='Pending']"));
		WebElement radio_approved = driver.findElement(By.cssSelector("[value='Approved']"));
		WebElement radio_rejected = driver.findElement(By.cssSelector("[value='Rejected']"));
		
		
		System.out.println("is radio_pending selected or not: " + radio_pending.isSelected());  //true
		System.out.println("is radio_approved selected or not: " + radio_approved.isSelected());
		System.out.println("is radio_rejected selected or not: " + radio_rejected.isSelected());
		
		System.out.println("============radio_approved seleted==================");
		radio_approved.click();
		
		System.out.println("is radio_pending selected or not: " + radio_pending.isSelected());  //false
		System.out.println("is radio_approved selected or not: " + radio_approved.isSelected());//true
		System.out.println("is radio_rejected selected or not: " + radio_rejected.isSelected());
		
	}
		
		
	}


