package Basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyAlertConfirmation {
	
	@Test
	public void alerts() throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.destinationqa.com/aut/AlertsPopups.html");
		driver.findElement(By.xpath("//input[@id='btnConfirm']")).click();
		Alert myAlert = driver.switchTo().alert();
		Thread.sleep(1000);
		//String actText = myAlert.getText();
		//Assert.assertEquals(actText, "");
		
		//myAlert.accept();
		myAlert.dismiss();
		
		
	}

}
