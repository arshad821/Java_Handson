package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	
	public void Treeset() {
		
		TreeSet tree = new TreeSet();
		tree.add(1);
		tree.add(3);
		tree.add(2);
		tree.add(6);
		tree.add(5);
	//	tree.add(null); //null pointer
		
		System.out.println("Elements are sorted on ascending order :" + tree);
		
		System.out.println("Return first value: " + tree.first());
		System.out.println("Return last value: " + tree.last());
		System.out.println("***********************************************************************");
		
		System.out.println("return  value less than 3: " + tree.headSet(3));
		System.out.println("return  value more than 3: " + tree.tailSet(3));
		System.out.println("will return value in middle: " + tree.subSet(2,5));
		System.out.println("***********************************************************************");
		
		System.out.println("return null since we havent given any order.. : " + tree.comparator());
		
		System.out.println("Return next higher value of given index: " + tree.higher(2));
		System.out.println("Return next lower value of given index: " + tree.lower(2));
		
		System.out.println("return and Remove the first eleemnt: " + tree.pollFirst());
		System.out.println("return and Remove the last eleemnt: " + tree.pollLast());
		System.out.println("After Polling: " + tree);
		
		System.out.println("Arranged in Descending order: " + tree.descendingSet());
		System.out.println("***********************************************************************");
		
		Iterator iterator = tree.iterator();
		while (iterator.hasNext()) {
			System.out.println("Ascending: "+ iterator.next());
		}
		System.out.println("***********************************************************************");
		Iterator desciterator = tree.descendingIterator();
		while (desciterator.hasNext()) {
			System.out.println("descending: "+ desciterator.next());
		}
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		TreeSetExample treeset = new TreeSetExample();
		treeset.Treeset();
	}
}
