package com.selenium.locators;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ConfirmationAlertExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        // Click the confirmation alert button
        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();

        // Switch to alert
        Alert alert = driver.switchTo().alert();

        // Get alert text
        System.out.println("Alert text is: " + alert.getText());

        // Dismiss the alert (click 'Cancel')
        alert.dismiss();

        System.out.println("Alert dismissed successfully!");
        driver.quit();
    }
}
