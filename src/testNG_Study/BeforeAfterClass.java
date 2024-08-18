package testNG_Study;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterClass {
 @BeforeClass
 public void beforeclass() {
	 Reporter.log("beforeclass is running",true);
 }
	
	@Test
  public void f() {
	  Reporter.log("test case running",true);
  }
	@Test
	  public void f1() {
		  Reporter.log("test case1 running",true);
	  }
	@AfterClass
	 public void afterclass() {
		 Reporter.log("afterclass is running",true);
	 }
	@BeforeMethod
	public void f3() {
		Reporter.log("this beforemethod is running ",true);
	}
		
	@AfterMethod
	 public void afterm() {
		 Reporter.log("aftermethod is running",true);
	 }
}
