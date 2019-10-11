package selenium_week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Func {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver(); //Invoke the browser

		driver.get("http://automationpractice.com/index.php");

		WebElement Sign_In_Link_Element = driver.findElement(By.className("login"));

		Sign_In_Link_Element.click();

		Thread.sleep(2000);

		driver.findElement(By.id("email_create")).sendKeys("invalid_address");

		Thread.sleep(5000);
		
		String buttonText = driver.findElement(By.xpath("//*[@id='SubmitCreate']/span")).getText();
		
		System.out.println(buttonText);

		driver.findElement(By.name("SubmitCreate")).click();

		Thread.sleep(1000);

		String expectedSrrMess = "Invalid email ";

		String actualErrMess = driver.findElement(By.xpath("//div[@id='create_account_error']/ol/li")).getText();

		if(actualErrMess.equals(expectedSrrMess)) {
			System.out.println("Test case passed");
		}else {
			System.out.println("Test case failed");

			System.out.println("Actual text during runtime : "+actualErrMess);
			System.out.println("Expected text : "+expectedSrrMess);
		}

		driver.quit();

	}


}
