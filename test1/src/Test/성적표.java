package Test;

public class 성적표 {
	public static void main(String[] args) {

		String name[] = {"홍길동", "김길동", "이길동"};	// 이름 배열 생성
		int kor[] = {81, 77, 71};	// 국어 배열 생성
		int eng[] = {76, 65, 76};	// 영어 배열 생성
		int mat[] = {82, 71, 90};	// 수학 배열 생성
		
		int korsum=0;	//국어 합계
		int engsum=0;	//영어 합계
		int matsum=0;	//수학 합계
		float sum_sum=0;	//합계의 합계
		
		System.out.print("이름" + "  " + "국어" + "  " + "영어" + "  " + "수학" + "  " + "총점" + "  " + "평균" + '\n');	// 첫줄 출력
		
		for (int a=0; a<25; a++)	// 상단 장선
			{
				System.out.print("-");
			}
			
				System.out.print('\n');	// 다음 줄 이동
			
		for (int m=0; m<name.length; m++)	// 이름 출력
			{
				korsum += kor[m];
				engsum += eng[m];
				matsum += mat[m];
				sum_sum=korsum+engsum+matsum;
					
				int q = kor[m] + eng[m] + mat[m];
				float v = q/3f;
					
				System.out.print(name[m] + " " + kor[m] + "  " + eng[m] + "  " + mat[m] + "  " + q + "  " + String.format("%.2f",v));	// 이름 및 합계 출력
				System.out.print('\n');
			}
			
		for (int b=0; b<25; b++)	// 하단 장선
			{
				System.out.print("-");
			}	
		
				System.out.print('\n');	// 다음 줄 이동
				System.out.print("합계" + "  " + korsum + " " + engsum + " " + matsum + " " + String.format("%.0f",sum_sum) + "  " + String.format("%.2f",sum_sum/3));		
	}	// main 닫기
}	// class 닫기