package com.fdmgroup.exercise6_testcases;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestExercise1point4 {

	Exercise1point4 exercise4;
	
	@Before
	public void setUp() throws Exception {
		exercise4 = new Exercise1point4();
	}

	@Test
	public void test_encodeReturns_bzfz_when_abcd_passedIn() {
		String result = exercise4.encode("abcd");
		String expected = "bzfz";
		assertEquals(expected,result);
	}
	
	@Test
	public void test_encodeReturns_bzfz_when_ABCD_passedIn() {
		String result = exercise4.encode("ABCD");
		String expected = "bzfz";
		assertEquals(expected,result);
	}
	
	@Test
	public void test_encodeReturns_bydw_when_aaaa_passedIn() {
		String result = exercise4.encode("aaaa");
		String expected = "bydw";
		assertEquals(expected,result);
	}
	
	@Test
	public void test_encodeReturns_axcv_when_zzzz_passedIn() {
		String result = exercise4.encode("zzzz");
		String expected = "axcv";
		assertEquals(expected,result);
	}
	
	@Test
	public void test_encodeReturnsCorrectOutputWhen52xletter_a_passedIn() {
		String result = exercise4.encode("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		String expected = "bydwfuhsjqlonmpkritgvexczabydwfuhsjqlonmpkritgvexcza";
		assertEquals(expected,result);
	}
	
	@Test
	public void test_encodeReturns_uur_biyvb_when_two_words_passedIn() {
		String result = exercise4.encode("two words");
		String expected = "uur biyvb";
		assertEquals(expected,result);
	}

	@Test
	public void test_harderEncoder_returns_correct_output_for_quick_brown_fox_sentence() {
		String result = exercise4.encode("the quick brown fox jumps over the lazy dog");
		String expected = "ufh voput mfbic wwq eyjrr pthn now blnl syx";
		assertEquals(expected,result);
	}
}
