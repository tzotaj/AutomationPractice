package com.implementations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertEquals;

import com.report.Logs;

public class LoginPage {
    private final By loginUsername = By.id("user-name");
    private final By loginPassword = By.id("password");
    private final By submitLogin = By.name("login-button");
    private final By title = By.xpath("//span[contains(text(),'Products')]");
    WebDriver chrome;

    public LoginPage(WebDriver chrome) {

        this.chrome = chrome;
    }

    public void loginUser(String user, String password) {

        chrome.findElement(loginUsername).sendKeys(user);
        chrome.findElement(loginPassword).sendKeys(password);
        chrome.findElement(submitLogin).click();

        String ExpectedText = chrome.findElement(title).getText();
        assertEquals("PRODUCTS", ExpectedText);
        Logs.info("Loggin successful");
    }

}
