package com.epam.poland.aqa.bdd.homework.pageobject.pages;

import com.epam.poland.aqa.bdd.homework.pageobject.BasePage;
import com.epam.poland.aqa.bdd.homework.pageobject.modules.AccountModule;
import com.epam.poland.aqa.bdd.homework.pageobject.modules.PreferencesModule;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage extends BasePage {

   public MainPage(WebDriver webDriver){
        super(webDriver);
    }

    public MainPage open(){
       webDriver.get("https://www.asos.com/");
       webDriver.manage().window().maximize();
       return this;
    }

    public LoginPage goToLoginPage() {
       dropDownAccountMenuButton.click();
       WebElement loginButton = new WebDriverWait(webDriver,Duration.ofSeconds(10))
               .until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-testid=\"signin-link\"]")));
       loginButton.click();
       return new LoginPage(webDriver);
    }

    public AccountModule goToAccountModule(){
       dropDownAccountMenuButton.click();
       return new AccountModule(webDriver);
    }

    public String getCountryName(){
       String value = countryIcon.getAttribute("alt");
       return value;
    }

    public PreferencesModule goToCountryPreferences(){
       countryIcon.click();
       return new PreferencesModule(webDriver);
    }

    public MainPage chooseClothesForMan(String gender){
       if(gender=="Male"){
            manClothesButton.click();
       } else if(gender=="Female") {
           womanClothesButton.click();
       }
       return this;
    }

    public ClothesCategoryPage goToClothesCategory(){
       chooseClothesForMan("Male");
       clothesCategoryButton.click();
       WebElement allProductsButton = new WebDriverWait(webDriver, Duration.ofSeconds(10)).
               until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@aria-labelledby=\"ace7f5e5-b0be-464e-b1a9-0f2f3c245d36\"]//a")));
       allProductsButton.click();
       return new ClothesCategoryPage(webDriver);
    }

    public ClothesCategoryPage searchClothesCategory(String keyWord){
       searchPanel.sendKeys(keyWord);
       searchButton.click();
       return new ClothesCategoryPage(webDriver);
    }

    public FavouritesPage goToFavouritesPage(){
       favouritesButton.click();
       return new FavouritesPage(webDriver);
    }

}
