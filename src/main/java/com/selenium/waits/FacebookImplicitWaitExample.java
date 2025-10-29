package com.selenium.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class FacebookImplicitWaitExample {
    public static void main(String[] args) {
        
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Open Facebook
        driver.get("https://www.facebook.com");
        
        driver.manage().window().maximize();

        // Set Implicit Wait - applies to all elements
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Locate elements (Selenium waits up to 10 seconds for each)
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("testuser@example.com");

        WebElement passwordField = driver.findElement(By.id("pass"));
        passwordField.sendKeys("fakepassword123");

        WebElement loginButton = driver.findElement(By.name("login"));
        loginButton.click();

        // Wait a few seconds to observe the result (optional)
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the browser
        driver.quit();
    }
}
