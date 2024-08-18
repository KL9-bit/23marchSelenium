package dataProviders;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class UtilityDP {	
	
@DataProvider(name="cricketplayers")
public String[][] myData() throws EncryptedDocumentException, IOException {
	String testData[][]=readDataFromExcel("test1", "Sheet4");
	return testData;
}	
public static String [][] readDataFromExcel(String excelfilename, String sheetname ) throws EncryptedDocumentException, IOException 
	{//here "user.dir" mean user directory---user means us and directory means current folders path.
		String path = System.getProperty("user.dir")+"\\"+excelfilename+".xlsx";
		System.out.println(path);
	FileInputStream myfile=new FileInputStream(path);
	Sheet mysheet = WorkbookFactory.create(myfile).getSheet(sheetname);
	int rowcount = mysheet.getLastRowNum();
	int cellcount = mysheet.getRow(0).getLastCellNum()-1;
		System.out.println("total row count = "+rowcount);
		System.out.println("total cell count = " +cellcount);  
		String data[][]=new String[rowcount+1][cellcount+1];
		for(int i=0;i<=rowcount;i++) {
			for(int j=0;j<=cellcount;j++) {
				String value = mysheet.getRow(i).getCell(j).getStringCellValue();
				data[i][j]=value;
			}
		}
		return data;
	}	

public static String readDataFromPropertiesFile(String key) throws IOException
    {
	
           FileInputStream myfile=new FileInputStream(System.getProperty("user.dir")+"\\fbTest.properties");
           Properties prop= new Properties();
           prop.load(myfile);

            String value = prop.getProperty(key);
            return value;
     }

}

