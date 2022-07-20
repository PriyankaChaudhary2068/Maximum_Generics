package com.bridgelabz.maximumGenerics;

import java.util.Scanner;


public class MaximumInteger {
	
	
      public static void main(String[] args) {
	        System.out.println("Welcome To Find Maximum Integer !");

	        MaximumInteger maximum = new MaximumInteger();

	        System.out.println("Maximum Number Among Three Integer Numbers Is : " + maximum.compareTo());

	    }

	    // compareTo method check the maximum number among three numbers and return it :-
	    public Integer compareTo() {

	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter The First Number:");
	        Integer number1 = scanner.nextInt();

	        System.out.println("Enter The Second Number:");
	        Integer number2 = scanner.nextInt();

	        System.out.println("Enter The Third Number:");
	        Integer number3 = scanner.nextInt();
	        Integer maximum = number1;

	        if (number1 > number2 && number1 > number3) {
	            maximum = number1;
	        }
	         else if (number2 > number1 && number2 > number3) {
	            maximum = number2;
	         }

	         else {
	            maximum = number3;
	        }
	        
	        scanner.close();
	        return maximum;
	        
	       
	    }
	}


	
	 


