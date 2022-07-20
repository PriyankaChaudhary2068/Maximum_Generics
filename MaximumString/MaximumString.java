package com.bridgelabz.maximumGenerics;

import java.util.Scanner;

public class MaximumString {
	
	
	    public static void main(String[] args) {
	        System.out.println("Welcome To Find Maximum String!");

	        MaximumString maximum = new MaximumString();

	        System.out.println("Maximum String Among Three String Is : " + maximum.compareTo());

	    }

	    // compareTo method check the maximum number among three numbers and return it :-
	    public String compareTo() {

	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter The First String :");
	        String string1 = scanner.next();

	        System.out.println("Enter The Second String :");
	        String string2 = scanner.next();

	        System.out.println("Enter The Third String :");
	        String string3 = scanner.next();

	        String maximum = string1;

	        if(string2.compareTo(maximum) > 0){
	            maximum = string2;

	        }
	        if (string3.compareTo(maximum) > 0){
	            maximum = string3;

	        }
	        
	        scanner.close();
	        return maximum;
	    }
	}



