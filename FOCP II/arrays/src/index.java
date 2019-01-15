import java.util.*;
class index
{
    public static void main(String args[])
    {
	int arr[]=new int[10];
	int search;
	int index=-1;
	Scanner scan=new Scanner(System.in);
    for(int x:arr)
    {
    System.out.println("enter value:");
    arr[x]=scan.nextInt();
    }
    System.out.println("enter the element you want to search: ");
    search=scan.nextInt();
	System.out.println("the entered array is: ");
	for(int j:arr)
	{  
	System.out.println("arr "+arr[j]);
	if(arr[j]==search)
        {
        index=j;
        }
	}
    System.out.println("index "+index);
	}
}