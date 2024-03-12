package Programs;

public class ReverseASentence {

	public static void main(String[] args) {
		
		String str="hii how are you";
		String[] s1=str.split(" ");
		for (int i =s1.length-1;i>=0; i--) {
			System.out.print(s1[i]+" ");
		}
	}
}
