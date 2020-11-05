package HashSet;

import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> h = new HashSet<String>();
		h.add("B");
		h.add("C");
		h.add("A");
		h.add("Z");
		h.add(null);
		System.out.println(h.add("Z"));// returns false since duplicates are not allowed
		System.out.println(h);// [B, C, A, Z, null] is not the output because in this insertion order is not preserved.
		h.add("Z");//it wont give any compile time error or runtime error because its return type is boolean hence it will just return false
		System.out.println(h.contains("Z"));
			
		HashSet<Integer> set = new HashSet<>();
		set.add(12);
		set.add(2);
		set.remove(2);
		System.out.println(set);
	}

}
