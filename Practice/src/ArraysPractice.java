import java.util.*;
import java.util.Map.Entry;
public class ArraysPractice {

	public static void main(String[] args) {
		int[] arr = {9,8,7,6};
		Arrays.sort(arr);
		for(int i=0; i<arr.length; i++) {
		 System.out.print(arr[i]+ " ");
		}
		System.out.println();
		Map<Integer, Integer> map = new HashMap<>();
		map.put(1,10);
		map.put(2,11);
		map.put(3,12);
		map.put(4,13);
		System.out.println(map);
		
		// iterate over map
		for(Map.Entry<Integer, Integer> m : map.entrySet()) {
			int key = m.getKey();
			int val = m.getValue();
			System.out.println(key+ " "+ val);
		}
		
		// using iterator
		Set s1 = map.entrySet();
		Iterator itr = s1.iterator();
		while(itr.hasNext()) {
			Map.Entry<Integer, Integer>m1 = (Map.Entry<Integer, Integer>) itr.next();
			System.out.println(m1.getKey() + " " + m1.getValue());
		}
		
		
	}
}
