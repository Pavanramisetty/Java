package com.fdmgroup.exercise6_testcases;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TestExercise1point1 {

	Exercise1point1 exercise1;
	
	@Before
	public void setUp() throws Exception {
		exercise1 = new Exercise1point1();
	}
	
	@Test
	public void test_primeNumbersReturns2_when2passedIn() {
		List<Integer> actual = exercise1.primeNumbers(11);
		List<Integer> expected = new ArrayList<Integer>(Arrays.asList(2,3,5,7,11));
		assertEquals(expected,actual);
	}
	
	@Test
	public void test_primeNumbersReturns2_3_5_7_11_when11passedIn() {
		List<Integer> actual = exercise1.primeNumbers(11);
		List<Integer> expected = new ArrayList<Integer>(Arrays.asList(2,3,5,7,11));
		assertEquals(expected,actual);
	}

	@Test
	public void test_primeNumbersReturns2_3_5_7_11_when12passedIn() {
		List<Integer> actual = exercise1.primeNumbers(12);
		List<Integer> expected = new ArrayList<Integer>(Arrays.asList(2,3,5,7,11));
		assertEquals(expected,actual);
	}
	
	@Test
	public void test_primeNumbersReturns2_3_5_7_11_13_when13passedIn() {
		List<Integer> actual = exercise1.primeNumbers(13);
		List<Integer> expected = new ArrayList<Integer>(Arrays.asList(2,3,5,7,11,13));
		assertEquals(expected,actual);
	}
	
	@Test
	public void test_primeNumbersReturns2_3_5_7_11_13_17_19_23_29_31_37_41_43_47when50passedIn() {
		List<Integer> actual = exercise1.primeNumbers(50);
		List<Integer> expected = new ArrayList<Integer>(Arrays.asList(2,3,5,7,11,13,17,19,23,29,31,37,41,43,47));
		assertEquals(expected,actual);
	}
	


}
