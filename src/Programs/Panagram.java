package Programs;

import java.util.TreeSet;

public class Panagram {

	static String print(String str)
	{
		TreeSet t=new TreeSet();
		for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i);
			if(ch!=' ') {
				t.add(ch);
			}
		}
		if(t.size()==26) {
			return "panagram";
		}else {
			return "not panagram";
		}
	}
	public static void main(String[] args) {
		System.out.println(print("the quick brown fox jumps over the lazy dog"));
	}
}
