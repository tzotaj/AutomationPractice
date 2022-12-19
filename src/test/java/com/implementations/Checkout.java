package com.implementations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertEquals;

public class Checkout {
    public final By firstName = By.id("first-name");
    public final By lastName = By.id("last-name");
    public final By zipCode = By.id("postal-code");
    public final By continueButton = By.id("continue");
    private final By information = By.xpath("//div[contains(text(),'FREE PONY EXPRESS DELIVERY!')]");
    public final By submitOrder = By.id("finish");
    public final By finalMessage = By.xpath("//h2[contains(text(),'THANK YOU FOR YOUR ORDER')]");
    WebDriver chrome;

    public Checkout(WebDriver chrome) {
        this.chrome = chrome;
    }

    public void proceedToCheckout(String name, String lastname, String zip) {

        chrome.findElement(firstName).sendKeys(name);
        chrome.findElement(lastName).sendKeys(lastname);
        chrome.findElement(zipCode).sendKeys(zip);
        chrome.findElement(continueButton).click();

        String ExpectedText = chrome.findElement(information).getText();
        assertEquals("FREE PONY EXPRESS DELIVERY!", ExpectedText);
        chrome.findElement(submitOrder).click();

        String finalText = chrome.findElement(finalMessage).getText();
        assertEquals("THANK YOU FOR YOUR ORDER", finalText);

    }

}
