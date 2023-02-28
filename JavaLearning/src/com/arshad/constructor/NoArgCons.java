package com.arshad.constructor;

public class NoArgCons {

	String employeename;
	int employeeid;
	//No Arg Cons
	NoArgCons(){
		employeename="Arshad";
		int employeeid=2143925;
		System.out.println("Employee object is created");
	}

	public static void main(String [] args) {

		NoArgCons employee = new NoArgCons();
		System.out.println(employee.employeeid);	


	}

}
