package selenium_week1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstAutomation {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		String URL = "http://automationpractice.com/index.php";
		String Sign_In_Link = "login";
		String Email_Address_TextBox = "email_create";
		String Email_Addresss_Value = "selenium@gmail.com";
		String Create_an_Account_Button = "SubmitCreate";
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver(); //Invoke the browser
		
		//To launch url
		
		driver.get(URL);
		
		Thread.sleep(2000); // hold the process for 2 seconds
		
		//To find sign in button and click
		
		WebElement Sign_In_Link_Element = driver.findElement(By.className(Sign_In_Link));
		
		Sign_In_Link_Element.click();
		
		Thread.sleep(2000);
		
		// To enter text in email address box
		
		driver.findElement(By.id(Email_Address_TextBox)).sendKeys(Email_Addresss_Value);
		
		Thread.sleep(5000);
		
		//To click create an account button
		
		driver.findElement(By.name(Create_an_Account_Button)).click();
		
		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"create_account_error\"]/ol/li")); 
		
		System.out.println(ele.getText());
		
		//To close the browser
		
		driver.quit();   //driver.close();
		
		System.out.println("Test case executed successfully");
		
	}
	
	

}
