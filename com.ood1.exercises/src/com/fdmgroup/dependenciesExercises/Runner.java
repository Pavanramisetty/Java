package com.fdmgroup.dependenciesExercises;

public class Runner {

	public static void main(String[] args) {
		//Hard Drive 1
		Harddrive drive1 = new Harddrive("Seagate", 2, 0);
		System.out.println(" Drive1 ");
		System.out.println(" Model : " + drive1.getMODEL() );
		System.out.println(" Capacity : " + drive1.getCAPACITY() + "  TB (2048 GB)" );
		System.out.println(" Used : " + drive1.getUsedSpace() + " GB");

		// To the set the used space
		drive1.setUsedSpace(50);
		System.out.println(drive1.getUsedSpace());

		//For Hard drive 2
		Harddrive drive2 = new Harddrive("Dell", 3, 500);
		System.out.println(" Drive2 ");
		System.out.println(" Model : " + drive2.getMODEL() );
		System.out.println(" Capacity : " + drive2.getCAPACITY() + "  TB (2048 GB)" );
		System.out.println(" Used : " + drive2.getUsedSpace() + " GB");
		
		//For processors 1
		System.out.println(" Processor 1 ");
		Processor processor1 = new Processor("Intel Xeon", 2.93, 6);
		System.out.println(" MODEL : " + processor1.getMODEL());
		System.out.println(" Capacity : " + processor1.getSPEED());
		System.out.println(" Speed " + processor1.getNUM_OF_CORES());

		//For processors 2
		System.out.println(" Processor 2");
		Processor processor2 = new Processor("Intel Celeron", 2.9, 2);
		System.out.println(" MODEL :" + processor2.getMODEL());
		System.out.println(" Capacity : " + processor2.getSPEED());
		System.out.println(" Speed " + processor2.getNUM_OF_CORES());
		
		//For Memory 1
		System.out.println(" MEMORY 1 ");
        Memory memory1 = new Memory(" Kingston ", 4, 1600);
        System.out.println(" Model :" + memory1.getMODEL());
        System.out.println(" Capacity :" + memory1.getCAPACITY() + " GB");
        System.out.println(" Speed : " + memory1.getSPEED());

        //For Memory 2
        System.out.println(" MEMORY 2 ");
        Memory memory2 = new Memory(" Corsair ", 8, 1333);
        System.out.println(" Model :" + memory2.getMODEL());
        System.out.println(" Capacity :" + memory2.getCAPACITY() + " GB");
        System.out.println(" Speed : " + memory2.getSPEED());

	}

}
