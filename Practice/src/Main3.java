import java.util.Scanner;
public class Main3 {

	public void time(int w) {
		
		if(w == 0) {
			System.out.println("Time Estmated: 0 minutes");
		}
		else if(w > 0 && w <= 2000) {
			System.out.println("Time Estimated: 25 minutes");
		}
		else if(w > 2000 && w <= 4000) {
			System.out.println("Time Estimated: 35 minutes");
		}
		else if(w > 2000 && w <= 4000) {
			System.out.println("Time Estimated: 45 minutes");
		}
		else if(w > 4000) {
			System.out.println("OVERLOADED");
		}
		else {
			System.out.println("INVALID INPUT");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int w = Integer.parseInt(sc.next());
		Main3 obj = new Main3();
		obj.time(w);
	}

}
