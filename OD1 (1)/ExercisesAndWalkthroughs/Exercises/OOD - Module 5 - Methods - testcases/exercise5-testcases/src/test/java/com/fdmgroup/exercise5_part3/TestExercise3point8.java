package com.fdmgroup.exercise5_part3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestExercise3point8 {

	Exercise3point8 exercise;
	
	@Before
	public void setUp() throws Exception {
		exercise = new Exercise3point8();
	}

	@Test
	public void test_1_2_3_4_5_returns_3() {
		double[] numbers = {1.0, 2.0, 3.0, 4.0, 5.0};
		double result = exercise.medianNumber(numbers);
		assertEquals(3.0,result,0.000000000000000000001);
	}
	
	@Test
	public void test_1_2_3_4_returns_2point5() {
		double[] numbers = {1.0, 2.0, 3.0, 4.0};
		double result = exercise.medianNumber(numbers);
		assertEquals(2.5,result,0.000000000000000000001);
	}
	
	@Test
	public void test_unordered_5_item_array_returns_3point9() {
		double[] numbers = {7.4, 3.9, 1.2, 9.7, 2.3};
		double result = exercise.medianNumber(numbers);
		assertEquals(3.9,result,0.000000000000000000001);
	}
	
	@Test
	public void test_unordered_6_item_array_returns_5point65() {
		double[] numbers = {7.4, 3.9, 1.2, 9.7, 2.3, 8.2};
		double result = exercise.medianNumber(numbers);
		assertEquals(5.65,result,0.000000000000000000001);
	}

}
