package com.nopcommerce.demo.sw6.cucumber.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.sw6.cucumber.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegisterPage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//h1[text()='Register']")
    WebElement registerText;

    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstName;
    @CacheLookup

    @FindBy(id = "LastName")
    WebElement lastName;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement email;

    @CacheLookup
    @FindBy(id = "Password")
    WebElement password;

    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPassword;

    @CacheLookup
    @FindBy(id = "register-button")
    WebElement register;

    @CacheLookup
    @FindBy(xpath = "//div[@class='result']")
    WebElement registerMessage;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueBtn;

    public void verifyTextRegister(String expectedText) {

        verifyElements(registerText, expectedText, "Text is not Displayed");
        log.info("Verify Text from Webpage");
    }

    public void inputFirstNameField(String name) {

        sendTextToElement(firstName, name);
        log.info("Send text to First name : " + firstName.toString());
    }

    public void lastNameField(String lName) {

        sendTextToElement(lastName, lName);
        log.info("Send text to Last Name : " + lastName.toString());
    }

    public void emailField(String email1) {

        sendTextToElement(email, email1);
        log.info("Send text to email : " + email.toString());
    }

    public void passwordField(String password1) {

        sendTextToElement(password, password1);
        log.info("Send text to password : " + password.toString());
    }

    public void confirmPasswordField(String confirmPass) {

        sendTextToElement(confirmPassword, confirmPass);

    }

    public void clickOnRegister() {

        clickOnElement(register);
        log.info("Click on register " + register.toString());
    }

    public void verifyRegisterTextMessage(String expextedMessage) {

        verifyElements(registerMessage, expextedMessage, "Message is not displayed");
        log.info("Verify Text from Webpage");
    }

    public void clickOnContinueBtn() {

        clickOnElement(continueBtn);
        log.info("Click on continue " + continueBtn.toString());
    }
}
