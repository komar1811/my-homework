package com.epam.poland.aqa.bdd.homework.pageobject.pages;

import com.epam.poland.aqa.bdd.homework.pageobject.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ClothesCategoryPage extends BasePage {

    @FindBy(xpath = "//h1[@class=\"_1hVpqlz\"]")
    private WebElement pageTitle;


    public ClothesCategoryPage(WebDriver webDriver){
        super(webDriver);
    }

    public String getClothesCategoryPageTitleText(){
        return pageTitle.getText();
    }

    public ClothesPage goToClothesPage(){
        WebElement clothesElement = new WebDriverWait(webDriver, Duration.ofSeconds(10)).
                until(ExpectedConditions.elementToBeClickable(By.xpath("//*/a/div[1]/img")));
        clothesElement.click();
        return new ClothesPage(webDriver);
    }

    public Boolean euroIsDisplayed(){
        WebElement priceTag = new WebDriverWait(webDriver, Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),\"€\")]")));
        return priceTag.isDisplayed();
    }
}
