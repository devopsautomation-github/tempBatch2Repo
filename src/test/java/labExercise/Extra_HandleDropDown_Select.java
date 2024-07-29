package labExercise;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Extra_HandleDropDown_Select extends DriverSetup{
	

	
	@Test
	public void verifyDropDownTest() throws Exception {
		
		
		driver.get("http://webapps.tekstac.com/Shopify/");
		
		
		
		WebElement cityList = driver.findElement(By.cssSelector("#selectcity"));
		
		
//		Actions act = new Actions();
		
		Select list = new Select(cityList);
		
		
		
		System.out.println("is dropdown accept multiple selection or not: " + list.isMultiple());
		
		//index ----- start from 0
		list.selectByIndex(1);			//	Coimbatore
		
		
		Thread.sleep(2000);
		
		
		list.selectByValue("mas");		//	Chennai
		
		
		
		Thread.sleep(2000);
		
		
		list.selectByVisibleText("Coimbatore");
		
	}
		
		
	}


