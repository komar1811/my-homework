package com.epam.poland.aqa.bdd.homework.pageobject.modules;

import com.epam.poland.aqa.bdd.homework.pageobject.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AccountModule extends BasePage {

    public AccountModule(WebDriver webDriver){
        super(webDriver);
    }

    public String getAccountNameText(){
        WebElement accountName = new WebDriverWait(webDriver, Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\"tiqiyps\"]")));
        String accountNameText = accountName.getText();
        return accountNameText;
    }
}
