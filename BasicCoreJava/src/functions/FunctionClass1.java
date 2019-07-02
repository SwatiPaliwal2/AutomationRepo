package functions;

public class FunctionClass1 
{

	public static void main(String[] args)
	{
		
		sum();  // function calling
		sum1(30,40);
		sum2(30,40,50);
		sub(10,20);
		mult(10,20);
		div(40,20);
		
	}
	
	//access modifier  nature of functn  returntype  name
	public             static            void        sum()
	{
		int a=10;
		int b=20;
		System.out.println(a+b);
	}

	public static void sum1(int a, int b)
	{		
		System.out.println(a+b);
	}
	
	public static void sum2(int a, int b, int c)
	{		
		System.out.println(a+b+c);
	}
	
	public static int sum3(int a, int b, int c)// function to return value
	{		
		return a+b+c;
	
	}
	
	public static void sub(int a, int b)
	{		
		System.out.println(a-b);
	}
	
	public static void mult(int a, int b)
	{
		System.out.println(a*b);
			
	}
	public static void div(int a, int b)
	{
		System.out.println(a/b);
			
	}
	
}
