package reference;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.ExcelReader;

public class TestNGDataProvider {

	@DataProvider(name="data")
	public Object[][] returnData(){

		Object[][] objArr = new Object[2][2];

		objArr[0][0] = 1;

		objArr[0][1] = "Pratheep";

		objArr[1][0] = 2;

		objArr[1][1] = "MK";

		return objArr;
		
		//return new Object[][] {{1,"Pratheep"}};
	}
	
	@DataProvider(name="fromExcel")
	public Object[][] fromExcelData() throws Exception{

		return ExcelReader.getTableArray("./testdata/data.xlsx", "Sheet1");
		
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod");
	}

	@Test(dataProvider = "data")
	public void printTest(int num,String name) {

		Reporter.log("Testcase 1 started");
		System.out.println("Number is "+num+" Name is "+name);
		Reporter.log("Testcase 1 ended");
		
	}
	
	@Test(dataProvider = "fromExcel")
	public void printTest(String username,String password) {

		Reporter.log("Testcase 2 started");
		System.out.println("Username is "+username+" Password is "+password);
		Reporter.log("Testcase 2 ended");
		
	}


}
