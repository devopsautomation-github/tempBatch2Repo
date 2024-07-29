package testNGExample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTestExample_DependsOnMethod {
	
	
	@Test
	public void login() {
		
		System.out.println("login test case");
	}
	
	@Test
	public void logout() {
		
		System.out.println("logout test case");
	}
	
	@Test
	public void addItems() {
		
		System.out.println("addItems test case");
		Assert.assertTrue(false);   //failed
		
	}
	
	
	@Test(dependsOnMethods = "addItems")
	public void cancelOrder() {
		
		System.out.println("cancelOrder test case");
	}
	
	
	@Test(dependsOnMethods = "addItems")
	public void updateOrder() {
		
		System.out.println("updateOrder test case");
	}
	
	@Test
	public void payment() {
		
		System.out.println("payment test case");
	}

}
