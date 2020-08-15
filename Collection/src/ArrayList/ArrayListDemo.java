package ArrayList;
/*
 * In ArrayList index is very important
 */

import java.io.Serializable;
import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		LinkedList ll = new LinkedList();
		al.add("A");
		al.add(10); // heterogeneous objects are allowed
		al.add("A"); // duplicates allowed
		al.add(null); // null insertion possible
		System.out.println(al); // [A,10,A,null]...sqaure brackets becoz we have called reference of al...and reference is called by toString() method which adds square brackets
		al.remove(2); // to remove object we need to give index of it...i.e. remove(int index)
		System.out.println(al);
		al.add(2,"M"); // to add object at in between of array thn give object and ndex t which it needs to be inserted
		System.out.println(al);
		System.out.println(al.isEmpty()); // checks whether ArrayList is empty or not
		ll.add(5); // it adds the object at the end
		ll.add(5);
		al.addAll(ll); // different collection can be added
		al.addAll(2,ll);
		Object[] arr = ll.toArray(); // to convert linkedList or any collection to array object.toArray() is used which return objects array since collection is a group of objects in a single unit.
		System.out.println(al);
		System.out.println(ll);
		System.out.println(arr[0]); 
		System.out.println(al.size()); // to check the size of the ArrayList al.size()
		System.out.println(al.get(0)); // to get the object from the arraylist index is passed 
		
		System.out.println(al instanceof Serializable); // all collection class implements serializable interface
		System.out.println(al instanceof Cloneable); // all collection class implements cloneable interface
		System.out.println(al instanceof RandomAccess); // only ArrayList and vector class implements RandomAccess interface 
		System.out.println(ll instanceof RandomAccess);
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(9);
		al2.add(8);
		al2.add(7);
		al2.add(6);
		al2.add(5);
		al2.add(4);
		al2.add(9);
		System.out.println(al2);
		al2.set(2, 4);
		System.out.println(al2);
		Collections.sort(al2); // Collections class contains ultility methods like sorting, searching etc
		System.out.println(al2);
		int index = Collections.binarySearch(al2, 9);
		System.out.println(index);
	}

}
