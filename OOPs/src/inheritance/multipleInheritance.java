package inheritance;

class E{
	private int a;
	
	E(int a){
		this.a = a;
	}
	
	public int getA() {
		return this.a;
	}
}

class F{
	
	private int a;
	
	F(int a){
		this.a = a;
	}
	
	public int getA() {
		return this.a;
	}
}

//class G extends E, F { // multiple inheritance is not supported to avoid ambiguity
	
//	getA();
//}

public class multipleInheritance {
	
	public static void main(String[] args) {
		
		//G obj = new G();
		//obj.getA();
		
	}
}
