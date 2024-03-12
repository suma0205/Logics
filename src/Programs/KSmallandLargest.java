package Programs;

public class KSmallandLargest {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5,6,7,8,9};
		int k=1;
		int min=arr[k-1];
		int max=arr[arr.length-k];
		System.out.println(min+" "+max);
	}

}
