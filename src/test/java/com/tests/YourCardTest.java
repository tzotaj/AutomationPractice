package com.tests;

import com.OpenBrowser;
import com.implementations.AddToCard;
import com.implementations.LoginPage;
import com.implementations.YourCard;
import org.testng.annotations.Test;

public class YourCardTest extends OpenBrowser {
    YourCard yourcard;
    LoginPage login;
    AddToCard addtocard;

    @Test(priority = 4, description = "View Products on Card")
    public void checkCard() throws InterruptedException {
        yourcard = new YourCard(chrome); //inicializojm page object yourcard
        login = new LoginPage(chrome);
        addtocard = new AddToCard(chrome);

        login.loginUser("standard_user", "secret_sauce");
        addtocard.addCard();
        yourcard.viewCard();

    }
}
