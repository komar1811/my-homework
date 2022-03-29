package com.epam.poland.aqa.bdd.homework.pageobject;

import com.epam.poland.aqa.bdd.homework.pageobject.modules.DropDownBagModule;
import com.epam.poland.aqa.bdd.homework.pageobject.pages.BagPage;
import com.epam.poland.aqa.bdd.homework.pageobject.pages.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class BasePage {
    protected WebDriver webDriver;

    @FindBy(xpath = "//button[@data-testid=\"myAccountIcon\"]")
    protected WebElement dropDownAccountMenuButton;
    @FindBy(xpath = "//div[@data-testid=\"topbar\"]//img[@class=\"RLpiNyQ\"]")
    protected WebElement countryIcon;
    @FindBy(xpath = "//a[@data-testid=\"men-floor\"]")
    protected WebElement manClothesButton;
    @FindBy(xpath = "//a[@data-testid=\"women-floor\"]")
    protected WebElement womanClothesButton;
    @FindBy(xpath = "//button[@data-id=\"029c47b3-2111-43e9-9138-0d00ecf0b3db\"]")
    protected WebElement clothesCategoryButton;
    @FindBy(xpath = "//input[@type=\"search\"]")
    protected WebElement searchPanel;
    @FindBy(xpath = "//button[@type=\"submit\"]")
    protected WebElement searchButton;
    @FindBy(xpath = "//a[@data-testid=\"savedItemsIcon\"]")
    protected WebElement favouritesButton;
    @FindBy(xpath = "//a[@data-testid=\"miniBagIcon\"]")
    protected WebElement bagPageButton;
    @FindBy(xpath = "//a[@data-testid=\"asoslogo\"]")
    protected WebElement logoButton;


    protected BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver,this);

    }

    public DropDownBagModule moveToDropDownBagModule(){
        Actions actions = new Actions(webDriver);
        actions.moveToElement(bagPageButton);
        return new DropDownBagModule(webDriver);
    }

    public BagPage goToBagPage(){
        bagPageButton.click();
        return new BagPage(webDriver);
    }

    public MainPage returnToMainPage(){
        logoButton.click();
        return new MainPage(webDriver);
    }

    public Boolean isProductAdded(){
        WebElement productCounter = new WebDriverWait(webDriver, Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-testid=\"miniBagIcon\"]/span[2]")));
        return productCounter.isDisplayed();
    }
}