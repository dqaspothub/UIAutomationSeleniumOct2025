package com.selenium.pom.test;

import com.selenium.pom.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.selenium.pom.pages.FacebookHomePage;
import com.selenium.pom.pages.FacebookLoginPage;

public class FacebookLoginTest extends BaseTest {

    @Test
    public void testValidLogin() throws InterruptedException {

        FacebookLoginPage loginPage = new FacebookLoginPage(driver);

        FacebookHomePage home = loginPage.loginAs("Kannathasan", "123");

        Thread.sleep(3000); // can replace with WebDriverWait

        Assert.assertTrue(home.isAtHomePage(),
                "Login failed — current URL: " + home.getCurrentUrl());
    }
}
