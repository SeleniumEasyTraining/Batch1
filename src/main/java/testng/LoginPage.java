package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class LoginPage {

	WebDriver driver;
	
	@BeforeMethod(alwaysRun=true)
	@Parameters({"browserName","baseURL"})
	public void beforeMethod(String browser,String baseurl) {

		if(browser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

			driver = new ChromeDriver(); 
			
		}else if(browser.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");

			driver = new FirefoxDriver(); 
		}
		
		System.out.println("Browser Launched");

		driver.get(baseurl);
	}


	@Test(groups = {"P2"},dependsOnMethods = { "verifySignin_Link_Is_Present" })
	public void verifyLogo() {

		WebDriverWait wait = new WebDriverWait(driver, 15);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"header_logo\"]/a")));

		WebElement logo = driver.findElement(By.xpath("//*[@id=\"header_logo\"]/a"));

		if(logo.isDisplayed()) {

			System.out.println("Logo is present in Login Page");
		}else {
			System.out.println("Logo is not present in Login Page");
		}
	}

	@Test(groups = {"P1","contactUS"})
	public void verifyContactUs_Link_Is_Present() {

		WebDriverWait wait = new WebDriverWait(driver, 15);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"contact-link\"]/a")));

		WebElement contact_Us_Link = driver.findElement(By.xpath("//*[@id=\"contact-link\"]/a"));
		
		String actualText = contact_Us_Link.getText();
		
		String expectedText = "Contact us";
		
		Assert.assertEquals(actualText, expectedText);
		
		Assert.assertTrue(contact_Us_Link.isDisplayed());
		
		Assert.assertFalse(contact_Us_Link.isDisplayed(),"We dont want contact us links to be displayed . But here its displayed");

	}

	@Test(groups = {"P1","SignIn"})
	public void verifySignin_Link_Is_Present() {

		WebDriverWait wait = new WebDriverWait(driver, 15);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")));

		WebElement SignIn_Link = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));

		if(SignIn_Link.isDisplayed()) {

			System.out.println("Sign In Link is present in Login Page");
		}else {
			System.out.println("Sign In Link is not present in Login Page");
		}

	}
	
	@Test(dataProvider="excelData")
	public void login(String username,String password,String manager) {
		
		
		System.out.println("Username : "+username);
		
		System.out.println("Password : "+password);
		
		System.out.println("Manager :"+manager);
		
		/*WebDriverWait wait = new WebDriverWait(driver, 15);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")));

		WebElement SignIn_Link = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
		
		SignIn_Link.click();
		
		driver.findElement(By.name("email")).sendKeys(username);
		
		driver.findElement(By.name("passwd")).sendKeys(password);
		
		driver.findElement(By.name("SubmitLogin")).click();*/
		
	}

	@AfterMethod(alwaysRun=true)
	public void afterMethod() {

		driver.quit();

		System.out.println("Browser closed");

	}
	
	@DataProvider(name="testdata")
	public Object[][] returnData(){
		
		Object[][] objArr = new Object[2][3];
		
		objArr[0][0] = "pratheep@gmail.com";
		objArr[0][1] = "password";
		objArr[1][0] = "srini@gmail.com";
		objArr[1][1] = "password";
		
		
		return objArr;
	}
	
	@DataProvider(name="excelData")
	public Object[][] getTestData() throws Exception{
		
		return ReadExcel.getExcelData("./testdata/data.xlsx", "Sheet1");
	}
	

}
