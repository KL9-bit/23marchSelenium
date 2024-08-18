package coverFoxUsingPOMAndExcel;


import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import CommonMethod.Utility;

public class CoverFoxTC {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {

        ChromeOptions opt= new ChromeOptions();
        opt.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.coverfox.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		String filepath = "C:\\Users\\Dell\\eclipse\\java-2024-03\\eclipse\\EXCEL\\test1.xlsx";
		
		String age = Utility.readDataFromExcel(filepath, "Sheet4", 1, 0);
		String pinCode = Utility.readDataFromExcel(filepath, "Sheet4", 1, 1);
		String moblieNumber = Utility.readDataFromExcel(filepath, "Sheet4", 1, 2);
		
		//create object of homePage
		CoverFoxHomePage home= new 	CoverFoxHomePage(driver);	
		home.clickOnGenderButton();
		
		//create object of healthPlanPage
		CoverFoxHealthPlanPage healthPlanPage=new CoverFoxHealthPlanPage(driver);
		healthPlanPage.clickOnNextButton();
		
		//create object of MemberDetailsPage
		CoverFoxMemberDetailsPage  MemberDetailsPage=new CoverFoxMemberDetailsPage(driver);
	
		MemberDetailsPage.handleAgeDropDown(age);
		MemberDetailsPage.clickOnNextButton();
		
		//create object of MemberDetailsPage
		CoverFoxAddressDetailsPage addressDetails= new CoverFoxAddressDetailsPage(driver);
		addressDetails.EnterPincode(pinCode);
		addressDetails.EnterMoblieNumber(moblieNumber);
		addressDetails.clickOncontinueButton();
		
		////create object of CoverFoxResultPage
		Thread.sleep(4000);
		CoverFoxResultPage resultPage=new CoverFoxResultPage(driver);
		resultPage.validateBanners();
		
		Thread.sleep(1000);
		driver.close();
	}

}
