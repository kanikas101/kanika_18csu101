import java.util.*;
class program3
{
	public static void main(String args[])
	{
	int arr1[]=new int[5];
	int arr2[]=new int[5];
	int term,i,j,m=0;
	boolean check=false;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter 5 values between 10 and 100: ");
	for(i=0;i<5;i++)
	{
    term=scan.nextInt();
    if(term>=10&&term<=100)
    {
    arr1[i]=term;
    System.out.println("Element added!!");
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
    else
    {
    System.out.println("ERROR!! ENTER NUMBER B/W 10 AND 100 ");
    i--;
    }
	}
	System.out.println("NON DUPLICATE VALUES ARE: ");
	for(i=0;i<m;i++)
		System.out.print(arr2[i]+" ");
	if(m==5)
		System.out.print("\nWORST CASE!!");
	}
}