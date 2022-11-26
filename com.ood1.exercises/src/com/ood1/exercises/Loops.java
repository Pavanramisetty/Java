package com.ood1.exercises;

import java.util.ArrayList;

public class Loops {

	public static void main(String[] args) {
		
		/*#######################################################################################
		#                          section 1 For Each Loops                                     #
		########################################################################################*/

	    // Section 1.1 Array of courses
		String[] courses = {"UNIX", "SQL", "Java", "Python", "WebApps"};
	    for (String course : courses)
	    	System.out.println("I love Learning " + course);
	    
	    // section 1.2 Copying to an ArrayList
	    ArrayList<String> courseList = new ArrayList<String>();
	    for (String course : courses)
	    	courseList.add(course);
	    System.out.println(courseList.size());
	    
	    // section 1.3 Use foreach loop and print all the courses in the array list
	    for(String course : courseList)
	    	System.out.println(course);
	    
	    // section 1.4 Total price
	    ArrayList<Double> prices = new ArrayList<Double>();
	    prices.add(4.50);
	    prices.add(1.99);
	    prices.add(9.75);
	    prices.add(3.15);
	    prices.add(10.25);
	    double totalPrice = 0;
	    for(double price : prices)
	    	totalPrice += price;
	    System.out.println("Total prices is " + totalPrice);
	    
	    // section 1.5 Copying to an array
	    ArrayList<Double> copyList = new ArrayList<Double>();
	    for(double price : prices)
	    	copyList.add(price);
	    System.out.println(copyList.size());
	    
	    // section 1.6 reversing a string
	    String normalString = "desrever neeb sah txet siht";
	    char[] charList = normalString.toCharArray();
	    String reverse = "";
	    
	    for (char letter : charList)
	    	reverse = letter + reverse;
	    System.out.println(reverse);
	    

		/*#######################################################################################
		#                          section 2 For  Loops                                         #
		########################################################################################*/

	    // section 2.1 One Million
	    for (int number = 0; number <= 1000000; number++)
	    	System.out.println(number);
	    
	    // section 2.2 summing a one million
	    long sumOfOneMillion = 0;
	    for (int number = 0; number <= 1000000; number++)
	    	sumOfOneMillion += number;
	    System.out.println(sumOfOneMillion);
	    
	    // section 2.3 Odd numbers
	    for (int oddNumber = 0; oddNumber <=20; oddNumber++)
	    	if (oddNumber % 2 != 0)
	    		System.out.println(oddNumber);

	    // section 2.4 Three times tale
	    for(int threeTable=0; threeTable <= 12; threeTable++)
	    	System.out.println(threeTable + "X" + 3 + "=" + (threeTable * 3));
	    
	    // section 2.5 Increment alternate numbers
	    int[] scores = {25,15,19,99,75,47,59,82};
	    for (int score = 0; score <= scores.length-1; score+=2)
	    	scores[score]++;
	    for (int score = 0; score <= scores.length-1; score+=2)
	    	System.out.println(scores[score]);
	    
	    
	    // section 2.6 Alternate Letters
	    for (char character = 'b'; character <= 'z'; character +=2){
	    	System.out.println(character);
	    }
	    
	    // section 2.7 All times table
	    for(int table=1; table <= 12; table++)
	    	for (int multiple = 1; multiple <= 12; multiple++)
	    	    System.out.println(multiple + " X " + table + " = " + (multiple * table));
	    
	    
		/*#######################################################################################
		#                          section 3 while  Loops                                         #
		########################################################################################*/

        // section 3.1 print million with while loop
	    int million = 0;
		
	    while (million <= 1000000){
	    	System.out.println(million);
	    	million++;
	    }
	    
	    // section 3.2 use while loop to display lower case alphabets
	    char charectar = 'a';	
		while (charectar <= 'z'){
			System.out.println(charectar);
			charectar++;
		}
		
		// section 3.3 use while to write fibonacci
		int previousNumber = 1;
		int currentNumber = 0;
						
		while(currentNumber<= 1000){
			System.out.println(currentNumber);
			int temp = currentNumber;
			currentNumber += previousNumber;
			previousNumber = temp;
		}


		/*#######################################################################################
		#                          section 4 for  Loops                                         #
		########################################################################################*/

        // section 4.1 Finding a city
		String[] cities = { "Glasgow", "London", "Birmingham", "Cardiff", "Manchester", "Newcastle" };

		for (String city : cities) {
			if (city.charAt(0) == 'B') {
				System.out.println(city + " -  match");
				break;
			} else {
				System.out.println(city + " - doesn't match");
			}
		}

		
        // section 4.2 Find a number over a hundred
		int[] numbers = {6, 15, 75, 32, 89, 24, 103, 17, 5, 250, 63, 91};

		for (int number : numbers){
			if (number> 100){
				System.out.println(number);
				break;
			}
		} 
	}

}
 