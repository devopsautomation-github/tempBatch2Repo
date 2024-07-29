package testNGExample;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class NOPCommApp extends BaseTest{
	
	
//	@Test(enabled = false)
	
	@Test
	public void verifyLoginFeature() throws InterruptedException {
		
		driver.findElement(By.cssSelector("input#Email")).clear();;
		driver.findElement(By.cssSelector("input#Email")).sendKeys("admin@yourstore.com");
		
		driver.findElement(By.cssSelector("input#Password")).clear();;
		driver.findElement(By.cssSelector("input#Password")).sendKeys("admin");
		
		
		driver.findElement(By.cssSelector("input#RememberMe")).click();
		
		
		
		driver.findElement(By.tagName("button")).click();
		
		
		Thread.sleep(3000);
		//validation Step
		Assert.assertTrue(driver.getTitle().contains("Dashboard"));
		System.out.println("application title after login: " + driver.getTitle());
		
		
		
		
		
	}
	
	//@Test(enabled = true) @Ignore
	
	@Test
	public void verifyLogoutFeature() throws Exception {
		
		driver.findElement(By.partialLinkText("Logo")).click();
		
		
		Thread.sleep(3000);
		//validation Step
		Assert.assertTrue(driver.getTitle().contains("Login"));
		System.out.println("application title after login: " + driver.getTitle());
		
	}

}
