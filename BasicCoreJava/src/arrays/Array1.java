package arrays;

import org.apache.xpath.operations.String;

public class Array1 
{

	public static void main(String[] args) 
	{
		String name="Swati";
		System.out.println(name);
		
		String name2="Anand";
		System.out.println(name2);
		
		
		//For(int i=0; i<=6; i++)
		//{
		
		 String[] stdnt=new String[6]; 
		 stdnt[0]="Swati"; 
		 stdnt[1]="Vinaya";
		 stdnt[2]="Kalyani"; 
		 stdnt[3]="Surajit"; 
		 stdnt[4]="Arif"; 
		 stdnt[5]="Ajashra";
		
		// without for loop
		
		  System.out.println(stdnt[0]); System.out.println(stdnt[1]);
		  System.out.println(stdnt[2]); System.out.println(stdnt[3]);
		  System.out.println(stdnt[4]); System.out.println(stdnt[5]);
		 
		// with for loop
		for(int n=0; n<6; n++)
			System.out.println(stdnt[n]);
	
	}

}
