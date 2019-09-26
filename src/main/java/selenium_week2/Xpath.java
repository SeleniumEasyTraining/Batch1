package selenium_week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver(); //Invoke the browser

		driver.get("http://automationpractice.com/index.php");
		
		String connnn= "//a[@title='Contact Us']";
		
		WebElement contactLink = driver.findElement(By.xpath(connnn));

		contactLink.click();
		
		driver.quit();

	}

}
