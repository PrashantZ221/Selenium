package Basic;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MyExplicitWait {

	@Test
	public void MyExpWait()
	{
		WebDriver driver = new FirefoxDriver();
		
		//Every 500ms, it will check for the element.
		//Usually the seconds are set according to the benchmark set by dvpt performance team
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		
		WebElement myElement = (new WebDriverWait(driver, Duration.ofSeconds(20))).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@class='gsfiaaaaa']")));
		myElement.click();
		
	}

}
