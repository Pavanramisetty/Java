package com.fdmgroup.exercise5_part3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.fdmgroup.exercise5_part3.Exercise3point4;

public class TestExercise3point4 {

	Exercise3point4 exercise4;
	
	@Before
	public void setUp() throws Exception {
		exercise4  = new Exercise3point4();
	}

	@Test
	public void test_maxNumberReturns4WhenArray_1_2_3_4_passedIn() {
		int[] array = {1,2,3,4};
		int highestNumber = exercise4.maxNumber(array);
		assertEquals(4,highestNumber);
	}
	
	@Test
	public void test_maxNumberReturns7WhenArray_3_7_1_2_0passedIn() {
		int[] array = {3,7,1,2,0};
		int highestNumber = exercise4.maxNumber(array);
		assertEquals(7,highestNumber);
	}
	
	@Test
	public void test_maxNumberReturnsMinus1WhenArray_minus3_minus4_minus1_minus2_minus5_minus8_passedIn() {
		int[] array = {-3,-4,-1,-2,-5,-8};
		int highestNumber = exercise4.maxNumber(array);
		assertEquals(-1,highestNumber);
	}
	
	@Test
	public void test_maxNumberReturnsZeroWhenArray_minus3_zero_minus4_minus1_minus2_passedIn() {
		int[] array = {-3,0,-4,-1,-2};
		int highestNumber = exercise4.maxNumber(array);
		assertEquals(0,highestNumber);
	}
	
	@Test
	public void test_maxNumberReturns11WhenArray_minus30_zero_minus40_11_minus12_minus20_passedIn() {
		int[] array = {-30,0,-40,11,-12,-20};
		int highestNumber = exercise4.maxNumber(array);
		assertEquals(11,highestNumber);
	}

}
