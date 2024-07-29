package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

//import junit.framework.Assert;
import utility.Constants;

public class LoginPageWithoutPagefactory {

	WebDriver driver;

	public LoginPageWithoutPagefactory(WebDriver driver) {

		this.driver = driver;
	}

	// Identification
	By textEmail = By.id("Email");
	By textPass = By.cssSelector("input#Password");
	By chkRem = By.cssSelector("input#RememberMe");
	By btnLogin = By.tagName("button");
	By btnLogout = By.partialLinkText("Logo");
	
	
	
//	WebElement txt_Email;

	// Actions or Methods

	public void enterEmail() {
		driver.findElement(textEmail).clear();
		driver.findElement(textEmail).sendKeys(Constants.adminEmail);

	}

	public void enterEmail(String email) {
		driver.findElement(textEmail).clear();
		driver.findElement(textEmail).sendKeys(email);

	}

	public void enterPassword(String pwd) {
		driver.findElement(textPass).clear();
		driver.findElement(textPass).sendKeys(pwd);

	}

	public void clickCheckbox() {

		driver.findElement(chkRem).click();
	}

	public void clickLoginButton() {

		driver.findElement(btnLogin).click();
	}

	public void clickLogout() {

		driver.findElement(btnLogout).click();
	}
	
	public void verifyApplicationTitle(String exptitle) throws Exception {

		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(), exptitle);
	}

}
