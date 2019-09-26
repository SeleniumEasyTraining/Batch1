package selenium_week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver(); //Invoke the browser

		driver.get("http://automationpractice.com/index.php");

		driver.findElement(By.xpath("//ul[contains(@class,'sf-menu clearfix menu-content sf-js-enabled sf-arrows')]/li/a")).click();

		Thread.sleep(3000);
		
		boolean beforeCheck=driver.findElement(By.id("layered_id_attribute_group_1")).isSelected();
		
		if(beforeCheck==true) {
			System.out.println("Check box is already selected");
		}else {
			driver.findElement(By.id("layered_id_attribute_group_1")).click();
		}

		//To choose Dropdown
		
		WebElement dropdown = driver.findElement(By.id("selectProductSort"));
		
		Select sel = new Select(dropdown);
		
		//sel.selectByIndex(5);
		
		//sel.selectByValue("name:asc");
		
		sel.selectByVisibleText("Price: Highest first");
		
		driver.quit();

	}

}
