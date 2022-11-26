package com.fdmgroup.classesAndObjectsExercises;

public class Memory {
	private final String MODEL;
	private final double CAPACITY;
	private double usedSpace;
	private final double SPEED;
	
	public Memory(String mODEL, double cAPACITY, double sPEED) {
		super();
		MODEL = mODEL;
		CAPACITY = cAPACITY;
		SPEED = sPEED;
	}
	
	public double getUsedSpace() {
		return usedSpace;
	}
	public void setUsedSpace(double usedSpace) {
		this.usedSpace = usedSpace;
	}
	public String getMODEL() {
		return MODEL;
	}
	public double getCAPACITY() {
		return CAPACITY;
	}
	public double getSPEED() {
		return SPEED;
	}

	
	public static void storeData(String data) {
		System.out.println(data);
	}
}
