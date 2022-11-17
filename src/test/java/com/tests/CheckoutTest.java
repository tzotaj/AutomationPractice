package com.tests;

import com.OpenBrowser;
import com.pageobjects.AddToCard;
import com.pageobjects.Checkout;
import com.pageobjects.YourCard;
import org.testng.annotations.Test;


public class CheckoutTest extends OpenBrowser {
    Checkout checkout;
    YourCard yourCard;
    AddToCard addToCard;

    @Test
    public void CheckoutProduct() throws InterruptedException {

        addToCard.addCard();
        Thread.sleep(2000);
        yourCard.viewCard();
        Thread.sleep(2000);
        checkout.proceedToCheckout("Tedi","Zotaj","2001");

    }

}
