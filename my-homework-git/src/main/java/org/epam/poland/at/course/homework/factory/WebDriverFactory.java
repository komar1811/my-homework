package org.epam.poland.at.course.homework.factory;

import org.epam.poland.at.course.homework.enumeration.SupportedBrowsers;
import org.epam.poland.at.course.homework.properties.converters.SupportedBrowserConverter;
import org.epam.poland.at.course.homework.properties.holder.PropertyHolder;
import org.openqa.selenium.WebDriver;

public class WebDriverFactory {
    public WebDriver getWebDriver() {
        String propertyValue = new PropertyHolder().readProperty("browser");
        SupportedBrowsers browser = SupportedBrowserConverter.valueOfWebBrowser(propertyValue);

        return browser.getWebDriver();
    }
}
