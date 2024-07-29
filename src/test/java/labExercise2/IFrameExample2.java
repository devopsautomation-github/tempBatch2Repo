package labExercise2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class IFrameExample2 extends DriverSetupTestNG{
	
	
	@Test
	public void verifyScreenShotTest() throws Exception {
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		Thread.sleep(5000);
		
		//handle frame
		
		//index
		//name or id 
		//webelement
		
//		driver.switchTo().frame(0);
//		driver.switchTo().frame("iframe_heading");

		WebElement myframe = driver.findElement(By.cssSelector("[data-src*=\"photo\"]"));
		driver.switchTo().frame(myframe);
		
		
		
		
		
		String headingText = driver.findElement(By.cssSelector("[src*='tatras3']")).getAttribute("alt");
		System.out.println("Heading text: " + headingText);
		
		
	}
	
	
	

}
