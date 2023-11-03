package JavaProgramming;

public class Circle_P187 {
	int radius;
	String name;
	
	public Circle_P187() 
	{	// 매개 변수 없는 생성자
		radius = 1; name = "";	// 필드 초기화
	}
	
	public Circle_P187(int r, String n) // 매개 변수를 가진 생성자
	{	
		radius = r; name = n;	// 매개 변수로 필드 초기화
	}
	
	public double getArea() 
	{
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		Circle_P187 pizza = new Circle_P187(10, "자바피자");	//객체 생성. 반지름을 10으로, 이름을 "자바피자"로 초기화
		
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);
		
		Circle_P187 donut = new Circle_P187();	// 객체 생성. 반지름을 1, 이름을 ""로 초기화
		donut.name = "도넛피자";	// 이름 변경
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);
	}
}
