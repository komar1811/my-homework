package com.epam.poland.aqa.bdd.homework.factory;


import com.epam.poland.aqa.bdd.homework.properties.converters.SupportedBrowserConverter;
import com.epam.poland.aqa.bdd.homework.properties.holder.PropertyHolder;
import org.openqa.selenium.WebDriver;

public class WebDriverFactory {
    public WebDriver getWebDriver() {
        return SupportedBrowserConverter.valueOfWebBrowser(
                new PropertyHolder().readProperty("browser")).getWebDriver();
    }
}
