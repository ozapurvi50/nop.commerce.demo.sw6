package com.nopcommerce.demo.sw6.cucumber.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.sw6.cucumber.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CheckOutPage extends Utility {

    private static final Logger log = LogManager.getLogger(CheckOutPage.class.getName());

    @CacheLookup
    @FindBy(id = "BillingNewAddress_FirstName")
    WebElement firstName;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_LastName")
    WebElement lastName;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_Email")
    WebElement email;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_CountryId")
    WebElement country;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_City")
    WebElement city;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_Address1")
    WebElement addressLine1;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    WebElement zipCode;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement telNumber;

    @CacheLookup
    @FindBy(xpath = "//button[@onclick='Billing.save()']")
    WebElement continueBtn;

    @CacheLookup
    @FindBy(id = "shippingoption_1")
    WebElement nextDayAirRadioBtn;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 shipping-method-next-step-button']")
    WebElement shippingContinueBtn;

    @CacheLookup
    @FindBy(id = "paymentmethod_1")
    WebElement creditCardOption;

    @CacheLookup
    @FindBy(xpath = "//button[@name='save' and @class='button-1 payment-method-next-step-button']")
    WebElement paymentContinueOption;

    @CacheLookup
    @FindBy(id = "CreditCardType")
    WebElement creditCardOption1;

    @CacheLookup
    @FindBy(id = "CardholderName")
    WebElement cardHolderName;

    @CacheLookup
    @FindBy(id = "CardNumber")
    WebElement cardNumber;

    @CacheLookup
    @FindBy(id = "ExpireMonth")
    WebElement expireMonth;

    @CacheLookup
    @FindBy(id = "ExpireYear")
    WebElement expireYear;

    @CacheLookup
    @FindBy(id = "CardCode")
    WebElement cCode;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-info-next-step-button']")
    WebElement continueCardPayment;

    @CacheLookup
    @FindBy(xpath = "//li[@class='payment-method']//span[@class='value']")
    WebElement paymentMethod;

    @CacheLookup
    @FindBy(xpath = "//li[@class='shipping-method']//span[@class='value']")
    WebElement shippingMethod;

    @CacheLookup
    @FindBy(xpath = "//span[@class='value-summary']//strong")
    WebElement total;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Confirm')]")
    WebElement confirm;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Thank you')]")
    WebElement thankYou;

    @CacheLookup
    @FindBy(xpath = "//strong[contains(text(),'Your order has been successfully processed!')]")
    WebElement orderMessage;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueClick;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement welcomeToStoreText;

    @CacheLookup
    @FindBy(id = "shippingoption_2")
    WebElement radioBtn2ndDayAir;

    @CacheLookup
    @FindBy(xpath = "//button[@name='save' and @class='button-1 payment-method-next-step-button']")
    WebElement visaCard;


    public void inputFirstName(String fName) {

        sendTextToElement(firstName, fName);
        log.info("Send text to First Name : " + firstName.toString());

    }

    public void inputLastName(String lName) {

        sendTextToElement(lastName, lName);
        log.info("Send text to Last Name : " + lastName.toString());
    }

    public void inputEmail(String email1) {

        sendTextToElement(email, email1);
        log.info("Send text to email : " + email.toString());
    }

    public void selectCountry(String country1) {

        selectByVisibleTextFromDropDown(country, country1);
        log.info("Select from dropdown  to country : " +country.toString());

    }

    public void inputCity(String city1) {

        sendTextToElement(city, city1);
        log.info("Send text to city : " + city.toString());
    }

    public void inputAddress(String address1) {

        sendTextToElement(addressLine1, address1);
        log.info("Send text to address : " + addressLine1.toString());

    }

    public void inputZipCode(String zipCode1) {

        sendTextToElement(zipCode, zipCode1);
        log.info("Send text to zipcode : " + zipCode.toString());
    }

    public void inputTelephoneNumber(String telNum) {

        sendTextToElement(telNumber, telNum);
        log.info("Send text to Phone number : " + telNumber.toString());

    }

    public void clickOnContinueBtn() {

        clickOnElement(continueBtn);
        log.info("Click on Continue button " + continueBtn.toString());
    }

    public void clickOnNextDayAirRadioBtn() {

        clickOnElement(nextDayAirRadioBtn);
        log.info("Click on Radio Button: " + nextDayAirRadioBtn.toString());
    }

    public void clickOnContinueOnShipping() {

        clickOnElement(shippingContinueBtn);
        log.info("Click on Continue button " + shippingContinueBtn.toString());

    }

    public void clickOnCreditCard() {

        clickOnElement(creditCardOption);
        log.info("Click on Credit card button " + creditCardOption.toString());
    }

    public void clickOnPaymentContinue() {

        clickOnElement(paymentContinueOption);
        log.info("Click on Payment Continue button " + paymentContinueOption.toString());
    }

    public void selectCreditCard(String creditCard1) throws InterruptedException {

        Thread.sleep(2000);
        selectByVisibleTextFromDropDown(creditCardOption1, creditCard1);
        log.info("Select card by visible text from dropdown " + creditCardOption1.toString());

    }

    public void inputCardHolderName(String cName) {

        sendTextToElement(cardHolderName, cName);

        log.info("Send text to card holder name : " + cardHolderName.toString());
    }

    public void inputCardNumber(String cardNum) {

        sendTextToElement(cardNumber, cardNum);
        log.info("Send text to card number field : " + cardNumber.toString());

    }

    public void selectExpireMonth(String expMonth) {

        selectByVisibleTextFromDropDown(expireMonth, expMonth);
        log.info("Select card by visible text from dropdown " + expireMonth.toString());

    }

    public void selectExpireYear(String expYear) {

        selectByVisibleTextFromDropDown(expireYear, expYear);
        log.info("Select card by visible text from dropdown " + expireYear.toString());

    }

    public void inputCardCode(String code) {

        sendTextToElement(cCode, code);

        log.info("Send text to code: " + cCode.toString());
    }

    public void clickOnContinuCardPayment() {

        clickOnElement(continueCardPayment);
        log.info("Click on Continue Card Payment : " + continueCardPayment.toString());
    }

    public void verifyPaymentMethod(String expectedMessage) {

        verifyElements(paymentMethod, expectedMessage, "payment method not displayed");
        log.info("Verify Text from Webpage");
    }

    public void verifyShippingMethod(String expectedMessage) {

        verifyElements(shippingMethod, expectedMessage, "shipping method is not correct");
        log.info("Verify Text from Webpage");
    }

    public void verifyTotal(String expectedMessage) {

        verifyElements(total, expectedMessage, "Total is not correct");
        log.info("Verify Text from Webpage");
    }

    public void clickOnConfirm() {

        clickOnElement(confirm);
        log.info("Click on confirm " + confirm.toString());
    }

    public void verifyThankYou(String expectedMessage) {

        verifyElements(thankYou, expectedMessage, "Message not displayed");
        log.info("Verify Text from Webpage");
    }

    public void verifyOrderConfirmation(String expectedMessage) {

        verifyElements(orderMessage, expectedMessage, "Order is confirm");
        log.info("Verify Text from Webpage");
    }

    public void clickOnContinue() {

        clickOnElement(continueClick);
        log.info("Click on continue " +continueClick.toString());
    }

    //    public void verifyTextWelcomeToOurStore(String expectedMessage){
//        verifyElements(Welcome to our store,);
    //   }
    public void clickOnRadioBtn2ndDayAir() {

        clickOnElement(radioBtn2ndDayAir);
        log.info("Click on radio button " + radioBtn2ndDayAir.toString());
    }

    public void inputVisaCardNumber(String vCardNumber) {

        sendTextToElement(visaCard, vCardNumber);
        log.info("Send text to card number : " + visaCard.toString());
    }

    public void verifyNokiaCartTotal(String expectedTotal) {

        verifyElements(total, expectedTotal, "Total not displayed as expected");
        log.info("Verify Text from Webpage");
    }
}
