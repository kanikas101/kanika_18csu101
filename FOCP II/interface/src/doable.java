public interface doable
{
 	public static final String NAME="kanika";
 	public void doThis();
 	public int doThat();
 	public void doThis2(float value,char ch);
 	public boolean doTheOther(int num);
}
public class Something implements doable 
{
	public void doThis()
	{
     System.out.println("hello");
	}
	public int doThat()
	{
		int i=1;
		return i;
	}
	public void doThis2()
	{
		System.out.println("hello 2");
	}
	public boolean doTheOther()
}