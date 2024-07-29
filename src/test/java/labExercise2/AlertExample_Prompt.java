package labExercise2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertExample_Prompt extends DriverSetupTestNG{
	
	
	@Test
	public void verifyScreenShotTest() throws Exception {
		
		//click on button ---- generate an alert
		driver.findElement(By.cssSelector("[onclick*='ionf()']")).click();
		
		Thread.sleep(3000);
		
		//Alert/frame/windows
		
		
		//handle Alert
		
		Alert promptAlert = driver.switchTo().alert();
		
		
		String alertText = promptAlert.getText();
		
		
		//accept ---- ok
		//dismiss --- cancel
		//getText
		//sendKeys
		
		
		//validate alert Text
		System.out.println("Alert Textare : " + alertText);
		Assert.assertEquals(alertText, "Your Name Please");
		

		Thread.sleep(5000);
		//sendKeys
		
		
		promptAlert.sendKeys("Hello Lavanaya !!");
		
		
		//
		Thread.sleep(5000);
		//accept
		promptAlert.accept();
		
		//dismiss
//		ConfirmAlert.dismiss();
		
		
	}
	
	
	

}
