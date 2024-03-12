package Programs;

class StringClass {
 public static void main(String[] args) {
	String s1=new String("class");
	String s2=new String("class");
	System.out.println(s1==s2);
	System.out.println(s1.equals(s2));	
	System.out.println("********************");
	String s3="cool";
	String s4="cool";
	System.out.println(s3==s4);
	System.out.println(s3.equals(s4));
}
	
}

