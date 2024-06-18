package Basic;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyAlertsScreenShot {

	@Test
	public void alerts() throws InterruptedException, IOException
	{
		WebDriver driver = new FirefoxDriver();
		
		try{
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.get("http://www.destinationqa.com/aut/AlertsPopups.html");
			
			//driver.findElement(By.xpath("//input[@id='btnAlert']")).click();  //Correct xpath
			driver.findElement(By.xpath("//input[@id='btnAlertzz']")).click();  //Wrong xpath
			
			Thread.sleep(1000);
			String actText = driver.switchTo().alert().getText();
			driver.switchTo().alert().accept();
			Thread.sleep(1000);
			boolean result = actText.equals("I'm blocking!");
			
			Thread.sleep(1000);
			Assert.assertTrue(result, "Message alert is wrong");
			
			driver.quit();
		}	
		
		catch(Exception e)
		{
			TakesScreenshot a = (TakesScreenshot) driver;
			File srcFile = a.getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(srcFile, new File("F:\\Prashant\\abc.png"));
		}
	}
		

}
