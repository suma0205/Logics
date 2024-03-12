package Programs;

import java.util.Arrays;

public class UnsorToSort {
	public static void main(String[] args) {
		
		int[] arr= {4,3,5,2,1};
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
