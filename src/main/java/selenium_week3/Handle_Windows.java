package selenium_week3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import net.bytebuddy.description.modifier.SynchronizationState;

public class Handle_Windows {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver(); //Invoke the browser

		driver.get("http://automationpractice.com/index.php");

		Actions action = new Actions(driver);

		WebElement women = driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[1]/a"));

		WebElement contactUS = driver.findElement(By.xpath("//*[@id=\"contact-link\"]/a"));

		action.keyDown(Keys.CONTROL).click(contactUS).keyUp(Keys.CONTROL).build().perform();

		action.keyDown(Keys.CONTROL).click(women).keyUp(Keys.CONTROL).build().perform();

		Thread.sleep(5000);

		String ParentWindow = driver.getWindowHandle();

		Set<String> listOfWindows = driver.getWindowHandles();
		
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();

	}

}
