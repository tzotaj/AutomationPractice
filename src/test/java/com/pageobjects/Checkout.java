package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertEquals;

public class Checkout {

    public final By firstName = By.id("first-name");
    public final By lastName = By.id("last-name");
    public final By zipCode = By.id("postal-code");

    public final By continueButton = By.id("continue");

    private final By Information= By.xpath("//class[contains(text(),'summary_value_label')]");

    public final By submitOrder = By.id("finish");

    public final By finalMessage = By.xpath("//class[contains(text(),'complete-header')]");

    WebDriver chrome;

    public Checkout (WebDriver chrome){
        this.chrome = chrome;
    }

    public void proceedToCheckout(String name, String lastname, String zip) throws InterruptedException {

        chrome.findElement(firstName).sendKeys(name);
        chrome.findElement(lastName).sendKeys(lastname);
        chrome.findElement(zipCode).sendKeys(zip);

        chrome.findElement(continueButton).click();
        Thread.sleep(2000);

        String ExpectedText = chrome.findElement(Information).getText();
        assertEquals("FREE PONY EXPRESS DELIVERY!",ExpectedText);
        Thread.sleep(1000);
        chrome.findElement(submitOrder).click();

        String finalText = chrome.findElement(finalMessage).getText();
        assertEquals("THANK YOU FOR YOUR ORDER",finalText);


    }

}
