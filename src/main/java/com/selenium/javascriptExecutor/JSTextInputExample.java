package com.selenium.javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSTextInputExample {
    public static void main(String[] args) {

    	WebDriver driver = new ChromeDriver();
    	
        driver.manage().window().maximize();
        
        int a = 10;
        

        driver.get("https://www.facebook.com");

        WebElement emailField = driver.findElement(By.id("email"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        
        js.executeScript("arguments[0].value='testuser@example.com';", emailField);

        System.out.println("✅ Email entered using JavaScript!");

        driver.quit();
    }
}
