package testNGExample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTestExample_DependsOnGroup {
	
	
	@Test(groups = "smokeTest")
	public void login() {
		
		System.out.println("login test case");
	}
	
	@Test(groups = "smokeTest")
	public void logout() {
		
		System.out.println("logout test case");
	}
	
	@Test(groups = "sanityTest")
	public void addItems() {
		
		System.out.println("addItems test case");
		Assert.assertTrue(false);   //failed
		
	}
	
	
	@Test(groups = "sanityTest")
	public void cancelOrder() {
		
		System.out.println("cancelOrder test case");
	}
	
	
	@Test(groups = "sanityTest")
	public void updateOrder() {
		
		System.out.println("updateOrder test case");
	}
	
	@Test(groups = "smokeTest", dependsOnGroups = "sanityTest")
	public void payment() {
		
		System.out.println("payment test case");
	}

}
