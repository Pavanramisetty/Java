package com.fdmgroup.exercise5_part3;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.fdmgroup.exercise5_part3.Exercise3point2;

public class TestExercise3point2 {

	Exercise3point2 exercise2;
	
	@Before
	public void setUp() throws Exception {
		exercise2 = new Exercise3point2();
	}
	
	@Test
	public void test_arrayContainsReturnsFalseWhenStringNotInArrayPassedIn() {
		String[] array = {"string1","string2","string3"};
		boolean isInArray = exercise2.arrayContains(array,"string4");
		assertFalse(isInArray);
	}
	
	@Test
	public void test_arrayContainsReturnsTrueWhenStringAtStartOfArrayPassedIn() {
		String[] array = {"string4","string5","string6","string7"};
		boolean isInArray = exercise2.arrayContains(array,"string4");
		assertTrue(isInArray);
	}
	
	@Test
	public void test_arrayContainsReturnsTrueWhenStringInMiddleOfArrayPassedIn() {
		String[] array = {"string8","string9","string10"};
		boolean isInArray = exercise2.arrayContains(array,"string8");
		assertTrue(isInArray);
	}
	
	@Test
	public void test_arrayContainsReturnsTrueWhenStringAtEndOfArrayPassedIn() {
		String[] array = {"string11","string12","string13","string12","string15"};
		boolean isInArray = exercise2.arrayContains(array,"string15");
		assertTrue(isInArray);
	}
	
}
