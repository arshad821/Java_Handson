package com.arshad.abstraction;

public class intrfceg extends Interfaceeg1 implements UpcomingProjects,Interface2{
	
	@Override
	public void oldproject() {
		System.out.println("It isss old project");
	}
	
	public static void main( String[] args) {
		
		Interfaceeg1 intrface = new intrfceg();
		intrface.oldproject();
		
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		System.out.println("methods3");
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("methods1");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("methods2");
	}

}
