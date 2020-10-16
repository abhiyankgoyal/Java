package kaprekarNo;

import java.util.Scanner;

public class modifiedKaprekar {
	
	static void kaprekarNumbers(int p, int q) {
        int flag = 0;
        for(int i=p; i<=q; i++){
            if(check(i)){
                flag = 1;
                System.out.print(i + " ");
            }
        }
        if(flag == 0){
            System.out.println("INVALID RANGE");
        }
    }

    public static boolean check(int num){
    	if(num == 1) {
    		return true;
    	}
        long sq_num = num*num;
        long l=0;
        long r=0;
        String str = String.valueOf(sq_num);
        String lStr = str.substring(0, str.length()/2);
        if(lStr.isEmpty()) {
        	l=0;
        }
        else {
        	l=Integer.parseInt(lStr);
        }
        r = Integer.parseInt(str.substring(str.length()/2));
        if((l+r) == num){
            return true;
        }
        return false;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int q = sc.nextInt();
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        //System.out.println(check(1));
        kaprekarNumbers(p, q);
        sc.close();

	}

}
