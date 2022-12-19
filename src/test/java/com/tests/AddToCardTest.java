package com.tests;

import com.OpenBrowser;
import com.implementations.AddToCard;
import com.implementations.LoginPage;
import org.testng.annotations.Test;

public class AddToCardTest extends OpenBrowser {

    AddToCard addToCard;
    LoginPage loginPage;


    public void cardAction() {
        addToCard = new AddToCard(chrome);
        loginPage = new LoginPage(chrome);

        loginPage.loginUser("standard_user", "secret_sauce");

    }

    @Test(priority = 2, description = "Add Product to Card")


    public void addProduct() {
        cardAction();
        addToCard.addCard();

    }

    @Test(priority = 3, description = "Add Product to Card")
    public void removeProduct() {

        addProduct();
        addToCard.removeCard();

    }
}
