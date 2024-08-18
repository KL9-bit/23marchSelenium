package coverFoxUsingPOM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxResultPage {
	@FindBy(xpath = "//div[contains(text(),'Health Insurance Plans')]") private WebElement resultlText;
	
	@FindBy(className = "plan-card-container") private List<WebElement> banners;	
	
	public CoverFoxResultPage (WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void validateBanners() 
	{
		String[] ar = resultlText.getText().split(" ");
		int result = Integer.parseInt(ar[0]);
		
		if(result==banners.size())
		{
			System.out.println("Result is mathing with banners, TC is passed");
		}else {
			System.out.println("Result is not mathing with banners, TC is failed");
		}
		
	}
	
	
	
	
	
	

}
