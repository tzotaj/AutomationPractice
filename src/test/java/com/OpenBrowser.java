package com;
import com.mystore.BaseClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpenBrowser {

    public WebDriver chrome;
    BaseClass browser = new BaseClass();

    @Test
    public void openChrome(){
        chrome = browser.initializeDriver();
        chrome.get("http://automationpractice.com/");
    }

//    @AfterMethod
//    public void cleanUp() {
//        chrome.quit();
//    }
}
