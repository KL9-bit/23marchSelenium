package web_Table;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {
public static void main(String[]args)
{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	
	//how to count rows of table?
	List<WebElement> row = driver.findElements(By.xpath("//table[@name='courses']//tr"));
	int totalcountofrows= row.size();
	System.out.println("total count of rows = "+totalcountofrows);
	System.out.println("=================================================================");
	//how to count columns of table?
	List<WebElement> columns = driver.findElements(By.xpath("//table[@name='courses']//tr//th"));
	int totalcountofcolumns = columns.size();
	System.out.println("total count of columns = "+totalcountofcolumns);
	System.out.println("=================================================================");
	//how to read particular data from table?
	WebElement getdata = driver.findElement(By.xpath("//table[@name='courses']//tr[3]//td[2]"));
	String readdata = getdata.getText();

	System.out.println("particular data from table = "+readdata);
	System.out.println("=================================================================");
	
	//how to read particular row from table
	//table[@name='courses']//tr[5]/td[1]
	//table[@name='courses']//tr[5]/td[2]
	//table[@name='courses']//tr[5]/td[3]
	
	for(int i=1;i<=3;i++) {
		WebElement element = driver.findElement(By.xpath("//table[@name='courses']//tr[5]//td["+i+"]"));
      String text = element.getText();
      System.out.println("particular data from row of table = "+text);
      	}
	System.out.println("=================================================================");
	for(int j=1;j<=3;j++)
	{
		WebElement element1 = driver.findElement(By.xpath("//table[@name='courses']//tr[9]//td["+j+"]"));
		String text1 = element1.getText();
		System.out.println("particular data from row of table ="+text1);
		
	}
	System.out.println("=================================================================");
	
	for(int i=2;i<=totalcountofrows;i++)
	{
		WebElement elementss = driver.findElement(By.xpath("//table[@name='courses']/tbody/tr["+i+"]/th[3]"));
		String text = elementss.getText();
				System.out.println(text);
	}	
	
 }
}
