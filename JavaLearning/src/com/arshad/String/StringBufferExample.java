package com.arshad.String;

public class StringBufferExample {
	
	public static void main(String[] args) {
	
	String name="Arshad";
	StringBuffer name1 = new StringBuffer("Dulqar");
	
	System.out.println("String is Immutable(unchangable)");
    System.out.println("Appending name to OG string: "+ name.concat("Arsh"));
    System.out.println("Orginal String is : " + name);
    System.out.println("**************");
	System.out.println("Stringbuffer is mutable(changable)");
    System.out.println("Appending name to OG string: "+ name1.append("Salman"));
    System.out.println("Orginal String is : " + name1);
    
    //string buffer methods
    StringBuffer name2 = new StringBuffer("Karthik");
    System.out.println(name2.reverse()); //string buffer can be reversed..but string cant..
    
    StringBuffer name3 = new StringBuffer("Ramarajan");
    System.out.println(name3.replace(0, 3, "raj"));
	
    StringBuffer name4 = new StringBuffer("feiKARTHIK");
    System.out.println(name4.delete(0, 3));

    StringBuffer name5 = new StringBuffer("Moni");
    System.out.println(name5.insert(4, "sha"));
   
    StringBuffer name6 = new StringBuffer("Moni");
    System.out.println(name6.capacity()); // will tell the capacity of string buffer . default is 20..
}}
