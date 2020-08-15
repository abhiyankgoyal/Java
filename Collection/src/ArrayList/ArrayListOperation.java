package ArrayList;

import java.util.*;

public class ArrayListOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(3);
		al.add(5);
		al.add(1);
		al.add(8);
		al.add(4);
		System.out.println(al);
		for(int i=0; i<al.size(); i++) {
			al.set(i, al.get(i)+1);
		}
		System.out.println(al);
		//forEach loop
		for(int num : al) {
			System.out.println(num);
		}
		
		al.remove(1);
		System.out.println(al);
		al.remove((Integer)2);
		System.out.println(al);
	}

}
