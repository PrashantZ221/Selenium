package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
/* for CFT - no need to give chromedriver.exe file.
        It will autodetect, or we can specify the specific version using chromeoptions
        ChromeOptions co = new ChromeOptions();
        co.setBrowserVersion("117");    */

        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();

        driver.get("https://google.com");
        System.out.println(driver.getTitle());

        driver.quit();
    }
}