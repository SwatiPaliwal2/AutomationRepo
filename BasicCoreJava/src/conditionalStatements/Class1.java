package conditionalStatements;
// If else statements
public class Class1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		int c=30;
		if(b>a)
		{
			System.out.println("b is greater than a");
		}	
		else 
		{
			System.out.println("a is greater than b");
		}	
	
		
		//And Operator
		//to find greatest of a,b,c
	
		
		if(a>b && a>c)
		{
			System.out.println("a is greatest");
		}	else if(b>a && b>c)
			{
				System.out.println("bis greatest");
			}
			else
			{
				System.out.println("c is greatest");
			}
			
		//OR Operator
		
		int age=30;
		
		if(age>60 || age<8)
		{
			System.out.println("eligible for benefit");
		}
		else
		{
			System.out.println("not eligible for benefit");
			
		}
		}
				
	}
	
		


