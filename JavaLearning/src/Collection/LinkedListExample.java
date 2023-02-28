package Collection;

import java.util.LinkedList;

public class LinkedListExample {


	public void linkedlist() {

		LinkedList<Integer> linkedlistt= new LinkedList<Integer>();

		linkedlistt.add(4);
		linkedlistt.add(2);
		linkedlistt.add(6);
		linkedlistt.add(8);
		linkedlistt.add(6);
		linkedlistt.add(9);
		linkedlistt.add(12);
		linkedlistt.add(12);
		linkedlistt.add(null);
		
		

		System.out.println("Linked List: " + linkedlistt);

		linkedlistt.addFirst(0); //add first one
		System.out.println("After adding first element,Linked List: " + linkedlistt);

		linkedlistt.addLast(10);   //add last one
		System.out.println("After adding last element,Linked List: " + linkedlistt);

		System.out.println("getting element on first position " + linkedlistt.getFirst());
		System.out.println("getting element on last position " + linkedlistt.getLast());
		System.out.println("getting element on index position " + linkedlistt.get(3));
		
		System.out.println("removinf first element " + linkedlistt.removeFirst());
		System.out.println("removinf last element " + linkedlistt.removeLast());
		System.out.println("removinf index based element " + linkedlistt.remove(3));
		System.out.println("***********************************************************************");
		
	//another method for delete
		System.out.println("deleting first element " + linkedlistt.poll());
		System.out.println("deleting first element " + linkedlistt.pollLast());
		System.out.println("deleting first element " + linkedlistt.pollFirst());
		
		//to remove occurence
		linkedlistt.removeFirstOccurrence(6);
		System.out.println("remvoing first occuranc of element " + linkedlistt);
		linkedlistt.removeLastOccurrence(12);
		System.out.println("remvoing first occuranc of element " + linkedlistt);	
	}
	
	public void iteratelinkedlistwithforandforeachloop() {
		
		LinkedList<String> llist = new LinkedList<String>();
		llist.add("A");
		llist.add("B");
		llist.add("C");
		llist.add("D");
		llist.add("E");
		System.out.println("For Loop");
		for(int i=0;i<llist.size();i++) {
			System.out.println("ELement in LLIst are : " +llist.get(i));
		}
		System.out.println("***********************************************************************");
		
		System.out.println("ForEach Loop");
		for (String string : llist) {
			System.out.println("Element in LList using for each: " + string);
		}
		System.out.println("***********************************************************************");
		
	}


	public static void main(String[] args) {

		LinkedListExample LLexample = new LinkedListExample();
		LLexample.linkedlist();
		
		LLexample.iteratelinkedlistwithforandforeachloop();

	}

}
