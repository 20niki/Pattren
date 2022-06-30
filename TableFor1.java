import java.util.*;

class TableFor1
{
	public static void main(String[] args)
	{
		for(int i=1; i<=10; i++)
		{
			System.out.print("\t\t\t");
				for(int j=1; j<=5; j++)
				{
					System.out.print(i*j+" ");
				}
			System.out.println();	
		}
	}
} 