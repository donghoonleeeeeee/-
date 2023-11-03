package Students;
import java.util.Scanner;

class Choice  // 선택 클래스 생성
{
	String Push; // 입력
	String Delete;  // 삭제
	String Print;  // 출력
	String Exit;  // 종료

		public void setChoice(String Push, String Delete, String Print, String Exit) 
		{
			this.Push = Push; // 입력
			this.Delete = Delete;
			this.Print = Print;
			this.Exit = Exit;
		}


		public String getPush() // 입력
		{
			return this.Push;
		}
	
		public String getDelete() // 삭제
		{
			return this.Delete;
		}
		
		public String getPrint()  // 출력
		{
			return this.Print;
		}
		
		public String getExit()  // 종료
		{
			return this.Exit;
		}
	
}	// Choice 클래스 닫기









class Push	// 입력 클래스 생성
{
	String name;
	int kor;
	int eng;
	int mat;

		public void setPush(String name, int kor, int eng, int mat)
		{
			this.name = name; // 입력
			this.kor = kor;
			this.eng = eng;
			this.eng = eng;
		}
		
		public String getname()
		{
			return this.name;
		}
		public int getkor()
		{
			return this.kor;
		}
		public int geteng()
		{
			return this.eng;
		}
		public int getmat()
		{
			return this.mat;
		}
	
	
	public void screen()	// 화면출력
	{
		Push push = new Push();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("학생성적관리(홍길동)");
		System.out.println("1학생정보입력, 2학생정보삭제, 3성적표출력, 4프로그램종료 중 하나를 선택하세요.");
		String Choice = scanner.next();
		
		
		if(Choice.equals("학생정보입력"))
			push.text();
		
		else if(Choice.equals("학생정보삭제"))
			System.out.print("삭제");
		
		else if(Choice.equals("성적표출력"))
			System.out.print("성적표출력");
		
		else if(Choice.equals("프로그램종료"))
			{
			System.out.print("프로그램을 종료합니다.");
			System.exit(0);}
		else
			System.out.print("다시 입력하세요.");
			screen();
	}
	
	
	public void text()
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("학생 수를 입력하세요.");
		int count = scanner.nextInt();
		String name[] = new String[count];
		int kor[] = new int[count];
		int eng[] = new int[count];
		int mat[] = new int[count];
		
		System.out.println("이름, 국어, 영어, 수학성적을 입력하세요.");
		for (int i=0; i<name.length; i++)
		{
			name[i]=scanner.next(); // 학생 수 만큼 입력된 이름을 배열에 저장
			kor[i]=scanner.nextInt(); // 학생 수 만큼 입력된 국어를 배열에 저장
			eng[i]=scanner.nextInt();
			mat[i]=scanner.nextInt();
		}
		
		
		System.out.print("저장되었습니다." + '\n' + "처음 화면으로 돌아갑니다.");
		screen();
		
	}
	
}

public class Menu
{
	public static void main(String[] args)
	{
		Push s1 = new Push();
		s1.screen();
		
	}
}
	