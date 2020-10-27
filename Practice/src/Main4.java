import java.util.Scanner;

class Main4 {
	
	String a;
	
	Main4(String a){
		this.a=a;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String b = sc.nextLine();
		int c = Integer.parseInt(sc.nextLine());
		Main4 obj = new Main4(b);
		System.out.println(obj.a);
		System.out.println(c);
		int y,z,x=10;
		
		y=z=x;
		y -= x--;
		z -= --x;
		System.out.println(x);
		x -= --x - x--;
		System.out.println(x);
		System.out.println(x+"-"+y+"-"+z);
		
	}
}