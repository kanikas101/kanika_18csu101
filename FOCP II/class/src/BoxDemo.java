class Box
{
	double width;
	double height;
	double depth;
	void setDim()
	{
	depth= 10;
	height=20;
	depth=20;
	}
	Box(double w,double h,double d)
	{
		this.width=w;
		this.height=h;
		this.depth=d;
	}
	Box()
	{
     this.width=0;
     this.height=0;
     this.depth=0;
	}

	double volume()
	{
	double volume=width*height*depth;
	return volume;
	}
}
class BoxDemo
{
	public static void main(String args[])
	{
Box myBox=new Box(2,3,4);
double Vol=myBox.volume();
System.out.println("volume using constructor = "+Vol);
Box myBox1= new Box();
myBox1.setDim();
double volume=myBox1.volume();
System.out.println("volume= "+volume);
}
}