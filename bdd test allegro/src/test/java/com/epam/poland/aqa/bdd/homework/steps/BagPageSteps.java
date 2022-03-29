package com.epam.poland.aqa.bdd.homework.steps;

import com.epam.poland.aqa.bdd.homework.pageobject.pages.BagPage;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import static com.epam.poland.aqa.bdd.homework.steps.BaseSteps.PAGES_STORAGE;


public class BagPageSteps {


    @Then("Clothes is not present on {string}")
    public void clothesIsNotPresentOn(String pageName) {
        Assert.assertTrue(((BagPage)PAGES_STORAGE.get(pageName)).emptyBagTitleIsDisplayed());
    }
}
