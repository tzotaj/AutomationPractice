package com.implementations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AddToCard {

    public final  By addToCard = By.id("add-to-cart-sauce-labs-backpack");
    public final  By remove = By.id("remove-sauce-labs-backpack");

    private final By Title= By.xpath("//span[contains(text(),'Products')]");
    private final By AddallProd = By.xpath("//button[contains(@name,'add-to-cart')]");
    private final By prices = By.xpath("//div[contains(@class,'inventory_item_price')]");


    private final By DropDown = By.className("product_sort_container");




    WebDriver chrome;


    public AddToCard(WebDriver chrome){
        this.chrome = chrome;

    }


    public void addCard() throws InterruptedException {

        WebElement ddown = chrome.findElement(DropDown);
        Thread.sleep(2000);
        Select select = new Select(ddown);
        Thread.sleep(2000);
        select.selectByValue("lohi");
        Thread.sleep(2000);

        List <WebElement> AllProd= chrome.findElements(AddallProd);
        System.out.println(AllProd);

        List <WebElement> PriceList = chrome.findElements(prices);


        Boolean Locator= chrome.findElement(Title).isDisplayed();


      //  for(WebElement ele: AllProd){
        //    ele[1].click();
         //   Thread.sleep(2000);
      //  }

   if(Locator == true){
   chrome.findElement(addToCard).click();
       Thread.sleep(2000);
   }else{
       System.out.println("Element is not present on screen");
       }



    }

    public void removeCard()  {

        chrome.findElement(remove).click();


    }


}
