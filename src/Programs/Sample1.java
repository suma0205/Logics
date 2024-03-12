package Programs;

public class Sample1 {
	
	public static void main(String[] args) {
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		int size=arr.length;
		int a=0;
		for (int i = 0; i < size; i++) {
			a=a+arr[i][i];
		}
		System.out.println(a);
	}
}
