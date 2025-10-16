package com.selenium.locators;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PromptAlertExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        // Click the prompt alert button
        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();

        // Switch to alert
        Alert alert = driver.switchTo().alert();

        Thread.sleep(7000);
        // Get alert text
        System.out.println("Alert text is: " + alert.getText());

        // Enter text into alert input box
        alert.sendKeys("Selenium Test");

        // Accept the alert
        alert.accept();

        System.out.println("Prompt accepted successfully!");
        driver.quit();
    }
}
