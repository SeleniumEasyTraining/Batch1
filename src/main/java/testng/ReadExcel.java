package testng;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	
	//xlx - HSSF
	//xlsx - XSSF
	
	public static Object[][] getExcelData(String filePath,String sheetName) throws Exception{
		
		
		FileInputStream excelFile =new FileInputStream(filePath);
		
		XSSFWorkbook workBook = new XSSFWorkbook(excelFile);
		
		XSSFSheet sheet = workBook.getSheet(sheetName);
		
		int lastRow = sheet.getLastRowNum();
		
		System.out.println("LastRow - :"+lastRow);
		
		int firstRow = sheet.getFirstRowNum();
		
		System.out.println("FirsRow - :"+firstRow);
		
		int rowCount = lastRow - firstRow;
		
		Object[][] objArr = new Object[rowCount][3];
		
		System.out.println("Total Row :"+rowCount);
		
		int ci,cj;
		
		ci=0;
		for(int i = 1;i<=rowCount;i++,ci++) {
			
			XSSFRow row = sheet.getRow(i);
			cj=0;
			for(int j = 0;j<row.getLastCellNum();j++,cj++) {
				
				objArr[ci][cj]=row.getCell(j).getStringCellValue();
			}
			
		}
		return objArr;
		
		
	}
	
}
