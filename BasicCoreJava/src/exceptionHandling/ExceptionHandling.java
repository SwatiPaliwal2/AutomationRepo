package exceptionHandling;

public class ExceptionHandling 
{

	public static void main(String[] args) 
	{
		int a=0;
		int b=20;
		
		try
		{
			System.out.println(b/a);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Fail: "+e.getMessage());
		}
		
		System.out.println("anand");
		
		/*
		 * for(int i=0; i<10; i++) { System.out.println(i); if(i==5) { break; } }
		 */
		
	}

}
