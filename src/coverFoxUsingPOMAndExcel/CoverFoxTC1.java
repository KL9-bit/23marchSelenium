package coverFoxUsingPOMAndExcel;


import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import coverFoxBase.Base;
import coverFoxUtility.Utility;

public class CoverFoxTC1 extends Base{

	WebDriver driver;
	CoverFoxHomePage homePage;
	CoverFoxHealthPlanPage healthPlanPage;
    CoverFoxAddressDetailsPage addressDetailsPage;
    CoverFoxMemberDetailsPage memberDetailsPage;
    CoverFoxResultPage resultPage;
	String filePath;
    
	@BeforeTest
	public void launchBrowser()
	{
		ChromeOptions opt= new ChromeOptions();
        opt.addArguments("--disable-notifications");
    	driver= new ChromeDriver(opt);
	    driver.manage().window().maximize();
    	driver.get("https://www.coverfox.com/");
    	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		homePage= new CoverFoxHomePage(driver);
		healthPlanPage= new CoverFoxHealthPlanPage(driver);
		addressDetailsPage = new CoverFoxAddressDetailsPage(driver);
		memberDetailsPage = new CoverFoxMemberDetailsPage(driver);
		resultPage = new CoverFoxResultPage(driver);
		filePath = System.getProperty("user.dir")+"\\test1.xlsx";
	
	}
	
	@BeforeClass
	public void preConditions() throws InterruptedException, EncryptedDocumentException, IOException
	{
   homePage.clickOnGenderButton();
   Thread.sleep(1000);
   healthPlanPage.clickOnNextButton();
   Thread.sleep(1000);
   memberDetailsPage.handleAgeDropDown(Utility.ReadDataFromExcel(filePath, "Sheet4", 0, 0));
   //memberDetailsPage.handleAgeDropDown(Utility.readDataFromPropertiesFile("age"));
   memberDetailsPage.clickOnNextButton();
   Thread.sleep(1000);
   addressDetailsPage.EnterPincode(Utility.ReadDataFromExcel(filePath, "Sheet4", 0, 1));	
   //addressDetailsPage.EnterPincode(Utility.readDataFromPropertiesFile("pinCode"));
   Thread.sleep(1000);
   addressDetailsPage.EnterMoblieNumber(Utility.ReadDataFromExcel(filePath, "Sheet4", 0, 2));
   //addressDetailsPage.EnterMoblieNumber(Utility.readDataFromPropertiesFile("mobNum"));
   Thread.sleep(1000);
   addressDetailsPage.clickOncontinueButton();
   
	}
		
	
	@Test
  public void validateBanners() throws InterruptedException 
	{
	  Thread.sleep(4000);	 
      int bannerPlanNumbers = resultPage.getPlanNumbersFromBanners();	
	  int StringplanNumbers = resultPage.getPlanNumbersFromString();
			  		  
  Assert.assertEquals(StringplanNumbers,bannerPlanNumbers,
		  "Plans on banners not matching with results,tc failed " );  
   }
	
@AfterClass
 public void closeBrowser()
    {
      driver.close();
    }

}
