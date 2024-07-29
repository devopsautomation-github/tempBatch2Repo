package locatorExample;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class NOPCommApp extends BaseTest{
	
	
	
	@Test
	public void verifyLogin() throws Exception {
		
		
		
		WebElement txtEmail = driver.findElement(By.id("Email"));
		
		
		
		
		//validation
		String valueAtt = txtEmail.getAttribute("value");
		System.out.println("Value Attribute: " + valueAtt);
		System.out.println("name Attribute: " + txtEmail.getAttribute("name"));
		System.out.println("type Attribute: " + txtEmail.getAttribute("type"));
		
		
		boolean isEmailDisplayed = txtEmail.isDisplayed();
		System.out.println("isEmailDisplayed: " + isEmailDisplayed);
		
		
		txtEmail.clear();;
		Thread.sleep(1000);
		txtEmail.sendKeys("lavanya@learnQuest.com");
		
	}
	

}
