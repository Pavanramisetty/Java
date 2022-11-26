package com.fdmgroup.classesAndObjectsExercises;

public class Processor {
	private final String MODEL;
	private final double SPEED;
	private final int NUM_OF_CORES;
	
	
	public Processor(String mODEL, double sPEED, int nUM_OF_CORES) {
		super();
		MODEL = mODEL;
		SPEED = sPEED;
		NUM_OF_CORES = nUM_OF_CORES;
	}


	public String getMODEL() {
		return MODEL;
	}


	public double getSPEED() {
		return SPEED;
	}


	public int getNUM_OF_CORES() {
		return NUM_OF_CORES;
	}
	
	public static void processData(String data) {
		System.out.println(data);
	}
	
	

}
