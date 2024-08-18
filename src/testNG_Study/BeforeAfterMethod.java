package testNG_Study;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethod {
 @BeforeMethod
 public void beforemethod() {
	 Reporter.log("this is before method is running",true);
 }
	
	@Test
  public void f() {
	  Reporter.log("this is (main method) test-methhod/test-case running",true);
  }
	
	@AfterMethod
	public void aftermethod() {
		Reporter.log("this is aftermethod is running",true);
	}
	
}
