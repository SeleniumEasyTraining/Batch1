package selenium_week3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_InSelenium {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver(); //Invoke the browser

		driver.get("http://automationpractice.com/index.php");
		
		Actions action = new Actions(driver);
		
		WebElement women = driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[1]/a"));
		
		WebElement blousesLink = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[2]/a"));
		
		WebElement searchBox = driver.findElement(By.id("search_query_top"));
		
		WebElement searchIcon = driver.findElement(By.name("submit_search"));
		
		action.moveToElement(searchBox).sendKeys(searchBox,"pants").click(searchIcon).build().perform();
		
		//mouse hover an element in selenium
		
		//action.moveToElement(women).perform();
		
		//action.moveToElement(women).click(blousesLink).build().perform();
		
		//right click on an element
		//action.contextClick(women).perform();
		
		//blousesLink.click();
		
		Thread.sleep(5000);
		
		driver.close();
	}

}
