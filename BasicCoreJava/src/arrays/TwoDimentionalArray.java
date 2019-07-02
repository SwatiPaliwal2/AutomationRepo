package arrays;

public class TwoDimentionalArray
{

	public static void main(String[] args)
	{
		String[][] arr=new String[3][2];
		
		//Row 1
		arr[0][0]="Name";
		arr[0][1]="Surname";
		
		//Row 1
		arr[1][0]="Name1";
		arr[1][1]="Surname1";
		
		//Row 1
		arr[2][0]="Swati";
		arr[2][1]="Paliwal";
		
		for(int r=0; r<=2; r++)
		{
			for(int c=0; c<=1; c++)
			{
				System.out.print(arr[r][c]+" ");
			}
			System.out.println();
		}
				
	}

}
