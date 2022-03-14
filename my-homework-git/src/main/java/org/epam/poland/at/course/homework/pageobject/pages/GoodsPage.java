package org.epam.poland.at.course.homework.pageobject.pages;

import org.epam.poland.at.course.homework.pageobject.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoodsPage extends BasePage {


    private WebElement product;

    public GoodsPage(WebDriver webDriver){
        super(webDriver);
    }

    public ProductPage chooseProduct() {
        System.out.println(webDriver.getCurrentUrl());
        product = webDriver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/div/div/div/div/div/div/div[1]/div/div[2]/div/span/a/div/img"));
        product.click();
        System.out.println("3");
        return new ProductPage(webDriver);
    }
}
