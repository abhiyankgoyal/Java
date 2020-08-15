class Car{
	private String name;
	private String model;
	private int price;
	
	Car(String name, String model, int price){
		this.name = name;
		this.model = model;
		this.price = price;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
}

public class ClassConcept {

	public int search(Car[] cars) {
		
		int i;
		int index=0;
		int max_price = cars[0].getPrice();
		for(i=1; i< cars.length; i++) {
			if(max_price < cars[i].getPrice()) {
				max_price = cars[i].getPrice();
				index = i;
			}
		}
		return index;
		//return max_price;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car("swift dzire", "zdi", 100000);
		Car c2 = new Car("swift dzire", "vdi", 50000);
		Car c3 = new Car("swift dzire", "xdi", 500000);
		Car c4 = new Car("i20", "xdi", 450000);
		Car c5 = new Car("i20", "xdi", 550000);
		Car c6 = new Car("i20", "xdi", 600000);
		
		Car[] cars = {c1, c2, c3, c4, c5, c6};
		
		ClassConcept obj = new ClassConcept();
		int res=obj.search(cars);
		System.out.println(cars[res].getPrice());
		System.out.println(c1.getName() + " " + c1.getModel() + " " + c1.getPrice());
	}

}
