package JavaProgramming;

public class 별그래프세로 {
	public static void main(String[] args) {
		int a[] = {4, 1, 3, 2, 5};
		int k = 5;
		
		for(int b=0; b<a.length; b++)
		{
			for (int c=0; c<a.length; c++)
			{
				if (a[c]>=k)
					System.out.print("*");
				else 
					System.out.print(" ");
			}
					System.out.print('\n');
					k=k-1;
		}
		for (int q=0; q<a.length; q++)
		{
			System.out.print(a[q]);
		}
	}
}
