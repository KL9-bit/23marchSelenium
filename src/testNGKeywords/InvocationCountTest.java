package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCountTest {
//we can't give value of invocationCount as zero or shouldn't be negative invocationCount because it will give as exception called "no found tests.Nothing was run ".
//and this exception its called as configuration mistake.	
	@Test(invocationCount = 3)
	public void mytest()
	{
		Reporter.log("my test is running",true);
	}

}
