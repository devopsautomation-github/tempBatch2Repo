package locatorExample.copy;

//import org.junit.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class NOPCommApp_Locator extends BaseTest {
	
		
	@Test
	public void verifyLogin() throws Exception {
		
		
		//ID
		//email
		
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		
		
		//class ---- password
		driver.findElement(By.className("password")).clear();
		
		//name
		driver.findElement(By.name("Password")).sendKeys("admin");
		
		
		//rememberMe Checkbox
		driver.findElement(By.name("RememberMe")).click();
		
		
		//tagname ---- login button
		driver.findElement(By.tagName("button")).click();
		
		
		
		Thread.sleep(3000);
		//validation Step
		System.out.println("Application title are login: " + driver.getTitle());
		
		
		
		//linkText/partialLinkText ---- Logout
		driver.findElement(By.linkText("Logout")).click();  // ------- exact text: 
		
		
		//linkText/partialLinkText ---- Logout
//		driver.findElement(By.partialLinkText("ogou")).click();
		
		
		Thread.sleep(3000);
		//validation Step
		System.out.println("Application title are logout: " + driver.getTitle());
		
		
		
		//XPATH   ---- checkbox
		
		driver.findElement(By.xpath("//input[@id=\"RememberMe\"]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		
		
		
		//CSSSelector   ---- checkbox
		
		driver.findElement(By.cssSelector("[type=checkbox]")).click();
				
		Thread.sleep(3000);
				
		driver.findElement(By.cssSelector("input[id='RememberMe']")).click();
		
		
	}
	

}
