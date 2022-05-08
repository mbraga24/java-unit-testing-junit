package com.testme.junit.helper;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Test;

public class ArraysCompareTest {

	/*
	 * Test {1,3,4,12} equals to {1,3,4,12}
	 */
	@Test
	public void testArraySort_ArraysMatched() {
		int[] numbers = {12,3,4,1};
		int[] expected = {1,3,4,12};
		
		Arrays.sort(numbers);
		assertArrayEquals(expected, numbers);
	}

}
