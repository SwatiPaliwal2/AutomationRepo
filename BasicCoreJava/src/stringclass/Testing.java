package stringclass;

public class Testing {

	public static void main(String[] args)
	{
		String name = "swati";
		String name2 = "Swati";
		
		// 1.CharAt function
		System.out.println(name.charAt(3));

		
		// 2.Equals function
		if(name.equals(name2)) 
		{
			System.out.println("name1 and name2 are same");
			
		}else
		{
			System.out.println("name1 and name2 are not same" );
		}
		
		// 3.EqualIgnorecase function
		if(name.equalsIgnoreCase(name2)) 
		{
			System.out.println("name1 and name2 are same");
			
		}else
		{
			System.out.println("name1 and name2 are not same" );
		}
		
		// 4.Length
		
		System.out.println(name.length());
		
		// 5.Replace
		
		System.out.println(name.replace("swa", "pri"));
		System.out.println(name.replace("swati", "priya"));
		
		System.out.println(name.replace('a', 'i'));
		
		
		// 6.Split
		
		String[] arr=name.split("a");
		System.out.println(arr.length);
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
			
		}
		
		for(String s : arr)
		{
			System.out.println(s);
		}
		
		
		// 7.Substring
		
		System.out.println(name.substring(2));
		System.out.println(name.substring(2, 5));// endindex takes values like,if given 5,it will pick upto 4th. 
		
		// 8.toLowerCase,9.toUpperCase
		
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		
	}

}
