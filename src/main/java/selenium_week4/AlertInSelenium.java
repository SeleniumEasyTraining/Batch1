package selenium_week4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertInSelenium {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver(); //Invoke the browser

		driver.manage().window().maximize();

		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.name("cusid")).sendKeys("134242");
		
		driver.findElement(By.name("submit")).click();
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		alert.dismiss();
		
		/*System.out.println(alert.getText());
		
		alert.accept();*/
		
		driver.quit();
		

	}

}
