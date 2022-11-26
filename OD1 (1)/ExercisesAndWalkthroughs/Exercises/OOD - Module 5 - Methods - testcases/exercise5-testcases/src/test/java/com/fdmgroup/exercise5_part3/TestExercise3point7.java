package com.fdmgroup.exercise5_part3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.fdmgroup.exercise5_part3.Exercise3point7;

public class TestExercise3point7 {

	Exercise3point7 exercise7;
	
	@Before
	public void setUp() throws Exception {
		exercise7 = new Exercise3point7();
	}

	@Test
	public void test_isAnagramReturnsTrueWhen_abc_and_cab_passedIn() {
		String string1 = "abc";
		String string2 = "cab";
		boolean isAnagram = exercise7.isAnagram(string1,string2);
		assertTrue(isAnagram);
	}
	
	@Test
	public void test_isAnagramReturnsTrueWhen_cab_and_abc_passedIn() {
		String string1 = "cab";
		String string2 = "abc";
		boolean isAnagram = exercise7.isAnagram(string1,string2);
		assertTrue(isAnagram);
	}
	
	@Test
	public void test_isAnagramReturnsFalseWhen_abcd_and_cab_passedIn() {
		String string1 = "abcd";
		String string2 = "cab";
		boolean isAnagram = exercise7.isAnagram(string1,string2);
		assertFalse(isAnagram);
	}
	
	@Test
	public void test_isAnagramReturnsFalseWhen_cab_and_abcd_passedIn() {
		String string1 = "cab";
		String string2 = "abcd";
		boolean isAnagram = exercise7.isAnagram(string1,string2);
		assertFalse(isAnagram);
	}
	
	@Test
	public void test_isAnagramReturnsTrueWhen_listen_and_silent_passedIn() {
		String string1 = "listen";
		String string2 = "silent";
		boolean isAnagram = exercise7.isAnagram(string1,string2);
		assertTrue(isAnagram);
	}
	
	@Test
	public void test_isAnagramReturnsTrueWhen_a_gentleman_and_elegant_man_passedIn() {
		String string1 = "a gentleman";
		String string2 = "elegant man";
		boolean isAnagram = exercise7.isAnagram(string1,string2);
		assertTrue(isAnagram);
	}
	
	

}
