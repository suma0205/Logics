package Programs;


public class PrimeNo {
	static String print(int no)
	{
		boolean flag=true;
		for(int i=2;i<no;i++)
		{
			if(no%i==0)
			{
				flag=false;
				break;
			}
		}
		if(flag==true)
		{
			return no+"  prime no"; 
		}
		else {
			return "not a prime";
		}
	}

	public static void main(String[] args) {
		System.out.println(print(9));
	}
}
