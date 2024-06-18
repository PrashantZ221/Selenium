package Basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MyiFrame {
	
	@Test
	public void Myframe() throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://toolsqa.com/iframe-practice-page/");
		
		//Index of frame
		//driver.switchTo().frame(0);    
		
		//Using Webelement
		/*WebElement Element = driver.findElement(By.xpath("Xpath of that iFrame"));
		driver.switchTo().frame(Element);*/
		
		driver.switchTo().frame("IF1");  // Move to that iFrame (By Default it takes Id, name)
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Prashant");
		
		driver.switchTo().defaultContent();  //Move to main page
		
		driver.quit();
		
	}



}
