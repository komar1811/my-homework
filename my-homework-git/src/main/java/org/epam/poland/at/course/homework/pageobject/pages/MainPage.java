package org.epam.poland.at.course.homework.pageobject.pages;

import org.epam.poland.at.course.homework.pageobject.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.epam.poland.at.course.homework.properties.props.Data.AMAZON;
import static org.epam.poland.at.course.homework.properties.props.Data.AMAZON_POSTCODE;

public class MainPage extends BasePage {
    @FindBy(xpath = "//*[@id=\"nav-global-location-popover-link\"]")
    private WebElement deliverButton;

    private WebElement goodsCategory;
    @FindBy(xpath = "//*[contains(text(),\""+AMAZON_POSTCODE+"\")]")
    private WebElement deliverText;

    public MainPage(WebDriver webDriver) {
        super(webDriver);
    }

    public MainPage open() {
        webDriver.get(AMAZON);
        return this;
    }

    public AddressModule openDeliveryMenu() {
        deliverButton.click();
        return new AddressModule(webDriver);
    }

    public String getDeliveryButtonText(){
        return deliverText.getText();
    }

    public GoodsPage chooseGoodCategory(){
        goodsCategory = new WebDriverWait(webDriver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div[2]/div[3]/div[2]/div[1]/div/div[2]/div[1]/div[1]/a/div[1]/img")));
        goodsCategory.click();
        return new GoodsPage(webDriver);
    }

    public void end() {
        webDriver.close();
        webDriver.quit();
    }
}
