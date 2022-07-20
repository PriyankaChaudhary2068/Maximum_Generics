package com.bridgelabz.maximumGenerics;

import java.util.Scanner;


public class MaximumFloat {
	
	
       public static void main(String[] args) {
	        System.out.println("Welcome To Find Maximum Float !");

	        MaximumFloat maximum = new MaximumFloat();

	        System.out.println("Maximum Number Among Three Integer Numbers Is : " + maximum.compareTo());

	    }

	    // compareTo method check the maximum number among three numbers and return it :-
	    public Float compareTo() {

	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter The First Number :");
	        Float number1 = scanner.nextFloat();

	        System.out.println("Enter The Second Number :");
	        Float number2 = scanner.nextFloat();

	        System.out.println("Enter The Third Number :");
	        Float number3 = scanner.nextFloat();

	        Float maximum = number1;

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


