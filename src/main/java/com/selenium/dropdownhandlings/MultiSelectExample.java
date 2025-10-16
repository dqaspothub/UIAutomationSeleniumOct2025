package com.selenium.dropdownhandlings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.interactions.Actions;

public class MultiSelectExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("URL_WITH_MULTIPLE_SELECT"); // replace with real URL
        WebElement multi = driver.findElement(By.id("multi-select"));

        Select select = new Select(multi);
        if (select.isMultiple()) {
            select.selectByVisibleText("Option 1");
            select.selectByValue("value2");
            select.selectByIndex(3);

            List<WebElement> selectedOptions = select.getAllSelectedOptions();
            selectedOptions.forEach(opt -> System.out.println(opt.getText()));

            // remove one selection
            select.deselectByVisibleText("Option 1");
            // clear all
            select.deselectAll();
        } else {
            System.out.println("Not a multi-select element");
        }
        driver.quit();
    }
}
