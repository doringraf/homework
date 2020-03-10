package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationTests {
    public static void chromeRun(String browser){
        WebDriver driver = BrowserFactory.getDriver(browser);
        driver.get("https://google.com");
        driver.manage().window().maximize();

        String title1 = driver.getTitle();

        driver.navigate().to("https://etsy.com");
        String title2 = driver.getTitle();
        driver.navigate().back();

        StringUtility.verifyEquals(title1,driver.getTitle());

        driver.navigate().forward();

        StringUtility.verifyEquals(title2,driver.getTitle());
        driver.close();
    }

    public static void firefoxRun(String browser){
        WebDriver driver = BrowserFactory.getDriver(browser);
        driver.get("https://google.com");
        driver.manage().window().maximize();

        String title1 = driver.getTitle();

        driver.navigate().to("https://etsy.com");
        String title2 = driver.getTitle();
        driver.navigate().back();

        StringUtility.verifyEquals(title1,driver.getTitle());

        driver.navigate().forward();

        StringUtility.verifyEquals(title2,driver.getTitle());
        driver.close();
    }

    public static void safariRun(String browser){
        WebDriver driver = BrowserFactory.getDriver(browser);
        driver.get("https://google.com");
        driver.manage().window().maximize();

        String title1 = driver.getTitle();

        driver.navigate().to("https://etsy.com");
        String title2 = driver.getTitle();
        driver.navigate().back();

        StringUtility.verifyEquals(title1,driver.getTitle());

        driver.navigate().forward();

        StringUtility.verifyEquals(title2,driver.getTitle());
        driver.close();
    }


    public static void main(String[] args) {
        chromeRun("chrome");
        firefoxRun("firefox");
        chromeRun("safari");
    }
}
