import java.util.*;
class Date
{
	int date,month,year;
	Date()
	{
	this.date=1;
	this.month=1;
	this.year=2000;
	}
	Date(int d,int m,int y)
	{
	this.date=d;
	this.month=m;
	this.year=y;
	}
	void displayDate()
	{
	System.out.println(" Entered date is: "+date+"/"+month+"/"+year);
	}
}
class DateTest
{
	public static void main(String args[])
	{
    int d,m,y;
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter date: ");
    d=scan.nextInt();
    System.out.println("Enter month: ");
    m=scan.nextInt();
    System.out.println("Enter year: ");
    y=scan.nextInt();
	Date myDate=new Date(d,m,y);
	myDate.displayDate();
    }
}