package com;

import com.driver.BaseClass;
import org.openqa.selenium.WebDriver;
import com.report.Logs;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class OpenBrowser {

    public WebDriver chrome;
    BaseClass browser = new BaseClass();

    @BeforeMethod                    // Annotation te TestNG; per tu run perpara testeve
    public void openChrome() {
        chrome = browser.initializeDriver();
        chrome.get("https://www.saucedemo.com/");
        Logs.startTestCase();
    }

    @AfterMethod                    // Annotation te TestNG; per tu run pas testeve
    public void cleanUp() {

        chrome.quit();
        Logs.endTestCase();
    }

}
