class ex6_program7
{
	public static void main(String args[])
	{
	char ch='A';
	for(int i=0;i<5;i++)
    {
    ch='A';
    for(int j=0;j<=i;j++)
    {
    System.out.print(ch);
    ch++;
    }
    for(int k=i;k>=0;k--)
    {
    ch--;
    System.out.print(ch);
    }
    System.out.print("\n");
	}
    }
}