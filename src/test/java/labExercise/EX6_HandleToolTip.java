package labExercise;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//import junit.framework.Assert;

public class EX6_HandleToolTip extends DriverSetup{
	

	
	@Test
	public void verifyCheckboxTest() throws Exception {
		
		
//		WebElement register_lnk = driver.findElement(By.linkText("Register here"));
		WebElement register_lnk = driver.findElement(By.partialLinkText("ter"));
		
		
		
		
		
		
		//get the attribute value ----- title
		String att_value = register_lnk.getAttribute("title");
		
		System.out.println("att_value value are: " + att_value);  //Registration
		
		Assert.assertEquals("Registration", att_value);
		
	}
		
		
	}


