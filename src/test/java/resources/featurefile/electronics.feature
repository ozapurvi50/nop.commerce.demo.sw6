
Feature: Electronics Test

  As a user I should able to navigate to Cell Phone page successfully
  and can verify that product added successfully and place the order successfully

  Background: I am on homepage
  @smoke
  Scenario: Verify navigate to Cell Phone successfully
    Given   I mouse hover on "Electronics"
    When    I mouse hover on "Cell phone" and click
    Then    I verify the text "Cell phones"

@sanity
Scenario Outline:: Verify product added successfully and place order successfully
    Given   I mouse hover on "Electronics"
    When    I mouse hover on "Cell phone" and click
    And     I verify the text "Cell phones"
    And     I click on list tab
    And     I click on Nokia Lumia
    And     I verify text nokia lumia "Nokia Lumia 1020"
    And     I verify  price "$349.00"
    And     I change quantity "2"
    And     I click on add to cart tab
    And     I verify shopping cart message "The product has been added to your shopping cart"
    And     I click on green button
    And     I mouse hover on shopping cart
    And     I click on go to cart
    And     I verify shopping cart title "Shopping cart"
    And     I verify the quantity
    And     I verify the total "$698.00"
    And     I click on terms of service checkbox
    And     I click on checkout button
    And     I click on Register button
    And     I verify text "Register"
    And     I input first name "<Firstname>"
    And     I input last name "<Lastname>"
    And     I input email address
    And     I input Password "<Password>"
    And     I input confirm password "<Confirm Password>"
    And     I click on register
    And     I verify register text message "Your registration completed"
    And     I click on Continue button
    And     I verify Shopping Cart title "Shopping cart"
  Examples:
    | Firstname | Lastname | Password    | Confirm Password |
    | James     | Simon    | password123 | password123      |