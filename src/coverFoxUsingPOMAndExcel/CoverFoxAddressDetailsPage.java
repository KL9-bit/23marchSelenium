package coverFoxUsingPOMAndExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxAddressDetailsPage {
	//step1-->WebElement=Date Member
	@FindBy(className = "mp-input-text") private WebElement pinCodeField;
	
	@FindBy(id = "want-expert") private WebElement moblieNumberField;
	
	@FindBy(className = "next-btn")private WebElement continueButton;
	
	//step2-->Constructor
    public CoverFoxAddressDetailsPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    	
    }

//step3-->Method
       
    public void EnterPincode(String pincodeValue) 
    {
    	pinCodeField.sendKeys(pincodeValue);
    }
    
    public void EnterMoblieNumber(String moblieNumber)
    {
    	moblieNumberField.sendKeys(moblieNumber);
    }
    
    public void clickOncontinueButton()
    {
     	continueButton.click();
    }
    
	
}