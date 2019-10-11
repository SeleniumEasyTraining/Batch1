package selenium_week3;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver(); //Invoke the browser
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.goibibo.com");
		
		//driver.navigate().refresh();//refresh a page
		
		driver.findElement(By.xpath("//*[@id=\"get_sign_up\"]")).click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));//go inside the frame
		
		driver.findElement(By.id("authMobile")).sendKeys("9876543210");
		
		driver.switchTo().defaultContent();//come out off the frameS
		
		driver.findElement(By.xpath("//*[@id=\"authOverlay\"]/div/a")).click();
		
		driver.quit();
	}

}
