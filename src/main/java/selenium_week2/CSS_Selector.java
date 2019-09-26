package selenium_week2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver(); //Invoke the browser
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.findElement(By.xpath("//a[@title='Log in to your customer account']")).click();
		
		Thread.sleep(5000);
		
		driver.close();
		
		System.out.println("Test case passed");

	}

}
