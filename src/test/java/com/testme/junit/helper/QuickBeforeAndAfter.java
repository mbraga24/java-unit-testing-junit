package com.testme.junit.helper;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickBeforeAndAfter {

	@BeforeClass
	public static void setupBeforeClass() {
		System.out.println("RUN SETUPBEFORECLASS() => Usually used when considering performance. When it isn't necessary to "
				+ "set up certain configuration before each test run.");	
	}
	
	@Before
	public void setup() {
		System.out.println("RUN SETUP()");
	}
	
	@Test
	public void test() {
		System.out.println("RUN TEST 1");
	}
	
	@After
	public void tearDown() {
		System.out.println("RUN TEARDOWN()");
	}
	
	@AfterClass
	public static void tearDownAfterClass() {
		System.out.println("RUN TEARDOWNAFTERCLASS() => Usually used when considering performance. When it isn't necessary to "
				+ "terminate certain configuration after each test run. Configuration might be share among most or all tests, "
				+ "hence why only terminate after all tests are done running.");	
	}

}
