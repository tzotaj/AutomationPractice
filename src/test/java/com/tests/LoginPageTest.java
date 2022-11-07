package com.tests;

import com.OpenBrowser;
import com.mystore.BaseClass;
import org.testng.annotations.Test;
import com.pageobjects.LoginPage;


public class LoginPageTest extends OpenBrowser {

    LoginPage login;


       @Test
       public void EnterApp() throws InterruptedException {

           login= new LoginPage(chrome);

           login.loginUser("tedi","1234");
       }





}
