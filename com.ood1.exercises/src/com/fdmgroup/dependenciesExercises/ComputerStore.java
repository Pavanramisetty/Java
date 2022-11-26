package com.fdmgroup.dependenciesExercises;

import java.util.ArrayList;

public class ComputerStore {
    public String name;
    private ArrayList<Computer> comp1 = new ArrayList<>();
    
	public ComputerStore(String name) {
		super();
		this.name = name;
	}
    
    public void addComputer(Computer computer) {
    	comp1.add(computer);
    }
    
    public ArrayList<Computer> getallComputers() {
		return comp1;
    	
    }

	@Override
	public String toString() {
		return "ComputerStore [name=" + name + ", comp1=" + comp1 + "]";
	}
}
