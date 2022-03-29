package com.epam.poland.aqa.bdd.homework.properties.holder;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyHolder {
    private final Properties properties = new Properties();

    {
        try(FileInputStream fis = new FileInputStream("src/test/java/resources/browser.properties")) {
            properties.load(fis);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public String readProperty(String propertyName) {
        return properties.getProperty(propertyName);
    }
}
