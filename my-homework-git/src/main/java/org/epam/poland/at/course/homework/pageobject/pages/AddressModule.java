package org.epam.poland.at.course.homework.pageobject.pages;

import org.epam.poland.at.course.homework.pageobject.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.epam.poland.at.course.homework.properties.props.Data.AMAZON_LOCATION;

public class AddressModule extends BasePage {

    private WebElement deliveryPostalCodeInfo;
    @FindBy(xpath = "//*[@id=\"GLUXZipUpdate\"]/span/input")
    private WebElement applyButton;
    private WebElement deliveryCountriesList;
    @FindBy(name = "glowDoneButton")
    private WebElement doneButton;

    public AddressModule(WebDriver webDriver){
        super(webDriver);
    }

    public ConfirmationModule changePostCode(String postCode) {
        deliveryPostalCodeInfo = new WebDriverWait(webDriver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"GLUXZipUpdateInput\"]")));
        deliveryPostalCodeInfo.sendKeys(postCode);
        applyButton.click();
        return new ConfirmationModule(webDriver);
    }

    public String getDeliveryCountry(){
        deliveryCountriesList = new WebDriverWait(webDriver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"GLUXCountryListDropdown\"]/span/span")));
        deliveryCountriesList.click();
        WebElement deliveryCountry = new WebDriverWait(webDriver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@class,\"scroll\")]//a[contains(text(), \"Poland\")][last()]")));
        return deliveryCountry.getText();
    }

    public MainPage chooseDeliveryCountry(){
        deliveryCountriesList = new WebDriverWait(webDriver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"GLUXCountryListDropdown\"]/span/span")));
        deliveryCountriesList.click();
        WebElement deliveryCountry = new WebDriverWait(webDriver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@class,\"scroll\")]//a[contains(text(), \""+AMAZON_LOCATION+"\")][last()]")));
        deliveryCountry.click();
        doneButton.click();
        return new MainPage(webDriver);
    }
}
