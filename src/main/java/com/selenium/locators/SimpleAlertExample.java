package com.selenium.locators;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlertExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        // Click on the button to trigger a simple alert
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
        // Switch to the alert
        Alert alert = driver.switchTo().alert();

        Thread.sleep(7000);
        
        // Get alert text
        System.out.println("Alert text is: " + alert.getText());

        // Accept the alert
        alert.accept();

        System.out.println("Alert accepted successfully!");
        driver.quit();
    }
}
