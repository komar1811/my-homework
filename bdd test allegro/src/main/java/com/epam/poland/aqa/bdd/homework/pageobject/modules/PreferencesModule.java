package com.epam.poland.aqa.bdd.homework.pageobject.modules;

import com.epam.poland.aqa.bdd.homework.pageobject.BasePage;
import com.epam.poland.aqa.bdd.homework.pageobject.pages.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PreferencesModule extends BasePage {

    public PreferencesModule(WebDriver webDriver){
        super(webDriver);
    }

    public MainPage changeCountry(String countryName){
        WebElement countrySelector = new WebDriverWait(webDriver, Duration.ofSeconds(10)).
                until(ExpectedConditions.elementToBeClickable(By.id("country")));
        countrySelector.click();
        WebElement country = new WebDriverWait(webDriver, Duration.ofSeconds(10)).
                until(ExpectedConditions.presenceOfElementLocated(By.xpath("//option[contains(text(),\"Poland\")]")));
        country.click();
        WebElement confirmButton = new WebDriverWait(webDriver, Duration.ofSeconds(10)).
                until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-testid=\"save-country-button\"]")));
        confirmButton.click();
        return new MainPage(webDriver);
    }

    public MainPage changeCurrency(String currency){
        WebElement countrySelector = new WebDriverWait(webDriver, Duration.ofSeconds(10)).
                until(ExpectedConditions.elementToBeClickable(By.id("country")));
        countrySelector.click();
        WebElement country = new WebDriverWait(webDriver, Duration.ofSeconds(10)).
                until(ExpectedConditions.presenceOfElementLocated(By.xpath("//option[contains(text(),\"Poland\")]")));
        country.click();
        WebElement currencySelector = new WebDriverWait(webDriver, Duration.ofSeconds(10)).
                until(ExpectedConditions.elementToBeClickable(By.id("currency")));
        currencySelector.click();
        WebElement chosenCurrency = new WebDriverWait(webDriver, Duration.ofSeconds(10)).
                until(ExpectedConditions.presenceOfElementLocated(By.xpath("//option[contains(text(),\""+currency+"\")]")));
        chosenCurrency.click();
        WebElement confirmButton = new WebDriverWait(webDriver, Duration.ofSeconds(10)).
                until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-testid=\"save-country-button\"]")));
        confirmButton.click();
        return new MainPage(webDriver);
    }
}
