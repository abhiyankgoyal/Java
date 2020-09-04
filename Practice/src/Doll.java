import java.util.*;
import java.util.ArrayList;
public class Doll {
	
	

	public int count(int dolls_count, List<Integer> dolls) {
		List<Integer> al = new ArrayList<>();
		int remainingDolls=0;
		int max=0;
		int max_count=0;
		for(int i=0; i<dolls.size(); i++) {
			if(dolls.get(i)>max) {
				max = dolls.get(i);
			}
		}
		System.out.println(max);
		for(int i=0; i<dolls.size(); i++) {
			if(dolls.get(i) == max) {
				max_count++;
			}
		}
		for(int i=0; i<dolls.size(); i++) {
			if(al.contains(dolls.get(i)) || al.get(i) == max) {
				remainingDolls++;
			}
			else {
				al.add(al.get(i));
			}
		}
		return remainingDolls + max_count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> dolls = new ArrayList<>();
		dolls.add(1);
		dolls.add(2);
		dolls.add(2);
		dolls.add(3);
		
		Doll d = new Doll();
		int res = d.count(dolls.size(), dolls);
		System.out.println(res);
	}

}
