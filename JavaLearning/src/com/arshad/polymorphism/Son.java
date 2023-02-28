package com.arshad.polymorphism;

public class Son extends Parent{
	
	@Override
	public void marriage() {
		System.out.println("i love another girl");
	}

	public static void main(String args[]) {
		
		Parent parent = new Son(); //dynamic
		parent.marriage();
		parent.properties();
		
	}
}
