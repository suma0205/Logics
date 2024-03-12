package Programs;

public class IdenticalString {

	public static void main(String[] args) {
		String s1="Hello";
		String s2="hello";
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("identical");
		}
	}
}
