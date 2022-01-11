package com.opnlycrm.pages;

import com.opnlycrm.utilities.ConfigurationReader;
import com.opnlycrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(name = "USER_LOGIN")
    public WebElement usernameInput;

    @FindBy(name = "USER_PASSWORD")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement loginBtn;

    public void loginAsHelpdesk() {
        String username = ConfigurationReader.get("helpdesk_username");
        String password = ConfigurationReader.get("helpdesk_password");

        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
    }

    public void loginAsHumanResource() {
        String username = ConfigurationReader.get("humanresource_username");
        String password = ConfigurationReader.get("humanresource_password");

        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
    }

    public void loginAsMarketing() {
        String username = ConfigurationReader.get("marketing_username");
        String password = ConfigurationReader.get("marketing_password");

        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
    }



}
