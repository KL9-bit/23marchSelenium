package verificationUsingTestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertStudy {
		
	@Test
	public void Mytest() {
		String s="Pune";
		String t="Mumbai";

		SoftAssert soft = new SoftAssert();
	soft.assertEquals(s,t,"s and t are not equals,TC is failed");
	soft.assertNotNull(t, "t is not Null, TC is passed");
		//soft.assertNull(t, "t is not Null, TC is failed");
//Without writing "soft.assertAll()" method we can't send msg to TestNG because of that it will run our test-case as a passed even though test-case is failed. 
		
	soft.assertAll();

	}

	@Test
	public void Mytest1() {
		
		boolean a=true;
	SoftAssert soft = new SoftAssert();
	//soft.assertFalse(a, "A is false,TC failed");
	soft.assertTrue(a, "A is true,TC passed");
	soft.assertAll();
	
	}	
}