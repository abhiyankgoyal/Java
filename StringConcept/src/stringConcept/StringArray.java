package stringConcept;
// {"xyyyyz", "xyyk","xyyyya","xaaa"};
public class StringArray {

	public static void main(String[] args) {
		
		String[] strarr = new String[3];
		// in string array at every index there is object since string is object
		strarr[0] = "abcd";
		strarr[1] = "defg";
		strarr[2] = "hijk";
		
		//String[] strarr2 = {"fsft", "erget", "hdth", "oijri", "hbvjcnm"};
	    
		for(int i=0; i<strarr.length; i++) // notice that here we didn't use brackets after length 
		{
			System.out.print(strarr[i] + " ");
		}
		System.out.println();
		
		String[] sarr = new String[3];
		
		sarr[0] = new String("abcd");
		sarr[1] = new String("abcde");
		sarr[2] = new String("abc");
		
		for(int i=0; i<sarr.length; i++)
		{
			System.out.print(sarr[i] + " ");
		}

	}

}
