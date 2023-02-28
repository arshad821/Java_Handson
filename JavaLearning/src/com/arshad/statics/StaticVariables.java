package com.arshad.statics;

public class StaticVariables {
	
	static int balance;
	String Depositedby;
	
	
	public static void main(String [] args) {
		
		StaticVariables object1 = new StaticVariables();
		object1.balance=2000;
		object1.Depositedby="Arshad";
		
		StaticVariables object2 = new StaticVariables();
		object2.balance=3300;
		object2.Depositedby="Dulqar";
		
		System.out.println("Object1 integer " + object1.balance);
		System.out.println("Object1 string " + object1.Depositedby);
		System.out.println("Object2 integer " + object2.balance);
		System.out.println("Object2 string " + object2.Depositedby);
		
		
		//sttaic variable will conside only last variable value and perform the same
	}

}
