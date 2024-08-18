package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrueFalse {
@Test
public void mathod() {
    //boolean a=true;
	boolean b=false;
	
	//Assert.assertTrue(b, "Value of b is false,TC failed");
	//Assert.assertTrue(a, "Value of a is true,TC passed");
	//Assert.assertFalse(a, "value of a is true,TC failed ");
	Assert.assertFalse(b, "value of b is false,TC passed ");
	
}
}