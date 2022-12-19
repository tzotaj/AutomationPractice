package com.tests;

import com.OpenBrowser;
import com.implementations.LoginPage;
import org.testng.annotations.Test;


public class LoginPageTest extends OpenBrowser {
    LoginPage login;        //inicializojme nje objekt te tipit LoginPage

    @Test(priority = 1, description = "Prerequisite Login")
    public void EnterApp() {

        login = new LoginPage(chrome);      //krijojme nje objekt te klases login ne menyre qe te perdorim metodat e kesaj klase

        login.loginUser("standard_user", "secret_sauce"); //therrasim metoden e loginit

    }
}
