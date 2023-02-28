package com.arshad.constructor;

public class Draw {
	
	String draw;
	
	Draw(){
		System.out.println("Draw object is created");
	}
	
	Draw(String todraw){
		//String draw=todraw;
		System.out.println("Drawing "+ todraw);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Draw draw1 = new Draw();
		// to use constrctor in different situation based on parameter given is called constructor overloading.
		Draw draw2 = new Draw("Circle");

	
	}

}
