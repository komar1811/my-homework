package org.epam.poland.at.course.homework.pageobject.pages;

import org.epam.poland.at.course.homework.pageobject.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ConfirmationModule extends BasePage {

    private WebElement continueButton;

    public ConfirmationModule(WebDriver webDriver){
        super(webDriver);
    }

    public MainPage proceedChangePostCode(){
        continueButton = new WebDriverWait(webDriver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id=\"GLUXHiddenSuccessFooter\"]//input[@id=\"GLUXConfirmClose\"]")));
        continueButton.click();
        return new MainPage(webDriver);
    }
}
