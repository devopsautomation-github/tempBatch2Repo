package labExercise;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//import junit.framework.Assert;

public class EX3_NavigationExample extends DriverSetup{
	

	
	@Test
	public void verifyCheckboxTest() throws Exception {
		
		
		driver.navigate().to("https://www.selenium.dev/");
		Thread.sleep(3000);
		driver.get("https://www.google.co.in/");
		
		
		//back in history
		Thread.sleep(3000);
		driver.navigate().back();
		
		
		System.out.println("Application Title: " + driver.getTitle());
		System.out.println("Application URL: " + driver.getCurrentUrl());
		
		
		
		
		//back in history
		Thread.sleep(3000);
		driver.navigate().forward();
				
				
		System.out.println("Application Title: " + driver.getTitle());				//google Page
		System.out.println("Application URL: " + driver.getCurrentUrl());
		
		
		
		//back in history
		Thread.sleep(3000);
		driver.navigate().refresh();
						
						
		System.out.println("Application Title: " + driver.getTitle());
		System.out.println("Application URL: " + driver.getCurrentUrl());
		
	}
	
	
	
	
		public static String getApplicationTitle() {
			
			return driver.getTitle();
		}
		
	}


