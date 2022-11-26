package com.fdmgroup.staticKeywordExercises;

public class Employee {
    private static String name;
    private static String jobTitle;
    private static double hourlyWage;
    private static double minimumWage;
    
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		Employee.name = name;
	}
	public static String getJobTitle() {
		return jobTitle;
	}
	public static void setJobTitle(String jobTitle) {
		Employee.jobTitle = jobTitle;
	}
	public static double getHourlyWage() {
		return hourlyWage;
	}
	public static void setHourlyWage(double hourlyWage) {
		if (hourlyWage < minimumWage)
		    Employee.hourlyWage = minimumWage;
		else
			Employee.hourlyWage = hourlyWage;
	}
	public static double getMinimumWage() {
		return minimumWage;
	}
	public static void setMinimumWage(double minimumWage) {
		Employee.minimumWage = minimumWage;
	}
}
