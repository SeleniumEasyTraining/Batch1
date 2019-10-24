package selenium_week4;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowsHandling {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver(); //Invoke the browser

		driver.manage().window().maximize();

		driver.get("http://automationpractice.com/index.php");

		Actions action = new Actions(driver);

		WebElement women = driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[1]/a"));

		WebElement contactUS = driver.findElement(By.xpath("//*[@id=\"contact-link\"]/a"));

		//action.keyDown(Keys.CONTROL).click(contactUS).keyUp(Keys.CONTROL).build().perform();

		action.keyDown(Keys.CONTROL).click(women).keyUp(Keys.CONTROL).build().perform();

		Thread.sleep(5000);

		String ParentWindow = driver.getWindowHandle();

		/*Set<String> setOfWindows = driver.getWindowHandles();

		System.out.println(setOfWindows.size());*/

		/*for(String currentWindow:setOfWindows) {

			if(!currentWindow.equals(ParentWindow)) {

				driver.switchTo().window(currentWindow);

				System.out.println(driver.getCurrentUrl());

				driver.close();
			}

		}
		 */

		ArrayList<String> list = new ArrayList<>(driver.getWindowHandles());

		System.out.println(list.size());

		System.out.println(list);

		for(int i= 0;i<list.size();i++)	{

			if(!list.get(i).equals(ParentWindow)) {

				driver.switchTo().window(list.get(i));

				System.out.println(driver.getCurrentUrl());

				WebElement tops = driver.findElement(By.xpath("//*[@id='categories_block_left']/div/ul/li[1]/a"));

				action.keyDown(Keys.CONTROL).click(tops).keyUp(Keys.CONTROL).build().perform();
				
				ArrayList<String> listOfNew = new ArrayList<>(driver.getWindowHandles());
				
				driver.switchTo().window(listOfNew.get(2));
				
				System.out.println(driver.getCurrentUrl());

				driver.close();
			}
		}

		driver.quit();

	}

}
