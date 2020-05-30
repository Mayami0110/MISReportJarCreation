package com.qa.mgnrega.testcases;

import org.testng.TestNG;

public class TestRunner {

	static TestNG testng1;
	public static void main(String[] args) {

		testng1 = new TestNG();
		testng1.setTestClasses(new Class[] {MISReportsPageTest.class});
		testng1.run();
		
	}

}
