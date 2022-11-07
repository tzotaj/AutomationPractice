package com.mystore;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;


//public class BaseClass {

//    protected WebDriver driver=null;
//
//    public BaseClass(WebDriver driver){
//
//        this.driver = driver;
//        PageFactory.initElements(driver,this); // responsible to initialize all the locators within the sub page -->
//
//    }
//
//    protected boolean waitForElement(WebElement ele, long timeout){
//        try {
//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
//            wait.ignoring(NoSuchElementException.class)
//                    .pollingEvery(Duration.ofMillis(500))
//                    .until(ExpectedConditions.elementToBeClickable(ele));
//            return true;
//        }catch(Exception e) {}
//        return false;

//    }

//}
import org.testng.annotations.BeforeMethod;



public class BaseClass {
    public WebDriver driver;


    public WebDriver initializeDriver() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.setCapability(ChromeOptions.CAPABILITY, options);
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return driver;

    }
}
