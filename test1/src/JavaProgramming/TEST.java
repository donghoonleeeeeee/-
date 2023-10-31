package JavaProgramming;

public class TEST {
	public static void main(String[] args) {
		int a[] = {4, 1, 3, 5, 2};
		
		for(int i=1; i<10; i++) {
			for(int j=1; j<10; j++) {
			System.out.print(i + "*" + j + "=" + i*j + '\n');
			}	
			System.out.print('\n');
		}
	}
}
