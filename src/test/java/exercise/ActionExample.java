package exercise;

import org.openqa.selenium.WebDriver;

public class ActionExample {

	
	
	
	public ActionExample(String driver) {
		
		
		System.out.println("inside a constructor");
		System.out.println("Welcome " + driver);
	}

	
	public void enterEmail(String email) {
		
		System.out.println("enterEmail" + email);
	}
	
	public void enterPassword(String pass) {
		
		System.out.println("enterPassword" + pass);
	}
	
	public void clickLogin() {
		
		System.out.println("clickLogin");
	}
	
	
	public void login(String email, String password) {
		enterEmail(email);
		enterPassword(password);
		clickLogin();
		
	}
	
	
	
	//==========================================================//
	
	public void clickAndHold(String email) {
		
		System.out.println("enterEmail" + email);
	}
	
	public void moveToElement(String pass) {
		
		System.out.println("enterPassword" + pass);
	}
	
	public void release() {
		
		System.out.println("clickLogin");
	}
	
	
	public void dragAnddrop(String email, String password) {
		clickAndHold(email);
		moveToElement(password);
		release();
		
	}
	
	
	
	
}
