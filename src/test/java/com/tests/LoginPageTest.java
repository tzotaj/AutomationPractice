package com.tests;

import com.OpenBrowser;
import com.pageobjects.LoginPage;
import org.testng.annotations.Test;


public class LoginPageTest extends OpenBrowser {

    LoginPage login;


       @Test
       public void EnterApp() throws InterruptedException {

           login= new LoginPage(chrome);

           login.loginUser("standard_user","secret_sauce");

       }





}
