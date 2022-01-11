package com.opnlycrm.tests;

import com.opnlycrm.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {

    @Test
    public void loginAsHelpdeskUser() {
        LoginPage loginPage = new LoginPage();
        loginPage.loginAsHelpdesk();

        String expectedUrl = "https://qa.openlycrm.com/stream/?login=yes";
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);
    }

    @Test
    public void loginAsHumanResourceUser() {
        LoginPage loginPage = new LoginPage();
        loginPage.loginAsHumanResource();

        String expectedUrl = "https://qa.openlycrm.com/stream/?login=yes";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    @Test
    public void loginAsMarketingUser() {

        LoginPage loginPage = new LoginPage();
        loginPage.loginAsMarketing();

        String expectedUrl = "https://qa.openlycrm.com/stream/?login=yes";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

}
