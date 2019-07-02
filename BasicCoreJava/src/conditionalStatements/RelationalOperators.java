package conditionalStatements;

public class RelationalOperators {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// <, >, <=,>=,!=,==	
		//to practice below operators in if else statements
		
		int a=10;
		int b=20;
		int c=30;
		// less than <,> greater than
		
		if(a<b && b>c)
		{
			System.out.println(a);
			System.out.println("a is the smallest");
		}
		
		// <=,>=
		
		if(b>=c)
		{
			System.out.println("b is greater than c");
		}
		else
		{
			if(b<=c)
			{
				if(a<=c)
				{
					System.out.println("c is the greatest");
				}
			}	
		}
		
		// !=,==
		if(a!=b)
		{
			System.out.println(b-a);
		}
		if(a==b)
		{
			System.out.println(b-a);
		}
		
}	}



