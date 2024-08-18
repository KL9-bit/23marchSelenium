package listenerStudy;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener{
	
@Override
public void onTestStart(ITestResult result)
  {
	
	Reporter.log("TC "+result.getName()+" execution started",true);
  }
@Override
	public void onTestSuccess(ITestResult result) {

Reporter.log("TC "+result.getName()+" completed Successfully",true);;
	}

@Override
	public void onTestFailure(ITestResult result) {

Reporter.log("TC " +result.getName()+" is failed",true);
	}	

@Override
	public void onTestSkipped(ITestResult result) {

Reporter.log("TC "+result.getName()+" is skipped",true);
	}
	
	
	
}
