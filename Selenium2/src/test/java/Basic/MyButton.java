package Basic;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyButton {

	@Test
	public void button() throws InterruptedException, IOException
	{
		
		WebDriver driver = new FirefoxDriver();
		
		try
		{
			driver.get("http://demos.telerik.com/aspnet-ajax/button/examples/overview/defaultvb.aspx");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//button[@value = 'Primary Button']/span")).click();  //Correct
			driver.findElement(By.xpath("//button[@value = 'Primary Button--']/span")).click();  //InCorrect
			//String actText = driver.findElement(By.xpath("")).getText();
			//String expText = "Server-Side Click: Primary Button was clicked";
			//Assert.assertTrue(result);
		}
		catch(Exception e)
		{
			MyScreenShot2.screenShot(driver);
		}
		
		
		Thread.sleep(2000);
		
		driver.quit();
	}
}
