package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MyComboBox {
	
	@Test
	public void MyCombo() throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demos.telerik.com/aspnet-ajax/combobox/examples/overview/defaultvb.aspx");
		
		driver.findElement(By.xpath("//li/div/span/input[@value='Choose a Product']")).sendKeys("Aniseed Syrup");
		Thread.sleep(5000);
		//Tag <em> is generated dynamically at runtime
		driver.findElement(By.xpath("//tbody/tr/td/em[contains(text(), 'Aniseed Syrup')]")).click();   
		
		driver.findElement(By.xpath("//input[@Value='Choose a Region']/following-sibling::button/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div/ul/li[contains(text(), 'Austin')]")).click();
		
		
		Thread.sleep(2000);
	}

}
