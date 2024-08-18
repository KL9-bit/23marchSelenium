package dataProviders;
import org.testng.annotations.*;
public class DataProviderTest {
	
	@DataProvider(name = "teacher")
public String[][] myData() 
	{
		String data[][]= {{"komal","lagade","9876540321"},
				{"ketaki","lagade","9806758343"},
				{"vedika","Sawant","8679054321"}};
		
		return data;			
	}
	@DataProvider(name="student")
public String[][] myData1() 
	{
		String data[][]= {{"puja","lagade","8888540321"},
				{"khushi","lagade","9996758343"},
				{"kritika","Sawant","8487554321"}};
		
		return data;			
	}
//take it as example
//	public int sum()
//	{
//		int a=10;
//		int b=20;
//		int sum=a+b;
//		return sum;	
//	}
//	it will give sum as return.	
}
