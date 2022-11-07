package com.pageobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class AccountCreationPage {

    private final By CreateAccountEmail = By.id("SubmitCreate");
    private final By GenderSelect = By.id("id_gender1");
    private final By Firstname = By.id("customer_firstname");
    private final By Password = By.id("passwd");
    private final By Lastname = By.id("lastname");
    private final By Company = By.id("company");
    private final By Address = By.id("address1");
    private final By City = By.id("City");
    private final By Postcode = By.id("postcode");
    private final By PhoneNr = By.id("phone_mobile");

    private final By SubmitAccountCreation = By.id("submitAccount");

    WebDriver chrome;

    public AccountCreationPage(WebDriver chrome) {
        this.chrome = chrome;
    }

    public void createNewAccount() throws InterruptedException {

        chrome.findElement(CreateAccountEmail).sendKeys("testemail@test.com");
        chrome.findElement(SubmitAccountCreation).click();
        Thread.sleep(2000);

        chrome.findElement(GenderSelect).sendKeys("1");
        chrome.findElement(Firstname).sendKeys("Tedi");
        chrome.findElement(Lastname).sendKeys("Test");
        chrome.findElement(Password).sendKeys("12345");
        chrome.findElement(Company).sendKeys("Ritech");
        chrome.findElement(Address).sendKeys("Main Address");
        chrome.findElement(City).sendKeys("Phoenix");
        chrome.findElement(Postcode).sendKeys("12345");
        chrome.findElement(PhoneNr).sendKeys("06012341234");

        chrome.findElement(SubmitAccountCreation).click();


    }
}