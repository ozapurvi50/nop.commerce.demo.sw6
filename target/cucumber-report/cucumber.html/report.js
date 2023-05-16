$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("electronics.feature");
formatter.feature({
  "line": 2,
  "name": "Electronics Test",
  "description": "\r\nAs a user I should able to navigate to Cell Phone page successfully\r\nand can verify that product added successfully and place the order successfully",
  "id": "electronics-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3762444100,
  "status": "passed"
});
formatter.background({
  "line": 7,
  "name": "I am on homepage",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 9,
  "name": "Verify navigate to Cell Phone successfully",
  "description": "",
  "id": "electronics-test;verify-navigate-to-cell-phone-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I mouse hover on \"Electronics\"",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I mouse hover on \"Cell phone\" phone and click",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I verify the text \"Cell phones\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Electronics",
      "offset": 18
    }
  ],
  "location": "ElectronicsSteps.iMouseHoverOn(String)"
});
formatter.result({
  "duration": 442413400,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "arguments": [
    {
      "val": "Cell phones",
      "offset": 19
    }
  ],
  "location": "ElectronicsSteps.iVerifyTheText(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 762958700,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 15,
  "name": ": Verify product added successfully and place order successfully",
  "description": "",
  "id": "electronics-test;:-verify-product-added-successfully-and-place-order-successfully",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 14,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "I mouse hover on \"Electronics\"",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "I mouse hover on \"Cell phone\" and click",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "I verify the text \"Cell phones\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I click on list tab",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I click on Nokia Lumia",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I verify text nokia lumia \"Nokia Lumia 1020\"",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I verify  price \"$349.00\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I change quantity \"2\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I click on add to cart tab",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I verify shopping cart message \"The product has been added to your shopping cart\"",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I click on green button",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I mouse hover on shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I click on go to cart",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I verify shopping cart title \"Shopping cart\"",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I verify the quantity",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I verify the total \"$698.00\"",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I click on terms of service checkbox",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I click on checkout button",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I click on Register button",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "I verify text \"Register\"",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "I input first name \"\u003cFirstname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "I input last name \"\u003cLastname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "I input email address",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "I input Password \"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "I input confirm password \"\u003cConfirm Password\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "I click on register",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "I verify register text message \"Your registration completed\"",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "I click on Continue button",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "I verify Shopping Cart title \"Shopping cart\"",
  "keyword": "And "
});
formatter.examples({
  "line": 45,
  "name": "",
  "description": "",
  "id": "electronics-test;:-verify-product-added-successfully-and-place-order-successfully;",
  "rows": [
    {
      "cells": [
        "Firstname",
        "Lastname",
        "Password",
        "Confirm Password"
      ],
      "line": 46,
      "id": "electronics-test;:-verify-product-added-successfully-and-place-order-successfully;;1"
    },
    {
      "cells": [
        "James",
        "Simon",
        "password123",
        "password123"
      ],
      "line": 47,
      "id": "electronics-test;:-verify-product-added-successfully-and-place-order-successfully;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2653725200,
  "status": "passed"
});
formatter.background({
  "line": 7,
  "name": "I am on homepage",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 47,
  "name": ": Verify product added successfully and place order successfully",
  "description": "",
  "id": "electronics-test;:-verify-product-added-successfully-and-place-order-successfully;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 14,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "I mouse hover on \"Electronics\"",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "I mouse hover on \"Cell phone\" and click",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "I verify the text \"Cell phones\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I click on list tab",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I click on Nokia Lumia",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I verify text nokia lumia \"Nokia Lumia 1020\"",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I verify  price \"$349.00\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I change quantity \"2\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I click on add to cart tab",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I verify shopping cart message \"The product has been added to your shopping cart\"",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I click on green button",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I mouse hover on shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I click on go to cart",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I verify shopping cart title \"Shopping cart\"",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I verify the quantity",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I verify the total \"$698.00\"",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I click on terms of service checkbox",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I click on checkout button",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I click on Register button",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "I verify text \"Register\"",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "I input first name \"James\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "I input last name \"Simon\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "I input email address",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "I input Password \"password123\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "I input confirm password \"password123\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "I click on register",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "I verify register text message \"Your registration completed\"",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "I click on Continue button",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "I verify Shopping Cart title \"Shopping cart\"",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Electronics",
      "offset": 18
    }
  ],
  "location": "ElectronicsSteps.iMouseHoverOn(String)"
});
formatter.result({
  "duration": 157925400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cell phone",
      "offset": 18
    }
  ],
  "location": "ElectronicsSteps.iMouseHoverOnAndClick(String)"
});
formatter.result({
  "duration": 1786084900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cell phones",
      "offset": 19
    }
  ],
  "location": "ElectronicsSteps.iVerifyTheText(String)"
});
formatter.result({
  "duration": 62193500,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iClickOnListTab()"
});
formatter.result({
  "duration": 77247700,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iClickOnNokiaLumia()"
});
formatter.result({
  "duration": 3743401900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Nokia Lumia 1020",
      "offset": 27
    }
  ],
  "location": "ElectronicsSteps.iVerifyTextNokiaLumia(String)"
});
formatter.result({
  "duration": 30983700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$349.00",
      "offset": 17
    }
  ],
  "location": "ElectronicsSteps.iVerifyPrice(String)"
});
formatter.result({
  "duration": 26369500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 19
    }
  ],
  "location": "ElectronicsSteps.iChangeQuantity(String)"
});
formatter.result({
  "duration": 134868900,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iClickOnAddToCartTab()"
});
formatter.result({
  "duration": 57479500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "The product has been added to your shopping cart",
      "offset": 32
    }
  ],
  "location": "ElectronicsSteps.iVerifyShoppingCartMessage(String)"
});
formatter.result({
  "duration": 281674500,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iClickOnGreenButton()"
});
formatter.result({
  "duration": 44894100,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iMouseHoverOnShoppingCart()"
});
formatter.result({
  "duration": 172138400,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iClickOnGoToCart()"
});
formatter.result({
  "duration": 1703653400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Shopping cart",
      "offset": 30
    }
  ],
  "location": "ElectronicsSteps.iVerifyShoppingCartTitle(String)"
});
formatter.result({
  "duration": 79288000,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iVerifyTheQuantity()"
});
formatter.result({
  "duration": 77608700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$698.00",
      "offset": 20
    }
  ],
  "location": "ElectronicsSteps.iVerifyTheTotal(String)"
});
formatter.result({
  "duration": 105685000,
  "error_message": "org.openqa.selenium.StaleElementReferenceException: stale element reference: stale element not found\n  (Session info: chrome\u003d113.0.5672.94)\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#stale_element_reference\nBuild info: version: \u00274.9.0\u0027, revision: \u0027d7057100a6\u0027\nSystem info: os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [710e6d90153a3b2bb6676d98545ca4a7, getElementText {id\u003dE67E499D80B19B32A2A3E33F524C14B9_element_1335}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 113.0.5672.94, chrome: {chromedriverVersion: 113.0.5672.63 (0e1a4471d5ae..., userDataDir: C:\\Users\\ozapu\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:51093}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:51093/devtoo..., se:cdpVersion: 113.0.5672.94, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nElement: [[ChromeDriver: chrome on WINDOWS (710e6d90153a3b2bb6676d98545ca4a7)] -\u003e xpath: //span[@class\u003d\u0027value-summary\u0027]//strong]\nSession ID: 710e6d90153a3b2bb6676d98545ca4a7\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:193)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:183)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:257)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.getText(RemoteWebElement.java:207)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:52)\r\n\tat com.sun.proxy.$Proxy23.getText(Unknown Source)\r\n\tat com.nopcommerce.demo.sw6.cucumber.utility.Utility.getTextFromElement(Utility.java:64)\r\n\tat com.nopcommerce.demo.sw6.cucumber.utility.Utility.verifyElements(Utility.java:385)\r\n\tat com.nopcommerce.demo.sw6.cucumber.pages.ShoppingCartPage.verifyTotal(ShoppingCartPage.java:65)\r\n\tat com.nopcommerce.demo.sw6.cucumber.steps.ElectronicsSteps.iVerifyTheTotal(ElectronicsSteps.java:95)\r\n\tat ✽.And I verify the total \"$698.00\"(electronics.feature:31)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ElectronicsSteps.iClickOnTermsOfServiceCheckbox()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ElectronicsSteps.iClickOnCheckoutButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ElectronicsSteps.iClickOnRegisterButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Register",
      "offset": 15
    }
  ],
  "location": "ElectronicsSteps.iVerifyText(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "James",
      "offset": 20
    }
  ],
  "location": "ElectronicsSteps.iInputFirstName(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Simon",
      "offset": 19
    }
  ],
  "location": "ElectronicsSteps.iInputLastName(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ElectronicsSteps.iInputEmailAddress()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "password123",
      "offset": 18
    }
  ],
  "location": "ElectronicsSteps.iInputPassword(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "password123",
      "offset": 26
    }
  ],
  "location": "ElectronicsSteps.iInputConfirmPassword(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ElectronicsSteps.iClickOnRegister()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Your registration completed",
      "offset": 32
    }
  ],
  "location": "ElectronicsSteps.iVerifyRegisterTextMessage(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ElectronicsSteps.iClickOnContinueButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Shopping cart",
      "offset": 30
    }
  ],
  "location": "ElectronicsSteps.iVerifyShoppingCartTitle2(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1494743300,
  "status": "passed"
});
});