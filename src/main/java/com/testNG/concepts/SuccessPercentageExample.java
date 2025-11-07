// SuccessPercentageExample.java
package com.testNG.concepts;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class SuccessPercentageExample {

    private final Random rnd = new Random();

    /**
     * This test runs 10 times. At least 60% (i.e. 6) of runs must pass for TestNG to mark the test as passed.
     * The test randomly fails to simulate a flaky test.
     */
    @Test(invocationCount = 10, successPercentage = 60)
    public void flakyButToleratedTest() {
        int value = rnd.nextInt(10); // 0..9
        System.out.printf("flakyButToleratedTest -> val
