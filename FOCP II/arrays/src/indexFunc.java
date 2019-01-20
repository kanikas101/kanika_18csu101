import java.util.*;
class indexFunc
{
public static int findIndex(int arr[],int search)
{
	int i=0;
	while(i<10)
	{
	if(arr[i]==search)
	{
		return i;
	}
	else
    {
    	i++;
	}
    }
    return -1;
}	

public static void main(String args[])
{
	int index,search,j;
	int arr[]=new int[10];
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter array: ");
	for(j=0;j<10;j++)
	{
	arr[j]=scan.nextInt();
	}
	System.out.print("enter element :");
	search=scan.nextInt();
	index=findIndex(arr,search);
	System.out.println("index = "+index);
}
}