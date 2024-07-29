package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

//import junit.framework.Assert;
import utility.Constants;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
		
		System.out.println("=================page factory concept========================");
		
		PageFactory.initElements(driver, this);
	}

//	// Identification
//	By textEmail = By.id("Email");
//	By textPass = By.cssSelector("input#Password");
//	By chkRem = By.cssSelector("input#RememberMe");
//	By btnLogin = By.tagName("button");
//	By btnLogout = By.partialLinkText("Logo");
	
	
	@FindBy(how = How.ID, using = "Email")
	WebElement text_Email1;
	
	
	@FindBy(id = "Email")
	WebElement text_Email;
	
	@FindBy(css  = "input#Password")
	WebElement text_Pass;
	
	
	@FindBy(css = "input#RememberMe")
	WebElement chk_rem;
	
	@FindBy(tagName = "button")
	WebElement btn_Login;
	
	@FindBy(partialLinkText  = "Logo")
	WebElement btn_Logout;
	
	
	
//	WebElement txt_Email;

	// Actions or Methods

	public void enterEmail() {
		text_Email.clear();
		text_Email.sendKeys(Constants.adminEmail);

	}

	public void enterEmail(String email) {
		text_Email1.clear();
		text_Email.sendKeys(email);

	}

	public void enterPassword(String pwd) {
		text_Pass.clear();
		text_Pass.sendKeys(pwd);

	}

	public void clickCheckbox() {

		chk_rem.click();
	}

	public void clickLoginButton() {

		btn_Login.click();
	}

	public void clickLogout() {

		btn_Logout.click();
	}
	
	
	
	
	public void login(String email, String pwd) {
		enterEmail(email);
		enterPassword(pwd);
		clickCheckbox();
		clickLoginButton();
		
	}
	
	
	
	
	
	
	
	public void verifyApplicationTitle(String exptitle) throws Exception {

		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(), exptitle);
	}

}
