package Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MyGridTable {
	@Test
	public void test() throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://money.rediff.com/mutual-funds/liquid");
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		int columnIndex = 0;
		//find number of columns
		List<WebElement> ele = driver.findElements(By.xpath("//table[@class='dataTable']//thead/tr/th"));
		
		int totalRows = ele.size();
		for(int i=1;i<=totalRows;i++){
			String columnValue = driver.findElement(By.xpath("//table[@class='dataTable']//thead/tr/th["+i+"]")).getText();
			if(columnValue.equals("Returns(%)")){
				columnIndex=i;
				break;
			}
		}
		
		String cellValue = driver.findElement(By.xpath("//table[@class='dataTable']//thead/tr/th["+columnIndex+"]/../../following-sibling::tbody/tr[3]/td["+columnIndex+"]")).getText();
		System.out.println("cellvalue="+cellValue);
		
	}

}
