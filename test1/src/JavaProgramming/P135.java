package JavaProgramming;
import java.util.Scanner;

public class P135 {
	public static void main(String[] args) {
		int intArray[] = new int[5];
		int sum=0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print(intArray.length + "개의 정수를 입력하세요>> ");
		for(int i=0; i<intArray.length; i++)
			intArray[i] = scanner.nextInt();// 키보드에서 입력받은 점수 저장
		
		for(int i=0; i<intArray.length; i++)
			sum += intArray[i];	// 배열에 저장된 점수 값 더하기;
		
		System.out.print("평균은 " + (double)sum/intArray.length);
		scanner.close();
	}
}
