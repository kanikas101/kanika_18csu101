import java.util.*;
class program1
{
	public static void main(String args[])
	{
     System.out.println("enter operand 1: ");
     Scanner scan=new Scanner(System.in);
     int a=scan.nextInt();
     System.out.println("enter operand 2: ");
     int b=scan.nextInt();
     int prod=a*b;
     int sum=a+b;
     int diff=a-b;
     int mod=a%b;
     System.out.println("sum= "+sum);
     System.out.println("difference= "+diff);
     System.out.println("product= "+prod);
     System.out.println("modulus= "+mod);
	}
}