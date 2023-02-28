package com.arshad.java;

public class BankAccount {

	Long Bankacc=12345678912l; //wrappper class
	
	String Accholdername= "Arshad";
	
	Integer bankbalance= 3587;
	
	
	public void getaccountholder() {
		System.out.println("Account holder name is "+ Accholdername);
	}
	
	
	
	
	public static void main(String[] args) {
		
		BankAccount account = new BankAccount();
		account.getaccountholder();
		

	}

}
