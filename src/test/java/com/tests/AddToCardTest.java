package com.tests;

import com.OpenBrowser;
import com.pageobjects.AddToCard;
import com.pageobjects.LoginPage;
import org.testng.annotations.Test;

public class AddToCardTest extends OpenBrowser {

    AddToCard addToCard;
    LoginPage loginPage;

    public void cardAction() throws InterruptedException {
        addToCard = new AddToCard(chrome);
        loginPage = new LoginPage(chrome);

        loginPage.loginUser("standard_user","secret_sauce");
        Thread.sleep(2000);


    }

    @Test
    public void addProduct() throws InterruptedException {
        cardAction();

        addToCard.addCard();

    }
    @Test
    public void removeProduct() throws InterruptedException {

        addProduct();
        Thread.sleep(2000);
        addToCard.removeCard();
        Thread.sleep(2000);

    }

}
