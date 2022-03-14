package org.epam.poland.at.course.homework.invoker.implementation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.epam.poland.at.course.homework.invoker.WebDriverInvoker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocalFirefoxInvoker implements WebDriverInvoker {

    @Override
    public WebDriver invokeWebDriver() {
        WebDriverManager.firefoxdriver().browserVersion("97").setup();
        return new FirefoxDriver();
    }
}
