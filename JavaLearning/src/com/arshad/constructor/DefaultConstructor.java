package com.arshad.constructor;

public class DefaultConstructor {
	 //example for default constructor.No con can be seen here.Compiler has created constructors. 
	
	String studentname="Arshad";
	int studentnum=123;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DefaultConstructor student = new DefaultConstructor();
		System.out.println(student.studentname);
		System.out.println(student.studentnum);

	}

}
