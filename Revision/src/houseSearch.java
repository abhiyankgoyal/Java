class House{
	
	private int l;
	private int b;
	private int a;
	
	House(int l, int b){
		this.l = l;
		this.b = b;
		this.a = l*b;
	}
	
	public int getLength() {
		return this.l;
	}
	
	public int getbreadth() {
		return this.b;
	}
	
	public int getArea() {
		return this.a;
	}
	
	public void setLength(int l) {
		this.l = l;
		this.a = this.l * this.b;
	}
	
	public void setBreadth(int b) {
		this.b = b;
		this.a = this.l * this.b;
	}
	
	public String toString() {
		String detail = "length =" +  " " + this.l + ", " + "breadth =" + ", " + this.b + " " + "area ="  + this.a;
		return detail;
	}
	
}
public class houseSearch {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		House h1 = new House(20,30);
		House h2 = new House(30,40);
		House h3 = new House(10,30);
		House h4 = new House(50,30);
		House h5 = new House(70,30);
		
		House[] houses = {h1,h2,h3,h4,h5};
		System.out.println("House h1: " + h1.toString());
		System.out.println(h1.getArea());
		
		String a="fghj";
		String b="fghj";
		String c = new String("abhi");
		String d = new String("abhi");
		
		if(c == d) {
			System.out.println(1);
		}
		else {
			System.out.println(-1);
		}
	}

}
