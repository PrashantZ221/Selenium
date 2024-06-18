package Basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MyImplicitWait {

	@Test
	public void MyImpWait()
	{
		WebDriver driver = new FirefoxDriver();
		
		//Every 500ms, it will check for the element.
		//Usually the seconds are set according to the benchmark set by dvpt performance team
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com");
		
		driver.findElement(By.xpath("//input[@class='gsfi']"));
	}

}
