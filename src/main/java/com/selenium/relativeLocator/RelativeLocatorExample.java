package com.selenium.relativeLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocatorExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("C:\\Users\\priya\\OneDrive\\Desktop\\form.html"); // local HTML file

        // Locate the password input
        WebElement password = driver.findElement(By.id("password"));

        // Find the label that is above the password field
        WebElement passwordLabel = driver.findElement(with(By.tagName("label")).above(password));
        System.out.println("Label above password: " + passwordLabel.getText());

        // Locate the username field which is above password
        WebElement username = driver.findElement(with(By.tagName("input")).above(password));
        username.sendKeys("kannan123");

        // Locate the login button below password
        WebElement loginBtn = driver.findElement(with(By.tagName("input")).below(password));
        loginBtn.click();

        driver.quit();
    }
}
