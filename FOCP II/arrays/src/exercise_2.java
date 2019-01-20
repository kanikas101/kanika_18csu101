import java.util.*;
class exercise_2
{
	public static int i;
	public static void display(int arr[])
	{
    System.out.println("elements of the array are: ");
    for(i=0;i<5;i++)
    System.out.print(arr[i]+ " ");
	}
	public static void sum(int arr[])
	{
	int Sum=0;
	for(i=0;i<5;i++)
	Sum=Sum+arr[i];
	System.out.println("\nsum of all elements = "+Sum);
	}
	public static int largest(int arr[])
	{
	int large=arr[0];;
	for(i=1;i<5;i++)
	if(arr[i]>large)
	large=arr[i];
	System.out.println("largest element = "+large);
	return large;
	}
	public static void seclargest(int arr[],int large)
	{
	int sec=0;;
	for(i=1;i<5;i++)
	if(arr[i]<large&&arr[i]>sec)
	sec=arr[i];
	System.out.println("second largest element = "+sec);
	}
	public static void smallest(int arr[])
	{
	int small=arr[0];
	for(i=1;i<5;i++)
	if(small>arr[i])
	small=arr[i];
	System.out.println("smallest element = "+small);
	}
	public static void altsum(int arr[])
	{
	int s=0;
	for(i=0;i<5;i=i+2)
	s=s+arr[i];
	System.out.println("Sum of alternate elements = "+s);
	}
	public static void even(int arr[])
	{
	int count=0;
	for(i=0;i<5;i++)
	if(arr[i]%2==0)
	count++;
	System.out.println("number of even elements= "+count);
	}
	public static void occurence(int arr[],int element)
	{
	int occur=0;
	for(i=0;i<5;i++)
	if(arr[i]==element)
	occur++;
	System.out.println("element "+element+" occurs "+occur+" times");
	}
	public static void main(String args[])
	{
	int arr[]=new int[5];
	int large,element;
	Scanner scan=new Scanner(System.in);
	for(i=0;i<5;i++)
	{
	System.out.print("enter element "+ (i+1)+": ");
	arr[i]=scan.nextInt();
	}
	display(arr);
    sum(arr);
    large=largest(arr);
    seclargest(arr,large);
    smallest(arr);
    altsum(arr);
    even(arr);
    System.out.print("enter element to find it's occurence: ");
    element=scan.nextInt();
    occurence(arr,element);
	}
}