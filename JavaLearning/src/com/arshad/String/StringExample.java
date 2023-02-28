package com.arshad.String;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name="arshad";//by string literal
		String name1=" Mohamed Arshad ";
		int num = 3;
		//these are string methods
		
		System.out.println(name.charAt(1));  //to print character at desired index position
				
		System.out.println(name.length()); 
		
		System.out.println(name.equals("Arshad"));
		
		System.out.println(name.equalsIgnoreCase("Arshad"));
		
		System.out.println(name.isEmpty());
		
		System.out.println(name.contains("a"));
		
		System.out.println(name1.substring(1));   //print particular portion of string
		
		System.out.println(name1.substring(0,7)); //print particular portion of string with end point.
		
		System.out.println(name1.concat(" Kaleeth"));
		
		System.out.println(name1.replace("A", "a"));
		System.out.println(name1.replace("Mohamed", "Mohd"));
		
		System.out.println(name1.indexOf("r"));  //to find charecter's position
		System.out.println(name1.indexOf("a", 8)); //to find charecter's position from specified index.
		
		System.out.println(name1.trim()); // will remove spaces in start and end.
		
		System.out.println(String.valueOf(num)); //imp.convert given datatype to string..
		
		System.out.println(name1.substring(1));
		
		//return joined string with given delimiter.
		System.out.println(String.join("/", "30","2","11"));
		System.out.println(String.join("-", "he","is","good","booy"));
		
		//Split
		String splitthis="I'm,Learning,Automation,Continuously";
		String[] splitted=splitthis.split(",");
		for (String finall : splitted) {
			System.out.println(finall);
		}
		
	}

}
