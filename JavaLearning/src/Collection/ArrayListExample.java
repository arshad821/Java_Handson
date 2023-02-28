package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample {
	
	
	
	public void arraylist() {
	
	ArrayList<String> arraylist = new ArrayList<String>();
	arraylist.add("Benz");
	arraylist.add("BMW");
	arraylist.add("Audi");
	arraylist.add("McLaren");
	arraylist.add("BMW");
	
	System.out.println(arraylist);
	
	System.out.println(arraylist.get(2)); //to retrive element.. based on index
	//System.out.println(arraylist.ind);
	
	
	System.out.println(arraylist.indexOf("BMW"));
	System.out.println(arraylist.lastIndexOf("BMW")); // to retrive last occcurence of element.
	System.out.println("************************************************");
	
	//to copy one list to another new list
	List<String> anotherlist = new ArrayList<String>();
	anotherlist.addAll(arraylist);
	System.out.println(anotherlist);
	
	anotherlist.remove(1);
	System.out.println(anotherlist);
	
	anotherlist.clear();
	System.out.println(anotherlist);
	
	arraylist.add(null);
	System.out.println(arraylist); //null will be inserted at end of list.
	
	arraylist.set(1, "TATA");
	System.out.println(arraylist);
	
	System.out.println(arraylist.isEmpty());
	
	//iterarte
	for (String string : arraylist) {
		System.out.println("Using for each : "+string);	
	}
	System.out.println("************************************************");
	
	for(int i=0 ; i<arraylist.size(); i++) {
		System.out.println("Using for loop : " + arraylist.get(i));	
	}
	System.out.println("************************************************");	
	
	ListIterator<String> listiterator = arraylist.listIterator();   
    while (listiterator.hasNext()) {
		System.out.println("Using List Iterator Method: "+ listiterator.next());
	}
    System.out.println("************************************************");	
    
    while (listiterator.hasPrevious()) {
    	System.out.println("Using List Iterator Method in reverse: "+ listiterator.previous());
	}
    System.out.println("************************************************");	
    
    Iterator<String> iterator = arraylist.iterator();
    while (iterator.hasNext()) {
    	System.out.println("Using Iterator Method: "+ iterator.next());
	}
    
	
	
}
	
	public static void main(String[] args) {
		
		ArrayListExample example = new ArrayListExample();
		example.arraylist();
		
		
	}

}
