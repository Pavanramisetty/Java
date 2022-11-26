package com.fdmgroup.staticKeywordExercises;

public class Employee_Runner {

	public static void main(String[] args) {
		// calling directly 
		Employee.setMinimumWage(9.53);
		
		// creating the 3 employee objects
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();
        
        //Calling with set hourly wage
        emp1.setHourlyWage(6.0);
        emp2.setHourlyWage(8.0);
        emp3.setHourlyWage(10.0);
        
        // Callgin get employe wages 
        System.out.println(emp1.getHourlyWage());
        System.out.println(emp2.getHourlyWage());
        System.out.println(emp3.getHourlyWage());
	}

}
