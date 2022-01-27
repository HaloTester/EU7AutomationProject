package com.opnlycrm.tests;

import com.opnlycrm.pages.LoginPage;
import com.opnlycrm.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginPageTest extends TestBase {

    @Test
    public void loginAsHelpdeskUser() {
        extentLogger = report.createTest("Login With Help Desk User Credentials");
        LoginPage loginPage = new LoginPage();
        extentLogger.info("Username: " + ConfigurationReader.get("helpdesk_username"));
        extentLogger.info("Password: " + ConfigurationReader.get("helpdesk_password"));
        extentLogger.info("Login as a help desk user");
        loginPage.loginAsHelpdesk();

        String expectedUrl = "https://qa.openlycrm.com/stream/?login=yes";
        extentLogger.info("Verify that user is main page");
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);

        extentLogger.pass("PASSED");
    }

    @Test
    public void loginAsHumanResourceUser() {
        extentLogger = report.createTest("Login With Human Resource User Credentials");

        LoginPage loginPage = new LoginPage();
        extentLogger.info("Username: " + ConfigurationReader.get("humanresource_username"));
        extentLogger.info("Password: " + ConfigurationReader.get("humanresource_password"));
        extentLogger.info("Login as a human resource user");
        loginPage.loginAsHumanResource();

        String expectedUrl = "https://qa.openlycrm.com/stream/?login=yes";
        extentLogger.info("Verify that user is main page");
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);

        extentLogger.pass("PASSED");
    }

    @Test
    public void loginAsMarketingUser() {
        extentLogger = report.createTest("Login With Marketing User Credentials");

        LoginPage loginPage = new LoginPage();
        extentLogger.info("Username: " + ConfigurationReader.get("marketing_username"));
        extentLogger.info("Password: " + ConfigurationReader.get("marketing_password"));
        extentLogger.info("Login as a marketing user");
        loginPage.loginAsMarketing();

        String expectedUrl = "https://qa.openlycrm.com/stream/?login=yes";
        extentLogger.info("Verify that user is main page");
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);

        extentLogger.pass("PASSED");
    }

}
