package com.fdmgroup.exercise6_testcases;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestExercise1point8 {

	Exercise1point8 exercise8;
	
	@Before
	public void setUp() throws Exception {
		exercise8 = new Exercise1point8();
	}

	@Test
	public void test_validPasswordReturnsFalseWhen_aA1$_passedIn() {
		boolean result = exercise8.validPassword("aA1$");
		assertFalse(result);
	}
	
	@Test
	public void test_validPasswordReturnsFalseWhen_bcdefg2_passedIn() {
		boolean result = exercise8.validPassword("bcdefg2");
		assertFalse(result);
	}
	
	@Test
	public void test_validPasswordReturnsFalseWhen_34_5678_passedIn() {
		boolean result = exercise8.validPassword("34_5678");
		assertFalse(result);
	}
	
	@Test
	public void test_validPasswordReturnsFalseWhen_J$KLMNP_passedIn() {
		boolean result = exercise8.validPassword("J$KLMNP");
		assertFalse(result);
	}
	
	@Test
	public void test_validPasswordReturnsTrueWhen_Pa$$word1_passedIn() {
		boolean result = exercise8.validPassword("Pa$$word1");
		assertTrue(result);
	}
	
	@Test
	public void test_validPasswordReturnsTrueWhen_Password1_passedIn() {
		boolean result = exercise8.validPassword("Password1");
		assertTrue(result);
	}
	
	@Test
	public void test_validPasswordReturnsTrueWhen_Pa$$word_passedIn() {
		boolean result = exercise8.validPassword("Pa$$word");
		assertTrue(result);
	}
	
	@Test
	public void test_validPasswordReturnsTrueWhen_PASSWORD_1_passedIn() {
		boolean result = exercise8.validPassword("PASSWORD_1");
		assertTrue(result);
	}
	
	

}
