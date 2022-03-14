package org.epam.poland.at.course.homework.invoker.implementation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.epam.poland.at.course.homework.invoker.WebDriverInvoker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocalEdgeInvoker implements WebDriverInvoker {

    @Override
    public WebDriver invokeWebDriver() {
        WebDriverManager.edgedriver().setup();
        return new EdgeDriver();
    }
}
