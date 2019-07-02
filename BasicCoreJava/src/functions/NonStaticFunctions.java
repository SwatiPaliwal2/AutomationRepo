package functions;

public class NonStaticFunctions 
{

	public static void main(String[] args) 
	{
		NonStaticFunctions ref = new NonStaticFunctions();
		
        int a = ref.sum(10,30);
        System.out.println(a);
        
        System.out.println(ref.sum(50, 60));
        
	}

	public int sum(int a, int b)
	{
		return a+b;
	}



}
