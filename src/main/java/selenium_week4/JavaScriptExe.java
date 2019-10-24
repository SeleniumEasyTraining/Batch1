package selenium_week4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExe {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver(); //Invoke the browser

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("http://automationpractice.com/index.php");

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		/*jse.executeScript("window.scrollBy(0,500)");
		
		jse.executeScript("window.scrollBy(0,500)");*/
		
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"cmsinfo_block\"]/div[1]/ul/li[2]/div/p/a"));
		
		jse.executeScript("arguments[0].scrollIntoView(true);", ele);
		
		jse.executeScript("arguments[0].click();", ele);
		
		Thread.sleep(5000);

		driver.close();
	}

}
