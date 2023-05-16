package com.nopcommerce.demo.sw6.cucumber.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.sw6.cucumber.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class SignInPage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    @CacheLookup
    @FindBy(xpath = ("//div[@class='page-title']//h1"))
    WebElement welcomeText;

    @CacheLookup
    @FindBy(xpath = ("//button[text()='Checkout as Guest']"))
    WebElement checkoutAsGuestBtn;

    @CacheLookup
    @FindBy(xpath = ("//button[text()='Register']"))
    WebElement registerBtn;

    public void verifyWelcomeText(String expectedMessage) {
        verifyElements(welcomeText, expectedMessage, "Welcome message is not displayed");
        log.info("Verify Text from Webpage");
    }

    public void clickOnCheckoutAsGuestBtn() {

        clickOnElement(checkoutAsGuestBtn);
        log.info("Click on checkout " + checkoutAsGuestBtn.toString());
    }

    public void clickOnRegisterBtn() {

        clickOnElement(registerBtn);
        log.info("Click on register button " + registerBtn.toString());

    }
}
