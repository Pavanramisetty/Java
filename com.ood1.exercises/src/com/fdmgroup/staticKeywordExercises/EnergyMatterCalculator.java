package com.fdmgroup.staticKeywordExercises;

public class EnergyMatterCalculator {
	
	public static final double SPEED_OF_LIGHT = 299792458;

	public static double matterToEnergy(double matter) {
	    double energy;
	    energy = (matter * SPEED_OF_LIGHT);
		return energy;
	}
	public static double energyToMatter(double energy) {
		double matter;
		matter = (energy / SPEED_OF_LIGHT);
		return matter;
	}
	
	public double getSPEED_OF_LIGHT() {
		return SPEED_OF_LIGHT;
	}

}
