package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MyCheckBox {
	
	@Test
	public void MyCombo() throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demos.telerik.com/aspnet-ajax/checkbox/overview/defaultvb.aspx");
		
		boolean state = false;
		
		try
		{
			driver.findElement(By.xpath("rbIcon rbToggleCheckbox"));
		}
		
		catch(Exception e)
		{
			state = true;
		}
		
		if(state)
		{
			System.out.println("Already checked");
		}
		
		else
		{
			driver.findElement(By.xpath("rbIcon rbToggleCheckbox")).click();
		}
		
		driver.quit();
		
	}

}
