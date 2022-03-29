package com.epam.poland.aqa.bdd.homework.steps;

import com.epam.poland.aqa.bdd.homework.pageobject.pages.LoginPage;
import com.epam.poland.aqa.bdd.homework.pageobject.pages.MainPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static com.epam.poland.aqa.bdd.homework.steps.BaseSteps.PAGES_STORAGE;

public class LoginPageSteps {

    @When("User goes from {string} to {string} and enters username as {string} and password {string}")
    public void userGoesToAndEntersUsernameAsAndPassword(String originalPageName, String pageName, String login, String passWord) {
        PAGES_STORAGE.put(pageName, ((MainPage) PAGES_STORAGE.get(originalPageName)).goToLoginPage());
        ((LoginPage)PAGES_STORAGE.get(pageName)).login(login, passWord);
    }

    @When("User goes from {string} to {string} and enters incorrect username as {string} and password {string}")
    public void userGoesFromToAndEntersIncorrectUsernameAsAndPassword(String originalPageName, String pageName, String login, String passWord) {
        PAGES_STORAGE.put(pageName, ((MainPage) PAGES_STORAGE.get(originalPageName)).goToLoginPage());
        ((LoginPage)PAGES_STORAGE.get(pageName)).incorrectLogin(login, passWord);
    }

    @Then("User gets error message {string} on {string}")
    public void userGetsErrorMessageOn(String errorMessage, String pageName) {
        Assert.assertTrue(errorMessage.contains(((LoginPage)PAGES_STORAGE.get(pageName)).getErrorMessage()));
    }
}
