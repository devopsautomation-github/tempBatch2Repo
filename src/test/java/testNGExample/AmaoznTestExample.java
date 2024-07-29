package testNGExample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AmaoznTestExample {
	
	
	@Test
	public void verifySearchFeature() {
		
		
		System.out.println("verifySearchFeature execution started.....");
	}

	
	@Test
	public void verifyPaymentFeature() {
		
		
		System.out.println("verifyPaymentFeature execution started.....");
		Assert.assertTrue(false);
	}
}
