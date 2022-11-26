package com.fdmgroup.exercise6_testcases;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestExercise1point3 {

	Exercise1point3 exercise3;
	
	@Before
	public void setUp() throws Exception {
		exercise3 = new Exercise1point3();
	}

	@Test
	public void test_simpleEncoderReturns_badc_when_abcd_passedIn() {
		String result = exercise3.simpleEncoder("abcd");
		assertEquals("badc",result);
	}
	
	@Test
	public void test_simpleEncoderReturns_uvp_xnsct_when_two_words_passedIn() {
		String result = exercise3.simpleEncoder("two words");
		assertEquals("uvp xnsct",result);
	}
	
	@Test
	public void test_simpleEncoderReturns_ayay_when_zzzz_passedIn() {
		String result = exercise3.simpleEncoder("zzzz");
		assertEquals("ayay",result);
	}
	
	@Test
	public void test_simpleEncoderReturns_bzba_when_aaaa_passedIn() {
		String result = exercise3.simpleEncoder("aaaa");
		assertEquals("bzbz",result);
	}
	
	@Test
	public void test_simpleEncoder_returns_correct_output_for_quick_brown_fox_sentence() {
		String result = exercise3.simpleEncoder("the quick brown fox jumps over the lazy dog");
		String expected = "ugf rtjbl cqpvo gny ktnot pufq sid kbyz enh";
		assertEquals(expected,result);
	}

}
