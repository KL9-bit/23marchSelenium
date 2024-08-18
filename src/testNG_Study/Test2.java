package testNG_Study;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test2 {
  @Test
  public void f6() {
	  Reporter.log("my name is komal lagade",true);  
  }
  
  @Test
  public void f5() {
	 Reporter.log("this is test method/test case",true);
  }
  
  @BeforeMethod
  public void f4() {
	  
	  Reporter.log("my name is komal",true);
  }
  @Test
  public void f0() {
	  Reporter.log("my name is komal c. lagade",true);  
  }
  
  @AfterMethod
  public void f3() {
	  Reporter.log("this is what we do",true);
	  
  }
  
  
}
