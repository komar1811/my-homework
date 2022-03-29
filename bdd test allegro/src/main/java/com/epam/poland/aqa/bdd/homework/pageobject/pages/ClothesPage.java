package com.epam.poland.aqa.bdd.homework.pageobject.pages;

import com.epam.poland.aqa.bdd.homework.pageobject.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ClothesPage extends BasePage {

    @FindBy(xpath = "//select[@data-id=\"sizeSelect\"]")
    private WebElement sizeSelector;
    @FindBy(xpath = "//span[@data-id=\"current-price\"]")
    private WebElement currencyPanel;

    public ClothesPage(WebDriver webDriver){
        super(webDriver);
    }

    public ClothesPage putClothesInBag(){
        sizeSelector.click();
        WebElement size = new WebDriverWait(webDriver, Duration.ofSeconds(10)).
                until(ExpectedConditions.elementToBeClickable(By.xpath("//option[3]")));
        size.click();
        WebElement addToBagButton = new WebDriverWait(webDriver, Duration.ofSeconds(10)).
                until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-test-id=\"add-button\"]")));
        addToBagButton.click();
        return this;
    }

    public ClothesPage makeFavourite(){
        WebElement favouriteButton = new WebDriverWait(webDriver, Duration.ofSeconds(20)).
                until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-test-id=\"saveForLater\"]")));
        favouriteButton.click();
        System.out.println((favouriteButton).getAttribute("aria-pressed"));
        return this;
    }
}
