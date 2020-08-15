package HashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		HashSet h = new HashSet();
		h.add("B");
		h.add("C");
		h.add("D");
		h.add("Z");
		h.add("Z");
		h.add(null);
		System.out.println(h);
		LinkedHashSet h2 = new LinkedHashSet(h); // in this insertion order is preserved but duplicates are not allowed
		h2.add(3);
		System.out.println(h2);
		HashSet h3 = new HashSet(h);
		System.out.println(h);
	}
}
