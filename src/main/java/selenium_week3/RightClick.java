package selenium_week3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver(); //Invoke the browser
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("http://automationpractice.com/index.php");

		Actions action = new Actions(driver);

		WebElement women = driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[1]/a"));

		action.keyDown(Keys.SHIFT).click(women).keyUp(Keys.SHIFT).build().perform();		

		Thread.sleep(3000);

		driver.quit();

	}

}
