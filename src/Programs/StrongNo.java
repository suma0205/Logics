package Programs;

public class StrongNo {
static int factorial(int no)
{
	int fact=1;
	for(int i=no;i>=1;i--) {
		fact=fact*i;
	}
	return fact;
}
static int add(int no) {
	int sum=0;
	while(no!=0)
	{
		int rem=no%10;
		sum+=factorial(rem);
		no=no/10;
	}
	return sum;
}
public static void main(String[] args) {
	int no=145;
	int x=add(no);
	if(no==x)
	{
		System.out.println("strong no");
		
	}
	else {
		System.out.println("not a strong no");
	}
}
}
