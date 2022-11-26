package com.ood1.exercises;

public class Conditionals {

	public static void main(String[] args) {
		
		/*############################################################################
		#                        Section 1 Simple if statements                      #                               
		#############################################################################*/
		//  section 1.1 Alien colour2
		String alienColour = "Black";
		if (alienColour.equals("green"))
			System.out.println("You have earned 5 points");
		
	    //  section 1.2 Alien colour2
		if (alienColour.equals("Red"))
			System.out.println("You just earned 10 points");
		else if (alienColour.equals("Yellow"))
			System.out.println("You just earned 15 points");
		
		// section 1.3 Merge three statements into one else if and write one more invalid condition
		if (alienColour.equals("green"))
			System.out.println("You have earned 5 points");
		else if (alienColour.equals("Red"))
			System.out.println("You just earned 10 points");
		else if (alienColour.equals("Yellow"))
			System.out.println("You just earned 15 points");
		else 
			System.out.println("Invalid Colour");
		
		
		// section 1.4 Stages of life
		int age = 2;
		if (age < 2)
		    System.out.println("The person is a baby");
		else if (age >= 2 && age < 4)
			System.out.println("This person is a toddler");
		else if (age >= 4 && age < 13)
			System.out.println("This person is a Child");
		else if (age >= 13 && age < 20)
			System.out.println("This person is a teenager");
		else if (age >= 20 && age < 65)
			System.out.println("This person is a working age adult");
		else if (age >= 65)
		    System.out.println("This person is pentioner");
		
		// 1.5 Tax rates
		int salary = 100000;
		if (salary > 150000)
			System.out.println("The tax percentage is 45%");
		else if(salary > 50000 && salary <150000)
			System.out.println("The tax percentage is 40%");
		else if(salary > 12500 && salary <50000)
			System.out.println("The tax percentage is 20%");
		else if(salary < 12500)
			System.out.println("The tax percentage is 0%");
		
		
		/*############################################################################
		#                        Section 2 more complex conditions                   #                               
		#############################################################################*/

		// section 2.1 Valid account numbers
		int accountNumber = 10000000;
		if (accountNumber >= 10000000 && accountNumber <= 99999999)
			System.out.println("This is the Valid account number");
		else
			System.out.println("This is the Invalid account Number");
		
		
		// section 2.2 Airline codes
		String flightCode = "LH1234";
		
		if (flightCode.substring(0, 2).equals("BA"))
			System.out.println("British Airways");
		else
			System.out.println("Not British Airways");
		
		
		//2.3 Airline codes 2
		String validFlight = flightCode.substring(0, 2);
		if (validFlight.equals("BA") || validFlight.equals("LH") || validFlight.equals("BA"))
			System.out.println("Valid airlines");
		else
			System.out.println("Invalid Airlines");
		
        // 2.4 Airline codes 3
		if (! validFlight.equals("BA") && ! validFlight.equals("LH") && ! validFlight.equals("BA"))
			System.out.println("Unrecognised or invalid airlines");

	    // 2.5 Valid ID
		Boolean passport = true;
		Boolean drivingLicense = true;
		if (passport || drivingLicense)
			System.out.println("ID Verified");
		else
			System.out.println("ID doesnt verified");
		
		//2.6 Older driver
		Boolean hasLicense = true;
		Boolean isDead = true;
		Boolean hasPassedEyeTest = true;
		if (hasLicense && ! isDead && hasPassedEyeTest)
			System.out.println("Can Still Drive");
		else
			System.out.println("Not licensed to Drive");
		
		
	}

}
