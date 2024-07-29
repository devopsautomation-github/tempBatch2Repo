package labExercise2;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HandleWindowExample extends DriverSetupTestNG{
	
	
	@Test
	public void verifyScreenShotTest() throws Exception {
		
		driver.get("https://webapps.tekstac.com/SeleniumApp1/TrainReservation/login.html");
		String parentWindow = driver.getWindowHandle(); 
		System.out.println("parentWindow: " + parentWindow);
		
		
		//click on GmailLogin Button
		
		driver.findElement(By.cssSelector("[title='GmailLogin']")).click();
		//handle window
		
		              			//unique value ----- current window
		Set<String> allWindow = driver.getWindowHandles();						//Set ----- unique value
		
		
		
		System.out.println("parentWindow: " + parentWindow);
		System.out.println("Window Count: " + allWindow.size());
		
		
		
		System.out.println("Application title before switching: " + driver.getTitle());
		
		
		String win1 = (String)allWindow.toArray()[0];
		String win2 = (String)allWindow.toArray()[1];
		
		
		
		System.out.println("win1: " + win1);
		System.out.println("win2: " + win2);
		
		Thread.sleep(4000);
		
		//swtich to window
		
		driver.switchTo().window(win2);
		System.out.println("Application title after switching: " + driver.getTitle());
		//enter email into gmail window
		driver.findElement(By.cssSelector("[name=\"name\"]")).sendKeys("lavanya@learnQuest.com");
		
		
		
		
		Thread.sleep(4000);
		//swtich to window
		
		driver.switchTo().window(parentWindow);
		driver.findElement(By.cssSelector("#submit")).click();
		System.out.println("Application title after switching to parentWindow: " + driver.getTitle());
		
		
	}
	
	
	

}
