package Programs;

public class LowerToUpper {
static String print(String str)
{
	String s="";
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		ch=(char)(ch-32);
//		if lower means (ch+32)
		s=s+ch;
	}
	return s;
}
public static void main(String[] args) {
	
System.out.println(print("java"));
}
}
