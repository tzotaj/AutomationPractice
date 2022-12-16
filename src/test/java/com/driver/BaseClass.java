package com.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;


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
