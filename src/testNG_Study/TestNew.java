package testNG_Study;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNew {
  @Test
  public void f() {
	  Reporter.log("Test Method is running",true);
  }
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("before Method is running",true);
  }

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("after Method is running",true);
  }

  @BeforeClass
  public void beforeClass() {
	  Reporter.log("before class is running",true);
  }

  @AfterClass
  public void afterClass() {
	  Reporter.log("after class is running",true);
  }

  @BeforeTest
  public void beforeTest() {
	  Reporter.log("before test is running",true);
  }

  @AfterTest
  public void afterTest() {
	  Reporter.log("after test is running",true);
  }

  @BeforeSuite
  public void beforeSuite() {
	  Reporter.log("before suite is running",true);
  }

  @AfterSuite
  public void afterSuite() {
	  Reporter.log("after suite is running",true);
  }

}
