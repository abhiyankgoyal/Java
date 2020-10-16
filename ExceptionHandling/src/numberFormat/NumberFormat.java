package numberFormat;

public class numberFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s = "abhi";
//		try {
//			int num = Integer.parseInt(s);
//			int a=5/0;
//		}
//		catch(NumberFormatException e) {
//			System.out.println(e);
//		}
//		catch(Exception e) {
//			System.out.println("exception handled");
//		}
//		System.out.println("execution continues");
//	}
	
	//----------------------------------------------------
	
		try{  
		   try{  
		     System.out.println("going to divide");  
		     int b =39/0;  
		   }
		   catch(ArithmeticException e){
		    	System.out.println(e);
		   }  
		   try{  
		    int a[]=new int[5];  
		    a[5]=4;  
		   }
		   catch(ArrayIndexOutOfBoundsException e){
			   System.out.println(e);
		   }  
		   System.out.println("other statement");  
		}
		catch(Exception e){
			System.out.println("handeled");
		}  
		System.out.println("normal flow..");  
		}

}
