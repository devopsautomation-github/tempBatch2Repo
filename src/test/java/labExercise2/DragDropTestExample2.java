package labExercise2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragDropTestExample2 extends DriverSetupTestNG{
	
	
	@Test
	public void verifyScreenShotTest() throws Exception {
		
		driver.get("http://webapps.tekstac.com/OnlineShopping/fashion.html");
		Thread.sleep(5000);
		
		
		
		
		WebElement shirts = driver.findElement(By.cssSelector("[id='Shirts']"));
//		WebElement Jackets = driver.findElement(By.cssSelector("[id='Jackets']"));
		
		WebElement basket = driver.findElement(By.cssSelector("[id='droppable']"));
		
		
		
		//drag and drop
		
		Actions act = new Actions(driver);
		//act.dragAndDrop(shirts, basket).perform();
		
		//A convenience method that performs click-and-hold at the location of the source element, 
		//moves to the location of the target element, then releases the mouse.
		
		act.clickAndHold(shirts).moveToElement(basket).release().perform();
		
		
		
	}
	
	
	

}
