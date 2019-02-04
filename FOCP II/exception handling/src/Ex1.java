public class Ex1 
{
private static Integer i = null;	
public static void main(String[] args) 
{
try 
{
System.out.println(i.toString());
} 
catch(NullPointerException e) 
{
System.err.println("Caught ");
e.printStackTrace();
} 
try 
{
i = 10;
System.out.println(i.toString());
} 
catch(NullPointerException e) 
{
System.err.println("Caught ");
e.printStackTrace();
} 
finally 
{
System.out.println("finally");
}
}	
}
