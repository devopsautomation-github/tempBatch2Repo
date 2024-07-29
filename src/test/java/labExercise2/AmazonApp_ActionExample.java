package labExercise2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AmazonApp_ActionExample extends DriverSetupTestNG{
	
	
	@Test
	public void verifyScreenShotTest() throws Exception {
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		
		
		
		
		WebElement SignIn = driver.findElement(By.xpath("//span[contains(text(),', sign in')]"));
		
		//SignIn.click();
		
		
		
		Actions act = new Actions(driver);
		
		act.moveToElement(SignIn).perform();
		
		
		
		
		
	}
	
	
	

}
