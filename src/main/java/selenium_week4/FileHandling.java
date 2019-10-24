package selenium_week4;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileHandling {

	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver(); //Invoke the browser

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.indeed.co.in/");

		WebElement postUrResume_link = driver.findElement(By.xpath("//*[@id=\"desktopGlobalHeader\"]/nav/ul[2]/li[1]/a | //*[@id=\"gnav-main-container\"]/div/div/div[3]/div[2]/a/span"));

		postUrResume_link.click();

		WebElement upload_cv_link = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div[2]/div/div/div[2]/div/div[1]/div/div[1]/button"));

		upload_cv_link.click();
		
		Thread.sleep(5000);

		//Store theC:\seleniumPractice location of the file in clipboard 
		//Clipboard
		StringSelection strSel = new StringSelection("C:\\seleniumPractice.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSel, null);
		
		System.out.println("File path stored in clipboard");

		Robot robot = new Robot();
		
		System.out.println("Robot class started");

		//Ctrl+V
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(5000);
		
		driver.close();
		

	}

}
