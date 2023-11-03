package Test;

public class 별오른쪽 {
	public static void main(String[] args) {
		for (int a=0; a<5; a++) {
			
			for(int c=4; c>a; c--) 
			{ 
				System.out.print(" ");
			}
			
			for (int b=0; b<=a; b++)
			{
				System.out.print("★");	
			}
				
			System.out.print('\n');
		}	
	}
}

