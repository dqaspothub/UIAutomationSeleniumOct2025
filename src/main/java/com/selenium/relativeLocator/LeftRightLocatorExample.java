package com.selenium.relativeLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class LeftRightLocatorExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/You/Desktop/horizontalForm.html");

        WebElement emailField = driver.findElement(By.id("emailField"));

        // Find the label to the left of the email field
        WebElement label = driver.findElement(with(By.tagName("label")).toLeftOf(emailField));
        System.out.println("Label text: " + label.getText());

        // Find button to the right of email field
        WebElement button = driver.findElement(with(By.tagName("button")).toRightOf(emailField));
        button.click();

        driver.quit();
    }
}
