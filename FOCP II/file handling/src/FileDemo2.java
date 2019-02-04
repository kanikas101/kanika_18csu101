import java.io.*;
class FileDemo2
{
	public static void main(String args[])
	{
		File f=null;
	try
	{
	f=new File("kanika.txt");
	FileReader fin=new FileReader(f);
	BufferedReader bin=new BufferedReader(fin);
	String sr;
	System.out.print("content of file: ");
	while((sr=bin.readLine())!=null)
	{
	System.out.println(sr);
	}
}
	catch(Exception e)
	{
	e.printStackTrace();
	}
	}
	}
