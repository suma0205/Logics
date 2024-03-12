package Programs;

class NthPrime {

	public static void main(String[] args)
	{
		int n=3;
		int count=1;
		for (int j = n; j <=100; j++) {
			int no=j;
			boolean flag=true;
			for (int i = 2; i < no; i++) {
				if(no%i==0){
					flag=false;
					break;
				}
			}
			if(flag==true)
			{
				if(count==n)
				{
					System.out.println(no);	
					break;
				}else{
					count++;
				}
			}
		}

	}
}
