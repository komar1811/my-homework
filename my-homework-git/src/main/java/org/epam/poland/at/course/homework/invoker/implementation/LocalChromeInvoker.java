package org.epam.poland.at.course.homework.invoker.implementation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.epam.poland.at.course.homework.invoker.WebDriverInvoker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocalChromeInvoker implements WebDriverInvoker {

    @Override
    public WebDriver invokeWebDriver() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        return new ChromeDriver();
    }
}
