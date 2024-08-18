package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel3 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream myfile = new FileInputStream("C:\\Users\\Dell\\eclipse\\java-2024-03\\eclipse\\EXCEL\\test1.xlsx");
		
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		// row-->0-5, cell-->0-2
		// outer for loop-->row
		for(int i=0;i<=4;i++) {
			//inner for loop --->column
			for(int j=0;j<=4;j++) {
				
				double table = mysheet.getRow(i).getCell(j).getNumericCellValue();
				System.out.print(table+"      ");
			}
			System.out.println();
		}
		
		
	}
}
