package Programs;

public class VowelsIntoSpaces {

	public static void main(String[] args) 
	{
		String str="bendakaluru is renamed has bengaluru";
		String[] s1=str.split(" ");
		for(String str1:s1) {
			int count=0;
			for (int i = 0; i < str1.length(); i++) {
				char ch=str.charAt(i);
				if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u') {
					count++;
				}
				}
			if(count>3) {
				System.out.print(str1.replaceAll("[a,e,i,o,u]", " "));
			}
		}
	}
}
