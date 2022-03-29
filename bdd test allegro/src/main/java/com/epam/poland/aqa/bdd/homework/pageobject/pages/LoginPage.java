package com.epam.poland.aqa.bdd.homework.pageobject.pages;

import com.epam.poland.aqa.bdd.homework.pageobject.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends BasePage {

    @FindBy(name = "Username")
    private WebElement loginField;
    @FindBy(name = "Password")
    private WebElement passWordField;
    @FindBy(xpath = "//input[@type=\"submit\"]")
    private WebElement loginButton;

    public LoginPage(WebDriver webDriver){
        super(webDriver);
    }

    public MainPage login(String login, String passWord){
        loginField.sendKeys(login);
        passWordField.sendKeys(passWord);
        loginButton.click();
        return new MainPage(webDriver);
    }

    public LoginPage incorrectLogin(String login, String passWord){
        loginField.sendKeys(login);
        passWordField.sendKeys(passWord);
        return this;
    }

    public String getErrorMessage(){
        loginButton.click();
        WebElement errorMessage = new WebDriverWait(webDriver, Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOfElementLocated(By.id("loginErrorMessage")));
        return errorMessage.getText();
    }
}
