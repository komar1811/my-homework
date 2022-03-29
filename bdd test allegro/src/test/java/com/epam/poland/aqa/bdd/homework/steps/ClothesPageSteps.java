package com.epam.poland.aqa.bdd.homework.steps;

import com.epam.poland.aqa.bdd.homework.pageobject.pages.MainPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static com.epam.poland.aqa.bdd.homework.steps.BaseSteps.PAGES_STORAGE;

public class ClothesPageSteps {
    @When("User goes from {string} to add a product to bag")
    public void addToABag (String originalPageName){
        ((MainPage)PAGES_STORAGE.get(originalPageName)).searchClothesCategory("Club").goToClothesPage().putClothesInBag();
    }

    @Then("Clothes counter is visible on the top bar")
    public void clothesCounterIsVisibleOnTheTopBar() {
        Assert.assertTrue(((MainPage)PAGES_STORAGE.get("Main Page")).isProductAdded());
    }

    @When("User goes from {string} to add a product to favourites")
    public void userGoesFromToAddAProductToFavourites(String originalPageName) {
        PAGES_STORAGE.put("Favourites Page",((MainPage)PAGES_STORAGE.get(originalPageName))
                .searchClothesCategory("Club")
                .goToClothesPage()
                .makeFavourite()
                .returnToMainPage()
                .goToFavouritesPage());
    }
}
