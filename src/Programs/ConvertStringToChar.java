package Programs;

public class ConvertStringToChar {

	public static void main(String[] args) {
		
		String str="java";
		char[] ch=new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			char c=str.charAt(i);
			ch[i]=c;
		}
		
		System.out.println(ch);
	}
}
