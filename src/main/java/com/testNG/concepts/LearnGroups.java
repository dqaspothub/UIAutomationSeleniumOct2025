package com.testNG.concepts;

import org.testng.annotations.Test;

public class LearnGroups {

	public int add(int a, int b) {
		
		int c = a+b;
		
		return c;
	}
	
	@Test(groups="sanity")
	public void t1() {
		System.out.println("t1");
	}
	

	@Test(groups={"retest","smoke"})
	public void t2() {
		System.out.println("t2");

	}
		
	@Test(groups = "smoke")
	public void t3() {
		System.out.println("t3");

	}
	

	@Test(groups = "smoke")
	public void t4() {
		System.out.println("t4");

	}
	

	@Test(groups = "retest")
	public void t5() {
		System.out.println("t5");

	}
}
