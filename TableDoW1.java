import java.util.*;

class TableDoW1
{
	public static void main(String[] args)
	{
		int i=1;
		do
		{
			System.out.println("\t\t\t");
				int j=1;
				do
				{
					System.out.print(i*j+" ");
					j++;
				}while(j<=5);
			System.out.println();	
			i++;
		}while(i<=10);
	}
}
 