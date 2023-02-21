package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperParameterizedTest2 {
	
	//ABCD => false, ABAB => true, AB => true, A => false
	
	StringHelper helper = new StringHelper();
	
	String input;
	
	public StringHelperParameterizedTest2(String input) {
		this.input = input;
	}

	@Parameters
	public static List<String> testConditions() {
		String[] expectedOutputs = {"ABCD", "ABAB", "AB", "A"};
		return Arrays.asList(expectedOutputs);
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame() {
		assertFalse("The condition failed", helper.areFirstAndLastTwoCharactersTheSame(input));
	}

}
