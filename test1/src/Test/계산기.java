package Test;
import java.text.DecimalFormat;
import java.util.Scanner;

public class 계산기 {
	public static int sum(int a, int b) // 덧셈 함수 생성
	{	
		int sum;
		sum = a+b;
		
		return sum;
	}
	public static int min(int a, int b) // 뺄셈 함수 생성
	{	
		int min;
		min = a-b;
		
		return min;
	}
	public static int avg(int a, int b) // 나눗셈 몫 함수 생성
	{	
		int avg;
		avg = (a+b)/2;
		
		return avg;
	}
	
	public static int aavg(int a, int b) // 나눗셈 나머지 함수 생성
	{	
		int aavg;
		aavg = (a+b)%2;
		
		return aavg;
	}
	
	 public static int pro(int a, int b) // 곱셈 함수 생성
	 {	
		int pro;
		pro = a*b;
		
		return pro;
	}
	
	 public static String make(int num)	// 천단위 콤마 생성
	 {
		 DecimalFormat mkComma = new DecimalFormat("#,###");
		 String make = (String)mkComma.format(num);
		 
		 return make;
	 }
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {

			System.out.print("두개의 숫자를 입력하세요" + '\n');
				int score1 = scanner.nextInt();
				int score2 = scanner.nextInt();
			
			
			System.out.print("연산자를 입력하세요(+, -, /, *, %)");
				char list = scanner.next().charAt(0);
		
			if(list == '+') {
				System.out.print(make(score1)+ " " + "+" + " " + make(score2) + " " + "=" + " " + make(sum(score1, score2)));
			}
			else if(list == '-') {
				System.out.print(make(score1)+ " " + "-" + " " + make(score2) + " " + "=" + " " + make(min(score1, score2)));
			}
			else if(list == '/') {
				System.out.print(make(score1)+ " " + "/" + " " + make(score2) + " " + "=" + " " + make(avg(score1, score2)));
			}
			else if(list == '*') {
				System.out.print(make(score1)+ " " + "*" + " " + make(score2) + " " + "=" + " " + make(pro(score1, score2)));
			}
			else if(list == '%') {
				System.out.print(make(score1)+ " " + "%" + " " + make(score2) + " " + "=" + " " + make(aavg(score1, score2)));
			}
			else {
				System.out.print("다시 입력하세요");
			}
			System.out.print('\n');
			
			System.out.print("계속 하시겠습니까? (y/n)");
				char exit = scanner.next().charAt(0);
					
					if (exit == 'n') // 브레이크
					{
						break;
					}
		} // 반복문 종료
		scanner.close();	// 스캐너 종료
	}	// main 종료
}	// 클래스 종료
