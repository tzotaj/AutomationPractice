package com.tests;

import com.OpenBrowser;
import com.pageobjects.YourCard;
import org.testng.annotations.Test;

public class YourCardTest extends OpenBrowser {
    YourCard yourcard;

    @Test
    public void checkCard(){
        yourcard.viewCard();

    }
}
