package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {
	
	//AACD => CD, ACD => CD, CDEF => CDEF, CDAA => CDAA
	
	StringHelper helper = new StringHelper();
	
	private String input;
	private String expextedOutput;
	
	public StringHelperParameterizedTest(String input, String expextedOutput) {
		this.input = input;
		this.expextedOutput = expextedOutput;
	}

	@Parameters
	public static Collection<String[]> testConditions() {
		String expectedOutputs[][] = {{"AACD", "CD"}, {"ACD", "CD"}, {"CDEF", "CDEF"}, {"CDAA", "CDAA"}};
		Collection<String[]> ExpectedList = Arrays.asList(expectedOutputs);
		return ExpectedList;
	}
	
	@Test
	public void testTruncateAInFirst2Positions() {
		assertEquals(expextedOutput, helper.truncateAInFirst2Positions(input));
	}
}
