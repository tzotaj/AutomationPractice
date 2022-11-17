package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCard {

    public final  By addToCard = By.id("add-to-cart-sauce-labs-backpack");
    public final  By remove = By.id("remove-sauce-labs-backpack");

    WebDriver chrome;

    public AddToCard(WebDriver chrome){
        this.chrome = chrome;

    }
    public void addCard(){

        chrome.findElement(addToCard).click();


    }

    public void removeCard(){


        chrome.findElement(remove).click();

    }
}
