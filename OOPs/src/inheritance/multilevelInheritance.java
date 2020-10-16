package inheritance;

class A{
	private int height;
	
	A(int height){
		this.height = height;
	}
	
	public int getHeight() {
		return this.height;
	}
	
}

class B extends A{
	
	private int weight;
	
	B(int height, int weight){
		super(height);
		this.weight = weight;
	}
	
	public int getWeight() {
		return this.weight;
	}
}

class C extends B{

	private int width;
	
	C(int height, int weight, int width){
		super(height, weight); // here first class A constructor is called then B and then C 
		this.width = width;
	}
	
	public int getWidth() {
		return this.width;
	}
}

public class multilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C obj = new C(180, 100, 40);
		System.out.println(obj.getHeight());
		System.out.println(obj.getWeight());
		System.out.println(obj.getWidth());
		
		B obj2 = new B(170, 80);
		System.out.println(obj2.getHeight());
		System.out.println(obj2.getWeight());
	}

}
