class DistanceDemo
{
	public static void main(String args[])
	{
	Distance d1=new Distance();
	Distance d2=new Distance(5,10);
	double distance=d1.calculateDistance(d1,d2);
	System.out.println("Distance is "+distance);
	}
}