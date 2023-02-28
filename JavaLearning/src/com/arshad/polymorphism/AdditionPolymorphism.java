package com.arshad.polymorphism;


public class AdditionPolymorphism {
	
	public int add(int a , int b) {
		return a + b;
		
	}
	public int add(int a, int b, int c) {
		return a + b + c;
	}
	public double add(double a, double b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		
		AdditionPolymorphism addition = new AdditionPolymorphism();
		
		System.out.println("Sum of 2 number is "+ addition.add(3, 5));
		System.out.println("Sum of 2 float number is "+ addition.add(1.3, 1.6));
		System.out.println("Sum of 3 number is "+ addition.add(1, 3, 5));
		
		
		
	}

}
