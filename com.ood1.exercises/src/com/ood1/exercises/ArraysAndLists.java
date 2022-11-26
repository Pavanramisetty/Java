package com.ood1.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraysAndLists {

	public static void main(String[] args) {
		
		/*################################################################################
		#                  Section 1 Arrays                                              #
		################################################################################*/
		
		// section 1.1, Friends array
		String[] friends = {"perl", "javascript", "c#", "java", "python"};
		
		// Display the number of friends in the array
	    System.out.println("The number of friends in the array is : " + friends.length);
        
	    //Displaying the each friend in the console
	    for (int friend = 0; friend < friends.length; friend++)
        	System.out.println(friends[friend]);
          
	    //replace the fifth friend
	    friends[4] = "TCL";
	    
        //Sort the array
	    Arrays.sort(friends);
	    System.out.println(Arrays.toString(friends));
	
	    //Display the first person of the array
	    System.out.println(friends[0]);
	    
	    //Display the last person of the array
	    System.out.println(friends[friends.length - 1]);
	
	    //Remove the second person and make it null
	    friends[1] = null;
	    System.out.println(friends.length);    
	    
	    // section 2 Poker hand
	    String[] pokerHand = new String[5];
	    pokerHand[0] = "Queen of hearts";
	    pokerHand[1] = "3 of spades";
 	    pokerHand[2] = "3 of diamonds";
	    pokerHand[3] = "9 of hearts";
	    pokerHand[4] = "6 of clubs";
	    System.out.println(pokerHand.length);
	    System.out.println(Arrays.toString(pokerHand));
	    
	    
		/*################################################################################
		#                  Section 2 Array Lists                                         #
		################################################################################*/

	    // section 2.1 Shopping basket
        ArrayList<String> shoppingBasket = new ArrayList<String>();
        shoppingBasket.add("Milk");
        shoppingBasket.add("Cereals");
        shoppingBasket.add("Apples");
        shoppingBasket.add("Oranges");
        shoppingBasket.add("Bread");
        
        //Display number of items in the basket
        System.out.println("The number of items in the basket are: " + shoppingBasket.size());
        
        //Display the first item in the shopping basket
        System.out.println(shoppingBasket.get(0));
        
        //Display the 5th element in the shopping basket
        System.out.println(shoppingBasket.get(4));
        	
        //Remove bread from the basket and display number of items
        shoppingBasket.remove("Bread");
        System.out.println(shoppingBasket.size());
	
	    //Remove third item and display the items
        shoppingBasket.remove(2);
        for (int item = 0; item < shoppingBasket.size(); item++)
        	System.out.println(shoppingBasket.get(item));

	    //Add potato , Oliv oil and chicken
        shoppingBasket.add("Potato");
        shoppingBasket.add("Oliv oil");
        shoppingBasket.add("Chicken");
        
        //Sort and display the first and last item
        Collections.sort(shoppingBasket);
        System.out.println(shoppingBasket.get(0));
        System.out.println(shoppingBasket.get(5));
        
        // Section 2 Salaries
        ArrayList<Integer> salaries = new ArrayList<Integer>();
        salaries.add(75000);
        salaries.add(25000);
        salaries.add(42000);
        salaries.add(30000);
        salaries.add(55000);
        salaries.add(42000);
        salaries.add(39000);
        
        //The highest salary
        System.out.println(Collections.max(salaries));
        //The lowest salary
        System.out.println(Collections.min(salaries));
        
        //Number of people earning 42000
        System.out.println(Collections.frequency(salaries, 42000));
        
        //Sort the salaries and give the median
        Collections.sort(salaries);
        System.out.println(salaries.get(3));
        
        //Reverse the salaries and display the items
        Collections.reverse(salaries);
        System.out.println(salaries.toString());
        System.out.println(salaries.get(0));
        System.out.println(salaries.get(6));
	
	}

}
