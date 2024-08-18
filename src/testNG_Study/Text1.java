package testNG_Study;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Text1 {
  @Test
  public void f() {
	  System.out.println("hi good moring");
	  Reporter.log("this is reporter");
	  Reporter.log("this is new reportor",true);
  }
  
  @BeforeMethod
  public void f1() {
	  
	  Reporter.log("my name is komal",true);
  }
  
  
  @AfterMethod
  public void f2() {
	  Reporter.log("this is what we do",true);
	  
  }
}
