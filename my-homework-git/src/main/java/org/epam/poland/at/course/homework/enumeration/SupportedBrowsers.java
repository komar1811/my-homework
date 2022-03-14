package org.epam.poland.at.course.homework.enumeration;

import org.epam.poland.at.course.homework.invoker.WebDriverInvoker;
import org.epam.poland.at.course.homework.invoker.implementation.LocalChromeInvoker;
import org.epam.poland.at.course.homework.invoker.implementation.LocalEdgeInvoker;
import org.epam.poland.at.course.homework.invoker.implementation.LocalFirefoxInvoker;
import org.openqa.selenium.WebDriver;

public enum SupportedBrowsers {
    LOCAL_CHROME (new LocalChromeInvoker()),
    LOCAL_FIREFOX (new LocalFirefoxInvoker()),
    LOCAL_EDGE (new LocalEdgeInvoker());

    private WebDriverInvoker webDriverInvoker;

    SupportedBrowsers(WebDriverInvoker webDriverInvoker){
        this.webDriverInvoker = webDriverInvoker;
    }

    public WebDriver getWebDriver(){
        return webDriverInvoker.invokeWebDriver();
    }
}
