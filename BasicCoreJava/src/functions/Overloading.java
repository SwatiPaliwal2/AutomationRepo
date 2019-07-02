package functions;

public class Overloading 
{

	public static void main(String[] args) 
	{
		
       System.out.println(sum(40,50));
       sum(10,20,30);
       sum(40,60);

	}
	
	public static int sum(int a, int b)
	{
		return a+b;
	}

	public static int sum(int a, int b, int c)
	{
	 int d = a+b+c;
	 return d;
	}
}
