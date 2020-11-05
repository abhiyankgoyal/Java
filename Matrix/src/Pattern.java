
public class Pattern {
	
	public void triangle0(int n) {
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(1);
			}
			System.out.println();
		}
	}
	
	public void triangle1(int n) {
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	public void triangle2(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public void triangle3(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=(n-i); j>0; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print(j); // S.o.p("*")
			}
			System.out.println();
		}
	}
	
	public void triangle4(int n) {
		int i,j, k;
		for(i=1; i<=n; i++) {
			for (j=n-i; j>0; j--)   
			{  
				System.out.print(" ");   
			}    
			for (k=1; k<=2*i-1; k++ )   
			{         
				System.out.print("*");   
			}   
			System.out.println();
		}
	}
	
	public void triangle5(int n) {
		
	   int i,j,k;
	   for(i=1; i<=n; i++) {
			for (j=n-i; j>0; j--)   
			{  
				System.out.print(" ");   
			}    
			for (k=1; k<=i; k++ )   
			{         
				System.out.print("* ");   
			}   
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		Pattern p = new Pattern();
		p.triangle0(5);
		System.out.println();
		p.triangle1(5);
		System.out.println();
		p.triangle2(5);
		System.out.println();
		p.triangle3(5);
		System.out.println();
		p.triangle4(8);
		System.out.println();
		p.triangle5(8);
	}

}
