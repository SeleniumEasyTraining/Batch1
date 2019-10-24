package reference;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestNGAnnotations2 {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite from TestNGAnnotations2 class");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test from TestNGAnnotations2 class");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class from TestNGAnnotations2 class");	
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method from TestNGAnnotations2 class");
	}
	
	@Test(enabled=false)
	public void testCase1() {
		System.out.println("Test Case 1 from TestNGAnnotations2 class");
	}
	
	@Test
	public void testCase2() {
		System.out.println("Test Case 2 from TestNGAnnotations2 class");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method from TestNGAnnotations2 class");	
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class from TestNGAnnotations2 class");	
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test from TestNGAnnotations2 class");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite from TestNGAnnotations2 class");
	}
	
}
