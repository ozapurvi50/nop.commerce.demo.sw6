
Feature: Top Menu Test
  As a user I want to navigate to all top menu pages

@regression
  Scenario Outline: User should navigate to all top menu page
    Given   I am on homepage
    When    I click on "<Top Menu Option>" from Top Menu
    And     I navigate to relevant page successfully
    Then    I verify "<Title>" of the page
    Examples:
      | Top Menu Option   | Title             |
      | Computers         | Computers         |
      | Electronics       | Electronics       |
      | Apparel           | Apparel           |
      | Digital Downloads | Digital downloads |
      | Books             | Books             |
      | Jewelry           | Jewelry           |
      | Gift Cards        | Gift Cards        |