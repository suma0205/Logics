package Programs;

public class CircularPrimeNo {

	static boolean print(int no)
	{
		String str=String.valueOf(no);
		for (int i = 0; i < str.length(); i++) {
			if(!prime(Integer.parseInt(str)))
			{
				return false;
			}
			str=str.substring(1)+str.charAt(0);
		}
		return true;
	}

	static boolean prime(int no)
	{
		if(no<=1) {
			return false;
		}
		for(int i=2;i<no;i++) {
			if(no%i==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int no=197;
		if(print(no)) {
			System.out.println("prime");
		}
		else {
			System.out.println("not");
		}
	}
}
