package com.pageobjects;
import com.mystore.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.xml.xpath.XPath;

import static org.testng.Assert.assertEquals;


public class LoginPage {
    //Locators
//    @FindBy(xpath="//a[contains(.,'Sign in')]")
//    WebElement PageSignin;

    private final By LoginBtn = By.xpath("//a[contains(.,'Sign in')]");
    private final By LoginEmail = By.id("email");
    private final By LoginPassword = By.id("passwd");

    private final By SubmitLogin = By.id("SubmitLogin");




    WebDriver chrome;

    public LoginPage(WebDriver chrome) {
        this.chrome = chrome;
    }

    public void loginUser(String email, String password) throws InterruptedException {


        chrome.findElement(LoginBtn).click();
        Thread.sleep(2000);
        chrome.findElement(LoginEmail).sendKeys(email);
        chrome.findElement(LoginPassword).sendKeys(password);
        chrome.findElement(SubmitLogin).click();
       // Assert.assertEquals(ExpectedText,"Test");

        String ExpectedText = chrome.findElement(By.xpath("")).getText(); //get text lexon string, merr vleren e stringut;
        assertEquals("IRCTC railways",ExpectedText);
}

}
