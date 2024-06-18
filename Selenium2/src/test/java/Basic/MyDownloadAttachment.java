/*
package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

public class MyDownloadAttachment {
	
	WebDriver driver;
	
	@Test
	public void myDownload() throws InterruptedException{
		
		  FirefoxProfile fprofile = new FirefoxProfile();//Create object of FirefoxProfile  to access Its properties.
		  fprofile.setPreference("browser.download.dir", "F:\\TestDownload");//Set Location to store files after downloading.
		  fprofile.setPreference("browser.download.folderList", 2);//Set Preference to not show file download confirmation dialogue using  types Of different file extension types.
		  
		  fprofile.setPreference("browser.helperApps.neverAsk.saveToDisk", 
		    "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;"//types Of MS Excel File.
		    + "application/pdf;" //types Of PDF File.
		    + "application/vnd.openxmlformats-officedocument.wordprocessingml.document;" //types Of MS doc File.
		    + "text/plain;" //types Of text File.
		    + "text/csv"); //types Of CSV File.
		  fprofile.setPreference( "browser.download.manager.showWhenStarting", false );
		  fprofile.setPreference( "pdfjs.disabled", true );

		  driver = new FirefoxDriver(fprofile);  //Pass fprofile parameter In webdriver to use preferences to download file.
		  driver.get("http://only-testing-blog.blogspot.in/2014/05/login.html");
	         
		  driver.findElement(By.xpath("//a[contains(.,'Download Text File')]")).click();//Download Text File
		  Thread.sleep(5000);
	                
		  driver.quit();
	}
	

}
*/
