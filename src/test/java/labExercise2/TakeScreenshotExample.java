package labExercise2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class TakeScreenshotExample extends DriverSetup{
	
	
	@Test
	public void verifyScreenShotTest() throws Exception {
		
		
		driver.get("https://www.amazon.in/");
		
		
		driver.findElement(By.cssSelector("[id*=searchtextbox]")).sendKeys("iphone 15 pro");
		
		driver.findElement(By.cssSelector("[type*='sub']")).click();
		
		
		
		Thread.sleep(3000);
		//capture a screenshot
		
		captureScreenshot("AmazonSearchItem_Iphone");
		
		
		
		
	}
	
	
	public void captureScreenshot(String fileName) throws Exception {
		
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotFile = ts.getScreenshotAs(OutputType.FILE);    //capture a screenshot
		File target = new File(".\\screnshotFolder\\" + fileName + ".png");
		
		FileUtils.copyFile(screenshotFile, target);
		
	}

}
