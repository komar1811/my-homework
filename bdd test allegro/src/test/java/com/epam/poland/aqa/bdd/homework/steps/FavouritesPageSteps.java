package com.epam.poland.aqa.bdd.homework.steps;

import com.epam.poland.aqa.bdd.homework.pageobject.pages.FavouritesPage;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import static com.epam.poland.aqa.bdd.homework.steps.BaseSteps.PAGES_STORAGE;


public class FavouritesPageSteps {

    @Then("Favourite Product is displayed on {string}")
    public void favouriteProductIsDisplayed(String pageName){
        Assert.assertTrue(((FavouritesPage)PAGES_STORAGE.get(pageName)).isFavouriteElementDisplayed());
    }
}
