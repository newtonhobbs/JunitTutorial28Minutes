package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {

	StringHelper helper = new StringHelper(); 
	
	//AACD => CD, ACD => CD, CDEF => CDEF, CDAA => CDAA
	@Test
	public void testTruncateAInFirst2Positions_AinFirst2Positions() {
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions_AinFirstPosition() {
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}

	@Test
	public void testTruncateAInFirst2Positions_AnotinFirst2Positions() {
		assertEquals("CDAA", helper.truncateAInFirst2Positions("CDAA"));
	}

	@Test
	public void testTruncateAInFirst2Positions_AnotPrestent() {
		assertEquals("CDEF", helper.truncateAInFirst2Positions("CDEF"));
	}
	
	//ABCD => false, ABAB => true, AB => true, A => false
	@Test 
	public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario() {
		assertFalse("The condition failed", helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}
	
	@Test 
	public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenario() {
		assertTrue("The condition failed", helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}
	
	@Test 
	public void testAreFirstAndLastTwoCharactersTheSame_TwoChar() {
		assertTrue("The condition failed", helper.areFirstAndLastTwoCharactersTheSame("AB"));
	}
	
	@Test 
	public void testAreFirstAndLastTwoCharactersTheSame_SingleCharOnly() {
		assertFalse("The condition failed", helper.areFirstAndLastTwoCharactersTheSame("A"));
	}
}
