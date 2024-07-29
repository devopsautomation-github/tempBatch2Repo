package labExercise2;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertExample_Confirm extends DriverSetupTestNG{
	
	
	@Test
	public void verifyScreenShotTest() throws Exception {
		
		//click on button ---- generate an alert
		driver.findElement(By.cssSelector("[onclick*='ion()']")).click();
		
		Thread.sleep(3000);
		
		//Alert/frame/windows
		
		
		//handle Alert
		
		String alertText = driver.switchTo().alert().getText();
		
		
		//accept ---- ok
		//dismiss --- cancel
		//getText
		//sendKeys
		
		
		//validate alert Text
		System.out.println("Alert Textare : " + alertText);
//		Assert.assertEquals(alertText, "Hi.. This is alert message!");
		

		//accept
		driver.switchTo().alert().accept();
		
		//dismiss
//		driver.switchTo().alert().dismiss();
		
		
	}
	
	
	

}
