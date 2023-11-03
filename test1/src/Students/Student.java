package Students;

import java.util.Scanner;

class getsetSD {
	private String name;
	private int C;
	private int java;
	private int html;
	
	public void set(String name, int C, int java, int html)
	{
		this.name = name;
		this.C = C;
		this.java = java;
		this.html = html;
	}
	
	
	public String getname()
	{
		return this.name;
	}
	
	public int getC()
	{
		return this.C;
	}
	
	public int getjava()
	{
		return this.java;
	}
	
	public int gethtml()
	{
		return this.html;
	}
	
	private int sum()
	{
		int sum = (C+10) + (java+20) + (html+10);
		return sum;
	}
	
	private float avg()	
	{
		float avg = sum()/3;
		return avg;
	}
	
	public void print1()
	{
		
		System.out.print("이름:" + name + " " + "C:" + C + " " + "java:" + java + " " + "html:" + html + " " + "합계:" + sum() + " " + "평균:" + avg());
	}
	
	public void print2()
	{
		Scanner scanner = new Scanner(System.in);
		
			System.out.println("이름, C, java, html의 성적을 입력하세요.");
			
			name = scanner.next();
			C = scanner.nextInt();
			java = scanner.nextInt();
			html = scanner.nextInt();
			
			String str1 = "이름: " + this.name;
			String str2 = "C:" + this.C + " / " + "java:" + this.java + " / " + "html:" + this.html;
			String str3 = "충점:" + sum()+ " / " + "평균:" + String.format("%.2f",avg());
			
			System.out.println(str1);
			System.out.println(str2);
			System.out.println(str3);
			
			if (avg()==100)
				System.out.println("등급: A+");
			else if(avg()>=95)
				System.out.println("등급: A");
			else if(avg()>=90)
				System.out.println("등급: B+");
			else if(avg()>=85)
				System.out.println("등급: B");
			else if(avg()>=80)
				System.out.println("등급: C+");
			else if(avg()>=75)
				System.out.println("등급: C");
			else
				System.out.println("등급: F");
	}
	
	public void print3()
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("학생수를 입력하세요.");
			int count = scanner.nextInt();
			String name[] = new String[count];
			int C[] = new int[count];
			int java[] = new int[count];
			int html[] = new int[count];
		
		
		System.out.println("이름, C, java, html의 성적을 입력하세요.");
		
			for(int i=0; i<name.length; i++)
			{
			name[i] = scanner.next();
			C[i] = scanner.nextInt();
			java[i] = scanner.nextInt();
			html[i] = scanner.nextInt();
			}
		
		System.out.print("이름" + "  " + "C" + "  " + "java" + "  " + "html" + "  " + "총점" + "  " + "평균" + '\n');
		
			for (int a=0; a<25; a++)	// 상단 장선
			{
				System.out.print("-");
			}
			System.out.print('\n');
		
			for (int m=0; m<name.length; m++)	// 이름 및 성적 출력
			{
				name[m] = this.name;
				C[m] = this.C;
				java[m] = this.java;
				html[m] = this.html;
			}
		System.out.println(name + "  " + C + "   " + java + "    " + html);	// 합계 및 출력	
	}
}
