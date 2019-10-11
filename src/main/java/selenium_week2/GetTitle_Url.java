package selenium_week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle_Url {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); //Invoke the browser
		
		driver.manage().window().maximize(); //maximize the window
		
		driver.get("http://automationpractice.com/index.php");
		
		Thread.sleep(2000);
		
		String actualTitle = driver.getTitle();
		
		System.out.println("Homepage title - "+actualTitle);

		WebElement Sign_In_Link_Element = driver.findElement(By.className("login"));

		Sign_In_Link_Element.click();

		Thread.sleep(2000);
		
		String LoginPageURL = driver.getCurrentUrl();
		
		System.out.println("Login page URL - "+LoginPageURL);
		
		String loginPageTitle = driver.getTitle();
		
		System.out.println("Login Page Title - "+loginPageTitle);

		driver.findElement(By.id("email_create")).sendKeys("invalid_address");

		Thread.sleep(5000);
		
		String buttonText = driver.findElement(By.xpath("//*[@id='SubmitCreate']/span")).getText();
		
		System.out.println(buttonText);

		driver.findElement(By.name("SubmitCreate")).click();
		
		driver.close();
	}

}
