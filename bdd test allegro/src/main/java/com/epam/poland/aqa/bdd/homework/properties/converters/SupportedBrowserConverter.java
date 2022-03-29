package com.epam.poland.aqa.bdd.homework.properties.converters;


import com.epam.poland.aqa.bdd.homework.enumeration.SupportedBrowsers;

public final class SupportedBrowserConverter {
    public static SupportedBrowsers valueOfWebBrowser(String webBrowser) {
        return switch(webBrowser) {
            case "local_chrome" -> SupportedBrowsers.LOCAL_CHROME;
            case "local_firefox" -> SupportedBrowsers.LOCAL_FIREFOX;
            case "local_edge" -> SupportedBrowsers.LOCAL_EDGE;
            default -> throw new IllegalArgumentException("No appropriate browser found");
        };
    }
}
