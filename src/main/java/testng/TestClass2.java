package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass2 {

	@BeforeTest
	public void beforeTest() {
		System.out.println("This before test is from Testclass2");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("This after test is from Testclass2");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("This before class is from Testclass2");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("This after class is from Testclass2");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This before Method is from Testclass2");
	}
	
	@AfterMethod
	public void aftereMethod() {
		System.out.println("This after Method is from Testclass2");
	}
	
	@Test
	public void testcase1() {
		System.out.println("This testcase 1 is from TestClass 2");
	}
	
	@Test
	public void testcase2() {
		System.out.println("This testcase 2 is from TestClass 2");
	}
	
}
