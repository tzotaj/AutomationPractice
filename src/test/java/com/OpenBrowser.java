package com;

import com.mystore.BaseClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class OpenBrowser {

    public WebDriver chrome;
    BaseClass browser = new BaseClass();

   @BeforeMethod
    public void openChrome(){
        chrome = browser.initializeDriver();
        chrome.get("https://www.saucedemo.com/");
    }

    @AfterMethod
    public void cleanUp() {
        chrome.quit();
    }
}
