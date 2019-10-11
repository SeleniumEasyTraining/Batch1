package reference;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver(); //Invoke the browser

		driver.get("http://automationpractice.com/index.php");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		//jse.executeScript("window.scrollBy(0,250)");
		
		WebElement follow_us_fb = driver.findElement(By.xpath("//*[@id=\"facebook_block\"]/div"));
		
		//scroll to particular element
		
		jse.executeScript("arguments[0].scrollIntoView(true);", follow_us_fb);
		
		WebElement selenium_framework_link = driver.findElement(By.xpath("//*[@id=\"cmsinfo_block\"]/div[1]/ul/li[2]/div/p/a"));
		
		jse.executeScript("arguments[0].click();", selenium_framework_link);
		
		driver.quit();
	}

}
