package Programs;

class PerfectNumber {
	static String print(int no)
	{
		int sum=0;
		for (int i = 1; i <= no/2; i++) {
			if(no%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==no)
		{
			return "perfect number";
		}
		else{
			return "not a perfect number";
		}
	}
	public static void main(String[] args) {
		System.out.println(print(6));
	}
}
