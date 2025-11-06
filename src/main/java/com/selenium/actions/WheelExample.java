package com.selenium.actions;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WheelExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            driver.get("https://www.selenium.dev/");

            WebElement target = driver.findElement(By.xpath("//h2[text()='Selenium Level Sponsors']"));

            Actions actions = new Actions(driver);

            // Scroll down by 500 pixels (positive = down, negative = up)
            actions.scrollByAmount(0, 500).perform();

            // Scroll the target element into view using the wheel
            actions.scrollToElement(target).perform();

            System.out.println("Scrolled using wheel actions!");
        } finally {
            driver.quit();
        }
    }
}
