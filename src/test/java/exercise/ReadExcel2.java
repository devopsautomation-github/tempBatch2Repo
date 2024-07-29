package exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel2 {

	public static void main(String[] args) throws Exception {
		
		
		FileInputStream fis = new FileInputStream("./testData\\RegisterStudent.xls");
		
		
		HSSFWorkbook workbook = new HSSFWorkbook(fis);
		
		
		//index ---- start from 0
		HSSFSheet sheet = workbook.getSheetAt(0);
		
		//SheetName
//		HSSFSheet sheet = workbook.getSheet("smokeTest");
		
		int rowCount = sheet.getLastRowNum();
		int columnsCount = sheet.getRow(0).getLastCellNum();
		
				
		
		System.out.println("Row Count are: " + rowCount);
		System.out.println("columns Count are: " + columnsCount);

		
		System.out.println("=====================loop started============================");
		System.out.println("=============================================================");
		
		for (int i = 1; i <= rowCount; i++) {
			
			
			String fName = sheet.getRow(i).getCell(0).toString();
			String address = sheet.getRow(i).getCell(4).toString();
			
			
			System.out.println("Firstname and Address: " + fName + " : " + address);
			System.out.println("=================================================");
			
			
		}
				
		
	}

}
