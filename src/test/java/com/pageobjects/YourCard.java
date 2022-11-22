package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertEquals;


public class YourCard {

    public final By Basket = By.className("shopping_cart_link");
    private final By ProductTitle= By.className("inventory_item_name");
    private final By Checkout= By.id("checkout");

    private final By CheckoutTitle = By.xpath("//span[contains(text(),'Checkout: Your Information')]");
    WebDriver chrome;

    public YourCard(WebDriver chrome){
        this.chrome = chrome;

    }

    public void viewCard() throws InterruptedException {

        chrome.findElement(Basket).click();
        String ExpectedText = chrome.findElement(ProductTitle).getText();
        assertEquals("Sauce Labs Backpack",ExpectedText);
        Thread.sleep(3000);
        chrome.findElement(Checkout).click();
        String ExpectedText2 = chrome.findElement(CheckoutTitle).getText();
        assertEquals("CHECKOUT: YOUR INFORMATION",ExpectedText2);
        Thread.sleep(3000);


    }


}
