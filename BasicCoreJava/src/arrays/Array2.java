package arrays;

public class Array2 
{

	public static void main(String[] args) 
	{
	  int[] rollnum=new int[4];
	  
	  rollnum[0]=101;
	  rollnum[1]=102;
	  rollnum[2]=103;
	  rollnum[3]=104;
	  
	  for(int i=0; i<=3; i++)
	  {
		  System.out.println(rollnum[i]);
	  }
	

	int length =rollnum.length;
	System.out.println(length);
	
	for(int i=0; i<rollnum.length; i++)
	  {
		  System.out.println(rollnum[i]);
	  }
	
	}
}
