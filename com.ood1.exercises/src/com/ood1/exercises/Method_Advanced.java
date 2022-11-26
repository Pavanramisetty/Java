package com.ood1.exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class Method_Advanced {

	public static void main(String[] args) {
		// 1.1 Prime numbers
		int n = 100;
		ArrayList<Integer> primeNumbers = new ArrayList<>();
	    primeNumbers.add(2);
	    for (int i = 3; i < n; i+=2) { 
	        boolean isPrime = true;
	        for (Integer prime : primeNumbers) { 
	            if (i % prime == 0) { 
	                isPrime = false;
	                break; 
	            }
	        }
	        if (isPrime) {
	            primeNumbers.add(i);
	        }
	    }
	    System.out.println(primeNumbers);
	    
	    // 1.2 Sorting the numbers
	    int array[] = {3,5,4,66,8,6,3,1,2,99,100};
        for (int i = 0; i <= array.length - 1; i++){
            for (int j = i + 1; j <= array.length - 1; j++){
                int tmp = 0;
                if(array[i] > array[j]){
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }    
        System.out.println(Arrays.toString(array));
  }   
}
