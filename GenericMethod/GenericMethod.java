package com.bridgelabz.maximumGenerics;

public class GenericMethod {
	
	 public static <T extends Comparable<T>>T testCase(T a, T b, T c) {
	        T max = a;
	        if (b.compareTo(max) > 0) {
	            max = b;
	        }
	        if (c.compareTo(max) > 0) {
	            max = c;
	        }
	        return max;
	    }

	    public static void main(String[] args) {
	        System.out.println("Welcome To Find Maximum Number Problem Using Generics \n");
	        System.out.println(" The Maximum Among Three Integer Values Is : " + testCase(9, 5, 10)+ "\n");
	        System.out.println(" The Maximum Among Three Float Values Is : " + testCase(9.8f, 5.7f, 101.7f)+ "\n");
	        System.out.println(" The Maximum among three string values is : " + testCase("Priyanka", "Sweta", "Pooja")+ "\n");

	    }
	}



