package com.ood1.exercises;

public class DataTypesExercises {

	public static void main(String[] args) {
		
		/* #######################################################################
		*  #                   Section 1 Strings                                 #
		*  ######################################################################*/
		
		// section 1.1 Simple message, Store a message in a string and display the message.
		String message = "Hello, How are you";
		System.out.println(message);
		
		
		//1.2 Full name
		String firsNname = "Pavan";
		String secondName = "Ramisetty";
		String fullName = firsNname + " " + secondName;
		System.out.println(fullName);
		
		
		//1.3 Personal message
	    String name = "Eric";
	    System.out.println("Hello" + " " + name + ", " + "Would you like to learn java today");
	    
	    
	    //1.4 Name operators, Using the full name from 1.2 section
	    System.out.println(fullName.length());  // Length of name
	    System.out.println(fullName.toUpperCase()); //Name in upper case
	    System.out.println(fullName.charAt(0)); // print first letter in your name
	    System.out.println(fullName.charAt(fullName.length()-1)); // print Last letter in your name
	    
	    
	    //1.5 Sentence operators
	    String sentence_operators = "this is a sentence";
	    
	    // Finding the first space in the sentence
	    char space = ' ';
	    System.out.println(sentence_operators.indexOf(space));
	    
	    //Finding the last space in the sentence
	    System.out.println(sentence_operators.lastIndexOf(space));
	    
	    //Display first 4 characters
	    System.out.println(sentence_operators.substring(0 , 4));
	    
	    //Display the position of x in the sentence
	    System.out.println(sentence_operators.indexOf('x'));

	    //Display the characters from position 10 onwards
	    System.out.println(sentence_operators.substring(10, sentence_operators.length()));
	    
	    //Display characters position from 5 to 8
	    System.out.println(sentence_operators.substring(5, 9));
	    
	    //Does this sentence contains 'a'?
	    boolean checkChar_a = sentence_operators.contains("a");
	    		System.out.println(checkChar_a);
	    
        //Does this sentence contains 'x'?
	    boolean checkChar_x = sentence_operators.contains("x");
	     		System.out.println(checkChar_x);
    		
	    //Add "is " first and "?" at last and display
        sentence_operators = "is " + sentence_operators + " ?";
        System.out.println(sentence_operators);
        
        //Replace the first t to T
        sentence_operators = sentence_operators.replaceFirst("t", "T");
        System.out.println(sentence_operators);
	     		
        
        
		/* #######################################################################
		*  #                   Section 2 primitive data types                    #
		*  #######################################################################*/
        
        // section 2.1 Favorite number
        int favouriteNumber = 25;
        System.out.println("My favourite number is " + favouriteNumber);
        
        
        //section 2.2 Adding ints, Display the two addition of two numbers 5 and 3 
        int firstNumber = 5;
        int secondNumber = 3;
        int sum = firstNumber + secondNumber;
        System.out.println("The sum of the two numbers are: " + sum);
        
        
        //section 2.3 Arithmetics, Create a counter with the value 0
        int counter = 0;
        counter = counter + 1; //Increment its order by one
        counter = counter + 5; // Adde5to the counter and display
        counter = counter - 1; // Decrement the counter to one
        counter = counter - 2; //Subtract counter by two
        counter = counter * 2; // Double the counter value
        System.out.println(counter); // Print the counter value and it should be 6
        
        
        //Section 2.4 Dividing different ints and doubles
        int a = 5;
        int b = 2;
        double c = 5;
        double d = 2;
        System.out.println(a / b);
        System.out.println(c / d);
        System.out.println(c / b);
        System.out.println(a / d);
        
        
        
		/* #######################################################################
		*  #                   Section 3 chars                                   #
		*  #######################################################################*/
        
        // section 3.1 Unicode numbers
        char letter = 'a';
        int code = 98;
        int valueOfa = letter;
        char ValueOf98 = (char) code;
        char ValueOf36 = 36;
        System.out.println("The value of the letter 'a' is: " + valueOfa); //Display the ascii value of letter 'a'
        System.out.println("The value of the ineger 98 is: " + ValueOf98); //Display the value of 98
        System.out.println("The value of the ineger 36 is: " + ValueOf36); //Display the value of '36'
        
        
		// section 3.2, Difference between letters
        //Display the value of 'c' minus 'a'
        int valueOfc = 'c';
        int valueOfz = 'z';
        System.out.println("The value of 'c' minus 'a' is: " + (valueOfc - valueOfa));//Used the a value from the line 126
        System.out.println("The value of 'z' minus 'a' is: " + (valueOfz - valueOfa)); 

        
        //Section 3.3, Adding chars and strings
        char char1 = 'x';
        char char2 = 'y';
        char char3 = 'z';
        String string1 = "z";
        String string2 = "y";
        System.out.println("The addition of char1, char2 and char3 is: " + (char1 + char2 + char3));// Display the addition ofchar1 + char2 + char3
        System.out.println("The addition of char1, char2 and string2 is: " + (char1 + char2 + string2));// Display the addition of char1 + char2 + string2
        System.out.println("The addition of char1, string1 and char3 is: " + (char1 + string1 + char3));// Display the addition of char1 + string1 + char3

        

		/* #######################################################################
		*  #                   Section 4 wrappers                                #
		*  #######################################################################*/
        
        // section 4.1 Convert strings to ints
        String number1 = "5";
        String number2 = "3";
        //Use parseint method and print the sum of the two given strings
        System.out.println("The addition of the given two numbers are: " + (Integer.parseInt(number1) + Integer.parseInt(number2)));
        
        
        // section 4.2 convert strings to doubles
        String number3 = "5.3";
        String number4 = "3.2";
        //Use parsedouble method convert and display the addition of the given strings
        System.out.println("The sum of the given strings are: " + (Double.parseDouble(number3) + Double.parseDouble(number4)));
        
        
        // section 4.3 Extracting the numbers from strings
        String string3 = "abc11";
        String string4 = "9xyz";
        String string5 = "abc7xya";
        
        String string6 = string3.substring(3);
        String string7 = string4.substring(0, 1);
        String string8 = string5.substring(3, 4);
        int add = Integer.parseInt(string6) + Integer.parseInt(string7) + Integer.parseInt(string8);
        System.out.println("The addition of the int parsefrom the given values are: " + add);      
	}

}
