package com.selenium.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookLoginPage {

    private WebDriver driver;

    private By emailInput = By.id("email");
    private By passwordInput = By.id("pass");
    private By loginButton = By.name("login");

   
    public FacebookLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    
    public void enterEmail(String email) {
        driver.findElement(emailInput).clear();
        driver.findElement(emailInput).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordInput).clear();
        driver.findElement(passwordInput).sendKeys(password);
    }

    public FacebookHomePage clickLogin() {
        driver.findElement(loginButton).click();
        return new FacebookHomePage(driver);
    }

    public FacebookHomePage loginAs(String email, String password) {
        enterEmail(email);
        enterPassword(password);
        return clickLogin();
    }
}
