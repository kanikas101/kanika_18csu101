import java.util.*;
class Circle
{
    double radius,a,c;
    Circle()
	{
	this.radius=1;
	}
	Circle(double r)
	{
	this.radius=r;
	}
	double area()
	{
	a=3.14*radius*radius;
	return a;
	}
	double circumference()
	{
	c=2*3.14*radius;
	return c;
	}
    void display()
    {
    System.out.println("Area = "+(area()));
    System.out.println("Circumference = "+(circumference()));
    }
 }
 class CircleTest
 {
    public static void main(String args[])
    {
    double r;
    Scanner scan=new Scanner(System.in);
    System.out.print("enter radius of circle: ");
    r=scan.nextDouble();
    Circle myCircle=new Circle(r);
    myCircle.display();
    }
}