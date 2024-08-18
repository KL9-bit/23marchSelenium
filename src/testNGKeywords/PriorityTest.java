package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityTest {
	//negative priority will always execute first. by default priority value is zero. 
	@Test(priority = -4)
	public void d()
	{
		Reporter.log("D is running",true);
	}

	@Test(priority = 1)
	public void a()
	{
		Reporter.log("A is running",true);
	}
	
	@Test(priority = -2)
	public void c()
	{
		Reporter.log("C is running",true);
	}
	
	@Test(priority = -1)
	public void b()
	{
		Reporter.log("B is running",true);
	}
	
	
	
	
}
