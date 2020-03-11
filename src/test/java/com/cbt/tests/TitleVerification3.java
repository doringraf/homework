package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification3 {
    public static void main(String[] args) {
        List<String> urls = Arrays.asList("https://luluandgeorgia.com",
                "https://wayfair.com", "https://www.westelm.com", "https://walmart.com");

        for (int i = 0; i < urls.size(); i++) {
            WebDriver driver = BrowserFactory.getDriver("chrome");
            driver.get(urls.get(i));
            String cutUrl = urls.get(i).substring(8,urls.get(i).indexOf(".com")).toLowerCase();
            cutUrl= cutUrl.replace("www.","");
            String cutTitle = driver.getTitle().replace(" ","").toLowerCase();

            if(cutTitle.contains(cutUrl)){
                System.out.println("Pass");
                System.out.println("cutUrl = " + cutUrl);
                System.out.println("cutTitle = " + cutTitle);
            } else {
                System.out.println("FAIL");
                System.out.println("cutUrl = " + cutUrl);
                System.out.println("cutTitle = " + cutTitle);
            }
            driver.close();
        }

    }
}
