package com.epam.poland.aqa.bdd.homework.steps;

import com.epam.poland.aqa.bdd.homework.pageobject.pages.ClothesCategoryPage;
import com.epam.poland.aqa.bdd.homework.pageobject.pages.ClothesPage;
import com.epam.poland.aqa.bdd.homework.pageobject.pages.MainPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static com.epam.poland.aqa.bdd.homework.steps.BaseSteps.PAGES_STORAGE;

public class ClothesCategoryPageSteps {
    @Then("Euro currency is present on {string}")
    public void isEuroCurrencyOnPage(String pageName) {
        Assert.assertTrue(((ClothesCategoryPage)PAGES_STORAGE.get(pageName)).euroIsDisplayed());
    }

    @When("User goes from {string} to {string} and marks product as favourite")
    public void userGoesFromToMarksProductAsFavourite(String originalPageName, String pageName) {
        PAGES_STORAGE.put(pageName, (((MainPage) PAGES_STORAGE.get(originalPageName)).goToClothesCategory().goToClothesPage()));
        ((ClothesPage)PAGES_STORAGE.get(pageName)).makeFavourite();
        PAGES_STORAGE.put("Favourites Page", ((MainPage)PAGES_STORAGE.get(originalPageName)).goToFavouritesPage());
    }

    @Then("Title for {string} is displayed on {string}")
    public void titleForAppropriateIsDisplayedOn(String gender, String pageName) {
        Assert.assertTrue((((ClothesCategoryPage)PAGES_STORAGE.get(pageName)).getClothesCategoryPageTitleText()).contains(gender));
    }

}
