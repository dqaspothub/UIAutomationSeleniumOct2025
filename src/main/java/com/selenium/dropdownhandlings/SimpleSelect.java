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

public class SimpleSelect {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement dropdown = driver.findElement(By.id("dropdown"));

        Select select = new Select(dropdown);

        // 1. Select by visible text
        select.selectByVisibleText("Option 2");

        // 2. Select by value attribute
        select.selectByValue("1"); // selects Option 1 when value="1"

        // 3. Select by index
        select.selectByIndex(2); // index is 0-based

        // Get currently selected option
        WebElement selected = select.getFirstSelectedOption();
        System.out.println("Selected: " + selected.getText());

        driver.quit();
    }
}
