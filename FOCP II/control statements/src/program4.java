import java.util.*;
class program4
{
	public static void main(String args[])
	{
	int num;
	char ch='y';
	Scanner scan=new Scanner(System.in);
	while(ch!='n')
	{
	System.out.println("enter a 5 digit number: ");
    num=scan.nextInt();
    if(num>=10000&&num<=99999)
    {
      System.out.print("   "+(num/10000));
      System.out.print("   "+((num/1000)%10));
      System.out.print("   "+((num/100)%10));
      System.out.print("   "+((num/10)%10));
      System.out.println("   "+(num%10));	
    }
    else
    {
      System.out.println("not a 5 digit number!!! ");
    }
    System.out.println("Do you wish to continue? (enter 'n' to exit)");
    ch=scan.next().charAt(0);
	}
    }
}