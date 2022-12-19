package com.implementations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.apache.logging.log4j.*;

import static org.testng.Assert.assertEquals;


public class YourCard {
    public final By basket = By.className("shopping_cart_link");
    private final By productTitle = By.className("inventory_item_name");
    private final By checkout = By.id("checkout");
    private final By checkoutTitle = By.xpath("//span[contains(text(),'Checkout: Your Information')]");
    private static Logger demologger = LogManager.getLogger(LoginPage.class.getName());

    WebDriver chrome;

    public YourCard(WebDriver chrome) {
        this.chrome = chrome;

    }

    public void viewCard() {

        chrome.findElement(basket).click();
        demologger.info("View basket item successful");


        String ExpectedText = chrome.findElement(productTitle).getText();
        assertEquals("Sauce Labs Fleece Jacket", ExpectedText);
        demologger.info("Title matches");


        chrome.findElement(checkout).click();
        String ExpectedText2 = chrome.findElement(checkoutTitle).getText();
        assertEquals("CHECKOUT: YOUR INFORMATION", ExpectedText2);
        demologger.info("Checkout information");


    }


}
