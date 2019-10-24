package reference;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestCaseFailureListenerExample {
	static WebDriver driver;
	
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		 driver = new ChromeDriver(); //Invoke the browser

		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		Assert.assertTrue(false);
	}
	
	@AfterTest
	public void afterTest() {
		
		driver.close();
	}
	
	public static String captureScreenshot() throws IOException {
		String timeStamp;
		File screenShotName;
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime()); 
		screenShotName = new File(System.getProperty("user.dir")+ "\\target\\"+timeStamp+".png");
		FileHandler.copy(scrFile, screenShotName);
		String filePath = screenShotName.toString();
		//String path = "<img src='"+ filePath + "' height='100' width='100'/>";
		return filePath;
	}
}
