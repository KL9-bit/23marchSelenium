package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class AllTableWithAallDatatypes {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
		
		FileInputStream myfile = new FileInputStream("C:\\Users\\Dell\\eclipse\\java-2024-03\\eclipse\\EXCEL\\test1.xlsx");
		
		Sheet mysheet3 = WorkbookFactory.create(myfile).getSheet("Sheet3");
		
	int mylastrowNum = mysheet3.getLastRowNum();
	System.out.println(mylastrowNum);
	int totalnNmberOfRows = mylastrowNum;
	short lastcellnum = mysheet3.getRow(0).getLastCellNum();
		System.out.println(lastcellnum);
		int totalNumberOfCells = lastcellnum-1;
		//outer for loop for 
		for(int i=0;i<=totalnNmberOfRows;i++) {
			for(int j=0;j<=totalNumberOfCells;j++)
			{
				Cell mycell = mysheet3.getRow(i).getCell(j);
				CellType myCellDatatype = mycell.getCellType();
				if(myCellDatatype==CellType.NUMERIC) {
					System.out.print(mycell.getNumericCellValue()+"    ");
				}else if(myCellDatatype==CellType.STRING) {
					System.out.print(mycell.getStringCellValue()+"    ");
				}else if(myCellDatatype==CellType.BOOLEAN) {
							System.out.print(mycell.getBooleanCellValue()+"    ");
				}
				
			}
			System.out.println();
		}
		
	}
}