package com.tests;

import com.OpenBrowser;
import com.pageobjects.LoginPage;
import org.testng.annotations.Test;


public class LoginPageTest extends OpenBrowser {

    LoginPage login;


       @Test(priority = 1, description = "Prerequisite Login")
       public void EnterApp() throws InterruptedException {

           login= new LoginPage(chrome);

           login.loginUser("standard_user","secret_sauce");

       }





}
