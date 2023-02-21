/**
 * 
 */
package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

/**
 * @author NHI437
 *
 */
public class ArrayCompareTest {

	@Test
	public void testArraySort_RandomArray() {
		int[] numbers = {12, 3, 4, 1};
		int[] expected = {1, 3, 4, 12};
		Arrays.sort(numbers);
		assertArrayEquals(expected, numbers);
	}
	
	//Method:1 for Exception
	@Test
	public void testArraySort_NullArray1() {
		int[] numbers = null;
		try {
			Arrays.sort(numbers);
		} catch (NullPointerException e) {
			// TODO: handle exception
		}
	}
	
	//Method:2 for Exception (Provides by JUnit)
	@Test(expected = NullPointerException.class)
	public void testArraySort_NullArray2() {
		int[] numbers = null;
		Arrays.sort(numbers);
	}
	
	//Here mention that we expect "NullPointerException" if,
	//There is no "NullPointerException" than this test will 
	//show test failed.
	@Test(expected = NullPointerException.class)
	public void testArraySort_NullArray3() {
		int[] numbers = {};
		//Here we pass empty array but expected NullPointerException
		//i.e we got Test failed.
		Arrays.sort(numbers);
	}
	
	//Performance Test
	@Test(timeout = 100)
	public void testSort_performance() {
		int array[] = {12, 23, 4};
		for(int i=1; i<=1000000; i++) {
			array[0] = i;
			Arrays.sort(array);
		}
	}
}
