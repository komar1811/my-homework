package org.epam.poland.at.course.homework;

import org.epam.poland.at.course.homework.factory.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    protected final WebDriver webDriver = new WebDriverFactory().getWebDriver();

    protected void setUPDriver() {
        webDriver.manage().window().maximize();
    }

    protected void quit(){
        webDriver.quit();
    }
}
