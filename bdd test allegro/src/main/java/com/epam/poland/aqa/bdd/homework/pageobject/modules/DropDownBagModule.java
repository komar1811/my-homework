package com.epam.poland.aqa.bdd.homework.pageobject.modules;

import com.epam.poland.aqa.bdd.homework.pageobject.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DropDownBagModule extends BasePage {

    public DropDownBagModule(WebDriver webDriver){
        super(webDriver);
    }

    public DropDownBagModule removeClothesElement(){
        WebElement removeClothesButton = new WebDriverWait(webDriver, Duration.ofSeconds(10)).
                until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class=\"_2y4LZqx\"]")));
        Actions actions = new Actions(webDriver);
        actions.moveToElement(removeClothesButton).click(removeClothesButton).perform();
        return this;
    }
}
