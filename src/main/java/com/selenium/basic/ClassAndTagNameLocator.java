package com.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class ClassAndTagNameLocator {

    public static void main(String[] args) throws InterruptedException {

        // 1️⃣ Launch Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2️⃣ Open Facebook login page
        driver.get("https://www.facebook.com/");

        // 3️⃣ Locate Email field using Class Name
        // The class name value can be found in the HTML of an element (class="inputtext")
        WebElement emailField = driver.findElement(By.className("inputtext"));
        emailField.sendKeys("testuser@example.com");
        System.out.println("Entered email using ClassName locator.");

        // 4️⃣ Locate all <a> (anchor) tags using Tag Name locator
        // TagName finds elements by their HTML tag (like input, button, a, div)
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        // Print the total number of links found on the page
        System.out.println("Total number of links on the Facebook page: " + allLinks.size());

        // Print the text of the first 5 links (for demo purpose)
        for (int i = 0; i < 5 && i < allLinks.size(); i++) {
            System.out.println("Link " + (i + 1) + ": " + allLinks.get(i).getText());
        }

        // 5️⃣ Wait for a few seconds to observe
        Thread.sleep(3000);

        // 6️⃣ Close browser
        driver.quit();
    }
}
