package com.cbt.tests;
import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;

import java.util.*;


public class TitleVerificationTests {
    public static void main(String[] args) {
        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");
        WebDriver driver = BrowserFactory.getDriver("chrome");


            driver.get("http://practice.cybertekschool.com/");
        String title1 = driver.getTitle();
            if (driver.getCurrentUrl().startsWith("http://practice.cybertekschool.com")) {
                System.out.println("Link - PASS");
            } else {
                System.out.println("Link - FAIL");
                System.out.println("Expected: http://practice.cybertekschool.com");
                System.out.println("Actual: " + driver.getCurrentUrl());
            }
            driver.navigate().to("http://practice.cybertekschool.com/dropdown");
        String title2 = driver.getTitle();
            if (driver.getCurrentUrl().startsWith("http://practice.cybertekschool.com")) {
                System.out.println("Link - PASS");
            } else {
                System.out.println("Link - FAIL");
                System.out.println("Expected: http://practice.cybertekschool.com");
                System.out.println("Actual: " + driver.getCurrentUrl());
            }
            driver.navigate().to("http://practice.cybertekschool.com/login");
        String title3 = driver.getTitle();
            if (driver.getCurrentUrl().startsWith("http://practice.cybertekschool.com")) {
                System.out.println("Link - PASS");
            } else {
                System.out.println("Link - FAIL");
                System.out.println("Expected: http://practice.cybertekschool.com");
                System.out.println("Actual: " + driver.getCurrentUrl());
            }

            if(title1.equals(title2) && title1.equals(title3)){
                System.out.println("Title Match - PASS");
            } else {
                System.out.println("Title Match - FAIL");
                System.out.println("title1 = " + title1);
                System.out.println("title2 = " + title2);
                System.out.println("title3 = " + title3);
            }

driver.close();
    }
}
