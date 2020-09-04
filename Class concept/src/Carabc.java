import java.util.Scanner;
class Car {
	int price;
	int avg;
	String name;

	Car(int p, int a, String n){

		price =p;
		avg= a;
		name=n;
	}


}

public class Carabc{

	public static void main(String[] args) {

		Car c1=new Car(100000,20,"bmw");
		Car c2=new Car(500000,22,"dzire");
		Car c3=new Car(800000,25,"i20");
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int avg = sc.nextInt();
		String n = sc.nextLine();
		Car c4 = new Car(p,avg,n);
		System.out.println(c1.price+ " " +c1.avg+ " " +c1.name );
		System.out.println(c2.price+ " " +c2.avg+ " " +c2.name );
		System.out.println(c3.price+ " " +c3.avg+ " " +c3.name );
		System.out.println(c4.price+ " " +c4.avg+ " " +c4.name );
		sc.close();

	}
}
