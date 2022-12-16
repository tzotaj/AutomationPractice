package com.implementations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertEquals;


public class LoginPage {


    private final By LoginUsername = By.id("user-name");
    private final By LoginPassword = By.id("password");

    private final By SubmitLogin = By.name("login-button");
    private final By Title= By.xpath("//span[contains(text(),'Products')]");



    WebDriver chrome;

    public LoginPage(WebDriver chrome) {
        this.chrome = chrome;
    }

    public void loginUser(String user, String password) throws InterruptedException {



        //Thread.sleep(2000);
        chrome.findElement(LoginUsername).sendKeys(user);
        Thread.sleep(2000);
        chrome.findElement(LoginPassword).sendKeys(password);
        Thread.sleep(2000);
        chrome.findElement(SubmitLogin).click();
        Thread.sleep(2000);
        //Assert.assertEquals(Title,"Products");

        String ExpectedText = chrome.findElement(Title).getText(); //get text lexon string, merr vleren e stringut;
        assertEquals("PRODUCTS",ExpectedText);
}


}
