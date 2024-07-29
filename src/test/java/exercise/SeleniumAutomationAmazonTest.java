package exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//import recap.ChromeDriver;

public class SeleniumAutomationAmazonTest {

	public static void main(String[] args) {
		
		
		ChromeDriver obj = new ChromeDriver();
		
		obj.get("https://www.amazon.in/");
		
		
		
		obj.findElements(By.className(""));
		
		obj.getWindowHandles();
		

	}

}
