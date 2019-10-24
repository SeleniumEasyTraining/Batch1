package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("The Next test cases are from regression suite");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("Regression Test cases completed");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After class");
	}
	
	@BeforeMethod
	public void beforeEachTestcase() {
		
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void afterEachTestCase() {
	
		System.out.println("After Method");
	}
	
	@Test(priority=1)
	public void verifyLoginPage() {
		
		System.out.println("This is the testcase of Login Page");
		
	}
	
	@Test(priority=2)
	public void verifyHomePage() {
		
		System.out.println("This is the testcase of Signin Page");
		
	}
	
	@Test(priority=0)
	public void verifySignIn() {
		
		System.out.println("This is the testcase for Signin");
		
	}
	
}
