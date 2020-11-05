import java.util.Scanner;
public class MatrixCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int[][] a = new int[3][3];
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<3; j++) {
				a[i][j] = sc.nextInt();
				//System.out.print(a[i][j] + " ");
			}
			//System.out.println();
		}
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length; j++) {
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
