package com.fdmgroup.exercise6_testcases;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestExercise1point7 {

	Exercise1point7 exercise7;
	
	@Before
	public void setUp() throws Exception {
		exercise7 = new Exercise1point7();
	}

	@Test
	public void test_validPostcodeReturnsTrueWhenAB12_3CDpassedIn() {
		boolean result = exercise7.validPostcode("AB12 3CD");
		assertTrue(result);
	}
	
	@Test
	public void test_validPostcodeReturnsTrueWhenLowerCaseAB12_3CDpassedIn() {
		boolean result = exercise7.validPostcode("ab12 3cd");
		assertTrue(result);
	}
	
	@Test
	public void test_validPostcodeReturnsTrueWhenAB123CDpassedIn() {
		boolean result = exercise7.validPostcode("AB123CD");
		assertTrue(result);
	}
	
	@Test
	public void test_validPostcodeReturnsTrueWhenEF4_5GHpassedIn() {
		boolean result = exercise7.validPostcode("EF4 5GH");
		assertTrue(result);
	}
	
	@Test
	public void test_validPostcodeReturnsTrueWhenEF45GHpassedIn() {
		boolean result = exercise7.validPostcode("EF45GH");
		assertTrue(result);
	}
	
	@Test
	public void test_validPostcodeReturnsTrueWhenlowerCaseEF4_5GHpassedIn() {
		boolean result = exercise7.validPostcode("ef4 5gh");
		assertTrue(result);
	}
	
	@Test
	public void test_validPostcodeReturnsTrueWhenJ67_8KLpassedIn() {
		boolean result = exercise7.validPostcode("J67 8KL");
		assertTrue(result);
	}

	@Test
	public void test_validPostcodeReturnsTrueWhenJ678KLpassedIn() {
		boolean result = exercise7.validPostcode("J678KL");
		assertTrue(result);
	}
	
	@Test
	public void test_validPostcodeReturnsTrueWhenj67_8klpassedIn() {
		boolean result = exercise7.validPostcode("j67 8kl");
		assertTrue(result);
	}
	
	@Test
	public void test_validPostcodeReturnsTrueWhenM9_0NPpassedIn() {
		boolean result = exercise7.validPostcode("M9 0NP");
		assertTrue(result);
	}
	
	@Test
	public void test_validPostcodeReturnsTrueWhenM90NPpassedIn() {
		boolean result = exercise7.validPostcode("M90NP");
		assertTrue(result);
	}
	
	@Test
	public void test_validPostcodeReturnsTrueWhenLowerCaseM9_0NPpassedIn() {
		boolean result = exercise7.validPostcode("m9 0np");
		assertTrue(result);
	}
	
	@Test
	public void test_validPostcodeReturnsFalseWhenM9_NPpassedIn() {
		boolean result = exercise7.validPostcode("M9 NP");
		assertFalse(result);
	}
	
	@Test
	public void test_validPostcodeReturnsFalseWhenJ67_8KpassedIn() {
		boolean result = exercise7.validPostcode("J67 8K");
		assertFalse(result);
	}
	
	@Test
	public void test_validPostcodeReturnsFalseWhenEFA4_5GHpassedIn() {
		boolean result = exercise7.validPostcode("EFA4 5GH");
		assertFalse(result);
	}
	
	@Test
	public void test_validPostcodeReturnsFalseWhenAB1_2CDEpassedIn() {
		boolean result = exercise7.validPostcode("AB1 2CDE");
		assertFalse(result);
	}
	
	@Test
	public void test_validPostcodeReturnsFalseWhen1_2CDEpassedIn() {
		boolean result = exercise7.validPostcode("1 2CDE");
		assertFalse(result);
	}
	
	@Test
	public void test_validPostcodeReturnsFalseWhenGF1_DE2EpassedIn() {
		boolean result = exercise7.validPostcode("GF1 DE2");
		assertFalse(result);
	}
}
