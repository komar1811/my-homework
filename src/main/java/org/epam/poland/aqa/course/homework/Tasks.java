package org.epam.poland.aqa.course.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.epam.poland.aqa.course.homework.Data.AMAZON_COUNTRY;
import static org.epam.poland.aqa.course.homework.Data.AMAZON_POSTAL_CODE;

public class Tasks {

    public static String Task11() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");

        WebElement deliverButton = driver.findElement(By.xpath("//*[@id=\"nav-global-location-popover-link\"]"));
        deliverButton.click();

        WebElement deliveryPostalCodeInfo = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"GLUXZipUpdateInput\"]")));
//        WebElement deliveryPostalCodeInfo = driver.findElement(By.xpath("//*[@id=\"GLUXZipUpdateInput\"]"));
        deliveryPostalCodeInfo.sendKeys(AMAZON_POSTAL_CODE);

        WebElement applyButton = driver.findElement(By.xpath("//*[@id=\"GLUXZipUpdate\"]/span/input"));
        applyButton.click();


        WebElement continueButton = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"GLUXConfirmClose\"]")));
        continueButton.click();


        WebElement deliverText = driver.findElement(By.xpath("//*[@id=\"glow-ingress-line2\"]"));
        String result = deliverText.getText();
        driver.close();
        driver.quit();

        return result;
    }

    public static boolean Task12() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");

        WebElement deliverButton = driver.findElement(By.xpath("//*[@id=\"nav-global-location-popover-link\"]"));
        deliverButton.click();

        WebElement deliveryCountriesList = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"GLUXCountryListDropdown\"]/span/span")));
        deliveryCountriesList.click();

        WebElement deliveryCountry = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),\"Poland\")]")));

        return deliveryCountry.getText().contains("Poland");

    }

    public static boolean Task13() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");

        WebElement deliverButton = driver.findElement(By.xpath("//*[@id=\"nav-global-location-popover-link\"]"));
        deliverButton.click();

        WebElement deliveryCountriesList = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"GLUXCountryListDropdown\"]/span/span")));
        deliveryCountriesList.click();

        WebElement deliveryCountry = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),\""+AMAZON_COUNTRY+"\")]")));
        deliveryCountry.click();

        WebElement doneButton = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(),\"Done\")]")));
        doneButton.click();

        WebElement goods = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"GaZP3LVmEhr8BoXOucfocw\"]/div[2]/div[1]/div[1]/a/div[1]/img")));
        goods.click();

        WebElement good = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/div/div/div/div/div[1]/div/div[2]/div/span/a/div/img"));
        good.click();

        WebElement goodCountry = driver.findElement(By.xpath("//*[contains(@class,\"inner\")]//*[contains(text(),\""+AMAZON_COUNTRY+"\")]"));


        return goodCountry.getText().contains(AMAZON_COUNTRY);

    }
}
