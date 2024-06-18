package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFirstScript {

	@Test
	public void myFirstMethod() throws InterruptedException
	{
		System.out.println("This is my first selenium script");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();    //Method chaining - return object of class
		
		driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("Selenium ide");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[contains(text(), 'Selenium IDE Plugins')]")).click();
		
		String actString = driver.findElement(By.xpath("//a[@title='Selenium Projects']")).getText();
		String expString = "Projects";
		
		boolean result = actString.equals(expString);
		
		Assert.assertTrue(result);
		
		driver.quit();
	}

}
