package testNGExample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotationExample {
	
	//pre-condition  --- BeforeSuite   -----BeforeTest   ----- BeforeClass  ---- BeforeMethod
	//test	         ----  Test
	//post-condition --- AfterSuite    -----AfterTest    ----- AfterClass   ---- AfterMethod
	
	@BeforeSuite
	public void BeforeSuite() {
		
		System.out.println("*****************BeforeSuite******************");
	}
	
	
	@AfterSuite
	public void AfterSuite() {
		
		System.out.println("******************AfterSuite******************");
	}
	
	
	@BeforeMethod
	public void BeforeMethod() {
		
		System.out.println("********************before executing any Method********************************");
	}
	
	
	@AfterMethod
	public void AfterMethod() {
		
		System.out.println("********************after executing any Method********************************");
	}
	
	@BeforeClass
	public void BeforeClass() {
		
		System.out.println("=============BeforeClass====================");
	}
	
	
	@AfterClass
	public void AfterClass() {
		
		System.out.println("=============AfterClass====================");
	}
	
	
	@BeforeTest
	public void BeforeTest() {
		
		System.out.println("=============BeforeTest====================");
	}
	
	
	@AfterTest
	public void AfterTest() {
		
		System.out.println("=============AfterTest====================");
	}
	
	@Test
	public void verifyLogin() {
		
		System.out.println("verifyLogin test case execution started.....");
	}
	
	@Test
	public void verifypayment() {
		
		System.out.println("verifypayment test case execution started.....");
	}
	
	@Test
	public void verifyLogout() {
		
		System.out.println("verifyLogout test case execution started.....");
	}

}
