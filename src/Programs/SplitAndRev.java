package Programs;

public class SplitAndRev {

	static void print(String str)

	{
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.print(rev+" ");
	}
	public static void main(String[] args) {
		String str="hii suma";
		String[] s1=str.split(" ");
		for (int i = 0; i < s1.length; i++) {
			print(s1[i]);
		}
	}
}
