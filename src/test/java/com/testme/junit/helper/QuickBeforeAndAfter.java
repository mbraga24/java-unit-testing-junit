package com.testme.junit.helper;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class QuickBeforeAndAfter {

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

}
