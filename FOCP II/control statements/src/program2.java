  import java.util.*;
class program2
{
public static void main(String args[])
{
	int num;
	char ch='y';
	Scanner scan=new Scanner(System.in);
while(ch=='y')
{
	System.out.println("enter number between 1 and 12 : ");
    num=scan.nextInt();
    switch(num)
    {
    case 1:System.out.println("January");
           break;
    case 2:System.out.println("February");
           break;
    case 3:System.out.println("March");
           break;
    case 4:System.out.println("April");
           break;
    case 5:System.out.println("May");
           break;
    case 6:System.out.println("June");
           break;
    case 7:System.out.println("July");
           break;
    case 8:System.out.println("August");
           break;
    case 9:System.out.println("September");
           break;
    case 10:System.out.println("October");
           break;
    case 11:System.out.println("November");
           break;
    case 12:System.out.println("December");
           break;
    default:System.out.println("ERROR:INVALID CHOICE! ENTER NUMBER BETWEEN 1 AND 12");
    }
    System.out.println("Do you wish to continue? (enter y for YES) ");
    ch=scan.next().charAt(0);
    }
}
}