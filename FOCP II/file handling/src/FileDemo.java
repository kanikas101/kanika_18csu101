import java.io.*;
import java.util.*;
public class FileDemo
{
	public static void main(String args[])
	{
	File f=null;
	try
	{
	f=new File("kanika.txt");
	FileWriter fout=new FileWriter(f);
	BufferedWriter bout=new BufferedWriter(fout);
	Scanner sc=new Scanner(System.in);
	System.out.print("enter a string: ");
	while(sc.hasNext())
	{
	bout.write(sc.nextLine());
	bout.newLine();
    }
    bout.close();
    }
	catch(Exception e)
	{
	e.printStackTrace();
	}
	}
}