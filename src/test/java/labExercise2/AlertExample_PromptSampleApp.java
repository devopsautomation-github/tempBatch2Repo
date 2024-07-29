package labExercise2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertExample_PromptSampleApp extends DriverSetupTestNG{
	
	
	@Test
	public void verifyScreenShotTest() throws Exception {
		
		
		driver.get("file:///C:/Users/91995/Desktop/rajesh/testData/Test.html");
		
		
		
		//click on button ---- generate an alert
		driver.findElement(By.cssSelector("[onclick*='PromptBox()']")).click();
		
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
		System.out.println("Alert Textare : " + alertText);		//Please enter your name:
		Assert.assertEquals(alertText, "Please enter your name:");
		

		Thread.sleep(5000);
		//sendKeys
		
		
		promptAlert.sendKeys("Welcome Lavanaya ");
		
		
		//
		Thread.sleep(5000);
		//accept
		promptAlert.accept();
		
		//dismiss
//		ConfirmAlert.dismiss();
		
		
		System.out.println(driver.findElement(By.cssSelector("#demoPrompt")).getText());
		
		
	}
	
	
	

}
