package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {


	private static XSSFSheet ExcelWSheet;

	private static XSSFWorkbook ExcelWBook;

	private static XSSFCell Cell;

	private static XSSFRow Row;

	public static Object[][] getTableArray(String FilePath, String SheetName) throws Exception {   

		String[][] tabArray = null;


		FileInputStream ExcelFile = new FileInputStream(FilePath);

		// Access the required test data sheet

		ExcelWBook =new XSSFWorkbook(ExcelFile);

		ExcelWSheet = ExcelWBook.getSheet(SheetName);

		//Find number of rows in excel file


		int rowCount = ExcelWSheet.getLastRowNum()-ExcelWSheet.getFirstRowNum();
		tabArray=new String[rowCount][2];

		//Create a loop over all the rows of excel file to read it
		int ci,cj;
		ci=0;
		for (int i = 1; i < rowCount+1; i++,ci++) {

			XSSFRow row = ExcelWSheet.getRow(i);

			//Create a loop to print cell values in a row
			cj=0;
			for (int j = 0; j < row.getLastCellNum(); j++,cj++) {

				//Print Excel data in console
				tabArray[ci][cj]=row.getCell(j).getStringCellValue();


			}

			System.out.println();
		}

		return(tabArray);

	}

}

