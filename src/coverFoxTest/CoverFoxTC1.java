package coverFoxTest;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import coverFoxBase.Base;
import coverFoxPOM.CoverFoxAddressDetailsPage;
import coverFoxPOM.CoverFoxHealthPlanPage;
import coverFoxPOM.CoverFoxHomePage;
import coverFoxPOM.CoverFoxMemberDetailsPage;
import coverFoxPOM.CoverFoxResultPage;
import coverFoxUtility.Utility;

@Listeners(coverFoxUtility.Listener.class)
public class CoverFoxTC1 extends Base{
//WebDriver driver;// we can't have driver here because we have already take driver in Base class.
	CoverFoxHomePage homePage;
	CoverFoxHealthPlanPage healthPlanPage;
    CoverFoxAddressDetailsPage addressDetailsPage;
    CoverFoxMemberDetailsPage memberDetailsPage;
    CoverFoxResultPage resultPage;
	String filePath;
    
	@BeforeTest
	public void launchBrowser()
	{
		openBrowser();
		homePage= new CoverFoxHomePage(driver);
		healthPlanPage= new CoverFoxHealthPlanPage(driver);
		addressDetailsPage = new CoverFoxAddressDetailsPage(driver);
		memberDetailsPage = new CoverFoxMemberDetailsPage(driver);
		resultPage = new CoverFoxResultPage(driver);
		//filePath = "C:\\Users\\Dell\\eclipse\\java-2024-03\\eclipse\\EXCEL\\test1.xlsx";
		filePath= System.getProperty("user.dir")+"/tesing_selenium_project/fbTest.properties";
	}
	
	@BeforeClass
	public void preConditions() throws InterruptedException, EncryptedDocumentException, IOException
	{
   homePage.clickOnGenderButton();
   Thread.sleep(1000);
   healthPlanPage.clickOnNextButton();
   Thread.sleep(1000);
   // memberDetailsPage.handleAgeDropDown(Utility.ReadDataFromExcel(filePath, "Sheet5", 0, 0));
   memberDetailsPage.handleAgeDropDown(Utility.readDataFromPropertiesFile("age"));
   memberDetailsPage.clickOnNextButton();
   Thread.sleep(1000);
   //addressDetailsPage.enterPincode(Utility.ReadDataFromExcel(filePath, "Sheet5", 0, 1));	
   addressDetailsPage.enterPincode(Utility.readDataFromPropertiesFile("pinCode"));	
   // addressDetailsPage.EnterMoblieNumber(Utility.ReadDataFromExcel(filePath, "Sheet5", 0, 2));
      addressDetailsPage.EnterMoblieNumber(Utility.readDataFromPropertiesFile("mobNum"));
   addressDetailsPage.clickOncontinueButton();   
	}
	@Test
  public void validateBanners() throws InterruptedException 
	{   Assert.fail();
	  Thread.sleep(3000);	 
      int bannerPlanNumbers = resultPage.getPlanNumbersFromBanners();	
	  int StringPlanNumbers = resultPage.getPlanNumbersFromString();
			  		  
  Assert.assertEquals(StringPlanNumbers,bannerPlanNumbers,"Plans on banners not matching with results,tc failed " );  
   }
	@Test
	public void validatePresenceOfSortButton() throws InterruptedException, IOException
	{
     Assert.fail();
	Thread.sleep(3000);
	Assert.assertTrue(resultPage.sortPlanFilterIsDisplayed(), "Sort Plan filter is not displayed,TC is failed");

	//Utility.takeScreenShot(driver, "validatePresenceOfSortButton");//can't have this code line because we have already use "Listener"
	}
	
@AfterClass
 public void closeBrowser() throws InterruptedException
    {
      browserClose();
    }
}