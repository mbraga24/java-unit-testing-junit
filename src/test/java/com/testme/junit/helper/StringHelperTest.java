package com.testme.junit.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StringHelperTest extends StringHelper {

	StringHelper helper = new StringHelper();
	
	/*
	 * Test AABC => BC
	 */
	@Test
	public void testTruncateAInFirst2Positions_AABC() {
		
		String actual = helper.truncateAInFirst2Positions("AABC");
		String expected = "BC";
		
		assertEquals(expected, actual);
	}
	
	/*
	 * Test ABC => BC
	 */
	@Test
	public void testTruncateAInFirst2Positions_ABC() {
		
		String actual = helper.truncateAInFirst2Positions("ABC");
		String expected = "BC";
		
		assertEquals(expected, actual);
	}
	
	/*
	 * Test CDEF => CDEF
	 */
	@Test
	public void testTruncateAInFirst2Positions_CDEF() {
		
		String actual = helper.truncateAInFirst2Positions("DCEF");
		String expected = "DCEF";
		
		assertEquals(expected, actual);		
	}
	
	/*
	 * Test CDAA => CDAA
	 */
	@Test
	public void testTruncateAInFirst2Positions_CDAA() {
		
		String actual = helper.truncateAInFirst2Positions("CDAA");
		String expected = "CDAA";
		
		assertEquals(expected, actual);
	}
	
	/*
	* Test ABCD => false
	*/
	@Test
	public void areFirstAndLastTwoCharactersTheSame_False_ABCD() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}
	
	/*
	* Test ABAB => false
	*/
	@Test
	public void areFirstAndLastTwoCharactersTheSame_True_ABAB() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}
	
	/*
	* Test AB => true
	*/
	@Test
	public void areFirstAndLastTwoCharactersTheSame_True_AB() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("AB"));
	}
	
	/*
	* Test A => false
	*/
	@Test
	public void areFirstAndLastTwoCharactersTheSame_True_A() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("A"));
	}
	
	

}
