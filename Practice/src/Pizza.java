import java.util.Scanner;
import java.util.*;

public class Pizza {
	
	public int[] meatPizza(int[] orders, int k) {
		
		
		Queue<Integer> q = new LinkedList<>();
		int count=0;
		if(k >= orders.length) {
			int res[] = new int[1];
			int flag=0;
			for(int i=0; i<orders.length; i++) {
				if(orders[i]<0) {
					res[count] = orders[i];
					return res;
				}
			}
			if(flag==0) {
				res[count] = 0;
				return res;
			}
		}
		
		int[] res = new int[orders.length - k + 1];
		for(int i=0; i<k; i++) {
			if(orders[i]<0) {
				q.add(orders[i]);
			}
		}
		
		for(int i=k; i<orders.length; i++) {
			if(q.isEmpty()) {
				res[count++] = 0;
			}
			else {
				res[count++] = q.poll();
			}
			if(orders[i] < 0) {
				q.add(orders[i]);
			}
		}
		
//		while(!q.isEmpty()) {
//			res[count++] = q.poll();
//		}
//		
//		while(count < orders.length-k+1) {
//			res[count++] = 0;
//		}
		
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numOfOrders = sc.nextInt();
		int size = sc.nextInt();
		int[] orders = new int[numOfOrders];
		for(int i=0; i<numOfOrders; i++) {
			orders[i] = sc.nextInt();
		}
		Pizza obj = new Pizza();
		int[] res = obj.meatPizza(orders, size);
		for(int i=0; i<res.length; i++) {
			System.out.print(res[i] + " ");
		}
	}

}
