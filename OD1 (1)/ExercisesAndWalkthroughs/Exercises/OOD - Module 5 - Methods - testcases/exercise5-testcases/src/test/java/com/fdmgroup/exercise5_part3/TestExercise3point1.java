package com.fdmgroup.exercise5_part3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.fdmgroup.exercise5_part3.Exercise3point1;

public class TestExercise3point1 {

	Exercise3point1 exercise1;
	
	@Before
	public void setUp() throws Exception {
		exercise1 = new Exercise3point1();
	}

	@Test
	public void test_leapYearReturnsTrueWhen2016PassedIn() {
		boolean isLeapYear = exercise1.leapYear(2016);
		assertTrue(isLeapYear);
	}
	
	@Test
	public void test_leapYearReturnsTrueWhen2000PassedIn() {
		boolean isLeapYear = exercise1.leapYear(2000);
		assertTrue(isLeapYear);
	}
	
	@Test
	public void test_leapYearReturnsFalseWhen2019PassedIn() {
		boolean isLeapYear = exercise1.leapYear(2019);
		assertFalse(isLeapYear);
	}
	
	@Test
	public void test_leapYearReturnsFalseWhen1900PassedIn() {
		boolean isLeapYear = exercise1.leapYear(1900);
		assertFalse(isLeapYear);
	}
	


}
