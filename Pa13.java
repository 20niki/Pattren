class Pa13
{
	public static void main(String[]args)
	{
	int i,j,k;
	for (i = 65; i <= 70; i++)
        {
            
            for (j = 70; j > i; j--)
            {
                System.out.print(" ");
            }
            for (k = 65; k <= i; k++)
            {
                System.out.print((char)k + " ");
            }
            System.out.println();
        }
	}
}