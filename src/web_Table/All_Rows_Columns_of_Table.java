package web_Table;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_Rows_Columns_of_Table {
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		//row 
		int allr = driver.findElements(By.xpath("//table[@name='courses']//tr")).size();
		System.out.println(allr);
		
		//columns
		int allc = driver.findElements(By.xpath("//table[@name='courses']//tr[1]//th")).size();
		System.out.println(allc);
		//total table rows and columns.
		//outer for-loop for row
		for(int i=1;i<=allr;i++) 
		{
			//inner for-loop for columns
			for(int j=1;j<=allc;j++)
		    	if(i==1){
			String allrc = driver.findElement(By.xpath("//table[@name='courses']//tr["+i+"]//th["+j+"]")).getText();
		System.out.print(allrc+"  ");
		    	}else
		{
		    		String allrc = driver.findElement(By.xpath("//table[@name='courses']//tr["+i+"]//td["+j+"]")).getText();
		    		System.out.print(allrc+"  ");			
		}
		System.out.println();
		}
		
	}

}
