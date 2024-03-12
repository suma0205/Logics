package Programs;

import java.util.ArrayList;
import java.util.List;

public class Sid1 {

	public static void main(String[] args)
	{
		int sr=3;
		int er=15;
		isPrime(sr,er);

	}
	static void isPrime(int sr,int er)
	{
		List<Integer> li=new ArrayList<Integer>();
		for(int i=sr;i<=er;i++){
			int no=i;
			boolean flag=true;
			for(int j=2;j<no;j++)
			{
				if(no%i==0)
				{
					flag=false;
					break;
				}
			}
			if(flag){
				li.add(no);
			}
		}
		System.out.println(li);
		System.out.println(li.get(0)+li.get(li.size()-1)+"="+(li.get(0)+li.get(li.size()-1)));
		System.out.println("Between count is="+(li.size()-2));
	}


}
