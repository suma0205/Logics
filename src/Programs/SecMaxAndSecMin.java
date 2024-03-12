package Programs;

import java.util.Arrays;

public class SecMaxAndSecMin {
	public static void main(String[] args) {

		int[] arr= {4,5,3,2,1};
		Arrays.sort(arr);
		int sum=arr[1]+arr[arr.length-2];
		System.out.println(sum);
	}
}
