import java.util.*;
class index
{
    public static void main(String args[])
    {
	int arr[]=new int[10];
	int search,x;
	int index=-1;
	Scanner scan=new Scanner(System.in);
    for(x=0;x<10;x++)
    {
    System.out.println("enter value:");
    arr[x]=scan.nextInt();
    }
    System.out.println("enter the element you want to search: ");
    search=scan.nextInt();
	System.out.println("the entered array is: ");
	for(x=0;x<10;x++)
	{  
	System.out.println("arr "+arr[x]);
	if(arr[x]==search)
        {
        index=x;
        }
	}
    System.out.println("index "+index);
	}
}