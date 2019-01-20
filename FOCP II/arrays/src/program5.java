import java.util.*;
class program5
{
	public static void main(String args[])
    {
    int arr1[]=new int[100];
    int arr2[]=new int[100];
    int arr3[]=new int[200];
    int size1,size2,i,j,k;
    Scanner scan=new Scanner(System.in);
    System.out.println("enter size of array 1: ");
    size1=scan.nextInt();
    System.out.println("enter sorted array of size in ascending order");
    for(i=0;i<size1;i++)
    {
    arr1[i]=scan.nextInt();
    }
    System.out.println("enter size of array 2: ");
    size2=scan.nextInt();
    System.out.println("enter sorted array in ascending order");
    for(i=0;i<size2;i++)
    {
    arr2[i]=scan.nextInt();
    }
    i=j=k=0;
    while(i<size1&&j<size2)
    {
    if(arr1[i]>arr2[j])
    {
     arr3[k]=arr2[j];
     j++;
     k++;
    }
    else if(arr1[i]<arr2[j])
    {
    arr3[k]=arr1[i];
    i++;
    k++;
    }
    else
    {
    arr3[k]=arr1[i];
    i++;
    j++;
    k++;
    }
    }
    while(i<size1)
    {
    arr3[k]=arr1[i];
    i++;
    k++;
    }
    while(j<size2)
    {
    arr3[k]=arr2[j];
    j++;
    k++;
    }
    System.out.println("sorted merged array is: ");
    for(i=0;i<k;i++)
    	System.out.println(" "+arr3[i]);
    }
}