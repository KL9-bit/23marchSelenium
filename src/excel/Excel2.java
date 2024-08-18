package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream myfile = new FileInputStream("C:\\Users\\Dell\\eclipse\\java-2024-03\\eclipse\\EXCEL\\test1.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("sheet2");
		
		//read complete one row
		for(int i=0;i<=2;i++) {
		String value = mysheet.getRow(0).getCell(i).getStringCellValue();
		
		System.out.print(value+" ");
		}
		System.out.println();
		System.out.println("==============================================");

		//read complete one colum 
		for(int i=0;i<=3;i++) {
		String value = mysheet.getRow(i).getCell(0).getStringCellValue();
		System.out.println("number of ehole column = "+value);}
		
	}

}
