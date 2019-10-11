package selenium_week3;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_Selenium {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver(); //Invoke the browser

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("http://automationpractice.com/index.php");

		getScreenshot("C://homepage.png", driver);
		
		WebElement women = driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[1]/a"));
		
		women.click();
		
		getScreenshot("C://womenPage.png", driver);

		driver.close();

	}

	public static void getScreenshot(String fileLoc,WebDriver driver) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;

		File srcFile = ts.getScreenshotAs(OutputType.FILE);

		File target = new File(fileLoc);

		FileHandler.copy(srcFile, target);

	}
	
	

}
