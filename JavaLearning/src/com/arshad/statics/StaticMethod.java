package com.arshad.statics;

public class StaticMethod {
	
	
	public static void Static() {
		System.out.println("This is Static Method");
	}
	
	public void nonstatic() {
		System.out.println("This is non-static");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//dont need to create object for static method.
		Static();
		
		
		StaticMethod sta = new StaticMethod();
		sta.nonstatic();
	}

}
