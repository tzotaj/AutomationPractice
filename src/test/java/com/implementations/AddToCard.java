package com.implementations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AddToCard {
    public final By remove = By.xpath("//button[contains(text(),'Remove')]");
    private final By prices = By.className("inventory_item_price");
    private final By priceBar = By.className("pricebar");
    private final By dropDown = By.className("product_sort_container");

    WebDriver chrome;

    public AddToCard(WebDriver chrome) {
        this.chrome = chrome;
    }

    public void addCard() {

        WebElement ddown = chrome.findElement(dropDown);
        Select select = new Select(ddown);
        select.selectByValue("lohi");

        List<WebElement> allProd = chrome.findElements(priceBar);        // pricebar permban price si dhe butonin add to card

        for (WebElement prod : allProd) {
            if (Double.valueOf(prod.findElement(prices).getText().substring(1)) >= 30) {
                prod.findElement(By.tagName("button")).click();
            }
        }

        for (WebElement prod : allProd) {
            if (Double.valueOf(prod.findElement(prices).getText().substring(1)) <= 10) {
                prod.findElement(By.tagName("button")).click();
            }
        }
    }

    public void removeCard() {
        chrome.findElement(remove).click();
    }
}
