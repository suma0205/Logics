package Programs;

public class ReplaceOldToNewChar 
//	public static void main(String[] args) {
//
//		String s="cool";
//		System.out.println(s.replace('c','t'));
//	}
//}
{
	public static void main(String[] args) {
		String s="suma1234@#$";
		System.out.println(s.replaceAll("[1-9@#$]", ""));
	}
}