package JavaProgramming;

public class TEST8 {
	public static void main(String[] args) {
		
		String name[] = {"홍길동", "김길동", "이길동"};
		int kor[] = {81, 77, 71};
		int eng[] = {76, 65, 76};
		int mat[] = {82, 71, 90};
		
		int sum1=0;	//국어 합계
		int sum2=0;	//영어 합계
		int sum3=0;	//수학 합계
		float sum_sum=0;	//합계의 합계
		
		
		
		System.out.print("이름" + "  " + "국어" + "  " + "영어" + "  " + "수학" + "  " + "총점" + "  " + "평균" + '\n');
		
		for (int a=0; a<25; a++)	// 상단 장선
			{
			System.out.print("-");
			}
			
				System.out.print('\n');	// 다음 줄 이동
			
			
		for (int m=0; m<name.length; m++)	// 이름 출력
			{
			System.out.print(name[m] + " ");
			
			int q = kor[m] + eng[m] + mat[m];
			float v = q/3f;
				{		
				
				for (int k=2; k<name.length; k++)	// 국어 점수 출력
					System.out.print(kor[m]);
					sum1 += kor[m];
				for (int e=2; e<name.length; e++)	// 영어 점수 출력
					System.out.print("  " + eng[m]);
					sum2 += eng[m];
				for (int t=2; t<name.length; t++)	// 수학 점수 출력
					System.out.print("  " + mat[m] + "  ");
					sum3 += mat[m];
					
					sum_sum=sum1+sum2+sum3;
					System.out.print(q + "  " + String.format("%.2f",v));	// 합계 및 출력
					System.out.print('\n');
				
				}
				
			}
		for (int b=0; b<25; b++)	// 하단 장선
		{
		System.out.print("-");
		
			}	
				System.out.print('\n');	// 다음 줄 이동
				System.out.print("합계" + " " + sum1 + " " + sum2 + " " + sum3 + "  " + sum_sum + " " + String.format("%.2f",sum_sum/3));
			
		
	}
}
