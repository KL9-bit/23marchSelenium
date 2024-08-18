package locator;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver =new ChromeDriver();

driver.get("https://www.facebook.com/signup");
driver.manage().window().maximize();

//Xpath by attribute 
driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("komal");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("lagade");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("komalclagadde@gmail.com");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("komalclagadde@gmail.com");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("498dfuhffij");

driver.findElement(By.xpath("//input[contains(@id,'u_0_4')]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//select[@id='day']")).sendKeys("9");
driver.findElement(By.xpath("//select[@id='month']")).sendKeys("June");
driver.findElement(By.xpath("//select[@id='year']")).sendKeys("1995");




	}

}
























//driver.findElement(By.xpath("//select[@aria-label='Day']")).sendKeys("9");
//driver.findElement(By.xpath("//select[@aria-label='Month')")).sendKeys("jun");
