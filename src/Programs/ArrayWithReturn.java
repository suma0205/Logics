package Programs;

public class ArrayWithReturn {

	static int[] print()
	{
		int[] arr= {5,20,33,40};
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]);
			}
		}
		return arr;

		}
		public static void main(String[] args) {
			int[] abb=print();
		}

	}
