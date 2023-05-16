package com.nopcommerce.demo.sw6.cucumber.steps;

import com.nopcommerce.demo.sw6.cucumber.pages.*;
import com.nopcommerce.demo.sw6.cucumber.utility.Utility;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ComputerSteps {
    @Given("^I click on \"([^\"]*)\"$")
    public void iClickOn(String menu) {
        new HomePage().selectMenu(menu);
    }

    @When("^I click on Desktop$")
    public void iClickOnDesktop() {
        new ComputerPage().clickOnDesktop();

    }

    @And("^I select \"([^\"]*)\" from Sort By dropdown$")
    public void iSelectFromSortByDropdown(String filters) {
        new DesktopPage().selectZToAFromSortByDropdown(filters);

    }

    @Then("^I verify Products are displayed in Descending order$")
    public void iVerifyProductsAreDisplayedInDescendingOrder() {
        new DesktopPage().verifyProductAreInDescendingOrder();
    }

    @And("^I Click on add to cart button$")
    public void userClickOnAddToCartButton() throws InterruptedException {
        Thread.sleep(1000);
        new DesktopPage().clickOnAddToCart();
    }

    @Then("^I verify \"([^\"]*)\" title$")
    public void iVerifyTitle(String expectedTitle) {
        new BuildYourOwnComputerPage().verifyBuildYourOwnComputerText(expectedTitle);
    }

    @And("^I select processor \"([^\"]*)\"$")
    public void iSelectProcessor(String processor) {
        new BuildYourOwnComputerPage().selectProcessor(processor);

    }

    @And("^I select RAM \"([^\"]*)\"$")
    public void iSelectRAM(String ram) {
        new BuildYourOwnComputerPage().selectRAM(ram);
    }

    @And("^I select HDD \"([^\"]*)\"$")
    public void iSelectHDD(String hdd) {
        new BuildYourOwnComputerPage().selectHDD(hdd);
    }

    @And("^I select OS \"([^\"]*)\"$")
    public void iSelectOS(String os) {
        new BuildYourOwnComputerPage().selectOS(os);
    }

    @And("^I select Software \"([^\"]*)\"$")
    public void iSelectSoftware(String software) {
        new BuildYourOwnComputerPage().selectSoftware(software);
    }

    @Then("^I verify the price \"([^\"]*)\"$")
    public void iVerifyThePrice(String price) {
        new BuildYourOwnComputerPage().verifyPrice(price);
    }

    @And("^I Click on add to cart button on Build your own computer$")
    public void iClickOnAddToCartButtonOnBuildYourOwnComputer() {
        new BuildYourOwnComputerPage().clickOnAddToCart();
    }

    @Then("^User verify add to cart message \"([^\"]*)\"$")
    public void userVerifyAddToCartMessage(String expectedMessage)  {
        new BuildYourOwnComputerPage().verifyAddToCartMessage(expectedMessage);
    }


    @And("^User click on cross button$")
    public void userClickOnCrossButton() {
        new BuildYourOwnComputerPage().clickOnCrossButton();
    }


    @And("^User mouse hover on shopping cart$")
    public void userMouseHoverOnShoppingCart() {
        new BuildYourOwnComputerPage().mouseHoverOnShoppingCart();
    }


    @And("^User click on go to cart$")
    public void userClickOnGoToCart() {
        new BuildYourOwnComputerPage().clickOnGoToCart();
    }

    @Then("^User verify title \"([^\"]*)\"$")
    public void userVerifyTitle(String title)  {
        new ShoppingCartPage().verifyShoppingCartTitle(title);
    }

    @And("^I change in quantity and click on update cart \"([^\"]*)\"$")
    public void iChangeInQuantityAndClickOnUpdateCart(String qty) {
        new ShoppingCartPage().changeQuantityAndUpdateCart(qty);
    }


    @Then("^User verify the total \"([^\"]*)\"$")
    public void userVerifyTheTotal(String total)  {
        new ShoppingCartPage().verifyTotal(total);
    }

    @And("^User clicks on checkbox$")
    public void userClicksOnCheckbox() {
        new ShoppingCartPage().clickOnTermsOfServiceCheckbox();
    }

    @And("^User click on checkout button$")
    public void userClickOnCheckoutButton() throws InterruptedException {
        Thread.sleep(1000);
        new ShoppingCartPage().clickOnCheckOutBtn();
    }

    @And("^I verify the welcome text \"([^\"]*)\"$")
    public void iVerifyTheWelcomeText(String text)  {
        new SignInPage().verifyWelcomeText(text);

    }
    @And("^I click on checkout as guest button$")
    public void iClickOnCheckoutAsGuestButton() {
        new SignInPage().clickOnCheckoutAsGuestBtn();
    }


    @And("^I input first name field \"([^\"]*)\"$")
    public void iInputFirstNameField(String fname)  {
        new CheckOutPage().inputFirstName(fname);

    }

    @And("^I input last name field \"([^\"]*)\"$")
    public void iInputLastNameField(String lname)  {
        new CheckOutPage().inputLastName(lname);

    }

    @And("^I select country \"([^\"]*)\"$")
    public void iSelectCountry(String country)  {
        new CheckOutPage().selectCountry(country);

    }

    @And("^I input city \"([^\"]*)\"$")
    public void iInputCity(String city)  {
        new CheckOutPage().inputCity(city);

    }

    @And("^I input address \"([^\"]*)\"$")
    public void iInputAddress(String address)  {
        new CheckOutPage().inputAddress(address);

    }

    @And("^I input zipcode \"([^\"]*)\"$")
    public void iInputZipcode(String zipcode)  {
        new CheckOutPage().inputZipCode(zipcode);


    }

    @And("^I input telephone \"([^\"]*)\"$")
    public void iInputTelephone(String telephone)  {
        new CheckOutPage().inputTelephoneNumber(telephone);

    }

    @And("^I click on continue button$")
    public void iClickOnContinueButton() {
        new CheckOutPage().clickOnContinue();
    }

    @And("^I input email$")
    public void iInputEmail() {
        new CheckOutPage().inputEmail("Primex007@gmail.com");
    }

    @And("^I click on next day air radio button$")
    public void iClickOnNextDayAirRadioButton() {
        new CheckOutPage().clickOnNextDayAirRadioBtn();
    }

    @And("^I click on continue on shipping$")
    public void iClickOnContinueOnShipping() {
        new CheckOutPage().clickOnContinueOnShipping();
    }
    @And("^I click on credit card button$")
    public void iClickOnCreditCardButton() {
        new CheckOutPage().clickOnCreditCard();
    }
    @And("^I click on payment continue$")
    public void iClickOnPaymentContinue() {
        new CheckOutPage().clickOnPaymentContinue();
    }

    @And("^I select credit card \"([^\"]*)\"$")
    public void iSelectCreditCard(String creditCard) throws InterruptedException {
        new CheckOutPage().selectCreditCard(creditCard);

    }

    @And("^I input card holder name \"([^\"]*)\"$")
    public void iInputCardHolderName(String cardHolderName)  {
        new CheckOutPage().inputCardHolderName(cardHolderName);

    }


    @And("^I input card number \"([^\"]*)\"$")
    public void iInputCardNumber(String cardNumber)  {
        new CheckOutPage().inputCardNumber(cardNumber);

    }

    @And("^I select expire month \"([^\"]*)\"$")
    public void iSelectExpireMonth(String month)  {
        new CheckOutPage().selectExpireMonth(month);

    }

    @And("^I select expire year \"([^\"]*)\"$")
    public void iSelectExpireYear(String year) {
        new CheckOutPage().selectExpireYear(year);

    }

    @And("^I input card code \"([^\"]*)\"$")
    public void iInputCardCode(String cardCode)  {
        new CheckOutPage().inputCardCode(cardCode);

    }

    @And("^I click on continue card payment$")
    public void iClickOnContinueCardPayment() {
        new CheckOutPage().clickOnContinuCardPayment();
    }



    @And("^I verify payment method \"([^\"]*)\"$")
    public void iVerifyPaymentMethod(String paymentMethod)  {
        new CheckOutPage().verifyPaymentMethod(paymentMethod);

    }

    @And("^I verify shipping method \"([^\"]*)\"$")
    public void iVerifyShippingMethod(String shippingMethod)  {
        new CheckOutPage().verifyShippingMethod(shippingMethod);

    }

    @And("^I verify  total \"([^\"]*)\"$")
    public void iVerifyTotal(String total)  {
        new CheckOutPage().verifyTotal(total);

    }

    @And("^I click on confirm$")
    public void iClickOnConfirm() {
        new CheckOutPage().clickOnConfirm();
    }

    @And("^I verify thank you message \"([^\"]*)\"$")
    public void iVerifyThankYouMessage(String expectedMessage)  {
        new CheckOutPage().verifyThankYou(expectedMessage);

    }


    @And("^I verify order confirmation \"([^\"]*)\"$")
    public void iVerifyOrderConfirmation(String expectedMessage)  {
        new CheckOutPage().verifyOrderConfirmation(expectedMessage);

    }

    @And("^I click on continue$")
    public void iClickOnContinue() {
        new CheckOutPage().clickOnContinue();
    }


    @And("^I verify the text welcome to our store \"([^\"]*)\"$")
    public void iVerifyTheTextWelcomeToOurStore(String expectedMessage)  {
        new HomePage().verifyTheTextWelcomeToOurStore(expectedMessage);

    }

}
