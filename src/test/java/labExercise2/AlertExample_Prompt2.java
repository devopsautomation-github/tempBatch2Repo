package labExercise2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertExample_Prompt2 extends DriverSetupTestNG{
	
	
	@Test
	public void verifyScreenShotTest() throws Exception {
		
		//click on button ---- generate an alert
		driver.findElement(By.cssSelector("[onclick*='ion()']")).click();
		
		Thread.sleep(3000);
		
		//Alert/frame/windows
		
		
		//handle Alert
		
		Alert ConfirmAlert = driver.switchTo().alert();
		
		
		String alertText = ConfirmAlert.getText();
		
		
		//accept ---- ok
		//dismiss --- cancel
		//getText
		//sendKeys
		
		
		//validate alert Text
		System.out.println("Alert Textare : " + alertText);
//		Assert.assertEquals(alertText, "Hi.. This is alert message!");
		

		//accept
		ConfirmAlert.accept();
		
		//dismiss
//		ConfirmAlert.dismiss();
		
		
	}
	
	
	

}
