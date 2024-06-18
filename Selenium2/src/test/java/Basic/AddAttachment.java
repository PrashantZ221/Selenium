package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
//import org.testng.annotations.Test;

public class AddAttachment {
	
	@Test
	public void Attachment() throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.2shared.com/");
		
		driver.findElement(By.xpath("//input[@id='upField']")).sendKeys("F:\\Prashant\\Docs\\Notes.txt");
		
		Thread.sleep(5000);
		
		driver.quit();
	}
}
