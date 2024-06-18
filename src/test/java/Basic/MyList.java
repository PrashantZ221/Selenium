package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MyList {

	private String getMyCountryLocator(String country)
	{
		country = "//ul/li[contains(text(), '"+country+"')]";
		return country;
	}
	
	@Test
	public void MyList() throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demos.telerik.com/aspnet-ajax/listbox/examples/overview/defaultvb.aspx");
		
		/*driver.findElement(By.xpath(getMyCountryLocator("Brazil"))).click();
		driver.findElement(By.xpath("//button[@title='To Right']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(getMyCountryLocator("Argentina"))).click();
		driver.findElement(By.xpath("//button[@title='To Right']")).click();*/
		
		
		//Write For loop with String array to pass multiple country at a time
		String country[] = {"Brazil", "Argentina", "USA"};
		int noOfCountry = country.length;
		
		for(int i=0; i < noOfCountry; i++)
		{
			driver.findElement(By.xpath(getMyCountryLocator(country[i]))).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@title='To Right']")).click();
		}
		
		Thread.sleep(2000);
		
		driver.quit();
	}
}
