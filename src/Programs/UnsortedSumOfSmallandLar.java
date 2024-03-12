package Programs;

import java.util.Arrays;

public class UnsortedSumOfSmallandLar {

	public static void main(String[] args) {
		int[] arr= {4,5,1,2,3};
		Arrays.sort(arr);
		int sum=arr[0]+arr[arr.length-3];
		System.out.println(sum);
	}
}
