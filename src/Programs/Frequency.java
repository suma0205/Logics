package Programs;

public class Frequency {
	public static void main(String[] args) {

		String str="abbaASDHJKKbbaannjjiifdg";
		int[] arr=new int[123];
		for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i);
			arr[ch]++;
		}
//		lower i=97
//		upper i=65 i<=90
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=0)
			{
				System.out.println((char)i+"->"+arr[i]);
			}
		}
	}

}
