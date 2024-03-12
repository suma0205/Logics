package Programs;

public class LevelPalindrome {
	static void palin(String str)
	{
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(str.equalsIgnoreCase(rev))
		{
			System.out.println(str+ " is palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
	}
	public static void main(String[] args) {

		String str="Le@#345vel";
		str=str.replaceAll("[0-9@#]", "");
		palin(str);
	}
}
