package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pages.LoginPage;
import utility.Constants;

public class LoginTest extends TestBase{
	
	
	@Test
	public void verifyLoginFeature() throws Exception {
		
		
		lp.enterEmail(Constants.adminEmail);
		lp.enterPassword(Constants.adminPass);
		lp.clickCheckbox();
		lp.clickLoginButton();
		//validation Step
		lp.verifyApplicationTitle("Dashboard / nopCommerce administration");
		lp.clickLogout();
		//validationStep
		lp.verifyApplicationTitle("Your store. Login");
		
		
//		lp.login(Constants.adminEmail, Constants.adminPass);
//		lp.verifyApplicationTitle("Dashboard / nopCommerce administration");
//		lp.clickLogout();
//		//validationStep
//		lp.verifyApplicationTitle("Your store. Login");
		
		
	}

}
