package com.selenium.pom.pages;

import org.openqa.selenium.WebDriver;

public class FacebookHomePage {

    private WebDriver driver;

    public FacebookHomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Simple validation: check redirect is successful
    public boolean isAtHomePage() {
        String url = driver.getCurrentUrl();
        return url.contains("facebook.com") && !url.contains("login");
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
}
