package exceptionHandling;

public class Testing2 
{

	public static void main(String[] args) 
	{
		System.out.println("Anand");
		
		
		System.out.println("Bhayre");
		
		Testing.sum(10,20);
		try 
		{
			Testing.sum(10,20,30);
		} 
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
