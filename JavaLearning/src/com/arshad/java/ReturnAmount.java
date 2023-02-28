package com.arshad.java;

public class ReturnAmount {
	
	Integer collectedamount=9999;
	
	public Integer collectamountandgiveit() {
		System.out.println("Daddy have collected rupees " + collectedamount + "and send it to u");
		return collectedamount;
	}
	
	public static void main(String [] args) {
		
		ReturnAmount myson = new ReturnAmount();
		Integer amount = myson.collectamountandgiveit();
		System.out.println("Got the amount son " + amount);
		
	}

}
