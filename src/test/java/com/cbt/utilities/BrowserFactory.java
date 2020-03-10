package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory {
    public static WebDriver getDriver(String str){
        WebDriver driver = null;
        if(str.equalsIgnoreCase("chrome")){
              WebDriverManager.chromedriver().setup();
              return new ChromeDriver();
        } else if(str.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        } else if(str.equalsIgnoreCase("safari")){
            return new SafariDriver();
        } else if((str.equalsIgnoreCase("edge")) || str.equalsIgnoreCase("internet explorer") ){
            return null;
        }
        WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
    }
}
