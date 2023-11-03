package Test;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class 성적표입출력 {
	public static void main(String[] args) {
		try {
			File file = new File("D:\\test\\javaprint.txt");
			if(!file.exists())
				{
					file.createNewFile();	
				}
			FileWriter fw = new FileWriter(file);
			BufferedWriter writer = new BufferedWriter(fw);
			
			Scanner scanner = new Scanner(System.in);
		
			System.out.print("학생 수를 입력하세요.");	// 학생 수 입력
			int count = scanner.nextInt();	// 학생 수 만큼 배열 생성
			String names[] = new String[count];	// 학생 수 만큼 이름 배열 생성
			int kor[] = new int[count];	// 학생 수 만큼 국어점수 배열 생성
			int eng[] = new int[count];	// 학생 수 만큼 영어점수 배열 생성
			int mat[] = new int[count];	// 학생 숫 만큼 수학점수 배열 생성
		
			System.out.print("(이름, 국어, 영어, 수학)성적을 입력하세요.:\n");
			for (int i=0; i<names.length; i++)
			{
				names[i]=scanner.next(); // 학생 수 만큼 입력된 이름을 배열에 저장
				kor[i]=scanner.nextInt(); // 학생 수 만큼 입력된 국어를 배열에 저장
				eng[i]=scanner.nextInt();
				mat[i]=scanner.nextInt();
			}
		
			int korsum=0;	//국어 합계
			int engsum=0;	//영어 합계
			int matsum=0;	//수학 합계
			float sum_sum=0;	//합계의 합계
		
			writer.write("이름" + "  " + "국어" + "  " + "영어" + "  " + "수학" + "  " + "총점" + "  " + "평균" + '\n');
		
			for (int a=0; a<25; a++)	// 상단 장선
			{
				writer.write("-");
			}
			
			writer.write('\n');	// 다음 줄 이동
			
			for (int m=0; m<names.length; m++)	// 이름 출력
			{
				korsum += kor[m];
				engsum += eng[m];
				matsum += mat[m];
					
				int q = kor[m] + eng[m] + mat[m];
				float v = q/3f;
				sum_sum=korsum+engsum+matsum;
				
				writer.write(names[m] + " " + kor[m] + " " + eng[m] + " " + mat[m] + " " + q + "  " + String.format("%.2f",v));	// 합계 및 출력
				writer.write('\n');
			}
			
			for (int b=0; b<25; b++)	// 하단 장선
			{
				writer.write("-");
			}	
		
			writer.write('\n');	// 다음 줄 이동
			writer.write("합계" + " " + korsum + " " + engsum + " " + matsum + "  " + sum_sum + " " + String.format("%.2f",sum_sum/3));
			
			scanner.close();
			writer.close();
		}catch(IOException e)
		{
			e.printStackTrace();
		}	//catch 닫기
	}	// main 닫기
}	// class 닫기
