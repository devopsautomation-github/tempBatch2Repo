package labExercise;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class EX2_FindElementByTag extends DriverSetup{
	
	
	List<WebElement> btnregister;
	
	@Test
	public void verifyElementByID() {
		
		
		
		//line of code
		
//		WebElement btnregister = driver.findElement(By.tagName("Select"));        //mutiple ---- 4
		
		
		btnregister = driver.findElements(By.xpath("//select[@id='delivery_area']/option"));  		/// match =7
		System.out.println("Count: " + btnregister.size());
		
		
		//------------------------------------------------------------------//
		
//		Assert.assertEquals(4, btnregister.size());;
		
		
//		System.out.println("text value are: " +btnregister.get(4).getText());
		
		
		
		for (int i = 0; i < btnregister.size(); i++) {
			
			String eleText = btnregister.get(i).getText();
			System.out.println("delivery element options are: " + eleText);
			
		}
		
		
		
		
		
		
	}

}
