package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEqualsNotEquals {
@Test
public void mathod() {
	String s="Pune";
	String t="mumbai";
	String u="Pune";
	
	Assert.assertEquals(s,t,"value of s and t is not matching ,TC is failed");
	Assert.assertNotEquals(u, t,"Value of u and t is not matching,TC is passed");
	//Assert.assertNotEquals(u, s,"Value of u and t is matching,TC is failed");
}
}