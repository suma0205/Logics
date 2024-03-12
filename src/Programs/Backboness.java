package Programs;

public class Backboness {

	static String res(String str) {
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		return rev;
	}
	public static void main(String[] args) {
		
		String str="backboneless";
		String s1=str.substring(0, str.length()/2);
		s1=res(s1);
		String s2=str.substring(str.length()/2);
		System.out.println(s1+" "+  s2);
	}
}
