package JavaProgramming;

public class 배열세로 {
	public static void main(String[] args) {
		int a[][] = {{1, 3}, {22, 4}, {25, 6}, {7, 81}, {9, 10}};
			
		for (int b=0; b<a.length; b++) 
			for (int c=0; c<a[b].length; c++) {
				System.out.print("[" + b + "][" + c + "] =" + a[b][c] + '\n');
			}
	}		
}

