package functions;

public class functionToAddValueReturnedByFunction 
{

	public static void main(String[] args) 
	{
		
		int d = sum(10,20,30);
		int e = sum(40,50,60);
		int f = d+e;
		System.out.println(f);
	}
		
	public static int sum(int a,int b,int c)
	{
		
		return a+b+c;
		
	}

}
