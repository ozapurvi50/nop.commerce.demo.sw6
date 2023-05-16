package com.nopcommerce.demo.sw6.cucumber.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.sw6.cucumber.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ComputerPage extends Utility {

    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//div[@class='block block-category-navigation']/descendant::a[2]")
    WebElement desktops;

    public void clickOnDesktop() {

        clickOnElement(desktops);
        log.info("Click on desktops : " + desktops.toString());
    }
}
