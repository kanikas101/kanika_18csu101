import java.util.*;
class program4
{
public static int duplicate(int arr1[])
{
boolean check=false;
int m=0;
int i,j;
int arr2[]=new int[5];
for(i=0;i<5;i++)
{
 for(j=0;j<=i-1;j++)
    {
    if(arr1[j]==arr1[i])
    {
    check=true;
    break;
    }
    else
    check=false;
    }
    if(check==false)
    {
    arr2[m]=arr1[i];
    m++;
    }
}	
System.out.println("NON DUPLICATE ELEMENTS ARE: ");
for(i=0;i<m;i++)
System.out.print(arr2[i]+" ");
return m;
}	
public static void main(String args[])
{
	int arr1[]=new int[5];
	int i,term,m;
	Scanner scan=new Scanner(System.in);
	for(i=0;i<5;i++)
	{
	System.out.println("Enter element: ");
    term=scan.nextInt();
    if(term>=10&&term<=100)
    {
    arr1[i]=term;
    System.out.println("Element added!!");
    }
    else
    {
    System.out.println("ERROR!! ENTER NUMBER B/W 10 AND 100 ");
    i--;
    }
	}
	m=duplicate(arr1);
	if(m==5)
	System.out.println("\nWORST CASE!!");
    }
}
	
