package sorting;

class Corona {
	
	private String state;
	private int confirmed;
	private int recovered;
	private int deaths;
	private int active;
	
	Corona(String state, int confirmed, int recovered, int deaths){
		this.state = state;
		this.confirmed = confirmed;
		this.recovered = recovered;
		this.deaths = deaths;
		this.active = confirmed - recovered - deaths;
	}
	
	public int getActiveCases() {
		return this.active;
	}
	
	public String toString() {
		return "( " + this.state + ": confirmed: " + this.confirmed + ", recovered: " + this.recovered + ", deaths: " + this.deaths + ", Active: " + this.active + " )";
	}
	
	
}

public class insertionSort {
	
	public void sort(int[] arr) {
		
		int n = arr.length;
		for(int i=1; i<n; i++) {
			for(int j=i-1; j>=0; j--) {
				if(arr[j+1] < arr[j] ) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
				else {
					break;
				}
			}
		}
	}
	
	public void sortByActiveCases(Corona[] cases) {
		
		int n = cases.length;
		int i, j;
		Corona temp;
		for(i=1; i<n; i++) {
			for(j=i-1; j>=0; j--) {
				if(cases[j+1].getActiveCases() > cases[j].getActiveCases()) {
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
		int[] arr = {8,6,9,28,12,20};
		System.out.println("array before insertion sort");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		insertionSort obj = new insertionSort();
		obj.sort(arr);
		System.out.println("array after insertion sort");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		Corona c1 = new Corona("Maharashtra", 250000, 150000, 5000);
		Corona c2 = new Corona("Gujarat", 200000, 100000, 2000);
		Corona c3 = new Corona("Tamil Nadu", 225000, 150000, 1000);
		Corona c4 = new Corona("Uttar Pradesh", 175000, 125000, 2500);
		Corona c5 = new Corona("Madhya Pradesh", 10000, 5000, 1000);
		Corona c6 = new Corona("Delhi", 300000, 250000, 10000);
		
		Corona[] cases = {c1, c2, c3, c4, c5, c6};
		
		System.out.println("State wise corona cases:");
		
		for(int i=0; i<cases.length; i++) {
			System.out.println(cases[i]);
		}
		
		System.out.println();
		
		obj.sortByActiveCases(cases);
		
		System.out.println("State wise active corona cases:");
		
		for(int i=0; i<cases.length; i++) {
			System.out.println(cases[i]);
		}
		
	}

}
