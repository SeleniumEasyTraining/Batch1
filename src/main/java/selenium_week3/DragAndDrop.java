package selenium_week3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver(); //Invoke the browser

		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		Thread.sleep(2000);

		WebElement sourceLOC = driver.findElement(By.id("draggable"));

		WebElement targetLOC = driver.findElement(By.id("droppable"));

		Actions action = new Actions(driver);

		action.dragAndDrop(sourceLOC, targetLOC).build().perform();	
		
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
