package Programs;

public class LeapYear {
	
	static boolean leapYear(int year)
	{
		return ((year%4==0&&year%100!=0)||(year%400==0));
	}
	public static void main(String[] args) {
		
		int year=2004;
		if(leapYear(year)) {
			System.out.println("leap year");
		}else {
			System.out.println("not a leap ");
		}
	}
}
