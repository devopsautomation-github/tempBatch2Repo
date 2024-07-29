package labExercise2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class IFrameExample extends DriverSetupTestNG{
	
	
	@Test
	public void verifyScreenShotTest() throws Exception {
		
		driver.get("https://webapps.tekstac.com/PurchaseApp/");
		Thread.sleep(5000);
		
		//handle frame
		
		//index
		//name or id 
		//webelement
		
//		driver.switchTo().frame(0);
//		driver.switchTo().frame("iframe_heading");

		WebElement myframe = driver.findElement(By.cssSelector("[src*='ding.ht']"));
		driver.switchTo().frame(myframe);
		
		
		
		
		
		String headingText = driver.findElement(By.cssSelector("#heading")).getText();
		System.out.println("Heading text: " + headingText);
		
		
	}
	
	
	

}
