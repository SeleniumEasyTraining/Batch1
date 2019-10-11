package reference;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window_Handling {

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

		System.out.println("Total window size - "+listOfWindows.size());

		for (String window : listOfWindows) {

			if(!window.equals(ParentWindow)) {

				driver.switchTo().window(window);

				System.out.println(driver.getCurrentUrl());

				driver.close();

			}

		}
		
		/*ArrayList<String> tabOrWindows = new ArrayList<>(listOfWindows);

		driver.switchTo().window(tabOrWindows.get(1));*/

		driver.quit();

	

	}


}
