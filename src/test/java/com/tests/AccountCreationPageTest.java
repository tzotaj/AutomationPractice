package com.tests;

import com.OpenBrowser;
import com.pageobjects.AccountCreationPage;
import com.pageobjects.LoginPage;
import org.testng.annotations.Test;

public class AccountCreationPageTest extends OpenBrowser {

    LoginPage login; //connect me LoginPage;
    AccountCreationPage createAccount;

    @Test
    public void newAccount() throws InterruptedException {

        login = new LoginPage(chrome); //inicializim i loginpage


        login.loginUser("test","test2");
        createAccount= new AccountCreationPage(chrome);
        createAccount.createNewAccount();



    }
}
