package com.arshad.polymorphism;

public class TheWayweTalk {
	
	
	public void talk(Parents Styleoftalking) {
		System.out.println("Polite and Respectful");
	}
	
	public void talk(Partner Styleoftalking) {
		System.out.println("Love,Care,Feelings");
	}
	
	public void talk(Boss Styleoftalking) {
		System.out.println("Not personal only about business");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TheWayweTalk talking = new TheWayweTalk();
		
		Parents parents = new Parents();
		talking.talk(parents);
		
		Boss boss=new Boss();
		talking.talk(boss);
		
		Partner partner = new Partner();
		talking.talk(partner);
		
		
	}

}
