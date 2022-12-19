package com.implementations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.report.Logs;

import static org.testng.Assert.assertEquals;


public class YourCard {
    public final By basket = By.className("shopping_cart_link");
    private final By productTitle = By.className("inventory_item_name");
    private final By checkout = By.id("checkout");
    private final By checkoutTitle = By.xpath("//span[contains(text(),'Checkout: Your Information')]");

    WebDriver chrome;

    public YourCard(WebDriver chrome) {
        this.chrome = chrome;

    }

    public void viewCard() {

        chrome.findElement(basket).click();
        Logs.warn("View basket item successful");


        String ExpectedText = chrome.findElement(productTitle).getText();
        assertEquals("Sauce Labs Fleece Jacket", ExpectedText);
        Logs.info("Title matches");


        chrome.findElement(checkout).click();
        String ExpectedText2 = chrome.findElement(checkoutTitle).getText();
        assertEquals("CHECKOUT: YOUR INFORMATION", ExpectedText2);
        Logs.info("Checkout information");


    }


}
