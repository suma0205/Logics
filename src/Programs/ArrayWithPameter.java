package Programs;

public class ArrayWithPameter {
	
	static void print(int[] arr)
	{
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		
		int[] abb= {10,20,30,40};
		print(abb);
	}
}
