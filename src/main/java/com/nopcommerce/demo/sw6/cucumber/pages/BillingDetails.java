package com.nopcommerce.demo.sw6.cucumber.pages;

import com.nopcommerce.demo.sw6.cucumber.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BillingDetails extends Utility {

    private static final Logger log = LogManager.getLogger(BillingDetails.class.getName());

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_FirstName']")
    WebElement billingName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_LastName']")
    WebElement billingLAstName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_Email']")
    WebElement billingEmail;

    @CacheLookup
    @FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']")
    WebElement dropCountryDownList;

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_City']")
    WebElement city;

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_Address1']")
    WebElement address1;

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_ZipPostalCode']")
    WebElement postcode;

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_PhoneNumber']")
    WebElement phoneNumber;

    @CacheLookup
    @FindBy(xpath = "//button[@onclick='Billing.save()']")
    WebElement clickOnContinueButton;

    public void enterBillingName(String name){

        sendTextToElement(billingName, name);
        log.info("Send text to Billing name : " + billingName.toString());
    }

    public void enterBillingLastName(String lastname){
        sendTextToElement(billingLAstName, lastname);
        log.info("Send text to Billing last name : " + billingLAstName.toString());
    }
    public void enterBillingEmail(String email){
        sendTextToElement(billingEmail, email);
        log.info("Send text to Billing email : " + billingEmail.toString());
    }
    public void enterBillingPhone(String phone){

        sendTextToElement(phoneNumber, phone);
        log.info("Send text to Phone number : " + phoneNumber.toString());
    }
    public void enterAddress(String address){
        sendTextToElement(address1, address);
        log.info("Send text to Address : " + address.toString());
    }
    public void enterCity(String city1){

        sendTextToElement(city, city1);
        log.info("Send text to City name : " + city.toString());
    }
    public void enterPostalCode(String pCode){

        sendTextToElement(postcode, pCode);
        log.info("Send text to Post code : " + postcode.toString());
    }
    public void enterCountry(String text){

        selectByVisibleTextFromDropDown(dropCountryDownList, text);
        log.info("Select country by visible name from dropdown list : ");
    }
    public void clickOnContinueButtonOnBillingPage(){

        clickOnElement(clickOnContinueButton);
        log.info("Click on Continue Button " + clickOnContinueButton.toString());
    }


}
