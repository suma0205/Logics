package Programs;

class Disariumno {
	
	static String add(int no){
		int n1 = no;
		int n2 = no;
		int count = 0;
		int sum = 0;

		while (n1 != 0) {
			n1 = n1 / 10;
			count++;
		}

		while (n2 != 0) {
			int rem = n2 % 10;
			sum+=Math.pow(rem, count);
			count--;
			n2 = n2 / 10;
		}

		if (no == sum) {
			return "Disarium number";
		}
		else{
			return "not a Disarium number";
		}
	}
	public static void main(String[] args) {
		System.out.println(add(135));


	}
}