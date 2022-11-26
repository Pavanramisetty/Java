package com.fdmgroup.exercise5_part3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.fdmgroup.exercise5_part3.Exercise3point5;

public class TestExercise3point5 {

	Exercise3point5 exercise5;
	
	@Before
	public void setUp() throws Exception {
		exercise5 = new Exercise3point5();
	}

	@Test
	public void test_extractEvenArrayReturnsEmptyArrayWhenArrayWithOnlyOddNumbersPassedIn() {
		int[] array = {5,3,7,7,3,3};
		int[] evenArray = exercise5.extractEvenArray(array);
		assertEquals(0,evenArray.length);
	}
	
	@Test
	public void test_extractEvenArrayReturnsArrayContaining_2_6_4When2_5_3_7_6_7_3_4_3passedIn() {
		int[] array = {2,5,3,7,6,7,3,4,3};
		int[] evenArray = exercise5.extractEvenArray(array);
		assertEquals(3,evenArray.length);
		assertEquals(2,evenArray[0]);
		assertEquals(6,evenArray[1]);
		assertEquals(4,evenArray[2]);
	}
	
	@Test
	public void test_extractEvenArrayReturnsArrayContaining_minus8_10_minus20_42When5_minus8_9_3_10_11_minus20_42passedIn() {
		int[] array = {5,-8,9,3,10,11,-20,42};
		int[] evenArray = exercise5.extractEvenArray(array);
		assertEquals(4,evenArray.length);
		assertEquals(-8,evenArray[0]);
		assertEquals(10,evenArray[1]);
		assertEquals(-20,evenArray[2]);
		assertEquals(42,evenArray[3]);
	}
	
	@Test
	public void test_extractEvenArrayReturnsArrayContainingSameNumbersWhenArrayWithOnlyEvensPassedIn() {
		int[] array = {6,4,8,2};
		int[] evenArray = exercise5.extractEvenArray(array);
		assertEquals(4,evenArray.length);
		assertEquals(6,evenArray[0]);
		assertEquals(4,evenArray[1]);
		assertEquals(8,evenArray[2]);
		assertEquals(2,evenArray[3]);
	}

}
