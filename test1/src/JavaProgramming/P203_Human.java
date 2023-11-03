package JavaProgramming;

class Human
{
	// String 타입의 name, int 타입의 age, double 타입의 height, weight 등 네 개의 필드를 갖는 Human클래스를 작성하라.
	public String name;	
	public int age;	//	
	public double height, weight;	
	 
	 public Human(String name)
	 	{
		 this.name = name;
	 	}
}

public class P203_Human
{
	public static void main(String[] args)	// main 메소드 추가
	{
		
		Human aHuman = new Human(null);
		aHuman.name = "홍길동";
		aHuman.age = 21;
		aHuman.height = 180.5;
		aHuman.weight = 73.2;
		
		System.out.print(aHuman.name + " " + aHuman.age + aHuman.height + aHuman.weight);
	}
}