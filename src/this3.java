class A3
{
	A3()
	{
		System.out.println("Hello a");
	}
	
	A3(int x)
	{
		this();
		System.out.println(x);
	}
}
public class this3 {

	public static void main(String[] args) {
		
		new A3(10);

	}

}
