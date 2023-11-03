package Test;

public class 별피라미드 {
	public static void main(String[] args) {
		for (int a=0; a<5; a++) {
			for(int c=4; c>a; c--) 
			{ 
				System.out.print(" ");
			}
			
			for (int b=1; b<=a*2-1; b++)
			{
				System.out.print("★");	
			}
				
			System.out.print('\n');
		}	
	}
}

