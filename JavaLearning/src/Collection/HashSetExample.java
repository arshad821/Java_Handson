package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class HashSetExample {


	public void Hashset() {

		HashSet<String> hashset = new HashSet<String>();
		hashset.add("Abcd adj");
		hashset.add("B");
		hashset.add("C");
		hashset.add("F");
		hashset.add("A"); //duplicate
		hashset.add("Z");
		hashset.add(null); //insertion order not followed

		System.out.println("Hashset contents are : " + hashset);

		hashset.remove(null);
		System.out.println("Hashset contents are : " + hashset);

		System.out.println(hashset.contains("A"));
		System.out.println("***********************************************************************");
		

		HashSet temphashset = new HashSet();
		temphashset.add("A");
		temphashset.add("B");
		temphashset.add("C");
		//temphashset.add("D");
		System.out.println(hashset.containsAll(temphashset)); //used to compare one set with another set...
		System.out.println("***********************************************************************");
		
	}


	public void iteratehashsetusingiterator() {

		HashSet<String> hasset = new HashSet<String>();
		hasset.add("a");
		hasset.add("b");
		hasset.add("c");
		hasset.add("d");
		hasset.add(null);

		Iterator<String> iterator = hasset.iterator();
		while(iterator.hasNext()) {
			System.out.println("Iterating using iteartor: " + iterator.next());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSetExample hashsetexample = new HashSetExample();
		hashsetexample.Hashset();
		hashsetexample.iteratehashsetusingiterator();


	}

}
