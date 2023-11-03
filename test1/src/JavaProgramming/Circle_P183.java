package JavaProgramming;

public class Circle_P183{
	int radius;
	String name;
	
	public Circle_P183() {}
	public double getArea() {
		return 3.14*radius*radius;
	}
	

	public static void main (String[] args) {
		Circle_P183 pizza;	// Circle 객체에 대한 레퍼런스 변수 pizza 선언
		pizza = new Circle_P183();
		pizza.radius = 10;
		pizza.name = "자바피자";
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은" + area);
		
		Circle_P183 donut = new Circle_P183();
		donut.radius = 2;
		donut.name = "자바도넛";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);
		
	} //main 닫기
}	// class 닫기
