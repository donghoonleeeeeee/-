package JavaProgramming;

import java.util.Scanner;

class Rectangle {
	int width;
	int height;
	public int getArea() {
		return width*height;
	}	
}

public class RectAppP185{
	public static void main(String[] args) {
		Rectangle rect = new Rectangle();	//갹체 생성
		Scanner scanner = new Scanner(System.in);
		System.out.print(">> ");
		rect.width = scanner.nextInt();
		rect.height = scanner.nextInt();
		System.out.println("사각형의 면적은 " + rect.getArea());
		scanner.close();
	}
}