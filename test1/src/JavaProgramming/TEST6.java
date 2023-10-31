package JavaProgramming;

public class TEST6 {
	public static void main(String[] args) {
		int a[] = {4, 1, 3, 5, 2};
		int r = 5;
		
			for (int b=0; b<a.length; b++)
			{	
				for (int c=0; c<a.length; c++)
				{
					if(a[c]>=r)
						
					System.out.print("★");
					else
					System.out.print("  ");
				}	
					System.out.print('\n');		
					r=r-1;
					
			}
			for (int y=0; y<a.length; y++) {
				System.out.print(a[y]+" ");
			}
	}
}

