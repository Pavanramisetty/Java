package com.fdmgroup.exercise6_testcases;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestExercise1point2 {

	Exercise1point2 exercise2;
	
	@Before
	public void setUp() throws Exception {
		exercise2 = new Exercise1point2();
	}

	@Test
	public void test_bubbleSortReturns_1_2_3_4_5when5_2_3_1_4passedIn() {
		int[] original = {5,2,3,1,4};
		int[] sorted = exercise2.bubbleSort(original);
		assertEquals(5,sorted.length);
		assertEquals(1,sorted[0]);
		assertEquals(2,sorted[1]);
		assertEquals(3,sorted[2]);
		assertEquals(4,sorted[3]);
		assertEquals(5,sorted[4]);
	}
	
	@Test
	public void test_bubbleSortReturns_minus5_minus4_minus3_minus2_minus1whenminus5_minus2_minus3_minus1_minus4passedIn() {
		int[] original = {-5,-2,-3,-1,-4};
		int[] sorted = exercise2.bubbleSort(original);
		assertEquals(5,sorted.length);
		assertEquals(-5,sorted[0]);
		assertEquals(-4,sorted[1]);
		assertEquals(-3,sorted[2]);
		assertEquals(-2,sorted[3]);
		assertEquals(-1,sorted[4]);
	}
	
	@Test
	public void test_bubbleSortReturns_minus99_minus50_0_3_12_75when75_0_minus50_12_3_minus99passedIn() {
		int[] original = {75,0,-50,12,3,-99};
		int[] sorted = exercise2.bubbleSort(original);
		assertEquals(6,sorted.length);
		assertEquals(-99,sorted[0]);
		assertEquals(-50,sorted[1]);
		assertEquals(0,sorted[2]);
		assertEquals(3,sorted[3]);
		assertEquals(12,sorted[4]);
		assertEquals(75,sorted[5]);
	}
	
	

}
