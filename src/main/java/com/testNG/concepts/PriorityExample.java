package com.testNG.concepts;
import org.testng.annotations.Test;
import org.testng.TestNG;

public class PriorityExample {
    @Test(priority = 1)
    public void login() {
        System.out.println("1 - login");
    }

    @Test(priority = 2)
    public void search() {
        System.out.println("2 - search");
    }

}
