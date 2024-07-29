package rutoExample;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class VerifyLogin extends DriverSetup {
	
	
	
	@Test
	public void verifyLoginTest() {
		
		
		driver.findElement(By.cssSelector("input#Email")).sendKeys("values to send");
		
		driver.findElement(By.cssSelector("input#RememberMe")).click();

		
		
	}

}
