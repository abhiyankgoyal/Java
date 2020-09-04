
public class MaxContigousSumArray {

	public void contigousSum(int[] a) {
//		int sum=0;
//		int maxSum=a[0];
//		int startIndex=0;
//		int endIndex=0;
//		for(int  i=0; i<a.length; i++) {
//			sum=a[i];
//			if(sum>maxSum) {
//				maxSum=sum;
//				startIndex = i;
//				endIndex = i;
//			}
//			for(int j=i+1; j<a.length; j++) {
//					sum += a[j];
//					if(sum>maxSum) {
//						maxSum = sum;
//						startIndex = i;
//						endIndex = j;
//					}
//			}
//		}
//		System.out.println("maximum sum of contigous elements: " + maxSum + "\nstart index: " + startIndex + "\nend index: " + endIndex);
//		System.out.print("contigous elements: ");
//		for(int i=startIndex; i<=endIndex; i++) {
//			System.out.print(a[i] + " ");
//		}
		int sum=0;
		int maxSum = Integer.MIN_VALUE;
		for(int i=0; i<a.length; i++) {
			sum += a[i];
			if(sum>maxSum) {
				maxSum = sum;
			}
			if(sum < 0) {
				sum=0;
			}
		}
		System.out.println(maxSum);
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,-6,4,3};
		MaxContigousSumArray obj = new MaxContigousSumArray();
		obj.contigousSum(arr);
	}

}
