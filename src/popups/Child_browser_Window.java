package popups;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_browser_Window {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://secure.indeed.com/auth");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[contains(text(),'Google')]")).click();
	Thread.sleep(3000);
     String WindowIdmainpage = driver.getWindowHandle();
     System.out.println(WindowIdmainpage);
     Set<String> AllWindowIDpage = driver.getWindowHandles();
     System.out.println(AllWindowIDpage);
	
     ArrayList<String> al=new ArrayList<String>(AllWindowIDpage);
     
 Iterator<String> al1 = al.iterator();
     String MPI = al1.next();
     String CPI = al1.next();
     driver.switchTo().window(CPI);
     
   //  String MainpageId = al.get(0);
    //String childpageId = al.get(1);
 // driver.switchTo().window(childpageId);
    driver.manage().window().maximize();
    driver.findElement(By.id("identifierId")).sendKeys("komalalgadea@gmail.com");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//span[text()='Next']")).click();
	Thread.sleep(3000);
	//driver.switchTo().window(MainpageId);
	driver.switchTo().window(MPI);
    Thread.sleep(3000);
 
	
		
	}

}
