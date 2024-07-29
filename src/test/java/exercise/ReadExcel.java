package exercise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception {
		
		
		File file = new File("./testData\\\\RegistrationData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		
		//FileInputStream fis = new FileInputStream("./testData\\RegistrationData.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		
		//index ---- start from 0
//		XSSFSheet sheet = workbook.getSheetAt(0);
		
		//SheetName
		XSSFSheet sheet = workbook.getSheet("smokeTest");
		
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
