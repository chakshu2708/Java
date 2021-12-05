class A2
{
	void m()
	{
		System.out.println("hello m");
	}
	
	void n()
	{
		System.out.println("hello n");
		this.m();
	}
}
public class this2 {

	public static void main(String[] args) {
		A2 a = new A2();
		a.n();
	}

}
