package sorting;

class Covid19{
	
	private String city;
	private int confirmed;
	private int recovered;
	private int deaths;
	private int active;
	
	Covid19(String city, int confirmed, int recovered, int deaths){
		this.city = city;
		this.confirmed = confirmed;
		this.recovered = recovered;
		this.deaths = deaths;
		this.active = confirmed - recovered - deaths;
	}
	
	public int getConfirmedCases() {
		return this.confirmed;
	}
	
	public int getRecoveredCases() {
		return this.recovered;
	}
	
	public int getActiveCases() {
		return this.active;
	}
	
	public int getDeaths() {
		return this.deaths;
	}
	
	public String toString() {
		return "( " + this.city + ": confirmed: " + this.confirmed + ", recovered: " + this.recovered + ", deaths: " + this.deaths + ", Active: " + this.active + " )";
	}
}

public class AllSortingMethods {
	
	public void bubbleSort(Covid19[] cases) {
		
		int i,j;
		Covid19 temp;
		for(i=0; i<cases.length-1; i++) {
			for(j=0; j<cases.length-i-1; j++) {
				if(cases[j].getConfirmedCases() < cases[j+1].getConfirmedCases()) {
					temp = cases[j+1];
					cases[j+1] = cases[j];
					cases[j] = temp;
				}
			}
		}
	}
	
	public void selectionSort(Covid19[] cases) {
		
		int minIndex, i, j;
		Covid19 temp;
		
		for(i=0; i<cases.length-1; i++) {
			minIndex = i;
			for(j=i+1; j<cases.length-1; j++) {
				if(cases[i].getRecoveredCases() < cases[j].getRecoveredCases()) {
					minIndex = j;
				}
			}
			temp = cases[minIndex];
			cases[minIndex] = cases[i];
			cases[i] = temp;
		}
	}
	
	public void insertionSort(Covid19[] cases) {
		
		int i,j;
		Covid19 temp;
		
		for(i=1; i<cases.length; i++) {
			for(j=i-1; j>=0; j--) {
				if(cases[j+1].getDeaths() > cases[j].getDeaths()) {
					temp = cases[j+1];
					cases[j+1] = cases[j];
					cases[j] = temp;
				}
				else {
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Covid19 c1 = new Covid19("Mumbai", 250000, 150000, 5000);
		Covid19 c2 = new Covid19("Ahmdabad", 200000, 100000, 2000);
		Covid19 c3 = new Covid19("Chennai", 225000, 150000, 1000);
		Covid19 c4 = new Covid19("Bihar", 175000, 125000, 2500);
		Covid19 c5 = new Covid19("Indore", 100000, 50000, 1000);
		Covid19 c6 = new Covid19("Delhi", 300000, 250000, 10000);
		
		Covid19[] cases = {c1, c2, c3, c4, c5, c6};
		
		System.out.println("City wise corona cases:");
		
		for(int i=0; i<cases.length; i++) {
			System.out.println(cases[i]);
		}
		
		System.out.println();
		
		AllSortingMethods obj = new AllSortingMethods();
		obj.bubbleSort(cases);
		System.out.println("City wise covid19 confirmed cases :");
		
		for(int i=0; i<cases.length; i++) {
			System.out.println(cases[i]);
		}
		
		System.out.println();
		
		obj.selectionSort(cases);
		System.out.println("City wise covid19 recovered cases :");
		
		for(int i=0; i<cases.length; i++) {
			System.out.println(cases[i]);
		}
		
		System.out.println();
		
		obj.insertionSort(cases);
		System.out.println("City wise covid19 recovered cases :");
		
		for(int i=0; i<cases.length; i++) {
			System.out.println(cases[i]);
		}
	}
}
