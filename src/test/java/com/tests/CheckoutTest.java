package com.tests;

import com.OpenBrowser;
import com.pageobjects.AddToCard;
import com.pageobjects.Checkout;
import com.pageobjects.LoginPage;
import com.pageobjects.YourCard;
import org.testng.annotations.Test;


public class CheckoutTest extends OpenBrowser {
    Checkout checkout;
    YourCard yourCard;
    AddToCard addToCard;

    LoginPage login;

    @Test(priority = 5, description = "Product checkout")
    public void CheckoutProduct() throws InterruptedException {
        checkout = new Checkout(chrome);
        yourCard = new YourCard(chrome);
        addToCard = new AddToCard(chrome);
        login = new LoginPage(chrome);

        login.loginUser("standard_user","secret_sauce");
        addToCard.addCard();
        yourCard.viewCard();
        checkout.proceedToCheckout("Tedi","Zotaj","2001");


    }

}
