package Basic;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class MyScreenShot {
	
	@Test
	public void screenShot() throws InterruptedException, IOException
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		
		TakesScreenshot a = (TakesScreenshot) driver;
		File srcFile = a.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(srcFile, new File("F:\\abc.png"));
		//"F:\\googleError"+"timestamp"+".png"
		
		driver.quit();
		
	}

}
