package com.arshad.abstraction;

public class Benz extends Car{  //inheritance
	
	@Override
	public void enginesecret() {
		System.out.println("Benz's engine secret");
	}
	@Override
	public void designsecret() {
		System.out.println("this is Benz design secret");
	}
	
	public static void main( String[] args) {
		
		Car car = new  Benz(); // dynamic polymorphism
		car.designsecret();
		car.enginesecret();
	}


}
