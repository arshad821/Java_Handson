package com.arshad.abstraction;

public abstract class Car {
	
	public abstract void enginesecret();
	/*{
		System.out.println("Car's engine secret");
	}*/
	
	public abstract void designsecret();
	/*{
		System.out.println("this is design secret");
	}*/

	//since we have implemented new functions in BMW and Benz this functions(body) are unwanted so we are removing and 
	//keeping the method as abstract ;if one method is abstract means the class should be abstract...
}
