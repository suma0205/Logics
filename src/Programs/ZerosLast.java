package Programs;

import java.util.Arrays;

public class ZerosLast {
	public static void main(String[] args) {
		int[] arr= {1,2,7,0,6,4,3,0,5,0,0};
		Arrays.sort(arr);
		int[] a=new int[arr.length];
		int j=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=0) {
				a[j]=arr[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
