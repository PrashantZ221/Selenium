package Basic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class MyScreenShot2 {
	
	@Test
	public static void screenShot(WebDriver driver) throws InterruptedException, IOException
	{
		
		TakesScreenshot a = (TakesScreenshot) driver;
		File srcFile = a.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(srcFile, new File("F:\\screenShot2.png"));
		//"F:\\googleError"+"timestamp"+".png"
		
	}

}
