package com.ood1.exercises;

import java.util.Arrays;

public class Methods {
	
	/*#########################################################################################################
	#               Methods section 1 Modularize previous exercises                                           #
	#########################################################################################################*/
	// section 1.1 Alien colors
	public static int getPoints(String colour) {
		String alienColour = colour;
		int result = 0;
		if (alienColour.equals("green"))
			result = 5;
		else if (alienColour.equals("Red"))
			result = 10;
		else if (alienColour.equals("Yellow"))
			result = 15;
		else 
			result = 0;
		return result;
	}
	
	// section 1.2 Summing Numbers
	public static int sumOfNumbersUpTo(int sumnumber) {
		int total = 0;
		for (int number = 0 ; number <= sumnumber ; number++)
		    total += number;
		return total;
		
	}
	
	//section 1.3 Time table
	public static void displayTimesTable(int timestable) {
		for (int number = 0; number <= timestable; number++)
			System.out.println(number + " X " + timestable + " = " + (number * timestable));
		
	}

	
	/*#########################################################################################################
	#               Methods section 2 Methods with test cases                                                 #
	#########################################################################################################*/
	
	// section 2.1 Leap year
	public static boolean leapYear(int isLeap) {
		boolean result = false;
		if (isLeap % 4 != 0)
			result = false;
		if (isLeap % 400 == 0)
			result = true;
		if (isLeap % 100 == 0)
			result = false;
		return result;
			
	}
	
	// section 2.2 Array contains
	public static boolean arrayContains(String[] list, String word) {
		boolean result = false;
		for (String element : list) 
		    if (element.equals(word))
			    result = true;
		return result;
		}
	
	// section 2.3 Array Frequency
	public static int arrayFrequency(int[] list, int num) {
		int result = 0;
		for (int number : list) {
			if (number == num)
				result += 1;
		}
		return result;
	}
	
	// section 2.4 max Number
	public static int maxNumber(int[] numList) {
		int maxNum = 0;
		Arrays.sort(numList);
		maxNum = numList[numList.length - 1];
		return maxNum;
	}
	
	
	// section 2.5 extracting even numbers
	public static int[] evenNumbers(int[] listNumbers){
		int length = 0;    
		for (int number : listNumbers) {   	// determine length of new array
			if (number % 2 == 0) {
				length ++;
			}
		}
		int[] even = new int[length];  // create new array
		int index = 0;
		for (int number : listNumbers) {		// add numbers to new array
			if (number % 2 == 0) {
				even[index] = number;
				index++;
			}
		}
		return even;
	}
	
	
	// section 2.6 Reversing an array
	public static String[] reverseStringArray(String[] array) {
		int length = array.length;
		String[] reversed = new String[length];
			
		for (int index = 0; index<length; index++) {
			int reversedIndex = length - 1 - index;
			reversed[reversedIndex] = array[index];
		}
			
		return reversed;
	}

	
	// section 2.7 Find anagarm
	public static boolean isAnagram(String string1, String string2) {
		
		char[] string1Array = string1.toCharArray();
		char[] string2Array = string2.toCharArray();
			
		Arrays.sort(string1Array);
		Arrays.sort(string2Array);
			
		string1 = new String(string1Array);
		string2 = new String(string2Array);
			
		return string1.equals(string2);
	}
	
	// section 2.8 Median number
    public double medianNumber(double[] numbers) {
		
		Arrays.sort(numbers);
		int middleIndex = numbers.length / 2;
		if (numbers.length%2 == 0)
			return (numbers[middleIndex]+numbers[middleIndex-1]) / 2;
		else 
			return numbers[middleIndex];
	}


	
	
	public static void main(String[] args) {
		int points = Methods.getPoints("black");
		System.out.println("You've scored " + points + " Points..!");
		
		System.out.println(sumOfNumbersUpTo(10));
		displayTimesTable(5);
		System.out.println(leapYear(1900));
		
		String[] array1 = {"Java", "Python", "c#", "c++"};
        System.out.println(arrayContains(array1, "Java"));
        
        int[] checkNumber = {1,2,3,4,5,5,5};
        System.out.println(arrayFrequency(checkNumber, 5));
        
        System.out.println(maxNumber(checkNumber));
        
        System.out.println(evenNumbers(checkNumber));
        
        System.out.println(reverseStringArray(array1));
        
        System.out.println(isAnagram("Java", "Python"));
        
        
        
        
	}

}
