package selenium_week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver(); //Invoke the browser

		driver.manage().window().maximize(); //maximize the window

		driver.get("http://automationpractice.com/index.php");

		Thread.sleep(2000);
		
		String placeHolderVal = driver.findElement(By.id("search_query_top")).getAttribute("class");
		
		System.out.println(placeHolderVal);
		
		WebElement Sign_In_Link_Element = driver.findElement(By.className("login"));

		System.out.println(Sign_In_Link_Element.getTagName());
		
		driver.close();
	}

}
