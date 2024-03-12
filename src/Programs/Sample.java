package Programs;

class Mobile{
	private int password;

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

}

public class Sample {
	public static void main(String[] args) {
		Mobile m=new Mobile();
		m.setPassword(1234);
		System.out.println(m.getPassword());
	}
}
