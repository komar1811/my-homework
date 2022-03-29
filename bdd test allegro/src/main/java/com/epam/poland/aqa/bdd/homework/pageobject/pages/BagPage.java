package com.epam.poland.aqa.bdd.homework.pageobject.pages;

import com.epam.poland.aqa.bdd.homework.pageobject.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BagPage extends BasePage {

    public BagPage(WebDriver webDriver){
        super(webDriver);
    }

    public Boolean emptyBagTitleIsDisplayed(){
        WebElement clothesItem = new WebDriverWait(webDriver, Duration.ofSeconds(10)).
                until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(@class,\"empty\")]")));
        return clothesItem.isDisplayed();
    }
}
