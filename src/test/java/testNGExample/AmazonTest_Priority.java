package testNGExample;

import org.testng.annotations.Test;

public class AmazonTest_Priority {
	
	// login  ------ addItem  ---- cancelOrder ---payment ----logout
	//   -100   -----  0      ----     1       --- 1 -----    2
	//priority
	
	//highest negative number having highest priority 
	//by default priority : 0 
	//if priority is same, execution as per naming conv
	
	
	
	@Test(priority = -100, description = "UserStory: Amazon Application Login feature")
	public void login() {
		
		System.out.println("verifyLogin test case execution started.....");
	}
	
	@Test(priority = 1)
	public void payment() {
		
		System.out.println("verifypayment test case execution started.....");
	}
	
	
	@Test
	public void addItems() {
		
		System.out.println("verifaddItems test case execution started.....");
	}
	
	@Test(priority = 1)
	public void cancelOrder() {
		
		System.out.println("cancelOrder test case execution started.....");
	}
	
	@Test(priority = 2)
	public void logout() {
		
		System.out.println("verifyLogout test case execution started.....");
	}

}
