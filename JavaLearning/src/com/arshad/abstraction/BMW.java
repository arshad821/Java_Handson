package com.arshad.abstraction;

public class BMW extends Car {
	
	public void enginesecret() {
		System.out.println("BMW's engine secret");
	}
	
	public void designsecret() {
		System.out.println("this is BMW design secret");
	}
	
	public static void main( String[] args) {
		
		Car car = new BMW();
		car.designsecret();
		car.enginesecret();
	}


}
