package com.epam.poland.aqa.bdd.homework.enumeration;


import com.epam.poland.aqa.bdd.homework.invoker.implementations.LocalChromeInvoker;
import com.epam.poland.aqa.bdd.homework.invoker.implementations.LocalEdgeInvoker;
import com.epam.poland.aqa.bdd.homework.invoker.implementations.LocalFirefoxInvoker;
import com.epam.poland.aqa.bdd.homework.invoker.WebDriverInvoker;
import org.openqa.selenium.WebDriver;

public enum SupportedBrowsers {
    LOCAL_CHROME(new LocalChromeInvoker()),
    LOCAL_FIREFOX(new LocalFirefoxInvoker()),
    LOCAL_EDGE(new LocalEdgeInvoker());

    private WebDriverInvoker webDriverInvoker;

    SupportedBrowsers(WebDriverInvoker webDriverInvoker) {
        this.webDriverInvoker = webDriverInvoker;
    }

    public WebDriver getWebDriver(){
        return webDriverInvoker.invokeWebDriver();
    }
}
