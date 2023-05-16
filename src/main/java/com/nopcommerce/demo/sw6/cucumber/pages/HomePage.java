package com.nopcommerce.demo.sw6.cucumber.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.sw6.cucumber.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import java.util.List;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//li//a")
    WebElement topMenu;

    @CacheLookup
    @FindBy(xpath = "//h1[contains (text(), 'Computers')]")
    WebElement computerText;

    @CacheLookup
    @FindBy(xpath = "//h1[contains (text(), 'Electronics')]")
    WebElement electronicsText;

    @CacheLookup
    @FindBy(xpath = "//h1[contains (text(), 'Apparel')]")
    WebElement apparelText;

    @CacheLookup
    @FindBy(xpath = "//h1[contains (text(), 'Digital downloads')]")
    WebElement digitalDownloadsText;

    @CacheLookup
    @FindBy(xpath = "//h1[contains (text(), 'Books')]")
    WebElement booksText;

    @CacheLookup
    @FindBy(xpath = "//h1[contains (text(), 'Jewelry')]")
    WebElement jewelryText;

    @CacheLookup
    @FindBy(xpath = "//h1[contains (text(), 'Gift Cards')]")
    WebElement giftCardsText;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement welcomeText;


    public void selectMenu(String menu) {
        List<WebElement> topMenuNames = driver.findElements(By.xpath("//ul[@class='top-menu notmobile']//li//a"));
        for (WebElement names : topMenuNames) {
            if (names.getText().equalsIgnoreCase(menu)) {
                names.click();
                break;
            }

        }
    }

    public void verifyComputersPageNavigation(String expectedMessage) {

        verifyElements(computerText, expectedMessage, "Wrong Text");

    }

    public void verifyElectronicsPageNavigation(String expectedMessage) {

        verifyElements(electronicsText, expectedMessage, "Wrong Text");

    }

    public void verifyApparelPageNavigation(String expectedMessage) {

        verifyElements(apparelText, expectedMessage, "Wrong Text");
        log.info("Verify Text from Webpage");
    }

    public void verifyDigitalDownloadsPageNavigation(String expectedMessage) {

        verifyElements(digitalDownloadsText, expectedMessage, "Wrong Text");
        log.info("Verify Text from Webpage");
    }

    public void verifyBooksPageNavigation(String expectedMessage) {

        verifyElements(booksText, expectedMessage, "Wrong Text");
        log.info("Verify Text from Webpage");
    }

    public void verifyJewelryPageNavigation(String expectedMessage) {

        verifyElements(jewelryText, expectedMessage, "Wrong Text");
        log.info("Verify Text from Webpage");
    }

    public void verifyGiftCardsPageNavigation(String expectedMessage) {

        verifyElements(giftCardsText, expectedMessage, "Wrong Text");
        log.info("Verify Text from Webpage");
    }

    public void verifyTheTextWelcomeToOurStore(String expectedMessage) {

        verifyElements(welcomeText, expectedMessage, "Message is not displayed");
        log.info("Verify Text from Webpage");
    }


    //**************** Electronics Test****************************

    @CacheLookup
    @FindBy(xpath = "//div[@class='page-title']//h1")
    WebElement errorMessage;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']")
    WebElement electronics;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']")
    WebElement cellPhones;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logout;

    public void mouseHoverOnElectronics() {

        mouseHoverToElement(electronics);
        log.info("Mouse hover on eletronics and click " + electronics.toString());
    }

    public void mouseHoverAndClickOnCellPhones() {

        mouseHoverToElementAndClick(cellPhones);
        log.info("Mouse hover on Cellphone and click " + cellPhones.toString());
    }

    public void clickOnLogoutLink() {

        clickOnElement(logout);
        log.info("Click on logout " + logout.toString());
    }

    public void getURL() {
        String url = driver.getCurrentUrl();
        Assert.assertEquals("The URL is incorrect", url, "https://demo.nopcommerce.com/");

    }

    public void verifyPageTitle(String title) {
        verifyElements(errorMessage, title, "Page title not displayed as expected");
        log.info("Verify page title ".toString());
    }
}
