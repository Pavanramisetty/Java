package com.fdmgroup.dependenciesExercises;

public class PowerSource {
    public double watts;

	public PowerSource(double watts) {
		super();
		this.watts = watts;
	}

	public void setWatts(double watts) {
		this.watts = watts;
	}
    
    public double supplyPower() {
    	return this.watts;
    }

	@Override
	public String toString() {
		return "PowerSource [watts=" + watts + "]";
	}
    
}
