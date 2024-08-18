package coverFoxUsingPOMAndExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxHomePage {
	
    //step1-->webElement-->Data Members(D.M.)/variables=>we take web element as D.M./variables
	//how to get data member / web element.
	@FindBy(xpath = "//div[text()='Male']") private WebElement maleButton;
	
	//step2-->constructor-->we use constructor for analyse those D.M./variables .
	public CoverFoxHomePage(WebDriver driver) 
	{
	PageFactory.initElements(driver, this);	
		
	}
	
	//step3-->methods-->we use methods for do actions on those D.M./variables
	public void clickOnGenderButton()
	{
		maleButton.click();
		
	}
	



}
