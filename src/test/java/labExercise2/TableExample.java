package labExercise2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TableExample extends DriverSetupTestNG{
	
	
	@Test
	public void verifyScreenShotTest() throws Exception {
		
		driver.get("https://webapps.tekstac.com/SeleniumApp1/SmartUniversity/view_dept.html");
		Thread.sleep(5000);
		
		
		
		
//		WebElement table = driver.findElement(By.cssSelector("#sortingTable"));
		
		List<WebElement> table_allHeader = driver.findElements(By.xpath("//*[@id='sortingTable']/thead/tr/th"));
		
		System.out.println("header count: " + table_allHeader.size());
		
		
			table_allHeader.get(0).getText();
			
			for (int i = 0; i < table_allHeader.size(); i++) {
				
				
				String header = table_allHeader.get(i).getText();
				
				System.out.println("header value are: " + header);
				
				if(header.equalsIgnoreCase("Department Name")) {
					
					System.out.println("index value are: " + i);
					
				}
				
			}
			
			
			
		List<WebElement> table_rows = driver.findElements(By.xpath("//*[@id='sortingTable']/tbody/tr"));
			
			
		for (int i = 0; i < table_rows.size(); i++) {
			
			
			String emailValue = driver.findElement(By.xpath("//*[@id='sortingTable']/tbody/tr[   "+ (i+1) +"   ]/td[3]")).getText();
			String deptValue = driver.findElement(By.xpath("//*[@id='sortingTable']/tbody/tr[   "+ (i+1) + "  ]/td[1]")).getText();
			System.out.println("emailValue: " + emailValue);
			System.out.println("deptValue: " + deptValue);
		}
		
		
	}
	
	
	

}
