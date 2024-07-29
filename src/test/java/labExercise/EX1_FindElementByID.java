package labExercise;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class EX1_FindElementByID extends DriverSetup{
	
	
	@Test
	public void verifyElementByID() {
		
		
		
		//line of code
		
		WebElement btnregister = driver.findElement(By.id("reg"));
		
		//click
		//get the text of element
		System.out.println("text are: " +btnregister.getText());
		
	}

}
