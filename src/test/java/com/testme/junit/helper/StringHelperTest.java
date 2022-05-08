package com.testme.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

import com.testme.junit.helper.StringHelper;

public class StringHelperTest extends StringHelper {

	StringHelper helper = new StringHelper();
	
	/*
	 * Passing AABC => BC test
	 */
	@Test
	public void testTruncateAInFirst2Positions_AABC_Success() {
		
		String actual = helper.truncateAInFirst2Positions("AABC");
		String expected = "BC";
		
		assertEquals(expected, actual);
	}
	
	/*
	 * Passing ABC => BC test
	 */
	@Test
	public void testTruncateAInFirst2Positions_ABC_Success() {
		
		String actual = helper.truncateAInFirst2Positions("ABC");
		String expected = "BC";
		
		assertEquals(expected, actual);
	}

}
