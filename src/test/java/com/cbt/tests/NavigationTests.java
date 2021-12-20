package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

public class NavigationTests {

    public static void main(String[] args) throws InterruptedException {
        /*
        Test Case : OS:Windows 10
        (1) open browser
        maximize the window
        (2) Go to website https://google.com
        (3) Save the title in a string variable
        (4) Go to https://etsy.com
        (5) Save the title in a string variable
        (6) Navigate back to previous page
        (7) Verify that title is same is in step 3
        (8) Navigate forward to previous page
        (9) Verify that title is same is in step 5
        close browser
        */

        String site1 = "https://google.com";
        String site2 = "https://etsy.com";

        WebDriver driver1 = BrowserFactory.getDriver("chrome");
        navigationTest(driver1, site1, site2);

        WebDriver driver2 = BrowserFactory.getDriver("firefox");
        navigationTest(driver2, site1, site2);

        WebDriver driver3 = BrowserFactory.getDriver("edge");
        navigationTest(driver3, site1, site2);

        WebDriver driver4 = BrowserFactory.getDriver("safari");
        navigationTest(driver4, site1, site2);

    }

    public static void navigationTest(WebDriver driver, String site1, String site2) throws InterruptedException {
        //maximize the window
        driver.manage().window().maximize();

        //(2) Go to website https://google.com
        driver.get(site1);

        //(3) Save the title in a string variable
        String title1 = driver.getTitle();

        Thread.sleep(2000);

        //(4) Go to https://etsy.com
        driver.navigate().to(site2);

        //(5) Save the title in a string variable
        String title2 = driver.getTitle();

        Thread.sleep(2000);

        //(6) Navigate back to previous page
        driver.navigate().back();

        //(7) Verify that title is same is in step 3
        String actualTitle1 = driver.getTitle();
        StringUtility.verifyEquals(title1, actualTitle1);

        Thread.sleep(2000);

        //(8) Navigate forward to previous page
        driver.navigate().forward();

        //(9) Verify that title is same is in step 5
        String actualTitle2 = driver.getTitle();
        StringUtility.verifyEquals(title2, actualTitle2);
        // close browser
        driver.quit();
    }
}
