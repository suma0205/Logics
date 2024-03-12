package Programs;

public class VowelsBeforeConsonants {
	public static void main(String[] args) {
		
		String str="java";
		String v="";
		String c="";
		for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				v=v+ch;
			}
			else {
				c=c+ch;
			}
		}
		System.out.println(c+" "+v);
	}
}
