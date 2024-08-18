 package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNullNotNull {
@Test
public void mathod() {
	String a="Pune";
//String b=null;
	
//Assert.assertNull(b, "Value is null,TC passed");
	//Assert.assertNull(a, "Value is not null,TC failed");
Assert.assertNotNull(a, "Value is not null,TC passed");
//Assert.assertNotNull(b, "Value is null,TC failed");

//Assert.fail();// we only use Assert.fail() method when we want to fail our test-case intentionally.

  }
}