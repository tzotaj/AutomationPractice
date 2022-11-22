package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCard {

    public final  By addToCard = By.id("add-to-cart-sauce-labs-backpack");
    public final  By remove = By.id("remove-sauce-labs-backpack");

    private final By Title= By.xpath("//span[contains(text(),'Products')]");

    WebDriver chrome;

    public AddToCard(WebDriver chrome){
        this.chrome = chrome;

    }
    public void addCard(){

        Boolean Locator= chrome.findElement(Title).isDisplayed();

   if(Locator == true){
   chrome.findElement(addToCard).click();
   }else{
       System.out.println("Element is not present on screen");
        }

    }

    public void removeCard(){


        chrome.findElement(remove).click();

    }
}
