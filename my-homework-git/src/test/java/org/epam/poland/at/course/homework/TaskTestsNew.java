package org.epam.poland.at.course.homework;


import org.epam.poland.at.course.homework.pageobject.pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.epam.poland.at.course.homework.properties.props.Data.AMAZON_LOCATION;
import static org.epam.poland.at.course.homework.properties.props.Data.AMAZON_POSTCODE;

public class TaskTestsNew extends BaseTest {
    @Test
    public void TaskTest11New() {
        MainPage mainPage = new MainPage(webDriver);
        String postCode = mainPage.open()
                .openDeliveryMenu()
                .changePostCode(AMAZON_POSTCODE)
                .proceedChangePostCode()
                .getDeliveryButtonText();
        Assert.assertTrue(postCode.contains(AMAZON_POSTCODE));
        mainPage.end();
    }

    @Test
    public void TaskTest12New() {
        MainPage mainPage = new MainPage(webDriver);
        boolean result = mainPage.open()
                .openDeliveryMenu()
                .getDeliveryCountry()
                .contains("Poland");
        Assert.assertTrue(result);
        mainPage.end();
    }

    @Test
    public void TaskTest13New() {
        MainPage mainPage = new MainPage(webDriver);
        boolean result = mainPage.open()
                .openDeliveryMenu()
                .chooseDeliveryCountry()
                .chooseGoodCategory()
                .chooseProduct()
                .getProductDeliveryCountry()
                .contains(AMAZON_LOCATION);
        Assert.assertTrue(result);
        mainPage.end();

    }
}