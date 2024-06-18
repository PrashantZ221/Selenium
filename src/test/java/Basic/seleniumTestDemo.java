package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class seleniumTestDemo {

    @Test
    public void TestGoogle() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com");
        String title = driver.getTitle();
        Assert.assertEquals(title, "Google");
        driver.quit();

    }

}
