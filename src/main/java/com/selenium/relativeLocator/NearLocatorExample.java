package com.selenium.relativeLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class NearLocatorExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("C:\\Users\\priya\\OneDrive\\Desktop\\form.html");

        WebElement forgotLink = driver.findElement(By.id("forgotLink"));

        Thread.sleep(4000);

        // Locate login button near the forgot link
        WebElement loginBtn = driver.findElement(with(By.tagName("input")).near(forgotLink));
        
        Thread.sleep(4000);
        
        loginBtn.click();

        driver.quit();
    }
}
