package com;

import com.driver.BaseClass;
import org.openqa.selenium.WebDriver;
import com.report.Logs;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class OpenBrowser {          //perdor driver per te hap browserin

    public WebDriver chrome;        //meqe do perdorim chrome browser
    BaseClass browser = new BaseClass(); //krijojme nje objekt te baseclases

    @BeforeMethod                    // Annotation te TestNG; per tu run perpara testeve
    public void openChrome() {               //hapet browser dhe apk under test page
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
