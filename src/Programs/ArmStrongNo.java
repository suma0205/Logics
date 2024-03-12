package Programs;

public class ArmStrongNo {
	public static void main(String[] args) {

		int no=153;
		int n1=no;
		int n2=no;
		int sum=0;
		int count=0;

		while(n1!=0) {
			n1=n1/10;
			count++;
		}

		while(n2!=0) {
			int rem=n2%10;
			sum+=Math.pow(rem,count);
			n2=n2/10;
		}
		if(sum==no)
		{
			System.out.println(no+" is arm strong");
		}
		else {
			System.out.println("not a arm");
		}
	}
}
