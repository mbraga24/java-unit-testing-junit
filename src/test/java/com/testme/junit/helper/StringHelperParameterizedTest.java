package com.testme.junit.helper;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperParameterizedTest extends StringHelper {

	StringHelper helper = new StringHelper();
	
	private String input;
	private String expectedOutput;
	
	public StringHelperParameterizedTest(String input, String expectedOutput) {
		this.input = input;
		this.expectedOutput = expectedOutput;
	}
	
	
	@Parameters
	public static Collection<String[]> testConditions() {
		String expectedOutputs[][] = {
				{"AABC", "BC"},
				{"ABC", "BC"}
		};
		return Arrays.asList(expectedOutputs);
	}
	
	/*
	 * Test AABC => BC
	 * Test ABC => BC
	 */
	@Test
	public void testTruncateAInFirst2Positions_AABC() {
		
		String actual = helper.truncateAInFirst2Positions(input);

		assertEquals(expectedOutput, actual);
	}	

}
