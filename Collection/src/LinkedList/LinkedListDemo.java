package LinkedList;

/*
 * In this initial capacity linked list cannot be declared unlike ArrayList.
 * 
 */

import java.util.*; //ll is in java.util package

public class LinkedListDemo {
	
	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		ll.add("Abhiyank");
		ll.add(30);
		ll.add(null);
		ll.add("Mayank");
		System.out.println(ll);
		ll.set(0, "Goyal");
		System.out.println(ll);
		ll.add(0, "A");
		System.out.println(ll);
		ll.addFirst("B");
		System.out.println(ll);
		ll.removeLast();
		System.out.println(ll);
		ll.addLast(7);
		System.out.println(ll);
		ll.removeFirst();
		System.out.println(ll);
		ll.remove(2);
		System.out.println(ll);
		
		ArrayList al = new ArrayList();
		
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		
		ll.addAll(al);
		System.out.println(ll);
		ll.addAll(1,al);
		System.out.println(ll);
		
		LinkedList ll2 = new LinkedList(al);
		System.out.println(ll2.getFirst());
		System.out.println(ll2.getLast());
		System.out.println(ll2.get(3));
		ll2.clear();
		System.out.println(ll2);
	}

}
