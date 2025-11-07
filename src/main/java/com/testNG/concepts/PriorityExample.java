package com.testNG.concepts;
import org.testng.annotations.Test;
import org.testng.TestNG;

public class PriorityExample {
	
    @Test //It will be considered as priority = 0
    public void loginScenario() {
        System.out.println("1 - loginScenario");
    }
    
    @Test
    public void loginTestCase() {
        System.out.println("1 - loginTestCase");
    }

    @Test(priority = 1)
    public void search() {
        System.out.println("2 - search");
    }

}
