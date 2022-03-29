package com.epam.poland.aqa.bdd.homework.pageobject.pages;

import com.epam.poland.aqa.bdd.homework.pageobject.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FavouritesPage extends BasePage {

    public FavouritesPage(WebDriver webDriver){
        super(webDriver);
    }

    public Boolean isFavouriteElementDisplayed(){
        WebElement clothesFavouriteElement = webDriver.findElement(By.xpath("//img[@class=\"image_csaq+ show_KyYlC productImage_L-3bK\"]"));
        return clothesFavouriteElement.isDisplayed();
    }
}
