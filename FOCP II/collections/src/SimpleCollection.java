public class SimpleCollection
{
	public static void main(String args[])
	{
	Collection c;
	c=new ArrayList();
	Syste.out.print(c.getClass().getName());
	for(int i=1;i<=10;i++)
	{
	c.add(i+"*"+i+"="+i*1);
	}
	Iterator iter=c.iterator();
	while(iter.hasNext())
	System.out.println(iter.next());
	}
}