package Programs;

public class RotateArrayRight {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5};
		int k=6;
		int size=arr.length;
		k=k%size;
		for (int i = 0; i < size; i++) {
			if(i<k)
			{
				System.out.println(arr[size+i-k]+" ");
			}
			else {
				System.out.println(arr[i-k]+" ");
			}
		}

	}
}
