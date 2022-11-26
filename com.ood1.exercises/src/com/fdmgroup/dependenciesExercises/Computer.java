package com.fdmgroup.dependenciesExercises;

public class Computer {

	private final String Model;
	private Harddrive harddrive;
	private Memory memory;
    private final Processor processor;
    
    public Computer(String model, Harddrive harddrive, Memory memory, Processor processor) {
		super();
		Model = model;
		this.harddrive = harddrive;
		this.memory = memory;
		this.processor = processor;
	}

	public Harddrive getHarddrive() {
		return harddrive;
	}

	public void setHarddrive(Harddrive harddrive) {
		this.harddrive = harddrive;
	}

	public Memory getMemory() {
		return memory;
	}

	public void setMemory(Memory memory) {
		this.memory = memory;
	}

	public String getModel() {
		return Model;
	}

	public Processor getProcessor() {
		return processor;
	}
	
	public void getPower(PowerSource powerSource) {
         System.out.println("watts + " + powerSource.supplyPower());        		
	}
	
	public static void turnOn() {
		System.out.println("System is turned on");
	}
	public static void turnOff() {
		System.out.println("System is turned off");
	}

	@Override
	public String toString() {
		return "Computer [Model=" + Model + ", harddrive=" + harddrive + ", memory=" + memory + ", processor="
				+ processor + "]";
	}
	
}
