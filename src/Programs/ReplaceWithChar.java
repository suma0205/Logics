package Programs;

public class ReplaceWithChar {
	public static void main(String[] args) {
		
		String str="J$A@2V#3A?45m&a7*v#9a";
		System.out.println(str.replaceAll("[A-Za-z!@#?$%^&*()_+]",""));
		System.out.println(str.replaceAll("[a-za-z?0-9]",""));
		System.out.println(str.replaceAll("[0-9a-z!@#$?%^&*()_+]",""));
		System.out.println(str.replaceAll("[A-Z0-9!@#$?%^&*()_+]",""));

	}
}
