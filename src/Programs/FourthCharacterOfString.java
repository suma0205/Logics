package Programs;

public class FourthCharacterOfString {

	static String print(String str) {
		int no=4;
		String s="";
		for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i);
			ch=(char)(ch+no);
			s=s+ch;
		}
		return s;
	}
	public static void main(String[] args) {
		System.out.println(print("hello"));
	}
}
