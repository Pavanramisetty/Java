package com.fdmgroup.exercise5_part3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.fdmgroup.exercise5_part3.Exercise3point3;

public class TestExercise3point3 {

	Exercise3point3 exercise3;
	
	@Before
	public void setUp() throws Exception {
		exercise3 = new Exercise3point3();
	}

	@Test
	public void test_arrayContainsReturnsZeroWhenNumberIsNotWithinTheArray() {
		int[] array = {1,2,3,4,5,6};
		int frequency = exercise3.arrayFrequency(array, 7);
		assertEquals(0,frequency);
	}
	
	@Test
	public void test_arrayContainsReturns1WhenNumberOccursOnceInTheArray() {
		int[] array = {1,2,3,4,5,6,7,8};
		int frequency = exercise3.arrayFrequency(array, 7);
		assertEquals(1,frequency);
	}
	
	@Test
	public void test_arrayContainsReturns2WhenNumberOccursTwiceInTheArray() {
		int[] array = {9,2,8,3,5,4,6,7,8,1};
		int frequency = exercise3.arrayFrequency(array, 8);
		assertEquals(2,frequency);
	}
	
	@Test
	public void test_arrayContainsReturns3WhenNumberOccursThreeTimesInTheArray() {
		int[] array = {9,2,8,3,5,4,6,9,7,8,1,9};
		int frequency = exercise3.arrayFrequency(array, 9);
		assertEquals(3,frequency);
	}
	
	@Test
	public void test_arrayContainsReturns4WhenNumberOccursFourTimesInTheArray() {
		int[] array = {10,10,10,9,2,8,3,5,4,6,9,7,8,1,9,10};
		int frequency = exercise3.arrayFrequency(array, 10);
		assertEquals(4,frequency);
	}

}
