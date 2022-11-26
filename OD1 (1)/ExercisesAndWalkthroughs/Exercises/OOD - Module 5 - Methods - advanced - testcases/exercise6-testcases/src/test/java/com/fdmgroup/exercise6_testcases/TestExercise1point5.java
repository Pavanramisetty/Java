package com.fdmgroup.exercise6_testcases;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestExercise1point5 {

	Exercise1point5 exercise5;
	
	@Before
	public void setUp() throws Exception {
		exercise5 = new Exercise1point5();
	}

	@Test
	public void test_rotate_returns_51234_when_12345_and_1_passed_in() {
		int[] array = {1,2,3,4,5};
		int[] result = exercise5.rotateArray(array,1);
		int[] expected = {5,1,2,3,4};
		assertArrayEquals(expected,result);
	}
	
	@Test
	public void test_rotate_returns_45123_when_12345_and_2_passed_in() {
		int[] array = {1,2,3,4,5};
		int[] result = exercise5.rotateArray(array,2);
		int[] expected = {4,5,1,2,3};
		assertArrayEquals(expected,result);
	}
	
	@Test
	public void test_rotate_returns_34512_when_12345_and_3_passed_in() {
		int[] array = {1,2,3,4,5};
		int[] result = exercise5.rotateArray(array,3);
		int[] expected = {3,4,5,1,2};
		assertArrayEquals(expected,result);
	}
	
	@Test
	public void test_rotate_returns_23451_when_12345_and_4_passed_in() {
		int[] array = {1,2,3,4,5};
		int[] result = exercise5.rotateArray(array,4);
		int[] expected = {2,3,4,5,1};
		assertArrayEquals(expected,result);
	}
	
	@Test
	public void test_rotate_returns_12345_when_12345_and_5_passed_in() {
		int[] array = {1,2,3,4,5};
		int[] result = exercise5.rotateArray(array,5);
		int[] expected = {1,2,3,4,5};
		assertArrayEquals(expected,result);
	}
	
	@Test
	public void test_rotate_returns_51234_when_12345_and_6_passed_in() {
		int[] array = {1,2,3,4,5};
		int[] result = exercise5.rotateArray(array,6);
		int[] expected = {5,1,2,3,4};
		assertArrayEquals(expected,result);
	}
	
	@Test
	public void test_rotate_returns_9876543210_when_9876543210_and_100_passed_in() {
		int[] array = {9,8,7,6,5,4,3,2,1,0};
		int[] result = exercise5.rotateArray(array,100);
		int[] expected = {9,8,7,6,5,4,3,2,1,0};
		assertArrayEquals(expected,result);
	}
	
	@Test
	public void test_rotate_returns_0987654321_when_9876543210_and_551_passed_in() {
		int[] array = {9,8,7,6,5,4,3,2,1,0};
		int[] result = exercise5.rotateArray(array,551);
		int[] expected = {0,9,8,7,6,5,4,3,2,1};
		assertArrayEquals(expected,result);
	}
	
	@Test
	public void test_rotate_returns_1098765432_when_9876543210_and_732_passed_in() {
		int[] array = {9,8,7,6,5,4,3,2,1,0};
		int[] result = exercise5.rotateArray(array,732);
		int[] expected = {1,0,9,8,7,6,5,4,3,2};
		assertArrayEquals(expected,result);
	}
	
	@Test
	public void test_rotate_returns_2109876543_when_9876543210_and_6543_passed_in() {
		int[] array = {9,8,7,6,5,4,3,2,1,0};
		int[] result = exercise5.rotateArray(array,6543);
		int[] expected = {2,1,0,9,8,7,6,5,4,3};
		assertArrayEquals(expected,result);
	}
	
	@Test
	public void test_rotate_returns_3210987654_when_9876543210_and_87654_passed_in() {
		int[] array = {9,8,7,6,5,4,3,2,1,0};
		int[] result = exercise5.rotateArray(array,87654);
		int[] expected = {3,2,1,0,9,8,7,6,5,4};
		assertArrayEquals(expected,result);
	}
	
	@Test
	public void test_rotate_returns_4321098765_when_9876543210_and_987655_passed_in() {
		int[] array = {9,8,7,6,5,4,3,2,1,0};
		int[] result = exercise5.rotateArray(array,987655);
		int[] expected = {4,3,2,1,0,9,8,7,6,5};
		assertArrayEquals(expected,result);
	}
	
	@Test
	public void test_rotate_returns_5432109876_when_9876543210_and_1234876_passed_in() {
		int[] array = {9,8,7,6,5,4,3,2,1,0};
		int[] result = exercise5.rotateArray(array,1234876);
		int[] expected = {5,4,3,2,1,0,9,8,7,6};
		assertArrayEquals(expected,result);
	}
	
	@Test
	public void test_rotate_returns_6543210987_when_9876543210_and_77777777_passed_in() {
		int[] array = {9,8,7,6,5,4,3,2,1,0};
		int[] result = exercise5.rotateArray(array,77777777);
		int[] expected = {6,5,4,3,2,1,0,9,8,7};
		assertArrayEquals(expected,result);
	}
	
	@Test
	public void test_rotate_returns_7654321098_when_9876543210_and_888888888_passed_in() {
		int[] array = {9,8,7,6,5,4,3,2,1,0};
		int[] result = exercise5.rotateArray(array,888888888);
		int[] expected = {7,6,5,4,3,2,1,0,9,8};
		assertArrayEquals(expected,result);
	}
	
	@Test
	public void test_rotate_returns_8765432109_when_9876543210_and_1999999999_passed_in() {
		int[] array = {9,8,7,6,5,4,3,2,1,0};
		int[] result = exercise5.rotateArray(array,1999999999);
		int[] expected = {8,7,6,5,4,3,2,1,0,9};
		assertArrayEquals(expected,result);
	}
	
	@Test
	public void test_rotate_returns_9876543210_when_9876543210_and_990_passed_in() {
		int[] array = {9,8,7,6,5,4,3,2,1,0};
		int[] result = exercise5.rotateArray(array,990);
		int[] expected = {9,8,7,6,5,4,3,2,1,0};
		assertArrayEquals(expected,result);
	}


}
