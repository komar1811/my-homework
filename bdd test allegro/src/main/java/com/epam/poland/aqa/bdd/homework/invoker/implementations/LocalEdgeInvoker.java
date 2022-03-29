package com.epam.poland.aqa.bdd.homework.invoker.implementations;

import com.epam.poland.aqa.bdd.homework.invoker.WebDriverInvoker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocalEdgeInvoker implements WebDriverInvoker {

    @Override
    public WebDriver invokeWebDriver() {
        WebDriverManager.edgedriver().setup();
        return new EdgeDriver();
    }
}

