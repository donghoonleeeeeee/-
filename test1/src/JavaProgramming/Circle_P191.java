package JavaProgramming;

public class Circle_P191 {
	int radius;
	
	void set(int r) 
	{
		radius = r;
	}
	
	double getArea() 
	{ 
		return 3.14*radius*radius;
	}
	
	public Circle_P191(int r)
	{
		radius = r;
	}
	
	public static void main(String[] args)
	{
		Circle_P191 pizza = new Circle_P191(10);
		System.out.println(pizza.getArea());
		
		Circle_P191 donut = new Circle_P191(5);
		System.out.println(donut.getArea());
	}
}
