package Programs;

public class HappyNo {

	static int add(int no)
	{
		int sum=0;
		while(no!=0)
		{
			int rem=no%10;
			sum+=rem*rem;
			no=no/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		
		int no=13;
		while(no>9) {
			no=add(no);
		}
		if(no==1||no==7) {
			System.out.println(no+ " happy no");
		}
		else {
			System.out.println("not a happy no");
		}
	}
}
