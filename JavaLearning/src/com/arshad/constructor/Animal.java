package com.arshad.constructor;

public class Animal {
	
	String animal_name;
	String animal_type;
	
	//parameterized constructor
	Animal(String name , String type){
		animal_name=name;
		animal_type=type;
	}
	
	public void sayaboutanimal() {
		System.out.println("Animal name is "+ animal_name + " and type is " + animal_type);
	}
	
	public static void main(String [] args) {
		Animal animal1 = new Animal("Bear", "Herbivore");
		animal1.sayaboutanimal();
		
		Animal animal2 = new Animal("Lion", "Omnivore");
		animal2.sayaboutanimal();
	}

}
