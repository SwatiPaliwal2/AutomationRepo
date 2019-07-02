package functions;

public class Test1 
{

	public static void main(String[] args) 
	{
		
		FunctionClass2.validAge(40); // Static functions can only call static functions and 
										//static variables.
		
		// To call the 
		
		NonStaticFunctions obj = new NonStaticFunctions();
		obj.sum(10, 20);
		System.out.println(obj.sum(10, 20));
	}

}
