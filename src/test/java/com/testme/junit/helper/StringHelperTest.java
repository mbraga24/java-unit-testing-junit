package com.testme.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

import com.testme.junit.helper.StringHelper;

public class StringHelperTest extends StringHelper {

	/*
	 * Passing AABC => BC test
	 */
	@Test
	public void truncateAInFirst2PositionsTest_AABC_Success() {
		
		StringHelper helper = new StringHelper();
		
		String actual = helper.truncateAInFirst2Positions("AABC");
		String expected = "BC";
		
		assertEquals(expected, actual);
	}
	
	/*
	 * Passing ABC => BC test
	 */
	@Test
	public void truncateAInFirst2PositionsTest_ABC_Success() {
		
		StringHelper helper = new StringHelper();
		
		String actual = helper.truncateAInFirst2Positions("ABC");
		String expected = "BC";
		
		assertEquals(expected, actual);
	}

}
