package com.epam.poland.aqa.bdd.homework.steps;

import com.epam.poland.aqa.bdd.homework.pageobject.pages.MainPage;
import io.cucumber.java.en.When;

import static com.epam.poland.aqa.bdd.homework.steps.BaseSteps.PAGES_STORAGE;

public class DropDownBagModuleSteps {

    @When("User goes from {string} to add a product to bag and removes clothes on {string}")
    public void userGoesFromToAndAddAProductToBagAndRemovesClothesOn(String originalPageName, String moduleName) {
        PAGES_STORAGE.put(moduleName, (PAGES_STORAGE.get(originalPageName)));
        PAGES_STORAGE.put("Bag Page",((MainPage)PAGES_STORAGE.get(originalPageName))
                .searchClothesCategory("Club")
                .goToClothesPage()
                .putClothesInBag()
                .moveToDropDownBagModule()
                .removeClothesElement()
                .returnToMainPage()
                .goToBagPage());
    }
}
