import java.util.*;
import java.lang.Math;
class program2
{
	public static void main(String args[])
	{
	int a,b,c,d,root1,root2;
	Scanner scan=new Scanner(System.in);
	System.out.println("given equation ax^2+bx+c ");
	System.out.print("enter a: ");
	a=scan.nextInt();
	System.out.print("enter b: ");
	b=scan.nextInt();
	System.out.print("enter c: ");
	c=scan.nextInt();
	d=b*b-4*a*c;
	if(d>0)
	{
	System.out.println("Roots are real and unequal");
    root1 = (-b + Math.sqrt(d));
    root2 = (-b - Math.sqrt(d))/(2*a);
    System.out.println("root 1= "+root1);
    System.out.println("root 2= "+root2);
	}
	else if(d==0)
	{
	System.out.println("Roots are real and equal");
	root1=(-b + Math.sqrt(d)) / (2*a);
	System.out.println("root = "+root1);
	}
	else
	System.out.println("Roots are imaginary");
	}
}