package map;
import java.io.*;
import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap m = new HashMap();
		m.put(101, "A");
		m.put(102, "B");
		m.put(103, "C");
		m.put(104, "D");
		m.put(105, "E");
		System.out.println(m);
		m.replace(101, "F");
		System.out.println(m);
		m.remove(103);
		System.out.println(m);
		System.out.println(m.put(104, "k"));
		System.out.println(m.containsKey(11));
		System.out.println(m.containsKey(101));
		System.out.println(m.containsValue("E"));
		//m.put(null, "L");
		System.out.println(m);
		System.out.println(m.isEmpty());
		System.out.println(m.size());
		//m.clear();
		//System.out.println(m);
		Set m2 = m.keySet();
		System.out.println(m2);
		Collection m3 = m.values();
		System.out.println(m3);
		Set m4 = m.entrySet();
		System.out.println(m4);
//		for(Object obj : m4) {
//			Map.Entry m5 = (Map.Entry)m4;
//			System.out.println(m5.getKey());
//		}
		
		String s = "abhiyankGoyal";
		s=s.toLowerCase();
		
		HashMap<Character, Integer> m5 = new HashMap<>();
		char[] c = s.toCharArray();
		for(int i=0; i<s.length(); i++) {
			if(m5.containsKey(s.charAt(i))) {
				m5.put(s.charAt(i), m5.get(s.charAt(i)) + 1);
			}
			else {
				m5.put(s.charAt(i), 1);
			}
		}
		
		Set ss = m5.entrySet();
		for(Map.Entry e : m5.entrySet()) {
			System.out.println(e.getKey() + " - " + e.getValue());
		}
	}

}
