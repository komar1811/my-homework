package com.epam.poland.aqa.bdd.homework;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/resources/features",
        glue = {"steps"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
}