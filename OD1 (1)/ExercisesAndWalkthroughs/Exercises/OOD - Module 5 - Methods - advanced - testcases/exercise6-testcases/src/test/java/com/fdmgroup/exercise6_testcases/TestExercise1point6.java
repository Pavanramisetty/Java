package com.fdmgroup.exercise6_testcases;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class TestExercise1point6 {

	Exercise1point6 exercise1point6;
	
	@Before
	public void setUp() throws Exception {
		exercise1point6 = new Exercise1point6();
	}

	@Test
	public void test_basic() {
		String[] commands = {"RIGHT", "UP", "DOWN", "LEFT",
							"LEFT", "DOWN", "DOWN"};
		int result = exercise1point6.roverMove(4, commands);
		assertEquals(12,result);
	}
	
	@Test
	public void test_basic2(){
		String[] commands = {"RIGHT", "DOWN", "LEFT", "LEFT","DOWN"};
		int result = exercise1point6.roverMove(4, commands);
		assertEquals(8,result);
	}
	
	@Test
	public void test_size5a(){
		String[] commands = {"RIGHT", "DOWN", "LEFT", "LEFT","DOWN","UP","UP","UP","RIGHT"};
		int result = exercise1point6.roverMove(5, commands);
		assertEquals(1,result);
	}
	
	@Test
	public void test_size5b(){
		String[] commands = {"RIGHT", "DOWN", "RIGHT", "RIGHT","RIGHT",
							"DOWN","RIGHT","UP","UP","UP","RIGHT"};
		int result = exercise1point6.roverMove(5, commands);
		assertEquals(4,result);
	}
	
	@Test
	public void test_size6(){
		String[] commands = {"LEFT","UP","LEFT","UP","RIGHT", "DOWN", "RIGHT",
								"DOWN", "RIGHT", "DOWN","RIGHT", "DOWN","RIGHT", 
								"DOWN","RIGHT", "DOWN",	"DOWN","RIGHT","UP","UP",
								"UP","RIGHT"};
		int result = exercise1point6.roverMove(6, commands);
		assertEquals(17,result);
	}
	
	@Test
	public void test_size13a(){
		String[] commands = {"DOWN","DOWN","RIGHT","RIGHT","RIGHT","RIGHT",
							"RIGHT","RIGHT","RIGHT","RIGHT","RIGHT","RIGHT",
							"RIGHT","RIGHT","RIGHT","RIGHT"};
		int result = exercise1point6.roverMove(13, commands);
		assertEquals(38,result);
	}
	
	@Test
	public void test_size13b(){
		String[] commands = {"DOWN","DOWN","RIGHT","RIGHT","RIGHT","RIGHT",
							"RIGHT","RIGHT","RIGHT","RIGHT","RIGHT","RIGHT",
							"RIGHT","RIGHT","RIGHT","RIGHT","DOWN","DOWN",
							"DOWN","DOWN","DOWN","DOWN","DOWN","DOWN","DOWN",
							"DOWN","DOWN","DOWN","DOWN","DOWN","LEFT","LEFT",
							"LEFT","LEFT","LEFT","LEFT","LEFT","LEFT","LEFT",
							"LEFT","LEFT","LEFT","LEFT","LEFT","LEFT","LEFT"};
		int result = exercise1point6.roverMove(13, commands);
		assertEquals(156,result);
	}

}
