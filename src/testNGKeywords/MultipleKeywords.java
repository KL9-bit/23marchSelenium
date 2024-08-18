package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MultipleKeywords {
	@Test//(dependsOnMethods = {"b"}, priority= -4)
	public void a()
	{
		Reporter.log("A is running",true);		
	}

	@Test(invocationCount = 2, priority = -3)
	public void b()
	{
		Reporter.log("B is running",true);		
	}
	
	
	@Test//(enabled = false,invocationCount = 3)
	public void c()
	{
		Reporter.log("C is running",true);		
	}
	
}
