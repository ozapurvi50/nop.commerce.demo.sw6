package com.nopcommerce.demo.sw6.cucumber.steps;

import com.nopcommerce.demo.sw6.cucumber.pages.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ElectronicsSteps {

    @Given("^I mouse hover on \"([^\"]*)\"$")
    public void iMouseHoverOn(String electronics) {

        new HomePage().mouseHoverOnElectronics();
    }

    @When("^I mouse hover on \"([^\"]*)\" and click$")
    public void iMouseHoverOnAndClick()  {

        new HomePage().mouseHoverAndClickOnCellPhones();
    }


    @Then("^I verify the text \"([^\"]*)\"$")
    public void iVerifyTheText(String text) {
        new CellPhonesPage().verifyTextCellPhone(text);

    }

    @And("^I click on list tab$")
    public void iClickOnListTab() {
        new CellPhonesPage().clickOnListTab();
    }

    @And("^I click on Nokia Lumia$")
    public void iClickOnNokiaLumia() throws InterruptedException{
        Thread.sleep(2000);
        new CellPhonesPage().clickOnNokiaLumia1020();
    }

    @And("^I verify text nokia lumia \"([^\"]*)\"$")
    public void iVerifyTextNokiaLumia(String expText) {
        new NokiaLumiaPage().verifyTextNokiaLumia1020(expText);
    }

    @And("^I verify  price \"([^\"]*)\"$")
    public void iVerifyPrice(String expectedPrice) {
        new NokiaLumiaPage().verifyThePrice(expectedPrice);

    }

    @And("^I change quantity \"([^\"]*)\"$")
    public void iChangeQuantity(String qty) {
        new NokiaLumiaPage().changeQuantity(qty);

    }

    @And("^I click on add to cart tab$")
    public void iClickOnAddToCartTab() {
        new NokiaLumiaPage().clickOnCartBtn();
    }

    @And("^I verify shopping cart message \"([^\"]*)\"$")
    public void iVerifyShoppingCartMessage(String expectedMessage) {
new NokiaLumiaPage().verifyShoppingCartMessage(expectedMessage);
    }

    @And("^I click on green button$")
    public void iClickOnGreenButton() {
        new NokiaLumiaPage().clickOnGreenBtn();
    }

    @And("^I mouse hover on shopping cart$")
    public void iMouseHoverOnShoppingCart() {
        new NokiaLumiaPage().mouseHoverOnShoppingCart();
    }

    @And("^I click on go to cart$")
    public void iClickOnGoToCart() {
        new NokiaLumiaPage().clickOnGoToCart();
    }

    @And("^I verify shopping cart title \"([^\"]*)\"$")
    public void iVerifyShoppingCartTitle(String title) {
        new ShoppingCartPage().verifyShoppingCartTitle(title);

    }

    @And("^I verify the quantity$")
    public void iVerifyTheQuantity() {

        new ShoppingCartPage().verifyTheQuantity();

    }

    @And("^I verify the total \"([^\"]*)\"$")
    public void iVerifyTheTotal(String total) {
        new ShoppingCartPage().verifyTotal(total);

    }

    @And("^I click on terms of service checkbox$")
    public void iClickOnTermsOfServiceCheckbox() {
        new ShoppingCartPage().clickOnTermsOfServiceCheckbox();
    }



    @And("^I click on Register button$")
    public void iClickOnRegisterButton() {
        new SignInPage().clickOnRegisterBtn();
    }

    @And("^I verify text \"([^\"]*)\"$")
    public void iVerifyText(String register) {
    new RegisterPage().verifyTextRegister(register);

    }

    @And("^I input first name \"([^\"]*)\"$")
    public void iInputFirstName(String name) {
       new RegisterPage().inputFirstNameField(name);

    }

    @And("^I input last name \"([^\"]*)\"$")
    public void iInputLastName(String lName) {
        new RegisterPage().lastNameField(lName);

    }

    @And("^I input email address$")
    public void iInputEmailAddress() {
        new RegisterPage().emailField("Prime18790@gmail.com");
    }

    @And("^I input Password \"([^\"]*)\"$")
    public void iInputPassword(String password) {
        new RegisterPage().passwordField(password);

    }

    @And("^I input confirm password \"([^\"]*)\"$")
    public void iInputConfirmPassword(String conpassword) {
        new RegisterPage().confirmPasswordField(conpassword);

    }

    @And("^I click on register$")
    public void iClickOnRegister() {
       new RegisterPage().clickOnRegister();
    }

    @And("^I verify register text message \"([^\"]*)\"$")
    public void iVerifyRegisterTextMessage(String arg0) {
new RegisterPage().verifyRegisterTextMessage("Your registration completed");
    }

    @And("^I click on Continue button$")
    public void iClickOnContinueButton() {
      new RegisterPage().clickOnContinueBtn();
    }

    @And("^I verify Shopping Cart title \"([^\"]*)\"$")
    public void iVerifyShoppingCartTitle2(String title) {
        new ShoppingCartPage().verifyShoppingCartTitle(title);
    }


    @When("^I mouse hover on \"([^\"]*)\" phone and click$")
    public void iMouseHoverOnPhoneAndClick(String cellphones){
        new HomePage().mouseHoverOnElectronics();;
    }

    @When("^I mouse hover on \"([^\"]*)\" phone$")
    public void iMouseHoverOnPhone(String Cellphones) {
        new HomePage().mouseHoverOnElectronics();;
    }

    @And("^I click on checkout button$")
    public void iClickOnCheckoutButton() {

        new ShoppingCartPage().clickOnCheckOutBtn();
    }
}
