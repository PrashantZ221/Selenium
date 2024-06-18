package Basic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MyAddAttachmentRobot {
	
	
	
	@Test
	public void addAttachment() throws InterruptedException, AWTException{
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.2shared.com");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		//driver.findElement(By.id("upField")).sendKeys("D:\\TrainingContent\\URLs.txt");
		driver.findElement(By.id("upField")).click();
		Thread.sleep(5000);
		 StringSelection ss = new StringSelection("F:\\Radiacal_Selenium\\Notes.txt");
	     //upload your file using RobotClass
	     //attach your path where file is located.
	     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	     Robot robot = new Robot();
	     Thread.sleep(5000);
	     robot.keyPress(KeyEvent.VK_CONTROL);
	     robot.keyPress(KeyEvent.VK_V);
	     
	     robot.keyRelease(KeyEvent.VK_CONTROL);
	     robot.keyRelease(KeyEvent.VK_V);
	     
	     Thread.sleep(6000);
	     robot.keyPress(KeyEvent.VK_ENTER);
	     robot.keyRelease(KeyEvent.VK_ENTER);
	     Thread.sleep(5000);
	}
}
