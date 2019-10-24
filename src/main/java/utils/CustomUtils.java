package utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class CustomUtils {

	public String captureScreenshot(WebDriver driver) throws IOException {
		String timeStamp;
		File screenShotName;
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//The below method will save the screen shot in d drive with name "screenshot.png"
		timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime()); 
		screenShotName = new File("D:\\MyTest\\Screenshots\\"+timeStamp+".png");
		FileHandler.copy(scrFile, screenShotName);
		 
		String filePath = screenShotName.toString();
		String path = "<img src='"+ filePath + "' height='100' width='100'/>";
		return path;
	}
	
}
