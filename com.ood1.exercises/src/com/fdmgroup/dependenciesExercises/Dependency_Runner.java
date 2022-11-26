package com.fdmgroup.dependenciesExercises;

public class Dependency_Runner {

	public static void main(String[] args) {
		Harddrive harddrive1 = new Harddrive("Dell", 3, 500);
		Harddrive harddrive2 = new Harddrive("Lenovo", 5, 300);
		
		Processor processor1 = new Processor("Intel Xeon", 2.93, 6);
		Processor processor2 = new Processor("Intel Celeron", 2.9, 2);
		
		Memory memory1 = new Memory(" Kingston ", 4, 1600);
		Memory memory2 = new Memory(" Corsair ", 8, 1333);
		
		Computer computer1 = new Computer("Dell", harddrive1, memory1, processor1);
		Computer computer2 = new Computer("Dell", harddrive2, memory2, processor2);
		
		PowerSource powersource1 = new PowerSource(100);
		computer1.getPower(powersource1);
		
	    ComputerStore store = new ComputerStore("computer");
	    store.addComputer(computer1);
        store.addComputer(computer2);
        
        System.out.println(store.getallComputers());  

	}

}
