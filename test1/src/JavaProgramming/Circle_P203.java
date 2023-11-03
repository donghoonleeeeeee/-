package JavaProgramming;

class Circle 
{
	int radius;
	public Circle(int radius)
	{
		this.radius = radius;
	}
	
	public double getArea()
	{
		return 3.14*radius*radius;
	}
}

public class Circle_P203
{
	public static void main(String[] args)
	{
		Circle c [];	//Circle 배열에 대한 레퍼런스 c선언
		c = new Circle[5];
	
		for(int i=0; i<c.length; i++)
			c[i] = new Circle(i);
		
		for(int i=0; i<c.length; i++)
			System.out.print((int)(c[i].getArea()) + " ");
	}
}