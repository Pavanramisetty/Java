package com.fdmgroup.exercise5_part3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.fdmgroup.exercise5_part3.Exercise3point6;

public class TestExercise3point6 {

	Exercise3point6 exercise6;
	
	@Before
	public void setUp() throws Exception {
		exercise6 = new Exercise3point6();
	}
	
	@Test
	public void test_reverseStringArrayReturnsCopyOfArrayWithOneStringOriginalString() {
		String[] originalArray = {"string1"};
		String[] reversedArray = exercise6.reverseStringArray(originalArray);
		assertEquals(originalArray[0],reversedArray[0]);
		assertEquals(1,reversedArray.length);
		assertFalse(originalArray == reversedArray);
	}

	@Test
	public void test_reverseStringArrayReturnsReversedCopyOfArrayWith4Strings() {
		String[] originalArray = {"string1","string2","string3","string4"};
		String[] reversedArray =exercise6.reverseStringArray(originalArray);
		assertEquals(4,reversedArray.length);
		assertFalse(originalArray == reversedArray);
		assertEquals("string4",reversedArray[0]);
		assertEquals("string3",reversedArray[1]);
		assertEquals("string2",reversedArray[2]);
		assertEquals("string1",reversedArray[3]);
		assertEquals("string1",originalArray[0]);
		assertEquals("string2",originalArray[1]);
		assertEquals("string3",originalArray[2]);
		assertEquals("string4",originalArray[3]);
	}

}
