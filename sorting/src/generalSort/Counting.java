package generalSort;

import java.util.Arrays;

public class Counting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,2,8,2,3};
		int[] temp = new int[10]; // size of the temp array is larger then the max. element in the arr array.
		for(int i=0;i<arr.length;i++) {
			temp[arr[i]]++;
		}
		int k = 0;
		for(int i=0;i<temp.length;i++) {
			if(temp[i]!=0) {
				while(temp[i]!=0) {
					arr[k] = i;
					k++;
					temp[i]--;
				}
			}
		}
		//Arrays.sort(arr);
		for(int n: arr) {
			System.out.print(n +" ");
		}
	}

}
// temp
// 0 0 0 0 0 0 0 0 0 0 0 inital values 
// 0 1 2 3 4 5 6 7 8 9 10 indexes

// 0 0 0 0 1 0 0 0 0 0 0 1st iteration
// 0 0 1 0 1 0 0 0 0 0 0 2nd iteration
// 0 0 1 0 1 0 0 0 1 0 0 3rd iteration
// 0 0 2 0 1 0 0 0 1 0 0 4th iteration
// 0 0 2 1 1 0 0 0 1 0 0 5th iteration

