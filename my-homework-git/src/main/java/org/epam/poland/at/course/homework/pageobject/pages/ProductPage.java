package org.epam.poland.at.course.homework.pageobject.pages;

import org.epam.poland.at.course.homework.pageobject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.epam.poland.at.course.homework.properties.props.Data.AMAZON_LOCATION;

public class ProductPage extends BasePage {

    @FindBy(xpath = "//*[contains(@class,\"inner\")]//*[contains(text(),\""+AMAZON_LOCATION+"\")]")
    private WebElement productCountry;

    public ProductPage(WebDriver webDriver){
        super(webDriver);
    }

    public String getProductDeliveryCountry(){
        return productCountry.getText();
    }
}
