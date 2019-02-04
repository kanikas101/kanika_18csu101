public class Ex 
{
public static void k() throws Exception 
{
System.out.println("Throwing from k()");
throw new Exception1("From k()");
}
public static void main(String[] args)
{
try
{
k();
} 
catch(Exception k) 
{
System.err.println("Caught Exception1");
k.printStackTrace();
}
 finally 
 {
System.out.println("Made it to finally");
}
}	
}