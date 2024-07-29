package labExercise;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Extra_HandleDropDown_Select2 extends DriverSetup{
	

	
	@Test
	public void verifyDropDownTest() throws Exception {
		
		
		driver.get("http://only-testing-blog.blogspot.com/2013/11/new-test.html");
		
		
		
		WebElement countryList = driver.findElement(By.cssSelector("[name=\"FromLB\"]"));
		
		
//		Actions act = new Actions();
		
		Select list = new Select(countryList);
		
		System.out.println(list.getOptions().size());
		
		
		
//		for (int i = 0; i < list.getOptions().size(); i++) {
//			
//			list.selectByIndex(i);	
//			
//		}
		
		
		
		System.out.println("is dropdown accept multiple selection or not: " + list.isMultiple());
		
		//index ----- start from 0
		list.selectByIndex(1);			//	Japan
		list.selectByIndex(2);	
		
		Thread.sleep(2000);
		
		
		list.selectByValue("India");		//	India
		
		
		
		Thread.sleep(2000);
		
		
		list.selectByVisibleText("Greece");		//Greece
		
		
		Thread.sleep(2000);
		list.deselectByValue("Greece");
		
	}
		
		
	}


