package collection;

import java.util.ArrayList;

public class ListImplementation {

	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Anand");
		list.add("Bhayre");
		list.add("Techbodhi");

		// to read the contents we are using enhanced for loop(only used for increasing counter).
		
		for(String s: list)
		{
			System.out.println(s);
			
		}
		//to read the contents we are using normal for loop(can be used for increasing and decreasing counter)
	    for (int i=0; i<list.size(); i++)
	    {
	    	System.out.println(list.get(i));
	    }
	}
	

}
