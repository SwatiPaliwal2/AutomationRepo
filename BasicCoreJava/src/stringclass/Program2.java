package stringclass;

public class Program2 {

	public static void main(String[] args) 
	{
		String name="anand";
		
		// to find out the number of "a" in the string
		
		/*
		 * char c1='a'; int count =0;
		 * 
		 * for(int i=0; i<name.length(); i++) { if(c1==name.charAt(i)) { count++; } }
		 * System.out.println(count);
		 */
		
	//method 2 :
	
		/*
		 * String c1 = "a"; int count =0; for (int i=0; i<name.length(); i++) {
		 * if(c1.equals(name.substring(i,i+1))) { count++;
		 * 
		 * }
		 * 
		 * } System.out.println(count);
		 */
   //method 3:
			
		System.out.println(name.length() - name.replace("a","").length());
			
			
			
	}
	
}
