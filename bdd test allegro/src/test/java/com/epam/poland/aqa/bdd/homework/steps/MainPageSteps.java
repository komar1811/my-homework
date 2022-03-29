package com.epam.poland.aqa.bdd.homework.steps;

import com.epam.poland.aqa.bdd.homework.pageobject.pages.MainPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static com.epam.poland.aqa.bdd.homework.steps.BaseSteps.PAGES_STORAGE;
import static com.epam.poland.aqa.bdd.homework.steps.BaseSteps.webDriver;

public class MainPageSteps {

    @Given("User is on {string}")
    public void userIsOnMainSteps(String pageName) {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.open();
        PAGES_STORAGE.put(pageName, mainPage);
    }

    @Then("User is successfully navigated to the {string}")
    public void userIsNavigatedToPage(String expectedUrl) {
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertEquals(expectedUrl, webDriver.getCurrentUrl(), "Expected URL is not correct");
    }

    @And("User name is {string} on {string} is present on dropdown menu")
    public void userNameIsOnIsPresentOnDropdownMenu(String userName, String pageName) {
        String accountName = (((MainPage)PAGES_STORAGE.get(pageName)).goToAccountModule().getAccountNameText());
        Assert.assertTrue(accountName.contains(userName));
    }

    @When("User clicks on country icon on {string} and enters country {string}")
    public void userClicksOnCountryIconOnAndEntersCountryOn(String pageName, String countryName) {
        ((MainPage)PAGES_STORAGE.get(pageName)).goToCountryPreferences().changeCountry("Poland");
    }

    @Then("Country icon {string} is present on {string}")
    public void countryIconIsPresentOn(String countryName, String pageName) {
        Assert.assertEquals(((MainPage)PAGES_STORAGE.get(pageName)).getCountryName(),countryName);
    }


    @When("User clicks on country icon on {string} and enters {string} currency")
    public void userClicksOnCountryIconOnAndEntersCurrency(String pageName, String currency) {
        ((MainPage)PAGES_STORAGE.get(pageName)).goToCountryPreferences().changeCurrency(currency);
        PAGES_STORAGE.put("Clothes Category Page", (((MainPage) PAGES_STORAGE.get(pageName)).goToClothesCategory()));
    }

    @When("User chooses {string} on {string}")
    public void userChoosesOn(String gender, String pageName) {
        ((MainPage)PAGES_STORAGE.get(pageName)).chooseClothesForMan(gender);
        PAGES_STORAGE.put("Clothes Category Page", (((MainPage) PAGES_STORAGE.get(pageName)).goToClothesCategory()));
    }
}
