package coverFoxUsingPOM;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CoverFoxTC {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.coverfox.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		//create object of homePage
		CoverFoxHomePage home= new 	CoverFoxHomePage(driver);	
		home.clickOnGenderButton();
		
		//create object of healthPlanPage
		CoverFoxHealthPlanPage healthPlanPage=new CoverFoxHealthPlanPage(driver);
		healthPlanPage.clickOnNextButton();
		
		//create object of MemberDetailsPage
		CoverFoxMemberDetailsPage  MemberDetailsPage=new CoverFoxMemberDetailsPage(driver);
		MemberDetailsPage.handleAgeDropDown();
		MemberDetailsPage.clickOnNextButton();
		
		//create object of MemberDetailsPage
		CoverFoxAddressDetailsPage addressDetails= new CoverFoxAddressDetailsPage(driver);
		addressDetails.EnterPincode();
		addressDetails.EnterMoblieNumber();
		addressDetails.clickOncontinueButton();
		
		////create object of CoverFoxResultPage
		Thread.sleep(4000);
		CoverFoxResultPage resultPage=new CoverFoxResultPage(driver);
		resultPage.validateBanners();
		
		Thread.sleep(1000);
		driver.close();
	}

}
