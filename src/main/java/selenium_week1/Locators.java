package selenium_week1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		ChromeDriver driver =  new ChromeDriver(); // To open chrome browser
		
		driver.get("https://www.facebook.com"); //It will navigate to the particular url
		
		WebElement password_TextBox = driver.findElement(By.name("pass")); //find Element of password text box
		
		WebElement user_textBox = driver.findElement(By.id("email"));//find Element of email text box
		
	}
	
}
