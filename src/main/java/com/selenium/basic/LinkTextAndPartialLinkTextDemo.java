package com.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextAndPartialLinkTextDemo {

    public static void main(String[] args) throws InterruptedException {

        // 1️⃣ Launch Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2️⃣ Open Facebook login page
        driver.get("https://www.facebook.com/");

        // 3️⃣ Use LinkText to click on "Forgotten password?"
        // LinkText works when you know the exact visible text of the link
        WebElement forgotPasswordLink = driver.findElement(By.linkText("Forgotten password?"));
        forgotPasswordLink.click();

        Thread.sleep(3000); // Wait to see the result
        System.out.println("Title after clicking Forgotten password link: " + driver.getTitle());

        // 4️⃣ Navigate back to login page
        driver.navigate().back();
        Thread.sleep(2000);

        // 5️⃣ Use PartialLinkText to click on "Create new account"
        // PartialLinkText works when only part of the visible text is known
        WebElement createAccountLink = driver.findElement(By.partialLinkText("Create"));
        createAccountLink.click();

        Thread.sleep(3000); // Wait to see the result
        System.out.println("Title after clicking Create Account link: " + driver.getTitle());

        // 6️⃣ Close the browser
        driver.quit();
    }
}
