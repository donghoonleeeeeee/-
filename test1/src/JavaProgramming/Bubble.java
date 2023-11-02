package JavaProgramming;

public class Bubble {
	public static void main(String[] args){
		int arr[] = {64, 34, 25, 12, 22, 11, 90};
		
		bubbleSort(arr);
		
		System.out.println("정렬된 배열: ");
		for (int i : arr) {
			System.out.print(i + " ");
			
		}
	}

	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		for(int i=0; i<n-1; i++)
		{
			for(int j=0; j<n-i-1; j++)
			{
				if (arr[j] > arr[j + 1])
				//인접한 두 요소를 비교하여 교환
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}
