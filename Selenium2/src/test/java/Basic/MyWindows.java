package Basic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MyWindows {
	
	@Test
	public void window()
	{
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.wiziq.com/tutorial/810773-selenium-presentation-update");
		
		driver.findElement(By.xpath("//span[contains(text(), 'Login with Facebook')]")).click();
		
		String ParentHandle = driver.getWindowHandle();
		Set<String> title = driver.getWindowHandles();
		
		for(String currentHandle : title)
		{
			driver.switchTo().window(currentHandle);
			System.out.println(driver.getTitle());
		}
		
		driver.findElement(By.id("email")).sendKeys("prashant");
		
		//driver.switchTo().defaultContent();
		driver.switchTo().window(ParentHandle);
		System.out.println(driver.getTitle());
		
		driver.quit();
	}
	
	

}
