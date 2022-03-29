package com.epam.poland.aqa.bdd.homework.invoker.implementations;

import com.epam.poland.aqa.bdd.homework.invoker.WebDriverInvoker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocalChromeInvoker implements WebDriverInvoker {

    @Override
    public WebDriver invokeWebDriver() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }
}
