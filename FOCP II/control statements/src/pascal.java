import java.util.*;
class pascal
{
	public static void main(String args[])
	{
	int no_row,c=1,i,j;
	Scanner scan=new Scanner(System.in);
	System.out.println("enter number of rows: ");
	no_row=scan.nextInt();
	for(i=0;i<no_row;i++)
	{
	for(int blk=1;blk<=no_row-i;blk++)
	System.out.print(" ");
	for(j=0;j<=i;j++)
	{
	if(j==0||i==0)
	c=1;
	else
	c=c*(i-j+1)/j;
	System.out.print(" "+c);
	}
	System.out.print("\n");
	}
	}
}