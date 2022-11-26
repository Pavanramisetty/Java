package com.fdmgroup.classesAndObjectsExercises;

public class Harddrive {
    private final String MODEL;
    private final double CAPACITY;
    private double usedSpace;
     
	public Harddrive(String mODEL, double cAPACITY) {
		super();
		MODEL = mODEL;
		CAPACITY = cAPACITY;
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
	
	public static String readDate(String file) {
		return ("data from" + file);
	}
	public static void writeData(String data, String file) {
        System.out.println(data + file);		
	}
	public Harddrive(String mODEL, double cAPACITY, double usedSpace) {
		super();
		MODEL = mODEL;
		CAPACITY = cAPACITY;
		this.usedSpace = usedSpace;
	}
	



    
    
    
    
}
