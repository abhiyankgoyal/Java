import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		//Main obj = new Main();
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		String parent = sc.nextLine();
		char child = sc.next().charAt(0);
		if(child == 'N') {
			int n = (5*5000)/100;
			System.out.println("TOTAL MEMBERS:1");
			System.out.println("COMISSION DETAILS");
			System.out.println(parent+":"+n+" INR");
		}
		else if(child == 'Y') {
			String childNames = sc2.nextLine();
			String[] childs = childNames.split(",");
			if(childs.length > 0) {
				int childComission = 250;
				int parentComission = childs.length*500;
				System.out.println("TOTAL MEMBERS:"+childs.length);
				System.out.println("COMISSION DETAILS");
				System.out.println(parent+":"+parentComission+" INR");
				for(int i=0; i<childs.length; i++) {
					System.out.println(childs[i]+":"+childComission + " INR");
				}
			}
		}
		else {
			System.out.println("INVALID INPUT");
		}
	}

}
