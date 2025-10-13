package com.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdAndNameLocatorDemo {

    public static void main(String[] args) throws InterruptedException {

        // 1️⃣ Launch Chrome browser
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();

        // 2️⃣ Open Facebook login page
        driver.get("https://www.facebook.com");

        // 3️⃣ Locate elements using ID locator
        // ID is one of the most reliable locators because it's usually unique for each element

        // Locate Email field using 'id' and enter text
        WebElement emailField = driver.findElement(By.name("email"));
        emailField.sendKeys("testuser@example.com");

        // Locate Password field using 'id' and enter text
        WebElement passwordField = driver.findElement(By.id("pass"));
        passwordField.sendKeys("Test@123");

        // Locate Login button using 'name' or 'id'
        WebElement loginButton = driver.findElement(By.name("login"));
        loginButton.click();

        // 4️⃣ Wait for a few seconds to observe result (not recommended for real tests)
        Thread.sleep(3000);

        // 5️⃣ Print the page title after login attempt
        System.out.println("Page Title After Login: " + driver.getTitle());

        // 6️⃣ Close the browser
        driver.quit();
    }
}
